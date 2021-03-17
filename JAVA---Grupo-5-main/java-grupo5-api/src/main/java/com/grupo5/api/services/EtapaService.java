package com.grupo5.api.services;

import com.grupo5.api.model.*;
import com.grupo5.api.repository.EtapaRepository;
import com.grupo5.api.repository.SalaCafeRepository;
import com.grupo5.api.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtapaService {

    @Autowired
    private EtapaRepository etapaRepository;

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private SalaCafeRepository salaCafeRepository;

    public List<EtapaModel> index(){
        return (List<EtapaModel>) etapaRepository.findAll();
    }


    public Object store(EtapaModel EtapaModel){
        try{
            return etapaRepository.save(EtapaModel);

        }catch(Exception e){
            return e;
        }
    }

    public Object vincularSalaEtapa( final Integer salaId, final Integer etapaId){
        try {

            SalaModel sala = salaRepository.findById(salaId).get();
            EtapaModel etapa = etapaRepository.findById(etapaId).get();

            etapa.setSala(sala);

            return etapaRepository.save(etapa);

        }catch(Exception e){
            return e;
        }
    }

    public Object vincularSalaCafeEtapa( final Integer salaCafeId, final Integer etapaId){
        try {

            SalaCafeModel salaCafe = salaCafeRepository.findById(salaCafeId).get();
            EtapaModel etapa = etapaRepository.findById(etapaId).get();

            etapa.setSalaCafe(salaCafe);

            return etapaRepository.save(etapa);

        }catch(Exception e){
            return e;
        }
    }

}
