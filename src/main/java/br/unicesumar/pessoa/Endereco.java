package br.unicesumar.pessoa;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Endereco {
	@Id
	private String id;
	private String logradouro;
	private String numero;
	private String cep;
	
	
	public Endereco() {
		id = UUID.randomUUID().toString();
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getId() {
		return id;
	}
	
	

}
