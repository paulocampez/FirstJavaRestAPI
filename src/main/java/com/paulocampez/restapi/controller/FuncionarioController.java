package com.paulocampez.restapi.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	@GetMapping("/{status}")
	public List<Funcionario> getByStatus(@RequestParam(value = "status", required = true) String status)
	{
		return funcionarioService.getByStatus(status);
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
	
	@GetMapping("/{salary1}/{salary2}")
	public List<Funcionario> getBySalary(@RequestParam(value = "salary1", required = true) Double salary1,
									 @RequestParam(value = "salary2", required = true) Double salary2 )
	{
		return funcionarioService.getBySalary(salary1,salary2);
	}
	
	@GetMapping("/{uf}")
	public List<Funcionario> getByUf(@RequestParam(value = "uf", required = true) String uf)
	{
		return funcionarioService.getByUf(uf);
	}
	
	@GetMapping("/{date1}/{date2}")
	public List<Funcionario> getByDate(@RequestParam(value = "date1", required = true) Date date1,
									   @RequestParam(value = "date2", required = true) Date date2)
	{
		return funcionarioService.getByDate(date1, date2);
	}
	@GetMapping("/{name}")
	public List<Funcionario> getByName(@RequestParam(value = "name", required = true) String name)
	{
		return funcionarioService.getByName(name);
	}
	
	@GetMapping("/{cpf}")
	public Funcionario getByCpf(@RequestParam(value = "cpf", required = true) String cpf)
	{
		return funcionarioService.getByTaxId(cpf);
	}
	@DeleteMapping("/{cpf}")
	public boolean deleteByTaxId(@RequestParam(value = "cpf", required = true) String cpf)
	{
		return funcionarioService.DeleteByTaxId(cpf);
	}
	@GetMapping("/{cargo}")
	public List<Funcionario> getByJob(@RequestParam(value = "cargo", required = true) String cargo)
	{
		return funcionarioService.getByJob(cargo);
	}
	
	
}
