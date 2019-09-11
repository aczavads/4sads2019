package br.unicesumar.socio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/socios")
public class SocioController {
	@Autowired
	private SocioRepository repo;

	@GetMapping
	public List<Socio> getAll() {
		return repo.findAll();
	}

	@GetMapping("/{id}")
	public Socio getById(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") String id) {
		repo.deleteById(id);
	}

	@PostMapping
	public String post(@RequestBody Socio novo) {
		novo = repo.save(novo);
		return novo.getId();
	}

	@PutMapping("/{id}")
	public void put(@PathVariable String id, @RequestBody Socio socio) {
		if (!id.equals(socio.getId())) {
			throw new RuntimeException("Socio.Id inválido!");
		}
		socio = repo.save(socio);
	}
}
