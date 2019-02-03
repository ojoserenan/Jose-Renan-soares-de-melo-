package com.Estoque.domain;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String produto;
	private int lote;
	private float preco;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fornecedor_id")
	private Fornecedor fornecedores;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "pagamento_id")
	private Pagamento pagamentos;
	
	public Pedidos() {}
	public Pedidos(Integer id, String produto, int lote, float preco) {
		super();
		this.id = id;
		this.produto = produto;
		this.lote = lote;
		this.preco = preco;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float calcularValor(int lote,float preco) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o Valor = R$ ");
		lote = 50 * ler.nextInt();
		float valor;
		valor = lote * preco;
		return valor;
		
	}

}
