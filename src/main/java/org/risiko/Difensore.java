package org.risiko;

public class Difensore {
    private int numeroCarrarmati;
    private Dado dado;

    private int[] risultati;

    public int getNumeroCarrarmati() {
        return numeroCarrarmati;
    }

    public void setNumeroCarrarmati(int numeroCarrarmati) {
        this.numeroCarrarmati = numeroCarrarmati;
    }

    public Difensore(int numeroCarrarmati) {
        this.numeroCarrarmati = numeroCarrarmati;
        dado = new Dado();
    }

    public int[] tiraDadi() {
        risultati = new int[numeroCarrarmati];

        for (int i = 0; i < numeroCarrarmati; i++) {
            risultati[i] = dado.generaNumero();
        }
        return risultati;
    }
}