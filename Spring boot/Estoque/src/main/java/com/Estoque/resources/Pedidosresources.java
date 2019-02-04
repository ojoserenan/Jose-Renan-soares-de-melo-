package com.Estoque.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Estoque.domain.Pedidos;
import com.Estoque.repository.PedidosRepository;

@RestController
public class Pedidosresources {
	
	@Autowired
	private PedidosRepository repository;
	
	@GetMapping("/pedidos")
	public List<Pedidos> getAllRoupas(){
		List<Pedidos> pedidos = repository.findAll();
		return pedidos;
		 
	}
	public void save (Pedidos pedidos) {
		repository.save(pedidos);
	}
	public void delete (Pedidos pedidos) {
		repository.delete(pedidos);
	}
}
