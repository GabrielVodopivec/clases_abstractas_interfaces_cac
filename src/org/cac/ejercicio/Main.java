package org.cac.ejercicio;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato();
        Animal perro = new Perro();
        Animal vaca = new Vaca();
        String sonidoEmitido;

        sonidoEmitido = gato.emitirSonido();
        ((Gato) gato).comerCarne();
        System.out.println(sonidoEmitido);
        System.out.println();

        sonidoEmitido = perro.emitirSonido();
        ((Perro) perro).comerCarne();
        System.out.println(sonidoEmitido);
        System.out.println();

        sonidoEmitido = vaca.emitirSonido();
        ((Vaca) vaca).comerHierba();
        System.out.println(sonidoEmitido);
        System.out.println();

        ((Perro) perro).comerAnimal(gato);
        ((Gato) gato).comerAnimal(perro);

        Hierba hierba = new Hierba("Girasol");
        ((Vaca) vaca).comerHierba(hierba);

    }
}