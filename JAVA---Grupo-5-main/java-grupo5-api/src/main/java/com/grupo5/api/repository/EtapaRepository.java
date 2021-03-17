package com.grupo5.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo5.api.model.EtapaModel;

/**
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@Repository
public interface EtapaRepository extends JpaRepository<EtapaModel, Integer>{

	
}
