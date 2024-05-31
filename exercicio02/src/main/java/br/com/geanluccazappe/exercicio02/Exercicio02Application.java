package br.com.geanluccazappe.exercicio02;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Random;

public class Exercicio02Application {

    private List<String> nomes;
    private List<String> sobrenomes;
    private List<String> clubes;
    private List<String> posicoes;

    public Exercicio02Application() throws Exception {
        nomes = List.of(retornaListaDaURI("https://venson.net.br/resources/data/nomes.txt").split("\n"));
        sobrenomes = List.of(retornaListaDaURI("https://venson.net.br/resources/data/sobrenomes.txt").split("\n"));
        clubes = List.of(retornaListaDaURI("https://venson.net.br/resources/data/clubes.txt").split("\n"));
        posicoes = List.of(retornaListaDaURI("https://venson.net.br/resources/data/posicoes.txt").split("\n"));
    }

    public Jogador gerarJogador() {
        Random random = new Random();
        String nome = nomes.get(random.nextInt(nomes.size()));
        String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
        String clube = clubes.get(random.nextInt(clubes.size()));
        String posicao = posicoes.get(random.nextInt(posicoes.size()));
        int idade = geraNumeroAleatorio(17, 40);
        return new Jogador(nome, sobrenome, clube, posicao, idade);
    }

    private static int geraNumeroAleatorio(int menor, int maior) {
        Random random = new Random();
        return random.nextInt(maior - menor + 1) + menor;
    }

    private static String retornaListaDaURI(String minhaUri) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(minhaUri)).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        return response.body();
    }
}

class Jogador {

    private String nome;
    private String sobrenome;
    private String clube;
    private String posicao;
    private int idade;

    public Jogador(String nome, String sobrenome, String clube, String posicao, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.clube = clube;
        this.posicao = posicao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getClube() {
        return clube;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getIdade() {
        return idade;
    }

    public String getDescricao() {
        return nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + clube + ".";
    }
}
