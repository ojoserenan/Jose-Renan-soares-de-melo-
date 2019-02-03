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
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String endereco;
	private int numero;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "produto_id")
	private Produto produto;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fornecedores")
	private List<Pedidos> pedidos;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fornecedores")
	private List<Cliente> cliente;
	
	public Fornecedor() {}
	public Fornecedor(String nome,String endereco, int numero) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.pedidos = new ArrayList<Pedidos>();
		this.cliente = new ArrayList<Cliente>();
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
	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<Pedidos> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}
	public List<Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	
}
