package br.unicesumar.aep1_2.conceito;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.unicesumar.aep1_2.aluno.Aluno;
import br.unicesumar.aep1_2.avaliacao.Avaliacao;

@Entity
public class Conceito {
	@Id
	private String id;

	@ManyToOne
	private Aluno aluno;

	@ManyToOne
	private Avaliacao avaliacao;

	@Embedded
	private Nota nota;

	public Conceito() {
		id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public Nota getNota() {
		return nota;
	}

}
