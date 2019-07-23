package aula20190722;

import java.util.Set;

public class Cidade {
	private String nome;
	private String sigla;
	private Set<Rua> ruas;
	
	public Cidade(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}	
	
	public void removerRua(Rua r) {
		this.ruas.remove(r);
	}
	
	public void adicionarRua(Rua r) {
		this.ruas.add(r);
	}	

}
