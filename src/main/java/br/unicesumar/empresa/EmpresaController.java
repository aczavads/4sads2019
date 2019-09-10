package br.unicesumar.empresa;

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
@RequestMapping("/api/empresas")
public class EmpresaController {
	@Autowired
	private EmpresaRepository repo;

	@GetMapping
	public List<Empresa> getAll() {
		return repo.findAll();
	}
	

	@GetMapping("/{id}")
	public Empresa getById(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") String id) {
		repo.deleteById(id);
	}

	@PostMapping
	public String post(@RequestBody Empresa novo) {
		novo = repo.save(novo);
		return novo.getId();
	}

	@PutMapping("/{id}")
	public void put(@PathVariable String id, @RequestBody Empresa Empresa) {
		if (!id.equals(Empresa.getId())) {
			throw new RuntimeException("Empresa.Id inválido!");
		}
		Empresa = repo.save(Empresa);
	}
}
