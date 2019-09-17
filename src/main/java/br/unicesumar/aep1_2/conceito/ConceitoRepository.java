package br.unicesumar.aep1_2.conceito;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConceitoRepository extends JpaRepository<Conceito, String>{
	
	//@Query(value="select a.nome, avg(c.nota) from aluno a inner join conceito c on c.aluno_id = a.id group by a.nome", nativeQuery=true)
	@Query(value="select 1 as A , 2 as B, 4 as C union all select 4, 5, 6 union all select 7, 8,9 ", nativeQuery=true)
	List<Map<String,Object>> consultarNotasMedias();

}
