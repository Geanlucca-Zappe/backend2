package com.example.exercicio07.Mappers;

import com.example.exercicio07.DTOS.ClienteDTO;
import com.example.exercicio07.Modelos.Cliente;

public class ClienteMapper {
    public ClienteDTO toDTO(Cliente cliente) {
        ClienteDTO dto = new ClienteDTO();
        dto.setNome(cliente.getNome());
        dto.setSaldo(cliente.getSaldo());
        return dto;
    }

    public Cliente toEntity(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente(null, 0, null);
        cliente.setNome(clienteDTO.getNome());
        cliente.setSaldo(clienteDTO.getSaldo());
        // A senha não é definida aqui porque não deve ser exposta no DTO
        return cliente;
    }
}