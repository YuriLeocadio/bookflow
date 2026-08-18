package com.yurileocadio.bookflow.exception;

public class LimiteEmprestimosException extends Exception {

    public LimiteEmprestimosException() {
        super("Limite de empréstimos atingido.");
    }

    public LimiteEmprestimosException(String message) {
        super(message);
    }
}
