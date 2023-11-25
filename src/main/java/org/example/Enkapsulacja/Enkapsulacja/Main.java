package org.example.Enkapsulacja.Enkapsulacja;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan", "Kowalski" , 22);

        System.out.println("Imie: "   + osoba.getImie());
        System.out.println("Nazwisko: "   + osoba.getNazwisko());
        System.out.println("Wiek: "   + osoba.getWiek());


        osoba.setWiek(33);
        System.out.println("Nowy wiek to: "   + osoba.getWiek());
        osoba.setImie("Anna");
        osoba.setNazwisko("Nowak");


        System.out.println(osoba.getImie() + " " + osoba.getNazwisko() + " " + osoba.getWiek());




    }
}