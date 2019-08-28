package br.unicesumar.rua;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.rua.Rua;
import br.unicesumar.rua.RuaRepository;

@RestController
@RequestMapping("/api/ruas")
public class RuaController {
	@Autowired
	private RuaRepository repo;
	
	@GetMapping
	public List<Rua> get() {
		return repo.findAll();
	}
	
	@PostMapping
	public String post(@RequestBody Rua nova) {
		nova = repo.save(nova);
		return nova.getId();
	}

}
