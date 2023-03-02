package com.jwsystems.jw.entities.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CartaoCredito implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataFechamentoFatura;
    @OneToOne
    @JoinColumn(name = "conta_id")
    private Conta conta;

    @OneToMany(mappedBy = "cartaoCredito")
    private List<Despesa> despesas = new ArrayList<>();

    public CartaoCredito(){
    }

    public CartaoCredito(Integer id, String nome, LocalDate dataFechamentoFatura, Conta conta, List<Despesa> despesas) {
        this.id = id;
        this.nome = nome;
        this.dataFechamentoFatura = dataFechamentoFatura;
        this.conta = conta;
        this.despesas = despesas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataFechamentoFatura() {
        return dataFechamentoFatura;
    }

    public void setDataFechamentoFatura(LocalDate dataFechamentoFatura) {
        this.dataFechamentoFatura = dataFechamentoFatura;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
