package br.com.geanluccazappe.exercicio04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

@SpringBootApplication
public class Exercicio04Application {

    public static String listaDeNomes;
    public static String listaDeSobrenomes;
    public static String listaDeClubes;
    public static String listaDeposicoes;

    public static void main(String[] args) throws Exception {
        listaDeNomes = retornaListaDaURI("https://venson.net.br/resources/data/nomes.txt");
        listaDeSobrenomes = retornaListaDaURI("https://venson.net.br/resources/data/sobrenomes.txt");
        listaDeClubes = retornaListaDaURI("https://venson.net.br/resources/data/clubes.txt");
        listaDeposicoes = retornaListaDaURI("https://venson.net.br/resources/data/posicoes.txt");

        SpringApplication.run(Exercicio04Application.class, args);
    }

    public static int geraNumeroAleatorio(int menor, int maior) {
        int diference = maior - menor;
        int aleatorio = (int) Math.floor(Math.random() * diference);
        return aleatorio + menor;
    }

    public static String retornaListaDaURI(String minhaUri) throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(minhaUri)).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String lista = response.body();
        return lista;
    }

    public static String retornaIndiceAleatorio(String stringao) {
        String[] listaDeNomes = stringao.split("\n");
        int indiceAleatorio = (int) Math.floor(Math.random()* listaDeNomes.length);
        return listaDeNomes[indiceAleatorio];
    }
}
