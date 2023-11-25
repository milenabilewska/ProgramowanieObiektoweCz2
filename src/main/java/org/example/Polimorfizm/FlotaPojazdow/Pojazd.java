package org.example.Polimorfizm.FlotaPojazdow;


abstract class Pojazd {
    private String nrRejestracyjny;
    private int predkoscMaksymalna;

    private int pojemnoscBaku;

    public Pojazd() {
    }

    public Pojazd(String nrRejestracyjny, int predkoscMaksymalna, int pojemnoscBaku) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.predkoscMaksymalna = predkoscMaksymalna;
        this.pojemnoscBaku = pojemnoscBaku;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public int getPredkoscMaksymalna() {
        return predkoscMaksymalna;
    }

    public void setPredkoscMaksymalna(int predkoscMaksymalna) {
        this.predkoscMaksymalna = predkoscMaksymalna;
    }

    public int getPojemnoscBaku() {
        return pojemnoscBaku;
    }

    public void setPojemnoscBaku(int pojemnoscBaku) {
        this.pojemnoscBaku = pojemnoscBaku;
    }

    public abstract String informacje();


}
