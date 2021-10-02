package com.betha.statustce.statustce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(schema = "statustce",name = "empresa_atendimento")
@Entity
public class EmpresaAtendimento {

    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="nome")
    private String nome;

    public EmpresaAtendimento(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
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

    public EmpresaAtendimento(){

    }
}