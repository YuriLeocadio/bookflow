package com.yurileocadio.bookflow;

import com.yurileocadio.bookflow.arquivo.CargaDadosIniciais;
import com.yurileocadio.bookflow.dominio.Emprestimo;
import com.yurileocadio.bookflow.dominio.Livro;
import com.yurileocadio.bookflow.dominio.Usuario;
import com.yurileocadio.bookflow.exception.LimiteEmprestimosException;
import com.yurileocadio.bookflow.exception.LivroIndisponivelException;

public class Main {
    public static void main(String[] args) {
        Livro[] livros = CargaDadosIniciais.carregarLivros();
        Usuario[] usuarios = CargaDadosIniciais.carregarUsuarios();

        try {
            Emprestimo e1 = Emprestimo.criar(usuarios[0], livros[0]);
            System.out.println("Emprestimo criado");
        } catch (LivroIndisponivelException e) {
            e.printStackTrace();
            System.out.println("BUG: não deveria falhar aqui - " + e.getMessage());
        } catch (LimiteEmprestimosException e) {
            e.printStackTrace();
            System.out.println("BUG: não deveria falhar aqui - " + e.getMessage());
        }

        try {
            Emprestimo e2 = Emprestimo.criar(usuarios[0], livros[0]);
            System.out.println("Emprestimo criado");
        } catch (LivroIndisponivelException e) {
            System.out.println(e.getMessage());
        } catch (LimiteEmprestimosException e) {
            e.printStackTrace();
            System.out.println("BUG: não deveria falhar aqui - " + e.getMessage());
        }
    }
}
