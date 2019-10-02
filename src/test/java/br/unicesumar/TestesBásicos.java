package br.unicesumar;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestesBásicos {

	@Test
	public void testar_somar_dois_números() {		
		double somaA = Utilitário.somar(10.0,30.0);
		double somaB = Utilitário.somar(701.01,-1.01);
		
		assertEquals("A soma está incorreta!", 40, somaA, 0.00);
		assertEquals("A soma está incorreta!", 700, somaB, 0.00);
	}
	
	@Test
	public void testar_somar_vários_números() {		
		double somaA = Utilitário.somar(10.0,30.0,10.00,10.00,20.00);
		double somaB = Utilitário.somar(701.01,-1.01, -1);
		
		assertEquals("A soma está incorreta!", 40, somaA, 0.00);
		assertEquals("A soma está incorreta!!", 699, somaB, 0.00);
	}

}
