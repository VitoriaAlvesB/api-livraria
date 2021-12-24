package library.com.book.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import library.com.book.models.Livros;
import library.com.book.repositories.LivrosRepository;

@RestController
@RequestMapping(value = "/api")
public class LivrosController {
	
	@Autowired
	LivrosRepository livrosRepository;

	@PostMapping("/salvar/livro")
	public void salvarLivros(@RequestBody Livros livro) {
		livrosRepository.save(livro);
	}
	
	@GetMapping("/livros") 
	public List<Livros> ListaTodosLivros() {
		return livrosRepository.findAll();
	}
	
	@PutMapping("/livro/{id}")
	public Livros atualizaLivro(@RequestBody Livros livros) {
		return livrosRepository.save(livros);
	}
	
	@DeleteMapping("deletar/livro")
	public void deletaLivro(@RequestBody Livros livros) {
		livrosRepository.delete(livros);
	}
}
