package br.unicesumar;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
		if (System.currentTimeMillis()%2 == 0) {
			throw new RuntimeException("Vixe!");
		}
		return repo.findAll();
	}

	@PostMapping
	public ResponseEntity<String> post(@RequestBody ENTITY obj) {
		if (repo.findById(obj.getId()).isPresent()) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
		repo.save(obj);
		return ResponseEntity.status(HttpStatus.CREATED).body(obj.getId());
	}

	@PutMapping("/{id}")
	public ResponseEntity<Void> put(@PathVariable String id, @RequestBody ENTITY obj) {

		if (!Objects.equals(id, obj.getId())) {
			return ResponseEntity.badRequest().build();
		}
		repo.save(obj);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		if (repo.findById(id).isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		repo.deleteById(id);
		return ResponseEntity.status(HttpStatus.GONE).build();
	}

}
