package br.unicesumar.pessoa.papel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import br.unicesumar.pessoa.ContratoSocial;

@Entity
public class Empresa extends Papel {
	@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="empresa_id")
	private ContratoSocial contratoSocial;
	
	public ContratoSocial getContratoSocial() {
		return contratoSocial;
	}
	
	public void setContratoSocial(ContratoSocial contratoSocial) {
		this.contratoSocial = contratoSocial;
	}

}
