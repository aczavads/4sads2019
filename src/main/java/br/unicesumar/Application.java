package br.unicesumar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.unicesumar.cidade.Cidade;
import br.unicesumar.cidade.CidadeRepository;
import br.unicesumar.rua.Rua;
import br.unicesumar.rua.RuaRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private RuaRepository repoRua;

	@Autowired
	private CidadeRepository repoCidade;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		Cidade maringá = repoCidade.save(new Cidade("Maringá","MGA"));
		System.out.println(maringá.getId());
		
		Rua avBrasil = repoRua.save(new Rua("Avenida Brasil"));
		Rua avGuedner = repoRua.save(new Rua("Avenida Guedner"));
		
		maringá.adicionarRua(avBrasil);
		maringá.adicionarRua(avGuedner);
		
		repoCidade.save(maringá);
		
		System.out.println("Foi.");
	}

}
