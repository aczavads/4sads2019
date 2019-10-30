package br.unicesumar.fluxo_de_caixa;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import junit.framework.TestCase;

public class TestesComContas extends TestCase {
	
	@Test
	public void testarSaldoConta() {
		
		ContaBancaria ccItau3712 = new ContaBancaria("3712","1325-4", TipoContaBancaria.CONTA_CORRENTE);
		
		assertEquals(new BigDecimal("0.00"), ccItau3712.getSaldo());
		
		ccItau3712.debitar(new Date(), new BigDecimal("100.00"));		
		assertEquals(new BigDecimal("-100.00"), ccItau3712.getSaldo());
		
		ccItau3712.debitar(new Date(), new BigDecimal("400.00"));		
		assertEquals(new BigDecimal("-500.00"), ccItau3712.getSaldo());

		ccItau3712.creditar(new Date(), new BigDecimal("50.00"));		
		assertEquals(new BigDecimal("-450.00"), ccItau3712.getSaldo());

	}

}
