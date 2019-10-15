package br.unicesumar.pessoa;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {
	@Autowired
	private PessoaRepository repo;
	
	
	@GetMapping
	public List<Pessoa> get() {
		return repo.findAll();
	}
	
	@PostMapping("/fisicas")
	public UUID post(@RequestBody Fisica nova) {
		repo.save(nova);
		return nova.getId();
	}
	
	@PostMapping("/juridicas")
	public UUID post(@RequestBody Juridica nova) {
		repo.save(nova);
		return nova.getId();
	}
	
	@PostMapping("/{id}/professor")
	public void post(@PathVariable UUID id, @RequestBody Professor papel) {
		Pessoa pessoa = repo.findById(id).get();
		pessoa.addPapel(papel);
		repo.save(pessoa);
	}
	@PostMapping("/{id}/aluno")
	public void post(@PathVariable UUID id, @RequestBody Aluno papel) {
		Pessoa pessoa = repo.findById(id).get();
		pessoa.addPapel(papel);
		repo.save(pessoa);
	}

}
