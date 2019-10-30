package br.unicesumar.fluxo_de_caixa;

import java.math.BigDecimal;
import java.util.Date;

public class ContaBancaria {
	private String numeroDaAgencia;
	private String numeroDaConta;
	private TipoContaBancaria tipo;
	private BigDecimal saldo;

	public ContaBancaria(String numeroDaAgencia, String numeroDaConta, TipoContaBancaria tipo) {
		this.numeroDaAgencia = numeroDaAgencia;
		this.numeroDaConta = numeroDaConta;
		this.tipo = tipo;
		saldo = new BigDecimal("0.00");
	}

	public String getNumeroDaAgencia() {
		return numeroDaAgencia;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public TipoContaBancaria getTipo() {
		return tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public MovimentoContaBancaria debitar(Date data, BigDecimal valor) {
		this.saldo = saldo.subtract(valor);
		return new MovimentoContaBancaria(data, valor, TipoMovimentoContaBancaria.DÉBITO);
	}

	public MovimentoContaBancaria creditar(Date data, BigDecimal valor) {
		this.saldo = saldo.add(valor);
		return new MovimentoContaBancaria(data, valor, TipoMovimentoContaBancaria.CRÉDITO);
	}

	

}
