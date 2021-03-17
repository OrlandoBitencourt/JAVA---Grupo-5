package com.grupo5.api.services;

import com.grupo5.api.model.EtapaModel;
import com.grupo5.api.model.PessoaModel;
import com.grupo5.api.model.SalaCafeModel;
import com.grupo5.api.repository.PessoaRepository;
import com.grupo5.api.repository.SalaCafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeService {

    @Autowired
    private SalaCafeRepository cafeRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<SalaCafeModel> index(){
        return (List<SalaCafeModel>) cafeRepository.findAll();
    }

    public Object store(SalaCafeModel salaCafeModel){
        try{
            return cafeRepository.save(salaCafeModel);

        }catch(Exception e){
            return e;
        }
    }

    public Object vincularPessoaSalaCafe( final Integer idSalaCafe, final Integer pessoaId){
        try{

            SalaCafeModel salaCafe = cafeRepository.findById(idSalaCafe).get();
            PessoaModel pessoa = pessoaRepository.findById(pessoaId).get();

            salaCafe.setPessoa(pessoa);

            cafeRepository.save(salaCafe);

            return cafeRepository.findById(idSalaCafe).get();

        }catch(Exception e){
            return e;
        }
    }


}
