package br.unicesumar.cor;

import javax.persistence.Entity;

import br.unicesumar.BaseEntity;

@Entity
public class Cor extends BaseEntity {
	private String nome;

	public Cor() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
