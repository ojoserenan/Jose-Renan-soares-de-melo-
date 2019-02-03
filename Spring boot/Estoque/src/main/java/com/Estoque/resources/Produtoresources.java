package com.Estoque.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Estoque.domain.Produto;
import com.Estoque.repository.ProdutoRepository;

@RestController
public class Produtoresources{
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping("/produto")
	public List<Produto> getAllRoupas(){
		List<Produto> produto = repository.findAll();
		return produto;
		 
	}
	
	
}
