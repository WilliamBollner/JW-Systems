package com.jwsystems.jw.entities.dtos;

import com.jwsystems.jw.entities.domain.Receita;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class ReceitaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    @NotNull(message = "O campo VALOR é requerido")
    private BigDecimal valor;
    private String descricao;
    @NotNull(message = "O campo CONTA é requerido")
    private String nomeConta;

    public ReceitaDTO(){
    }

    public ReceitaDTO(Receita obj){
        this.id = obj.getId();
        this.valor = obj.getValor();
        this.descricao = obj.getDescricao();
        this.nomeConta = obj.getConta().getNomeConta();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }
}
