package com.Estoque.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	private String estadoCivil;
	@JsonFormat(pattern = "yyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date dataNasc;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<Pedidos> pedidos;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fornecedor_id")
	private Fornecedor fornecedores;
	
	public Cliente() {}
	public Cliente(String nome, String cpf, String estadoCivil, Date dataNasc) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.dataNasc = dataNasc;
		this.pedidos = new ArrayList<Pedidos>();
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public List<Pedidos> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}
	
	
	
	
	
}
