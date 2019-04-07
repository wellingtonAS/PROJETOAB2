package com.netassist.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.netassist.domain.Funcionario;
import com.netassist.repository.FuncionarioRepository;

@RestController
public class FuncionarioResource {

	@Autowired
	private FuncionarioRepository repository;
	
	
	public List<Funcionario> getAllFuncionarios(){
		return repository.findAll();
	}
}
