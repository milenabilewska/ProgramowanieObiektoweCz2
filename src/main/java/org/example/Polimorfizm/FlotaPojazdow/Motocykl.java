package org.example.Polimorfizm.FlotaPojazdow;

public  class Motocykl extends Pojazd {


    private  String typSilnika;


    public Motocykl(String nrRejestracyjny, int predkoscMaksymalna, int pojemnoscBaku, String typSilnika) {
        super(nrRejestracyjny, predkoscMaksymalna, pojemnoscBaku);
        this.typSilnika = typSilnika;
    }

    public String getTypSilnika() {
        return typSilnika;
    }

    public void setTypSilnika(String typSilnika) {
        this.typSilnika = typSilnika;
    }

    @Override
    public String informacje() {
        return "Samchod: " + getNrRejestracyjny()
                + " \n Pojemnosc silnika " + getPojemnoscBaku()
                + " \n Predkosc maksymalna " + getPredkoscMaksymalna()
                + " \n Typ silnika " + getTypSilnika();
    }


}
