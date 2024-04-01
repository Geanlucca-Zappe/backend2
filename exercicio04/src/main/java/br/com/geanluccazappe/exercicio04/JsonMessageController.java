package br.com.geanluccazappe.exercicio04;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class JsonMessageController {

    @GetMapping("/jogadorJson")
    public Map<String, Object> jogadorJson() {
        Map<String, Object> jogador = new HashMap<>();
        jogador.put("nome", Exercicio04Application.retornaIndiceAleatorio(Exercicio04Application.listaDeNomes));
        jogador.put("sobrenome", Exercicio04Application.retornaIndiceAleatorio(Exercicio04Application.listaDeSobrenomes));
        jogador.put("clube", Exercicio04Application.retornaIndiceAleatorio(Exercicio04Application.listaDeClubes));
        jogador.put("posicao", Exercicio04Application.retornaIndiceAleatorio(Exercicio04Application.listaDeposicoes));
        jogador.put("idade", Exercicio04Application.geraNumeroAleatorio(17,40));

        return jogador;
    }
}
