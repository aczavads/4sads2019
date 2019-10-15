package br.unicesumar;

import java.util.Stack;

public class Utilitário {

	public static Elemento inverter(Elemento e) {
		Stack<Elemento> pilha = new Stack<>();
		Elemento aux = e;
		while (aux != null) {
			pilha.push(aux);
			aux = aux.getProximo();
		}
		
		
		Elemento atual = new Elemento(pilha.pop().getValor());
		Elemento primeiro = atual;
		while (!pilha.isEmpty()) {
			Elemento proximo = new Elemento(pilha.pop().getValor());
			atual.setProximo(proximo);
			atual = proximo;
		}
		return primeiro;
	}


}
