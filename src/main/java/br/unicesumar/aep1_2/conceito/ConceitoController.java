package br.unicesumar.aep1_2.conceito;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/conceitos")
public class ConceitoController {
	
	@Autowired
	private ConceitoRepository repo;
	
	@GetMapping("/medias") 
	public List<Map<String, Object>> consultarMedias() {
		return repo.consultarNotasMedias();
	}

}
