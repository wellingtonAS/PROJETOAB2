package com.netassist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netassist.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
