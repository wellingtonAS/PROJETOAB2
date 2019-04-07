package com.netassist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netassist.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
