package com.paulocampez.restapi.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	/*public List<Funcionario> getBySalary(Double n1, Double n2){
		
		return funcionarioRepository.findBySalary(n1,n2);
	}
	
	public List<Funcionario> getByUf(String uf){
		
		return funcionarioRepository.findByUf(uf);
	}
	
	public List<Funcionario> getByDate(Date d1, Date d2)
	{
		return funcionarioRepository.findByDate(d1, d2);
	}
	
	public List<Funcionario> getByName(String name)
	{
		return funcionarioRepository.findByName(name);
	}
	
	public Funcionario getByTaxId(String cpf)
	{
		return funcionarioRepository.findByTaxId(cpf);
	}
	
	public boolean DeleteByTaxId(String cpf)
	{
		return funcionarioRepository.deleteByTaxId(cpf);
	}
	
	public List<Funcionario> getByJob(String job)
	{
		return funcionarioRepository.findByJob(job);
	}*/
}
