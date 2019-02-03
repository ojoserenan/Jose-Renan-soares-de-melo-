package com.Estoque.resources;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Estoque.domain.Cliente;
import com.Estoque.repository.ClienteRepository;
@RestController
public class Clienteresources {
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping("/cliente")
	public List<Cliente> getAllRoupas(){
		List<Cliente> cliente = repository.findAll();
		return cliente;
		 
	}

}
