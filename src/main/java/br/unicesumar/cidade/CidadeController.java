package br.unicesumar.cidade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cidades")
public class CidadeController {
	@Autowired
	private CidadeRepository repo;
	
	@GetMapping
	public List<Cidade> get() {
		return repo.findAll();
	}

}
