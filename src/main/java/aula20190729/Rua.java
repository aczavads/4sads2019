package aula20190729;

public class Rua {
	private String nome;
	private Cidade cidade;

	public Rua(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	// + adicionarCidade(c : Cidade) : void
	public void adicionarCidade(Cidade c) {
		System.out.println("Adicionando a cidade na rua...");
		this.cidade = c;
		c.adicionarRua(this);
	}

	public void removerCidade() {
		this.cidade = null;
	}

}
