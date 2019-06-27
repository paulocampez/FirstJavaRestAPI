package com.paulocampez.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.paulocampez.restapi.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

	@Query("SELECT f FROM Funcionario WHERE p.status LIKE LOWER(CONCAT ('%', :status, '%'))")
	List<Funcionario> findByStatus(@Param("status") String status);
}
