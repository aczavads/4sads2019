package br.unicesumar.pessoa;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Juridica extends Pessoa {
	private String cnpj;
	private String razaoSocial;
	private Date fundadaEm;

	public Juridica() {
		super();
	}

	public Juridica(String nome, String cnpj, String razaoSocial, Date fundadaEm) {
		super(nome);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.fundadaEm = fundadaEm;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Date getFundadaEm() {
		return fundadaEm;
	}

	public void setFundadaEm(Date fundadaEm) {
		this.fundadaEm = fundadaEm;
	}

}
