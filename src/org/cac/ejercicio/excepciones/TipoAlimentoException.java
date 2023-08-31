package org.cac.ejercicio.excepciones;

public class TipoAlimentoException extends RuntimeException {
    public TipoAlimentoException() {
        super("Un animal carnívoro solo puede comer Animales");
    }

    public TipoAlimentoException(String message) {
        super(message);
    }
}