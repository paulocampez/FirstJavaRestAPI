package com.paulocampez.restapi.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.paulocampez.restapi.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {


	@Query("SELECT f FROM Funcionario f WHERE f.status LIKE LOWER(CONCAT ('%', :status, '%'))")
	List<Funcionario> findByStatus(@Param("status") String status);
	
	@Query("SELECT f FROM Funcionario f WHERE f.salario BETWEEN :n1 AND :n2")
	List<Funcionario> findBySalary(@Param("n1") Double n1, @Param("n2") Double n2);
	
	@Query("SELECT f FROM Funcionario f WHERE f.uf_nasc LIKE LOWER(CONCAT ('%', :uf, '%'))")
	List<Funcionario> findByUf(@Param("uf") String uf);
	
	@Query("SELECT f FROM Funcionario f WHERE f.data_cad BETWEEN :d1 AND :d2")
	List<Funcionario> findByDate(@Param("d1") Date d1, @Param("d2") Date d2);
	
	@Query("SELECT f FROM Funcionario f WHERE f.nome LIKE LOWER(CONCAT ('%', :name, '%'))")
	List<Funcionario> findByName(@Param("name") String name);
	
	@Query("SELECT f FROM Funcionario f WHERE f.cpf LIKE LOWER(CONCAT ('%', :taxId, '%'))")
	Funcionario findByTaxId(@Param("taxId") String taxId);
	
	@Transactional
	@Modifying
	@Query("Delete Funcionario f Where f.cpf =:cpf")
	void deleteByTaxId(@Param("cpf") String cpf);
	
	@Query("SELECT f FROM Funcionario f WHERE f.cargo LIKE LOWER(CONCAT ('%', :job, '%'))")
	List<Funcionario> findByJob(@Param("job") String job);
	
}
