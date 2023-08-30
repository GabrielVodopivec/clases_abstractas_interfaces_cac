package org.cac.ejercicio;

public interface IHervivoro {
    <T extends Hierba> void comerHierba(T t);
    void comerHierba();
}