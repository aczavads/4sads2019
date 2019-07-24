package aula20190729;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Cidade {
	//atributo simples
	private String nome;
	//atributo simples
	private String sigla;
	//atributo de associação entre Cidade e Rua (0..n)
	private Set<Rua> ruas = new HashSet<>();
	
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
	
	public Set<Rua> getRuas() {
		//1: retornando a coleção original o que permite a modificação externa, ferindo o encapsulamento!
		//return ruas;
		
		//2: retornando uma nova coleção não modificável que gerará uma exceção caso alguém tente modificar seu conteúdo.
		//Esta é a forma preferencial, pois a exceção deixará claro que houve uma tentativa de modificar a coleção. :D
		Set<Rua> novoConjuntoNãoModificável = Collections.unmodifiableSet(ruas); 
		return novoConjuntoNãoModificável;
		
		//3: retornando uma nove coleção modificável que contém os mesmos elementos da coleção original
		//Set<Rua> novoConjuntoModificável = new HashSet<>(ruas);
		//return novoConjuntoModificável;
	}
	
	

}
