package com.yurileocadio.bookflow.dominio;

public class Professor extends Usuario{
    public Professor(String nome, int idade, int cpf, String endereco) {
        super(nome, idade, cpf, endereco);
    }

    @Override
    public int getLimiteLivros() {
        return 5;
    }

    @Override
    public int getPrazoDevolucao() {
        return 30;
    }
}
