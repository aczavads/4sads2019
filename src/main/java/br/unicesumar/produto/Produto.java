package br.unicesumar.produto;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	private String id;
	private String nome;
	private double preco;

	public Produto() {
		id = UUID.randomUUID().toString();
	}

	public String getNome() {
		return nome;
	}

	public String getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
