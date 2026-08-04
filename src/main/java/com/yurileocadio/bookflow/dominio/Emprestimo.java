package com.yurileocadio.bookflow.dominio;

import java.time.LocalDate;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucaoPrevista = LocalDate.now().plusDays(usuario.getPrazoDevolucao());
    }

    public static Emprestimo criar(Usuario usuario, Livro livro) {
        if (livro.verificarDisponibilidade() && usuario.getTotalLivrosEmprestados() < usuario.getLimiteLivros()) {
            usuario.registrarEmprestimo();
            livro.marcarComoEmprestado();
            return new Emprestimo(usuario, livro);
        } else {
            return null;
        }
    }

    public void devolver() {
        livro.marcarComoDisponivel();
        usuario.registrarDevolucao();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }
}
