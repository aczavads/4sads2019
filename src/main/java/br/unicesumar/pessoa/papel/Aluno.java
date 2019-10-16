package br.unicesumar.pessoa.papel;

import javax.persistence.Entity;

@Entity
public class Aluno extends Papel {
	private String ra;
	
	public Aluno() {
		super();
	}
	
	public String getRa() {
		return ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}

}
