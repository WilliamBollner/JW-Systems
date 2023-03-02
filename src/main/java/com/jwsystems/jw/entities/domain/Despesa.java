package com.jwsystems.jw.entities.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Despesa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private BigDecimal valor;
    private String descricao;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate data;
    @ManyToOne
    @JoinColumn(name = "conta_id")
    private Conta conta;

    @ManyToOne
    @JoinColumn(name = "cartao_credito_id")
    private CartaoCredito cartaoCredito;

    @OneToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Despesa(){
    }

    public Despesa(Integer id, BigDecimal valor, String descricao, LocalDate data, Conta conta, CartaoCredito cartaoCredito, Categoria categoria) {
        id = id;
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
        this.conta = conta;
        this.cartaoCredito = cartaoCredito;
        this.categoria = categoria;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

}
