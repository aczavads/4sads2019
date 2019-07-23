package aula20190722;

public class Aplicação {
	
	public static void main(String[] args) {
		Cidade maringá = new Cidade("Maringá","MGA");
		Rua avBrasil = new Rua("Avenida Brasil");
		Rua avGuedner = new Rua("Avenida Guedner");
		
		
		maringá.adicionarRua(avBrasil);
		maringá.adicionarRua(avGuedner);
		maringá.adicionarRua(new Rua("Rua Santos Dummont"));
		
		maringá.removerRua(avGuedner);
		
		
	}

}
