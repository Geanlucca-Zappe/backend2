package com.example.exercicio07.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.exercicio07.DTOS.ClienteDTO;
import com.example.exercicio07.DTOS.TransacaoDTO;
import com.example.exercicio07.Mappers.ClienteMapper;
import com.example.exercicio07.Mappers.TransacaoMapper;
import com.example.exercicio07.Modelos.Cliente;
import com.example.exercicio07.Modelos.Transacao;
import com.example.exercicio07.Services.ClienteService;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/cliente/{nome}")
    public ResponseEntity<ClienteDTO> getCliente(@PathVariable(value = "nome") String nome) {
        Cliente cliente = clienteService.getCliente(nome);
        return ResponseEntity.ok().body(new ClienteMapper().toDTO(cliente));
    }

    @PostMapping("/transacao")
    public ResponseEntity<TransacaoDTO> createTransacao(@RequestBody TransacaoDTO transacaoDTO) {
        Transacao transacao = new TransacaoMapper().toEntity(transacaoDTO);
        clienteService.createTransacao(transacao);
        return ResponseEntity.ok().body(transacaoDTO);
    }
}