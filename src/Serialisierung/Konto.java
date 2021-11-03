package Serialisierung;

import java.io.Serializable;

// Klasse serialisierungsfähig machen
public class Konto implements Serializable {

    private String inhaber;
    private String KontoNr;

    public Konto(String inhaber, String kontoNr) {
        this.inhaber = inhaber;
        this.KontoNr = kontoNr;
    }

    @Override
    public String toString() {
        return "Name des Kontoinhabers: " + inhaber + " | " + "Kontonummer: " + KontoNr;
    }

    // ################## Getter und Setter ##############################

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }
}