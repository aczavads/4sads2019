package br.unicesumar.produto;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<Produto, String>{
	//@Query(value="select * from produto where produto.preco = :preco", nativeQuery=true)
	List<Produto> findByPreco(double preco);
	
	@Query(value="select a.* from produto a where preco = (select max(b.preco) from produto b)", nativeQuery=true)
	List<Produto> consultarProdutoDeMaiorPreco();

	@Query(value="select a.* from produto a where preco = (select min(b.preco) from produto b)", nativeQuery=true)
	List<Produto> consultarProdutoDeMenorPreco();
	
	@Query(value="select avg(a.preco) from produto a", nativeQuery=true)
	BigDecimal consultarPrecoMedio();
	
}
