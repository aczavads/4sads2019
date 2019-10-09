package br.unicesumar.pessoa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Fisica extends Pessoa {
	private String cpf;

	@Temporal(TemporalType.DATE)
	private Date nascidaEm;

	public Fisica() {
		super();
	}

	public Fisica(String nome, String cpf, Date nascidaEm) {
		super(nome);
		this.cpf = cpf;
		this.nascidaEm = nascidaEm;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getNascidaEm() {
		return nascidaEm;
	}

	public void setNascidaEm(Date nascidaEm) {
		this.nascidaEm = nascidaEm;
	}
}
