package com.Estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Estoque.domain.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos, Integer> {

}
