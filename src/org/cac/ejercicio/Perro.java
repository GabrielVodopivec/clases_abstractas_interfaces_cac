package org.cac.ejercicio;

import org.cac.ejercicio.excepciones.TipoAlimentoException;

public class Perro extends Animal implements ICarnivoro {
    @Override
    String emitirSonido() {
        return "guau";
    }

    @Override
    public void comerAnimal(Object o) {
        try {
            System.out.println("El perro se comió al " + ((Animal) o).getClass().getSimpleName());
        } catch (ClassCastException cce) {
            throw new TipoAlimentoException();
        }
    }

    @Override
    public void comerCarne() {
        System.out.println("El perro está comiendo asado.");
    }
}