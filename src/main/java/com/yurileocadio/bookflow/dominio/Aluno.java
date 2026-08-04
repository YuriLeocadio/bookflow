package com.yurileocadio.bookflow.dominio;

public class Aluno extends Usuario {
    public Aluno(String nome, int idade, int cpf, String endereco) {
        super(nome, idade, cpf, endereco);
    }

    @Override
    public int getLimiteLivros() {
        return 3;
    }

    @Override
    public int getPrazoDevolucao() {
        return 14;
    }
}
