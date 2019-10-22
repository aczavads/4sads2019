package br.unicesumar.cor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;

public interface CorRepository  extends JpaRepository<Cor, String>{
	
	

}
