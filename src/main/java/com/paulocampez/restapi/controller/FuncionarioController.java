package com.paulocampez.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paulocampez.restapi.model.Funcionario;
import com.paulocampez.restapi.service.FuncionarioService;

@RestController
@RequestMapping("/home")
public class FuncionarioController {

	
	/*INJECAO DE DEPENDENCIA COM AUTOWIRED(SPRING)*/
	@Autowired
	FuncionarioService funcionarioService;
	
	@GetMapping
	public List<Funcionario> getAll()
	{
		return funcionarioService.getAll();
	}
	
	@GetMapping("/{id}")
	public Funcionario getById(@RequestParam(value = "id", required = true) Long id)
	{
		return funcionarioService.getById(id);
	}
	
	@PostMapping
	public ResponseEntity<Funcionario> create(@RequestBody Funcionario funcionario)
	{
		Funcionario entity = funcionarioService.create(funcionario);
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}
	
	
}
