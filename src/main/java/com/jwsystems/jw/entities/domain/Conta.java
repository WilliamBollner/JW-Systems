package com.jwsystems.jw.entities.domain;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Conta implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeConta;
    private BigDecimal saldoInicial;
    private BigDecimal saldo;
    @OneToMany(mappedBy = "conta")
    private List<CartaoCredito> cartaoCreditos = new ArrayList<>();
    @OneToMany(mappedBy = "conta")
    private List<Receita> receitas = new ArrayList<>();
    @OneToMany(mappedBy = "conta")
    private List<Despesa> despesas = new ArrayList<>();

    public Conta(){
    }

    public Conta(Integer id, String nomeConta, BigDecimal saldoInicial, BigDecimal saldo, List<CartaoCredito> cartaoCreditos, List<Receita> receitas, List<Despesa> despesas) {
        this.id = id;
        this.nomeConta = nomeConta;
        this.saldoInicial = saldoInicial;
        this.saldo = saldo;
        this.cartaoCreditos = cartaoCreditos;
        this.receitas = receitas;
        this.despesas = despesas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public BigDecimal getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(BigDecimal saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public List<CartaoCredito> getCartaoCreditos() {
        return cartaoCreditos;
    }

    public void setCartaoCreditos(List<CartaoCredito> cartaoCreditos) {
        this.cartaoCreditos = cartaoCreditos;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }
}
