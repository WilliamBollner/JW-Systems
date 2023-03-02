package com.jwsystems.jw.entities.dtos;

import com.jwsystems.jw.entities.domain.Conta;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class ContaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    @NotNull(message = "O campo NOME é requerido")
    private String nomeConta;
    @NotNull(message = "O campo SALDO INICIAL é requerido")
    private BigDecimal saldoInicial;
    @NotNull(message = "O campo SALDO é requerido")
    private BigDecimal saldo;

    public ContaDTO(){
    }

    public ContaDTO(Conta obj) {
        this.id = obj.getId();
        this.nomeConta = obj.getNomeConta();
        this.saldoInicial = obj.getSaldoInicial();
        this.saldo = obj.getSaldo();
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
}
