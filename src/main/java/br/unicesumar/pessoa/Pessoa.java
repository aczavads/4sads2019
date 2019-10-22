package br.unicesumar.pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.unicesumar.pessoa.papel.Papel;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
	@Id
	private String id;
	private String nome;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pessoa_id")
	private List<Endereco> enderecos;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pessoa_id")
	private List<Papel> papeis;

	public Pessoa() {
		id = UUID.randomUUID().toString();
		enderecos = new ArrayList<>();
	}

	public Pessoa(String nome) {
		this();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void addEndereco(Endereco e) {
		enderecos.add(e);
	}
	
	public List<Papel> getPapeis() {
		return papeis;
	}

	public void addPapel(Papel p) {
		papeis.add(p);
	}

}
