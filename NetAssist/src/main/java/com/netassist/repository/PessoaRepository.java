package com.netassist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netassist.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
