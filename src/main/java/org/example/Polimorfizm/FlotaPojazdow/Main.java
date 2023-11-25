package org.example.Polimorfizm.FlotaPojazdow;

public class Main {

    public static void main(String[] args) {

        FlotaPojazdow flotaPojazdow = new FlotaPojazdow();


        Samochod samochod = new Samochod( "XYT 123", 200, 2000, 5);

        Motocykl motocykl = new Motocykl("ZXC 12345", 280, 2000, "typ");

        flotaPojazdow.dodajPojazd(samochod);

        flotaPojazdow.dodajPojazd(motocykl);


        flotaPojazdow.wyswietlFlote();




    }
}
