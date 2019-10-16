package br.unicesumar.pessoa.papel;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Professor extends Papel {
	private String matricula;
	
	@Temporal(TemporalType.DATE)
	private Date contratadoEm;
	
	public Professor() {
		super();
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
