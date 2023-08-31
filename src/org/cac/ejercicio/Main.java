package org.cac.ejercicio;

import org.cac.ejercicio.excepciones.TipoAlimentoException;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = Arrays.asList(new Gato(), new Perro(), new Vaca());

        animales.forEach(animal -> {
            if (animal instanceof ICarnivoro) {
                ((ICarnivoro) animal).comerCarne();
            } else {
                ((IHervivoro) animal).comerHierba();
            }
            System.out.println(animal.emitirSonido());
            System.out.println();
        });

        Gato gato = new Gato();
        Perro perro = new Perro();
        Vaca vaca = new Vaca();
        Hierba hierba = new Hierba("Girasol");

//        Alimentando al los carnívoros con animales y
//        a los herbívoros con hierbas;
        perro.comerAnimal(gato);
        gato.comerAnimal(perro);
        vaca.comerHierba(hierba);

//        Tratando de alimentar al perro con un Girasol;
        try {
            perro.comerAnimal(hierba);
        } catch (TipoAlimentoException tae) {
            System.out.println(tae.getMessage());
        }
    }
}