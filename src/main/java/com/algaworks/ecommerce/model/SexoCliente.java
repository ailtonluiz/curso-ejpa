package com.algaworks.ecommerce.model;

import lombok.Getter;

public enum SexoCliente {

    FEMININO("Feminino"),
    MASCULINO("Masculino");

    @Getter
    private String descricao;

    SexoCliente(String descricao){
        this.descricao = descricao;
    }
}
