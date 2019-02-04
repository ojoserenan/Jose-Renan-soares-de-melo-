package com.Estoque.resources;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Estoque.domain.Estoque;
import com.Estoque.repository.EstoqueRepository;

@RestController
public class Estoqueresources {
	@Autowired
	private EstoqueRepository repository;
	
	@GetMapping("/estoque")
	public List<Estoque> getAllEstoque(){
		List<Estoque> estoque = repository.findAll();
		return estoque;
	}
	public void save (Estoque estoque) {
		repository.save(estoque);
	}
	public void delete (Estoque estoque) {
		repository.delete(estoque);
	}
	
}
