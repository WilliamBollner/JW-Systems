package com.jwsystems.jw.entities.dtos;


import com.jwsystems.jw.entities.domain.CartaoCredito;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;

public class CartaoCreditoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer Id;
    @NotNull(message = "O campo NOME é requerido")
    private String nome;
    @NotNull(message = "Uma CONTA é requerida")
    private String nomeConta;

    public CartaoCreditoDTO() {
    }

    public CartaoCreditoDTO(CartaoCredito obj){
        this.Id = obj.getId();
        this.nome = obj.getNome();
        this.nomeConta = obj.getConta().getNomeConta();
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }
}
