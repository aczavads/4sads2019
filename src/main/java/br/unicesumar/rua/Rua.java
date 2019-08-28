package br.unicesumar.rua;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.unicesumar.cidade.Cidade;

@Entity
public class Rua {

	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String id;

	@ManyToOne
	@JoinColumn(name="cidade_id",nullable=false)
	private Cidade cidade;

	private String nome;

	public Rua() {
		id = UUID.randomUUID().toString();
	}

	public Rua(String nome) {
		this.nome = nome;
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

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public String getCidade_id() {
		return cidade.getId();
	}
}
