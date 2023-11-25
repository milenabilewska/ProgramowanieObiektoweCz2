package org.example.Enkapsulacja.KontoBankowe;

class KontoBankowe {
    private int numerKonta;
    private double saldo;

    public KontoBankowe(int numerKonta, double saldoPoczatkowe) {
        this.numerKonta = numerKonta;
        this.saldo = saldoPoczatkowe;
    }

    public int getNumerKonta() {
        return numerKonta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void wplac(double kwota) {
        if (kwota > 0) {
            saldo += kwota;
            System.out.println("Wpłacono " + kwota + " PLN na konto " + numerKonta + ".");
        } else {
            System.out.println("Nieprawidłowa kwota wpłaty.");
        }
    }

    public void wyplac(double kwota) {
        if (kwota > 0 && kwota <= saldo) {
            saldo -= kwota;
            System.out.println("Wypłacono " + kwota + " PLN z konta " + numerKonta + ".");
        } else {
            System.out.println("Nie można dokonać wypłaty. Brak wystarczających środków lub nieprawidłowa kwota wypłaty.");
        }
    }

    public void informacje() {
        System.out.println("Konto " + numerKonta + ": Numer konta: " + numerKonta + ", Saldo: " + saldo + " PLN");
    }
}
