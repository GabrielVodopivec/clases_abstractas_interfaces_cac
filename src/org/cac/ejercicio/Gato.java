package org.cac.ejercicio;

import org.cac.ejercicio.excepciones.TipoAlimentoException;

public class Gato extends Animal implements ICarnivoro {

    @Override
    String emitirSonido() {
        return "miau";
    }

    @Override
    public void comerAnimal(Object o) {
        try {
            System.out.println("El gato se comió al " +
                               ((Animal) o).getClass().getSimpleName());
        } catch (ClassCastException cce) {
            throw new TipoAlimentoException();
        }
    }

    @Override
    public void comerCarne() {
        System.out.println("El gato está comiendo atún.");
    }
}