package br.unicesumar.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public void post(@RequestBody Fisica nova) {
		repo.save(nova);
	}
	
	@PostMapping("/juridicas")
	public void post(@RequestBody Juridica nova) {
		repo.save(nova);
	}

}
