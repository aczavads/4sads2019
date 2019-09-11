package br.unicesumar.socio;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import br.unicesumar.empresa.ContratoSocial;

@Entity
public class Socio {

	@Id
	private String id;
	private String nome;
	
	@ManyToMany(mappedBy="socios")
	private Set<ContratoSocial> contratosSociais = new HashSet<>();

	public Socio() {
		id = UUID.randomUUID().toString();
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

}
