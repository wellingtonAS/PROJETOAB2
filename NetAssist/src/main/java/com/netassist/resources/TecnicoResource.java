package com.netassist.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netassist.domain.Tecnico;
import com.netassist.repository.TecnicoRepository;

@RestController
public class TecnicoResource {

	@Autowired
	private TecnicoRepository repository;
	
	
	@GetMapping("/tecnicos")
	public List<Tecnico> getAllTecnicos(){
		return repository.findAll();
	}
	
	@GetMapping("/tecnico/{id}")
	public Optional<Tecnico> getTecnicoById(@PathVariable Integer id){
		return repository.findById(id);
	}
}