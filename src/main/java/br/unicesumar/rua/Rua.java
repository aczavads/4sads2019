package br.unicesumar.rua;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.cidade.Cidade;

@Entity
public class Rua {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne
	private Cidade cidade;

	private String nome;

	public Rua() {
	}

	public Rua(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Cidade getCidade() {
		return cidade;
	}

}
