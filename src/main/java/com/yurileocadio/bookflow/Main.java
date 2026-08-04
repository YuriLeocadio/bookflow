package com.yurileocadio.bookflow;

import com.yurileocadio.bookflow.dominio.Aluno;
import com.yurileocadio.bookflow.dominio.Emprestimo;
import com.yurileocadio.bookflow.dominio.Livro;

public class Main {
    public static void main(String[] args) {
        Aluno joao = new Aluno("João", 20, "12345678900", "Rua A");
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "Romance");

        Emprestimo e1 = Emprestimo.criar(joao, livro);
        System.out.println(e1 != null ? "Empréstimo criado" : "Falhou");

        Emprestimo e2 = Emprestimo.criar(joao, livro); // mesmo livro, já emprestado
        System.out.println(e2 == null ? "Bloqueou corretamente (livro indisponível)" : "BUG");
    }
}
