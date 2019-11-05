package aula20191104.generics;

public class App {
	
	public static void main(String[] args) {
		Cesta<Ovo> cesta = new Cesta<Ovo>();
		cesta.adicionar(new Ovo());
		cesta.adicionar(new Ovo());
		cesta.adicionar(new Ovo());
		cesta.adicionar(new Ovo());
		cesta.adicionar(new Limão());
	}

}
