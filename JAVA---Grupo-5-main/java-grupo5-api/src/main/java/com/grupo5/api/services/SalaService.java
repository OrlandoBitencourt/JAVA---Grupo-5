package com.grupo5.api.services;

import com.grupo5.api.model.PessoaModel;
import com.grupo5.api.model.SalaCafeModel;
import com.grupo5.api.model.SalaModel;
import com.grupo5.api.repository.PessoaRepository;
import com.grupo5.api.repository.SalaCafeRepository;
import com.grupo5.api.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.management.InvalidAttributeValueException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private SalaCafeRepository salaCafeRepository;

    public List<SalaModel> index(){
        return (List<SalaModel>) salaRepository.findAll();
    }

    public Object store(SalaModel salaModel){
        try{
            return salaRepository.save(salaModel);

        }catch(Exception e){
            return e;
        }
    }

    public Object vincularPessoaSala( final Integer salaId, final Integer pessoaId){
        try{

            SalaModel sala = salaRepository.findById(salaId).get();
            PessoaModel pessoa = pessoaRepository.findById(pessoaId).get();

            //TODO
            //dividir numero de pessoas que vão entrar na sala de maneira que cada sala fique com valores iguais se não proximos
            //this.verificaSalaDisponivel(sala);

            int lotacaoMax = sala.getLotacaoSala();
            System.out.println(lotacaoMax);

            int totalPessoa = sala.getPessoas().size();
            System.out.println(totalPessoa);

            //verificar limitime de pessoas para aquela sala, se limite estiver cheio, retorna erro
            if(lotacaoMax > totalPessoa){
                sala.setPessoa(pessoa);
                salaRepository.save(sala);

                return salaRepository.findById(salaId).get();
            }else{

                throw new InvalidAttributeValueException("NUMERO MAXIMO DE PESSOA CADASTRADAS NA SALA");
            }

        }catch(Exception e){
            return e;
        }
    }

    //TODO
    //ANTES DE FAZER A DIVISÃO PRECISA VERIFICAR SE EXISTE MAIS DE 2 PESSOAS CADASTRADAS NA SALA

    //APLICAR LOGICA PARA DIVIDIR METADE DAS PESSOAS NASQUELA SALA EM OUTRA SALA
    public Object dividirPessoasEmNovasSalas(Integer salaId, Integer idNovaSala){
        try{
            SalaModel todasSalalas = salaRepository.findById(salaId).get();

            SalaModel novaSala = salaRepository.findById(salaId).get();
            SalaModel salaComAlunos = salaRepository.findById(salaId).get();

            List<PessoaModel> totalPessoasNaSala = todasSalalas.getPessoas();
            int valido = totalPessoasNaSala.size() % 2;

            if(valido == 0){

                for(int i = 0; i < totalPessoasNaSala.size()/2; i++){
                    PessoaModel pessoa = totalPessoasNaSala.get(i);

                    //DEVE RETIRARA AS PESSOAS ENCONTRADAS DA TABELA DE LIGAÇÃO "SALA_PESSOAS"
                    salaComAlunos.romevePessoas(pessoa);

                    //APOS RETIRAR PESSOAS ENCONTRADAS, DEVE ADICIONAR NOVAS PESSOAS
                    novaSala.setPessoa(pessoa);

                    return pessoa;
                }

            }else if(valido == 1){

                for(int i = 0; i < totalPessoasNaSala.size()+1/2; i++){

                }
            }

            return todasSalalas;

        }catch (Exception e){
            return e;
        }
    }

    public Object verificaSalaDisponivel(SalaModel salaParametro){
        try{

            List<SalaModel> todasSalas = salaRepository.findAll();

            System.out.println("TEM QUE CHEGAR AQUI");

            SalaModel sala = (SalaModel) todasSalas.stream()
                    .filter(item -> item.getLotacaoSala() >= salaParametro.getLotacaoSala())
                    .collect(Collectors.toList());

            System.out.println(sala);

            return sala;

        }catch (Exception e){
            return e;
        }
    }

}
