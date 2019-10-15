package br.unicesumar;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestesBásicos {

	/*
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
		
		assertEquals("A soma está incorreta!", 80, somaA, 0.00);
		assertEquals("A soma está incorreta!!", 699, somaB, 0.00);
	}
	
	@Test
	public void encontrar_maior_valor_no_array() {		
		double maiorA = Utilitário.encontrarMaior(new double[]{10,50,55.55,3,3.27,15,60,12,14});
		double maiorB = Utilitário.encontrarMaior(new double[]{1,500,55.55,3,3.27,15,60});
		
		assertEquals("Maior incorreto!", 60, maiorA, 0.00);
		assertEquals("Maior incorreto!", 500, maiorB, 0.00);
	}

	@Test(expected=ArrayVazioException.class)
	public void encontrar_maior_valor_no_array_vazio() {
		double maiorA = Utilitário.encontrarMaior(new double[]{});		
	}
	
	@Test
	public void inverter_string() {
		String stringA = Utilitário.inverter("roxo");
		String stringB = Utilitário.inverter("rosa");
		
		assertEquals("oxor", stringA);
		assertEquals("asor", stringB);		
	}
	*/
	
	@Test
	public void inverter_lista_encadeada() {
		Elemento primeiro = new Elemento("A");
		Elemento segundo = new Elemento("B");
		Elemento terceiro = new Elemento("C");
		Elemento quarto = new Elemento("D");
		primeiro.setProximo(segundo);
		segundo.setProximo(terceiro);
		terceiro.setProximo(quarto);
		
		Elemento primeiroInvertido = Utilitário.inverter(primeiro);
		
		assertEquals(primeiroInvertido.getValor(), "D");
		assertEquals(primeiroInvertido.getProximo().getValor, "C");
		assertEquals(primeiroInvertido.getProximo().getProximo().getValor, "B");
		assertEquals(primeiroInvertido.getProximo().getProximo().getProximo().getValor, "A");
	}

	

}
