package br.unicesumar.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ContratoSocial {
	@Id
	private String id;

	private String termos;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="contrato_social_id")
	private List<Socio> socios = new ArrayList<>();

	public ContratoSocial() {
		id = UUID.randomUUID().toString();
	}
	
	public String getTermos() {
		return termos;
	}
	
	public void setTermos(String termos) {
		this.termos = termos;
	}
	
	public String getId() {
		return id;
	}
}
