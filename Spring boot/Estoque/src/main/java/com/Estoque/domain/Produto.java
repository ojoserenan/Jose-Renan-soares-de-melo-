package com.Estoque.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private int codProduto;
	private float valor;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "estoque_id")
	private Estoque estoque;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "produto")
	private List<Fornecedor> fornecedores;
	
	public Produto() {}
	public Produto(Integer id, String nome, int codProduto, float valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.codProduto = codProduto;
		this.valor = valor;
		this.fornecedores = new ArrayList<Fornecedor>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	public List<Fornecedor> getFornecedor() {
		return fornecedores;
	}
	public void setFornecedor(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
	
}
