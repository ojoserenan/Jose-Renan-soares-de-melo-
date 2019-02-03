package com.Estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Estoque.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
