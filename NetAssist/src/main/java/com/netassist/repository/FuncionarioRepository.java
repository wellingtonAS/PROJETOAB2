package com.netassist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netassist.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
