package com.netassist.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netassist.domain.Cliente;
import com.netassist.repository.ClienteRepository;

@RestController
public class ClienteResource {
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping("/clientes")
	public List<Cliente> getClienteList() {
		return repository.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	public Optional<Cliente> getClienteById(@PathVariable Integer id) {
		return repository.findById(id);
	}

}
