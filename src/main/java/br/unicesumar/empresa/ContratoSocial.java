package br.unicesumar.empresa;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ContratoSocial {
	@Id
	private String id;
	private String termos;
	
	@OneToOne(mappedBy="contratoSocial")
	private Empresa empresa;
	
	
	public ContratoSocial() {
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	@JsonIgnore
	public Empresa getEmpresa() {
		return empresa;
	}
	public String getTermos() {
		return termos;
	}

}
