package com.jwsystems.jw.entities.dtos;

import com.jwsystems.jw.entities.domain.Categoria;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;

public class CategoriaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    @NotNull(message = "O campo NOME é requerido")
    private String nome;
    @NotNull(message = "O campo COR é requerido")
    private String cor;

    public CategoriaDTO() {
    }

    public CategoriaDTO(Categoria obj){
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.cor = obj.getCor();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
