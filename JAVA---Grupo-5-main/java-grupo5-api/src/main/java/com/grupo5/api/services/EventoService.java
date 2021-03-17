package com.grupo5.api.services;

import com.grupo5.api.model.EventoModel;
import com.grupo5.api.model.PessoaModel;
import com.grupo5.api.repository.EventoRepository;
import com.grupo5.api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<EventoModel> index(){
        return (List<EventoModel>) eventoRepository.findAll();
    }

    public Object store(EventoModel eventoModel){
        try{
            return eventoRepository.save(eventoModel);

        }catch(Exception e){
            return e;
        }
    }

    public Object vincularPessoaEvento( final Integer eventoID, final Integer pessoaId){
        try {

            PessoaModel pessoa = pessoaRepository.findById(pessoaId).get();
            EventoModel evento = eventoRepository.findById(eventoID).get();

//            pessoa.setEvento(evento);
            evento.setPessoa(pessoa);

//            pessoaRepository.save(pessoa);

            return eventoRepository.save(evento);

        }catch(Exception e){
            return e;
        }
    }
}
