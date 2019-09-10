package br.unicesumar.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<Produto, String>{
	
	@Query(value="select a.* from produto a where preco = (select max(b.preco) from produto b)", nativeQuery=true)
	List<Produto> consultarProdutoDeMaiorPreco();

}
