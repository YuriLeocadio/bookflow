package com.yurileocadio.bookflow.dominio;

public class Livro implements Emprestavel {
    private String  titulo;
    private String autor;
    private String tema;
    private boolean disponivel;

    public Livro(String titulo, String autor, String tema) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.disponivel = true;
    }

    @Override
    public boolean verificarDisponibilidade() {
        if (this.disponivel) {
            System.out.println("Disponível");
            return true;
        } else {
            System.out.println("Indisponível");
            return false;
        }
    }

    @Override
    public void marcarComoEmprestado() {
        this.disponivel = false;
    }

    @Override
    public void marcarComoDisponivel() {
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
