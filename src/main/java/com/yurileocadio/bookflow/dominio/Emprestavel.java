package com.yurileocadio.bookflow.dominio;

public interface Emprestavel {
    boolean verificarDisponibilidade();

    void marcarComoEmprestado();

    void marcarComoDisponivel();
}
