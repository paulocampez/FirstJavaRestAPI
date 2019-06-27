package com.paulocampez.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.paulocampez.restapi.model.Funcionario;
import com.paulocampez.restapi.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public List<Funcionario> getAll(){
		return funcionarioRepository.findAll();
	}
	
	public Funcionario getById(Long id){
		return funcionarioRepository.findById(id).orElseThrow();
	}
	
	public Funcionario create(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
	public List<Funcionario> getByStatus(String status){ 
		return funcionarioRepository.findByStatus(status);
	}
	
}
