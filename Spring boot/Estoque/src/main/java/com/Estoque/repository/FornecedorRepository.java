package com.Estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Estoque.domain.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {

}
