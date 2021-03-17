package com.grupo5.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.grupo5.api.model.PessoaModel;
import com.grupo5.api.model.SalaModel;

/**
 * 
 * @author Orlando, Gabriela, Rudolfo
 *
 */

@Repository
public interface SalaRepository extends PagingAndSortingRepository<SalaModel, Integer>, JpaRepository<SalaModel, Integer>{
	
	//SELECT COUNT(A.PESSOAS_PESSOA_ID) AS QUANTIDADE, 
	// B.SALA_LOTACAO FROM SALA_PESSOAS A 
	// JOIN SALA B ON (A.SALA_MODEL_SALA_ID = B.SALA_ID) 
	// WHERE A.SALA_MODEL_SALA_ID =  :NUMERODASALA
	/*
	@Query("SELECT COUNT(A.PESSOAS_PESSOA_ID) AS QUANTIDADE, \n"
			+ " B.SALA_LOTACAO FROM SALA_PESSOAS A \n"
			+ " JOIN SALA B ON (A.SALA_MODEL_SALA_ID = B.SALA_ID) \n"
			+ " WHERE A.SALA_MODEL_SALA_ID =  :NUMERODASALA")
	public List<PessoaModel> findByList(@Param("NUMERODASALA") int SALA_MODEL_SALA_ID){
		
	}*/
	
	
	
}
