package com.grupo5.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo5.api.model.SalaModel;


@Repository
public interface SalaRepository extends JpaRepository<SalaModel, Long>{

	
}
