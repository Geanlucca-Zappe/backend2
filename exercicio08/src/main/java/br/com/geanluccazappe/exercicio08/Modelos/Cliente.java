package br.com.geanluccazappe.exercicio08.Modelos;

public class Cliente {
    private String nome;
    private Double saldo;
    private String senha;
   
    public Cliente(String nome, double saldo, String senha) {

    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}