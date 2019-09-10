package br.unicesumar.empresa;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Empresa {
	@Id
	private String id;
	private String nome;
	
	@OneToOne(cascade=CascadeType.ALL)
	private ContratoSocial contratoSocial;
	
	
	public Empresa() {
		id = UUID.randomUUID().toString();
	}
	
	public ContratoSocial getContratoSocial() {
		return contratoSocial;
	}
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setContratoSocial(ContratoSocial contratoSocial) {
		this.contratoSocial = contratoSocial;
	}

}
