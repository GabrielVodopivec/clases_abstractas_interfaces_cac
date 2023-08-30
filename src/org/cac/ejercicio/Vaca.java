package org.cac.ejercicio;

public class Vaca extends Animal implements IHervivoro {
    @Override
    String emitirSonido() {
        return "muuuu";
    }

    @Override
    public void comerHierba(Hierba hierba) {
        System.out.println("La vaca se comió el " + hierba.getName());
    }

    @Override
    public void comerHierba() {
        System.out.println("La " + this.getClass().getSimpleName() + " está comiendo pasto");
    }
}