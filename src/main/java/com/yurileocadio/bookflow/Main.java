package com.yurileocadio.bookflow;

import com.yurileocadio.bookflow.dominio.Aluno;
import com.yurileocadio.bookflow.dominio.Emprestimo;
import com.yurileocadio.bookflow.dominio.Livro;
import com.yurileocadio.bookflow.exception.LimiteEmprestimosException;
import com.yurileocadio.bookflow.exception.LivroIndisponivelException;

public class Main {
    public static void main(String[] args) {
        Aluno joao = new Aluno("João", 20, "12345678900", "Rua A");
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", "Romance");

        try{
            Emprestimo e1 = Emprestimo.criar(joao, livro);
            System.out.println("Emprestimo criado");
        }catch (LivroIndisponivelException e){
            e.printStackTrace();
            System.out.println("BUG: não deveria falhar aqui - " + e.getMessage());
        } catch (LimiteEmprestimosException e){
            e.printStackTrace();
            System.out.println("BUG: não deveria falhar aqui - " + e.getMessage());
        }

        try{
            Emprestimo e2 = Emprestimo.criar(joao, livro);
            System.out.println("Emprestimo criado");
        }catch (LivroIndisponivelException e){
            System.out.println(e.getMessage());
        } catch (LimiteEmprestimosException e){
            e.printStackTrace();
            System.out.println("BUG: não deveria falhar aqui - " + e.getMessage());
        }
    }
}
