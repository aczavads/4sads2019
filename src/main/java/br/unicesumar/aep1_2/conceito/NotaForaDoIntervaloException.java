package br.unicesumar.aep1_2.conceito;

public class NotaForaDoIntervaloException extends RuntimeException {
	
	public NotaForaDoIntervaloException() {
		super("A nota deve estar no intervalo de 0.0 a 10.0!");
	}

}
