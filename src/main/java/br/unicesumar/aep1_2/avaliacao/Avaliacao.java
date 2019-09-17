package br.unicesumar.aep1_2.avaliacao;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Avaliacao {
	@Id
	private String id;
	
	private String descricao;
	
	public Avaliacao() {
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	

}
