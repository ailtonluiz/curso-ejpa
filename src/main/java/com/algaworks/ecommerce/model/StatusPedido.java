package com.algaworks.ecommerce.model;

import lombok.Getter;

public enum StatusPedido {

    AGUARDANDO("Aguardando"),
    CANCELADO("Cancelado"),
    PAGO("Pago");

    @Getter
    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

}
