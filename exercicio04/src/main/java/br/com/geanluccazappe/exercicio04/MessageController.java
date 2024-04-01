package br.com.geanluccazappe.exercicio04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/mensagem")
    public String mensagem() {
        String nome = Exercicio04Application.retornaIndiceAleatorio(Exercicio04Application.listaDeNomes);
        String sobrenome = Exercicio04Application.retornaIndiceAleatorio(Exercicio04Application.listaDeSobrenomes);
        String clube = Exercicio04Application.retornaIndiceAleatorio(Exercicio04Application.listaDeClubes);
        String posicao = Exercicio04Application.retornaIndiceAleatorio(Exercicio04Application.listaDeposicoes);
        int idades = Exercicio04Application.geraNumeroAleatorio(17,40);

        return nome +" "+ sobrenome + " é um futebolista brasileiro de " + idades + " anos que atua como " + posicao + ". Atualmente defende o " + clube + ".";
    }
}
