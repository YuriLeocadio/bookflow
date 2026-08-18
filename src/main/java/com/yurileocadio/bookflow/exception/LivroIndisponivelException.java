package com.yurileocadio.bookflow.exception;

public class LivroIndisponivelException extends Exception {

    public LivroIndisponivelException() {
        super("O livro está indisponível para empréstimo.");
    }

    public LivroIndisponivelException(String message) {
        super(message);
    }
}
