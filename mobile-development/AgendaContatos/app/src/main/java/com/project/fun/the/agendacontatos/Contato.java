package com.project.fun.the.agendacontatos;

/**
 * Created by suporte on 02/05/2018.
 */

public class Contato {

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
}
