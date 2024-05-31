package br.com.geanluccazappe.exercicio09.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.geanluccazappe.exercicio09.DTOS.LivroRequestDTO;
import br.com.geanluccazappe.exercicio09.Models.Livro;
import br.com.geanluccazappe.exercicio09.Repository.LivroRepository;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public List<Livro> getAll() {
        return livroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Livro getOne(@PathVariable Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Livro create(@RequestBody LivroRequestDTO livroRequest) {
        Livro livro = livroRequest.toLivro();
        return livroRepository.save(livro);
    }

    @PutMapping("/{id}")
    public Livro update(@PathVariable Long id, @RequestBody LivroRequestDTO livroRequest) {
        Livro livro = livroRepository.findById(id).orElse(null);
        if (livro != null) {
            livro.setNome(livroRequest.getNome());
            livro.setAutor(livroRequest.getAutor());
            return livroRepository.save(livro);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        livroRepository.deleteById(id);
    }

    @GetMapping("/nome/{nome}")
    public Livro getByName(@PathVariable String nome) {
        return livroRepository.findByNome(nome).orElse(null);
    }
}
