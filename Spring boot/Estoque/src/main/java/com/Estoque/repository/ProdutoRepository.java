package com.Estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Estoque.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
