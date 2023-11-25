package org.example.Polimorfizm.FlotaPojazdow;

import java.util.ArrayList;

public class FlotaPojazdow {

    private ArrayList<Pojazd> flota = new ArrayList<>();


    public void dodajPojazd (Pojazd pojazd) {

    flota.add(pojazd);
        System.out.println("Dodano pojazd   " + pojazd.informacje());
    }


    public  void  wyswietlFlote() {
        System.out.println("Flota: ");
        for(int i = 0 ; i< flota.size() ; i++  ) {
            Pojazd pojazd = flota.get(i);
            System.out.println ((i + 1 ) +  "  " + pojazd.informacje());

        }


    }
}


