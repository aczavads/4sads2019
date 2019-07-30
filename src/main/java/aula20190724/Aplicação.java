package aula20190724;

public class Aplicação {
	
	public static void main(String[] args) {
		Cidade maringá = new Cidade("Maringá","MGA");
		Rua avBrasil = new Rua("Avenida Brasil");
		Rua avGuedner = new Rua("Avenida Guedner");		
		
		maringá.adicionarRua(avBrasil);
		maringá.adicionarRua(avGuedner);
		maringá.adicionarRua(new Rua("Rua Santos Dummont"));
		
		listarRuasDaCidadeNoConsole(maringá);
		
		//Deveria gerar uma exceção pois não se deve modificar diretamente uma coleção de associação entre entidades!
		//Veja no getRuas da classe Cidade a explicação detalhada com as opções de implementação.
		//maringá.getRuas().remove(avBrasil);
		
		maringá.removerRua(avGuedner);
		listarRuasDaCidadeNoConsole(maringá);

		
		System.out.println("Foi.");		
	}
	
	public static void listarRuasDaCidadeNoConsole(Cidade c) {
		System.out.println("-----------------------");
		for (Rua ruaDaVez : c.getRuas() ) {
			System.out.println(ruaDaVez.getNome());
		}
	}

}
