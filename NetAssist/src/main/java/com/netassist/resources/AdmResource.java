package com.netassist.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netassist.domain.Adm;
import com.netassist.repository.AdmRepository;

@RestController
public class AdmResource {

	@Autowired
	private AdmRepository repository;
	
	@GetMapping("/adms")
	public List<Adm> getAllAdm(){
		return repository.findAll();
	}
	
	@GetMapping("/adms/id/{id}")
	public Optional<Adm> getAdmById(@PathVariable Integer id) {
		return repository.findById(id);
	}
	
	
}
