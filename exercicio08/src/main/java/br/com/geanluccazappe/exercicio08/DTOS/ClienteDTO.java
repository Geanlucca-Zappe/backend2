package br.com.geanluccazappe.exercicio08.DTOS;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;

public class ClienteDTO {
    @NotNull
    @Size(min = 1, max = 100)
    private String nome;

    @NotNull
    @Min(0)
    private Double saldo;

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
}

