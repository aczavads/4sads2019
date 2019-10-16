package br.unicesumar.pessoa.papel;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Papel {
	@Id
	private String id;
	
	public Papel() {
		id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	

}
