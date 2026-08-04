package com.yurileocadio.bookflow.dominio;

public abstract class Usuario {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private int totalLivrosEmprestados;

    public Usuario(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public abstract int getLimiteLivros();

    public abstract int getPrazoDevolucao();

    public void registrarEmprestimo(){
        this.totalLivrosEmprestados += 1;
    }

    public void registrarDevolucao(){
        this.totalLivrosEmprestados -= 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade não pode ser negativo");
            return;
        }
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTotalLivrosEmprestados() {
        return totalLivrosEmprestados;
    }
}
