package br.unicesumar.empresa;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.unicesumar.socio.Socio;

@Entity
public class ContratoSocial {
	@Id
	private String id;
	private String termos;

	@OneToOne(mappedBy = "contratoSocial")
	private Empresa empresa;

	@ManyToMany
	@JoinTable(name = "contrato_social_socios", 
	           joinColumns = @JoinColumn(name = "contrato_social_id"), 
	           inverseJoinColumns = @JoinColumn(name = "socio_id"))
	private Set<Socio> socios = new HashSet<>();

	
	
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
	
	public Set<Socio> getSocios() {
		return socios;
	}

}
