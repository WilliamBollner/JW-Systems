package com.jwsystems.jw.entities.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jwsystems.jw.entities.domain.Despesa;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class DespesaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    @NotNull(message = "O campo VALOR é requerido")
    private BigDecimal valor;
    private String descricao;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
    private String nomeConta;
    private String nomeCartao;
    @NotNull(message = "O campo CATEGORIA é requerido")
    private String nomeCategoria;

    public DespesaDTO(){
    }

    public DespesaDTO(Despesa obj){
        this.id = obj.getId();
        this.valor = obj.getValor();
        this.descricao = obj.getDescricao();
        this.data = obj.getData();
        this.nomeConta = obj.getConta().getNomeConta();
        this.nomeCartao = obj.getCartaoCredito().getNome();
        this.nomeCategoria = obj.getCategoria().getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
}
