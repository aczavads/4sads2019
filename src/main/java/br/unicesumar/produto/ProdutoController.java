package br.unicesumar.produto;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repo;

	@GetMapping
	public List<Produto> getAll() {
		return repo.findAll();
	}
	@GetMapping("/porPreco")
	public List<Produto> getAll(@RequestParam("preco") double preco) {
		return repo.findByPreco(preco);
	}
	
	@GetMapping("/consultarProdutosDeMaiorPreco")
	public List<Produto> getProdutosDeMaiorPreco() {
		return repo.consultarProdutoDeMaiorPreco();
	}
	
	@GetMapping("/consultarProdutosDeMenorPreco")
	public List<Produto> getProdutosDeMenorPreco() {
		return repo.consultarProdutoDeMenorPreco();
	}
	@GetMapping("/consultarPrecoMedio")
	public BigDecimal getPrecoMedio() {
		return repo.consultarPrecoMedio().setScale(2, RoundingMode.DOWN);
	}
	

	@GetMapping("/{id}")
	public Produto getById(@PathVariable("id") String id) {
		return repo.findById(id).get();
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") String id) {
		repo.deleteById(id);
	}

	@PostMapping
	public String post(@RequestBody Produto novo) {
		novo = repo.save(novo);
		return novo.getId();
	}

	@PutMapping("/{id}")
	public void put(@PathVariable String id, @RequestBody Produto produto) {
		if (!id.equals(produto.getId())) {
			throw new RuntimeException("Produto.Id inválido!");
		}
		produto = repo.save(produto);
	}
}
