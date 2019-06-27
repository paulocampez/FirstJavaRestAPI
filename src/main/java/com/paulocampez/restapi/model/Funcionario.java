package com.paulocampez.restapi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="funcionario")
public class Funcionario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String Nome;
	@NotNull
	private String Cpf;
	@NotNull
	private Date DataCad;
	@NotNull
	private String Cargo;
	@NotNull
	private String UfNasc;
	@NotNull
	@DecimalMax("999999.0") @DecimalMin("0.0") 
	private Double Salario;
	@NotNull
	private String Status;
	
	public Funcionario() {
		
	}
	
	public Long getIdFuncionario() {
		return id;
	}
	public void setIdFuncionario(Long idFuncionario) {
		id = idFuncionario;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public Date getDataCad() {
		return DataCad;
	}
	public void setDataCad(Date dataCad) {
		DataCad = dataCad;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public String getUfNasc() {
		return UfNasc;
	}
	public void setUfNasc(String ufNasc) {
		UfNasc = ufNasc;
	}
	public Double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
}
