package com.netassist.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netassist.domain.Pessoa;
import com.netassist.repository.PessoaRepository;

@RestController
public class PessoaResource {

	@Autowired
	private PessoaRepository repository;
	
	@GetMapping("/pessoas")
	public List<Pessoa> getAllPessoas(){
		return repository.findAll();
	}
	
	@GetMapping("/pessoas/{id}")
	public Optional<Pessoa> getPessoaById(@PathVariable Integer id) {
		return repository.findById(id);
	}
}
