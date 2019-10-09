package br.unicesumar.pessoa;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Papel {
	@Id
	private UUID id;
	
	public Papel() {
		id = UUID.randomUUID();
	}
	
	public UUID getId() {
		return id;
	}
	

}
