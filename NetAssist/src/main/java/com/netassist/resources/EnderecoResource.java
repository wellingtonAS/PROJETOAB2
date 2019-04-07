package com.netassist.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netassist.domain.Endereco;
import com.netassist.repository.EnderecoRepository;

@RestController
public class EnderecoResource {

	@Autowired
	private EnderecoRepository repository;
	
	@GetMapping("/endereco")
	public List<Endereco> getAllEndereco(){
		return repository.findAll();
	}
	
	@GetMapping("/endereco/{id}")
	public Optional<Endereco> getEnderecoById(@PathVariable Integer id) {
		return repository.findById(id);
	}
	
}
