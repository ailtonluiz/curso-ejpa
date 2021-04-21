package com.algaworks.ecommerce.model;

import lombok.Getter;

public enum StatusPagamento {

    PROCESSANDO("Processando"),
    CANCELADO("Cancelado"),
    RECEBIDO("Recebido");


    @Getter
    private String descricao;

    StatusPagamento(String descricao) {
        this.descricao = descricao;
    }
}
