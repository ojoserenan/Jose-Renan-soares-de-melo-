package com.Estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Estoque.domain.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Integer> {

}
