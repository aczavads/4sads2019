package br.unicesumar.fluxo_de_caixa;

import java.math.BigDecimal;
import java.util.Date;

public class MovimentoContaBancaria {
	private Date data;
	private BigDecimal valor;
	private TipoMovimentoContaBancaria tipo;

	public MovimentoContaBancaria(Date data, BigDecimal valor, TipoMovimentoContaBancaria tipo) {
		this.data = data;
		this.valor = valor;
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public TipoMovimentoContaBancaria getTipo() {
		return tipo;
	}
	
	
	

}
