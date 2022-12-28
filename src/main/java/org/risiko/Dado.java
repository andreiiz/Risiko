package org.risiko;

public class Dado {

    private int numero;

    public Dado() {
    }

    public int generaNumero() {
        return (int) Math.floor(Math.random() * (6 - 1 + 1) + 1);
    }
}
