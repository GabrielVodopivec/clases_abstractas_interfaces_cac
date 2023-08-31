package org.cac.ejercicio;

import org.cac.ejercicio.excepciones.TipoAlimentoException;

public class Perro extends Animal implements Alimentable {
    @Override
    String emitirSonido() {
        return "guau";
    }

    @Override
    public void comer(Object o) {
        try {
            System.out.println("El perro se comió al " + ((Animal) o).getClass().getSimpleName());
        } catch (ClassCastException cce) {
            throw new TipoAlimentoException();
        }
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo asado.");
    }
}