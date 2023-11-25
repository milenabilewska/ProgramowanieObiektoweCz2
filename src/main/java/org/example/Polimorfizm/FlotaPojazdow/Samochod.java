package org.example.Polimorfizm.FlotaPojazdow;

public class Samochod extends Pojazd{

    private int liczbaDrzwi;


    public Samochod(String nrRejestracyjny, int predkoscMaksymalna, int pojemnoscBaku, int liczbaDrzwi) {
        super(nrRejestracyjny, predkoscMaksymalna, pojemnoscBaku);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }


    @Override
    public String informacje() {
        return "Samchod: " + getNrRejestracyjny()
                + " \n Pojemnosc silnika " + getPojemnoscBaku()
                + " \n Predkosc maksymalna " + getPredkoscMaksymalna()
                + " \n Liczba drzwi " + getLiczbaDrzwi();
    }
}
