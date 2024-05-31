package br.com.geanluccazappe.exercicio07.Services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.geanluccazappe.exercicio07.Modelos.Cliente;
import br.com.geanluccazappe.exercicio07.Modelos.Transacao;

@Service
public class ClienteService {
    private Map<String, Cliente> clientes = new HashMap<>();

    public ClienteService() {
        // inicializar alguns clientes
        clientes.put("cliente1", new Cliente("cliente1", 1000.0, "senha1"));
        clientes.put("cliente2", new Cliente("cliente2", 2000.0, "senha2"));
        clientes.put("cliente3", new Cliente("cliente3", 3000.0, "senha3"));
    }

    public Cliente getCliente(String nome) {
        return clientes.get(nome);
    }

    public void createTransacao(Transacao transacao) {
        Cliente pagador = clientes.get(transacao.getPagador());
        Cliente recebedor = clientes.get(transacao.getRecebedor());

        if (pagador == null || recebedor == null) {
            throw new IllegalArgumentException("Pagador ou recebedor não encontrado");
        }

        Double quantidade = transacao.getQuantidade();
        if (pagador.getSaldo() < quantidade) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        pagador.setSaldo(pagador.getSaldo() - quantidade);
        recebedor.setSaldo(recebedor.getSaldo() + quantidade);
    }
}
