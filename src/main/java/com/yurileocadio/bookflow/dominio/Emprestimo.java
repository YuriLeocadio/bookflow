package com.yurileocadio.bookflow.dominio;

import com.yurileocadio.bookflow.exception.LimiteEmprestimosException;
import com.yurileocadio.bookflow.exception.LivroIndisponivelException;

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

    public static Emprestimo criar(Usuario usuario, Livro livro) throws LivroIndisponivelException, LimiteEmprestimosException {
        if (!livro.verificarDisponibilidade()) {
            throw new LivroIndisponivelException();
        } else if (usuario.getTotalLivrosEmprestados() >= usuario.getLimiteLivros()) {
            throw new LimiteEmprestimosException();
        } else {
            usuario.registrarEmprestimo();
            livro.marcarComoEmprestado();
            return new Emprestimo(usuario, livro);
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
