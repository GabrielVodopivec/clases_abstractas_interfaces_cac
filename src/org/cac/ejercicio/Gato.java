package org.cac.ejercicio;

public class Gato extends Animal implements ICarnivoro {

    @Override
    String emitirSonido() {
        return "miau";
    }

    @Override
    public <T extends Animal> void comerAnimal(T t) {
        System.out.println("El " + this.getClass().getSimpleName() + " se comió al " + t.getClass().getSimpleName());
    }

    @Override
    public void comerCarne() {
        System.out.println("El " + this.getClass().getSimpleName() + " está comiendo atún.");
    }
}