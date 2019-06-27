package com.paulocampez.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulocampez.restapi.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
