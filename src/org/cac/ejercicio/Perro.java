package org.cac.ejercicio;

public class Perro extends Animal implements ICarnivoro {
    @Override
    String emitirSonido() {
        return "guau";
    }

    @Override
    public void comerAnimal(Animal a) {
        System.out.println("El "+ this.getClass().getSimpleName() +" se comió al " + a.getClass().getSimpleName());
    }


    @Override
    public void comerCarne() {
        System.out.println("El " + this.getClass().getSimpleName() + " está comiendo asado.");
    }
}