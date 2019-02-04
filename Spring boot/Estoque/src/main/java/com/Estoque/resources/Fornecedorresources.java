package com.Estoque.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Estoque.domain.Fornecedor;
import com.Estoque.repository.FornecedorRepository;

@RestController
public class Fornecedorresources {
	@Autowired
	private FornecedorRepository repository;
	
	@GetMapping("/fornecedores")
	public List<Fornecedor> getAllRoupas(){
		List<Fornecedor> fornecedores = repository.findAll();
		return fornecedores;
		 
	}
	public void save (Fornecedor fornecedor) {
		repository.save(fornecedor);
	}
	public void delete (Fornecedor fornecedor) {
		repository.delete(fornecedor);
	}
}
