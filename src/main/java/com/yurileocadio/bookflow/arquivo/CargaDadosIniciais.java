package com.yurileocadio.bookflow.arquivo;

import com.yurileocadio.bookflow.dominio.Aluno;
import com.yurileocadio.bookflow.dominio.Livro;
import com.yurileocadio.bookflow.dominio.Professor;
import com.yurileocadio.bookflow.dominio.Usuario;

import java.io.InputStream;
import java.util.Scanner;

public class CargaDadosIniciais {
    private static int contarLinhas(String nomeArquivo){
        InputStream inputStream = CargaDadosIniciais.class.getResourceAsStream(nomeArquivo);
        Scanner scanner = new Scanner(inputStream);
        int contador = 0;
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            contador++;
        }
        scanner.close();
        return contador;
    }

    public static Livro[] carregarLivros() {
        InputStream inputStream = CargaDadosIniciais.class.getResourceAsStream("/livros.txt");
        Scanner scanner = new Scanner(inputStream);
        int i = 0;
        int quantidadeLivros = contarLinhas("/livros.txt");
        Livro[] livros = new Livro[quantidadeLivros];
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] partes = linha.split(";");
            Livro novoLivro = new Livro(partes[0].trim(), partes[1].trim(), partes[2].trim());
            livros[i] = novoLivro;
            i++;
        }
        scanner.close();
        return livros;
    }

    public static Usuario[] carregarUsuarios() {
        InputStream inputStream = CargaDadosIniciais.class.getResourceAsStream("/usuarios.txt");
        Scanner scanner = new Scanner(inputStream);
        int i = 0;
        int quantidadeUsuarios = contarLinhas("/usuarios.txt");
        Usuario[] usuarios = new Usuario[quantidadeUsuarios];
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] partes = linha.split(";");
            if (partes[0].trim().equals("aluno")) {
                Usuario novoUsuario = new Aluno(partes[1].trim(), Integer.parseInt(partes[2].trim()), partes[3].trim(), partes[4].trim());
                usuarios[i] = novoUsuario;
                i++;
            } else {
                Usuario novoUsuario = new Professor(partes[1].trim(), Integer.parseInt(partes[2].trim()), partes[3].trim(), partes[4].trim());
                usuarios[i] = novoUsuario;
                i++;
            }
        }
        scanner.close();
        return usuarios;
    }
}
