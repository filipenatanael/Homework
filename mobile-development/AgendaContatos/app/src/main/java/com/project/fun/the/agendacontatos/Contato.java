package com.project.fun.the.agendacontatos;

/**
 * Created by Filipe Natanael on 02/05/2018.
 */

public class Contato {

    private int id;
    private String nome;
    private String telefone;

    public Contato() {}

    public Contato(String nome, String telefone) {
        super();
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
