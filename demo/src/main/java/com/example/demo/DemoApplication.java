package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.BlocoDeFerroEntity;
import com.example.demo.models.BlocoEntity;
import com.example.demo.models.ItemEntity;
import com.example.demo.models.JogadorEntity;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		JogadorEntity jogador1 = new JogadorEntity();
		JogadorEntity jogador2 = new JogadorEntity();
		BlocoEntity blocoEntity = new BlocoEntity();
		BlocoDeFerroEntity blocoDeFerroEntity = new BlocoDeFerroEntity("Minerio de Ferro");
		ItemEntity drop = blocoEntity.destruir();
		ItemEntity drop1 = blocoDeFerroEntity.destruir();

		if(drop1 == null){
			System.out.println("Não dropou");

		} else {
			System.out.println(drop1.getNome());
		}
		jogador1.mover(10, 15);
		jogador2.mover(98, 178);
		System.out.println(jogador1.getPosicao());
		System.out.println(jogador2.getPosicao());
	}

}
