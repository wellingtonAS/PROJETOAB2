package com.netassist.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netassist.domain.Funcionario;
import com.netassist.repository.FuncionarioRepository;

@RestController
public class LoginsResource{
	
	@Autowired
	private FuncionarioRepository repository;
	
	@GetMapping("/funcionarios")
	public List<Funcionario> getAllFuncionario(){
		return repository.findAll();
	}
	
	@GetMapping("/funcionarios/{id}")
	public Optional<Funcionario> getFuncionarioById(@PathVariable Integer id) {
		return repository.findById(id);
	}
}
