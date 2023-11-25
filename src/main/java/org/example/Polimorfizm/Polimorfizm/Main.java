package org.example.Polimorfizm.Polimorfizm;

public class Main {

    public static void main(String[] args) {

        Figura figura1 = new Kwadrat();
        Figura figura2 = new Kolo();

        figura1.obliczPolePowierzchni();
        figura2.obliczPolePowierzchni();



    }
}
