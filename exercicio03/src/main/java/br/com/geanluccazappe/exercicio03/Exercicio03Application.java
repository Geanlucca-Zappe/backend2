package br.com.geanluccazappe.exercicio03;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Exercicio03Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Exercicio03Application.class, args);

        OscarService oscarService = context.getBean(OscarService.class);

        //Cria uma lista de atores
        List<Ator> atores = new ArrayList<>();
        List<Filme> filmes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        //Solicita ao usuário para adicionar atores e filmes
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do ator:");
            String nomeAtor = scanner.nextLine();

            System.out.println("Digite a nacionalidade do ator:");
            String nacionalidadeAtor = scanner.nextLine();

            System.out.println("O ator é elegível? (sim/não):");
            String elegivelAtor = scanner.nextLine();
            boolean isElegivel = elegivelAtor.equalsIgnoreCase("sim");

            Ator ator = context.getBean(Ator.class);
            ator.setNome(nomeAtor);
            ator.setNacionalidade(nacionalidadeAtor);
            ator.setElegivel(isElegivel);
            atores.add(ator);

            System.out.println("Digite o nome do filme:");
            String nomeFilme = scanner.nextLine();

            System.out.println("Digite o gênero do filme:");
            String generoFilme = scanner.nextLine();

            Filme filme = context.getBean(Filme.class);
            filme.setNomeFilme(nomeFilme);
            filme.setGenero(generoFilme);
            filme.setElegivel(true);
            filmes.add(filme);
        }

        //adiciona cada ator e filme da lista ao OscarService
        for (Ator ator : atores) {
            oscarService.adicionarIndicado(ator);
        }

        for (Filme filme : filmes) {
            oscarService.adicionarIndicado(filme);
        }

        //Imprime a lista de indicados 
        oscarService.mostrarListaIndicados();
		scanner.close();
    }
}
