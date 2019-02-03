package com.Estoque.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int cartao;
	private int dinheiro;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pagamentos")
	private List<Pedidos> pedidos;

	public Pagamento() {}
	public Pagamento( int cartao, int dinheiro) {
		super();
		this.cartao = cartao;
		this.dinheiro = dinheiro;
		this.pedidos = new ArrayList<Pedidos>();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public int getCartao() {
		return cartao;
	}


	public void setCartao(int cartao) {
		this.cartao = cartao;
	}


	public int getDinheiro() {
		return dinheiro;
	}


	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	
	public List<Pedidos> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}
	public float calcularTroco() {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float valorPago;
		float troco;
		System.out.printf("Informe o Valor = R$ ");
		valorPago = ler.nextFloat();
		Pedidos pedidos = new Pedidos();
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int lote = 0;
		lote = entrada.nextInt();
		float preco = (float) 2.70;
		troco = valorPago - pedidos.calcularValor(lote, preco);
		return troco;				
		
	}
	
}
