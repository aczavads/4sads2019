package br.unicesumar.aep1_2.conceito;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class Nota {
	
	@Column(scale=1, nullable=false)
	@NotNull
	private BigDecimal nota = new BigDecimal("0.0");
	
	
	public Nota() {
	}
	
	public Nota(BigDecimal nota) {
		if (nota.compareTo(new BigDecimal("0.0")) < 0 || nota.compareTo(new BigDecimal("10.0")) > 0) {
			throw new NotaForaDoIntervaloException();
		}
		this.nota = nota;
	}
	
	public BigDecimal getNota() {
		return nota;
	}

}
