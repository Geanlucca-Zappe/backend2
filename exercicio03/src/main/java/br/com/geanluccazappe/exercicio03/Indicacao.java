package br.com.geanluccazappe.exercicio03;

public class Indicacao implements Indicavel {
    private boolean elegivel;
    private int numeroDeIndicacoes;
    private String categoria; // novo atributo

    //getters e setters para categoria
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean isElegivel() {
        return elegivel;
    }

    @Override
    public void setElegivel(boolean elegivel) {
        this.elegivel = elegivel;
    }

    @Override
    public int getNumeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }

    @Override
    public void incrementarIndicacoes() {
        this.numeroDeIndicacoes++;
    }
}
