package br.unicesumar.pedido;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.produto.Produto;

@Entity
public class ItemPedido {
	@Id
	private String id;
	private double quantidade;
	private double precoUnitario;
	private double descontoPercentual;
	
	@ManyToOne
	private Produto produto;

	public ItemPedido() {
		id = UUID.randomUUID().toString();
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public double getDescontoPercentual() {
		return descontoPercentual;
	}
	public String getId() {
		return id;
	}
	public Produto getProduto() {
		return produto;
	}
}
