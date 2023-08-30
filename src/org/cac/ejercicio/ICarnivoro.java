package org.cac.ejercicio;

public interface ICarnivoro {
    <T extends Animal> void comerAnimal(T t);
    void comerCarne();
}