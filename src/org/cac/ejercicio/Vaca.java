package org.cac.ejercicio;

import org.cac.ejercicio.excepciones.TipoAlimentoException;

public class Vaca extends Animal implements IHervivoro {
    @Override
    String emitirSonido() {
        return "muuuu";
    }

    @Override
    public void comerHierba(Object o) {
        try {
        System.out.println("La vaca se comió el " + ((Hierba) o).getName());
        } catch (ClassCastException cce) {
            throw new TipoAlimentoException("Un animal herbívoro solo puede comer hierbas.");
        }
    }

    @Override
    public void comerHierba() {
        System.out.println("La vaca está comiendo pasto");
    }
}