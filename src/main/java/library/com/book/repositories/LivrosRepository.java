package library.com.book.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import library.com.book.models.Livros;

public interface LivrosRepository extends JpaRepository<Livros, Long> {

}
