package br.com.aguinaldo.neto.restwithspringbootandjava.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ResponseStatus(BAD_REQUEST)
public class UnsupportMathOperationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UnsupportMathOperationException(String ex) {
        super(ex);
    }
}
