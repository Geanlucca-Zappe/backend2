package com.example.demo.models;


import lombok.Data;

@Data
public class JogadorEntity {
    String nome = "Jogador 1";

    int posicaoX = 0;
    int posicaoY = 0;

    public void mover(int x, int y) {
        posicaoX = x;
        posicaoY = y;

    }
    public String getPosicao(){
        return posicaoX + " / " + posicaoY;

    }
    
}
