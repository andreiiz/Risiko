package org.risiko;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Risiko {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numeroCarrarmatiAttacco;
        int numeroCarrarmatiDifesa;
        int[] risultatiAttaccante;
        int[] risultatiDifensore;
        Attaccante attaccante;
        Difensore difensore;
        CarrarmatiPersi cPersi;
        System.out.println("Benvenuto nel gioco del risiko");
        System.out.println("Attaccante, inserisci il numero di carrarmanti con il quale attacchi");
        numeroCarrarmatiAttacco = in.nextInt();
        if (numeroCarrarmatiAttacco < 1 || numeroCarrarmatiAttacco > 3) {
            System.out.println("Minino 1 massimo 3!");
        }
        System.out.println("Difensore, inserisci il numero di carrarmanti con il quale difendi");
        numeroCarrarmatiDifesa = in.nextInt();
        if (numeroCarrarmatiDifesa < 1 || numeroCarrarmatiDifesa > 3 || numeroCarrarmatiDifesa > numeroCarrarmatiAttacco) {
            System.out.println("Minino 1 massimo 3!");
        }
        attaccante = new Attaccante(numeroCarrarmatiAttacco);
        difensore = new Difensore(numeroCarrarmatiDifesa);
        risultatiAttaccante = attaccante.tiraDadi();
        risultatiDifensore = difensore.tiraDadi();

        System.out.println("L'attaccante ha ottenuto: " + Arrays.toString(risultatiAttaccante));
        System.out.println("Il difensore ha ottenuto: " + Arrays.toString(risultatiDifensore));

        Arrays.stream(risultatiAttaccante)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.stream(risultatiDifensore)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        cPersi = scontro(risultatiAttaccante, risultatiDifensore);
        System.out.println("L'attaccante ha perso: " + cPersi.getCarrarmatiPersiAttaccante());

        System.out.println("Il difensore ha perso: " + cPersi.getCarrarmatiPersiDifensore());

        if (cPersi.getCarrarmatiPersiDifensore() == risultatiDifensore.length) {
            System.out.println("Il difensore ha perso");
        }

        if (cPersi.getCarrarmatiPersiAttaccante() == risultatiAttaccante.length) {
            System.out.println("L'attaccante ha perso");
        }
        in.close();
    }

    private static CarrarmatiPersi scontro(int[] attaccante, int[] difensore) {
        int nCarrarmatiPersiAttaccante = 0;
        int nCarrarmatiPersiDifensore = 0;
        for (int i = 0; i < difensore.length; i++) {
            if (difensore[i] >= attaccante[i]) {
                nCarrarmatiPersiAttaccante++;
            } else {
                nCarrarmatiPersiDifensore++;
            }
        }
        return new CarrarmatiPersi(nCarrarmatiPersiAttaccante, nCarrarmatiPersiDifensore);
    }
}
