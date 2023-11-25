package org.example.Enkapsulacja.KontoBankowe;

public class Main {
    public static void main(String[] args) {
        KontoBankowe konto1 = new KontoBankowe(12345, 1000);
        KontoBankowe konto2 = new KontoBankowe(67890, 500);

        konto1.informacje();
        konto2.informacje();

        konto1.wyplac(200);
        konto1.informacje();

        konto2.wplac(300);
        konto2.informacje();

        konto2.wplac(55500);
        konto2.informacje();


    }
}

