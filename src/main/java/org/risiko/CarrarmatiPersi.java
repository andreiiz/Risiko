package org.risiko;

public class CarrarmatiPersi {
    private int carrarmatiPersiAttaccante;

    private int carrarmatiPersiDifensore;

    public CarrarmatiPersi() {
    }

    public CarrarmatiPersi(int carrarmatiPersiAttaccante, int carrarmatiPersiDifensore) {
        this.carrarmatiPersiAttaccante = carrarmatiPersiAttaccante;
        this.carrarmatiPersiDifensore = carrarmatiPersiDifensore;
    }

    public int getCarrarmatiPersiAttaccante() {
        return carrarmatiPersiAttaccante;
    }

    public void setCarrarmatiPersiAttaccante(int carrarmatiPersiAttaccante) {
        this.carrarmatiPersiAttaccante = carrarmatiPersiAttaccante;
    }

    public int getCarrarmatiPersiDifensore() {
        return carrarmatiPersiDifensore;
    }

    public void setCarrarmatiPersiDifensore(int carrarmatiPersiDifensore) {
        this.carrarmatiPersiDifensore = carrarmatiPersiDifensore;
    }
}
