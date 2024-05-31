package br.com.geanluccazappe.exercicio09.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.geanluccazappe.exercicio09.Models.Livro;

import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    Optional<Livro> findByNome(String nome);
}
