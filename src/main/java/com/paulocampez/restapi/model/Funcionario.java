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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Cargo == null) ? 0 : Cargo.hashCode());
		result = prime * result + ((Cpf == null) ? 0 : Cpf.hashCode());
		result = prime * result + ((DataCad == null) ? 0 : DataCad.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result + ((Salario == null) ? 0 : Salario.hashCode());
		result = prime * result + ((Status == null) ? 0 : Status.hashCode());
		result = prime * result + ((UfNasc == null) ? 0 : UfNasc.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (Cargo == null) {
			if (other.Cargo != null)
				return false;
		} else if (!Cargo.equals(other.Cargo))
			return false;
		if (Cpf == null) {
			if (other.Cpf != null)
				return false;
		} else if (!Cpf.equals(other.Cpf))
			return false;
		if (DataCad == null) {
			if (other.DataCad != null)
				return false;
		} else if (!DataCad.equals(other.DataCad))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (Salario == null) {
			if (other.Salario != null)
				return false;
		} else if (!Salario.equals(other.Salario))
			return false;
		if (Status == null) {
			if (other.Status != null)
				return false;
		} else if (!Status.equals(other.Status))
			return false;
		if (UfNasc == null) {
			if (other.UfNasc != null)
				return false;
		} else if (!UfNasc.equals(other.UfNasc))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
