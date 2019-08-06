package br.unicesumar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.unicesumar.rua.Rua;
import br.unicesumar.rua.RuaRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private RuaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		repo.save(new Rua("Av. Guedner"));
		
		Rua rua1 = repo.findById(1L).get();
		rua1.setNome("Xiii " + System.currentTimeMillis());
		
		repo.save(rua1);
		
		for (Rua rua : repo.findAll()) {
			System.out.println(rua.getNome());
		}
		
		//continuar aqui com a classe cor...
		//Have fun! :D
		
		System.out.println("Foi.");
	}

}
