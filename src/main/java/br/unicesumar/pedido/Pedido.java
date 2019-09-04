package br.unicesumar.pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	@Id
	private String id;	
	private Integer numero;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<ItemPedido> itens = new ArrayList<>();
	
	public Pedido() {
		id = UUID.randomUUID().toString();
	}

	public Integer getNumero() {
		return numero;
	}
	public String getId() {
		return id;
	}
	
	public double getValor() {
		return 0.00;
	}
	public List<ItemPedido> getItens() {
		return itens;
	}

}
