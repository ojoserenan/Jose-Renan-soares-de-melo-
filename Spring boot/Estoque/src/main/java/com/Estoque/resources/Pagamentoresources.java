package com.Estoque.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Estoque.domain.Pagamento;
import com.Estoque.repository.PagamentoRepository;

@RestController
public class Pagamentoresources {
	
	@Autowired
	private PagamentoRepository repository;
	
	@GetMapping("/pagamentos")
	public List<Pagamento> getAllRoupas(){
		List<Pagamento> pagamentos = repository.findAll();
		return pagamentos;
		 
	}

}
