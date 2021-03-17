package com.grupo5.api.services;

import com.grupo5.api.model.EventoModel;
import com.grupo5.api.model.PessoaModel;
import com.grupo5.api.model.SalaModel;
import com.grupo5.api.repository.EventoRepository;
import com.grupo5.api.repository.PessoaRepository;
import com.grupo5.api.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private SalaRepository salaRepository;

    public List<PessoaModel> index(){
        return (List<PessoaModel>) pessoaRepository.findAll();
    }

    public Object store(PessoaModel pessoaModel){
        try{
            return pessoaRepository.save(pessoaModel);
        }catch(Exception e){
            return e;
        }
    }
}
