package br.unicesumar.cidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unicesumar.rua.Rua;

@RestController
@RequestMapping("/api/cidades")
public class CidadeController {
	@Autowired
	private CidadeRepository repo;
	
	@GetMapping
	public List<Cidade> get() {
		return repo.findAll();
	}
	
	@PostMapping
	public String post(@RequestBody Cidade nova) {		
		for (Rua r : nova.getRuas()) {
			r.setCidade(nova);
		}
		
		
		nova = repo.save(nova);
		return nova.getId();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		repo.deleteById(id);
	}

}
