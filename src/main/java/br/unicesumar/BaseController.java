package br.unicesumar;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//Type parameters or generics
public class BaseController<ENTITY extends BaseEntity, REPOSITORY extends JpaRepository<ENTITY, String>> {
	@Autowired
	private REPOSITORY repo;

	
	public REPOSITORY getRepo() {
		return repo;
	}
	
	@GetMapping
	public List<ENTITY> getAll() {
		return repo.findAll();
	}

	@PostMapping
	public String post(@RequestBody ENTITY obj) {
		repo.save(obj);
		return obj.getId();
	}

	@PutMapping("/{id}")
	public void put(@PathVariable String id, @RequestBody ENTITY obj) {

		if (!Objects.equals(id, obj.getId())) {
			throw new RuntimeException("Requisição inválida! Ids não conferem!");
		}
		repo.save(obj);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repo.deleteById(id);
	}

}
