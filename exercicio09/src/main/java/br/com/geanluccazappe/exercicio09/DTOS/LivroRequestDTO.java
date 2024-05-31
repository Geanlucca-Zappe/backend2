package br.com.geanluccazappe.exercicio09.DTOS;

import br.com.geanluccazappe.exercicio09.Models.Livro;

public class LivroRequestDTO {
    private String nome;
    private String autor;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro toLivro() {
        Livro livro = new Livro();
        livro.setNome(this.nome);
        livro.setAutor(this.autor);
        return livro;
    }

}
