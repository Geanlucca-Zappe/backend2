package com.example.exercicio07.Mappers;

import com.example.exercicio07.DTOS.TransacaoDTO;
import com.example.exercicio07.Modelos.Transacao;

public class TransacaoMapper {
    public TransacaoDTO toDTO(Transacao transacao) {
        TransacaoDTO dto = new TransacaoDTO();
        dto.setPagador(transacao.getPagador());
        dto.setRecebedor(transacao.getRecebedor());
        dto.setQuantidade(transacao.getQuantidade());
        return dto;
    }

    public Transacao toEntity(TransacaoDTO transacaoDTO) {
        Transacao transacao = new Transacao();
        transacao.setPagador(transacaoDTO.getPagador());
        transacao.setRecebedor(transacaoDTO.getRecebedor());
        transacao.setQuantidade(transacaoDTO.getQuantidade());
        return transacao;
    }
}