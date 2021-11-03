package Konsole;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // ######################## Konsolenausgaben #############################

        Konsolenausgabe.AusgabeText();

        /*
        Hier wird die Methode "AusgabeMitParameter" aus der Klasse "Konsolenausgabe"
        aufgerufen und ihr der String-Parameter "Textausgabe mit Parameteruebergabe." übergeben
         */
        Konsolenausgabe.AusgabeTextMitParameter("Hallo, ich bin ein Parameter !");

        // Hier wird die Methode "AusgabeMitTextumbruch" aus der Klasse "Konsolenausgabe" aufgerufen.
        Konsolenausgabe.AusgabeMitTextumbruch();

        /*
        Hier wird die Methode "KonsolenausgabeMitZweiParametern" aus der Klasse "Konsolenausgabe"
        aufgerufen und ihr die String-Parameter "Max" und "Mustermann" übergeben
         */
        Konsolenausgabe.AusgabeMitZweiParametern("Max", "Mustermann");

        // Hier wird die Methode "AusgabeMitZahlen" aus der Klasse "Konsolenausgabe" aufgerufen.
        Konsolenausgabe.AusgabeMitZahlen();

        // ######################## Konsoleneingaben #############################

        // Hier wird die Methode "Eingabe" aus der Klasse "Konsoleneingabe" aufgerufen.
        Konsoleneingabe.Eingabe();

        // Hier wird die Methode "EingabeAufZahlenPruefen" aus der Klasse "Konsoleneingabe" aufgerufen.
        Konsoleneingabe.EingabeAufZahlenPruefen();

        //Hier wird die Methode "zahlenInParameternUebergeben" aus der Klasse "Konsoleneingabe" aufgerufen
        //und ihr die Integer-Parameter "50" und "100" übergeben.
        Konsoleneingabe.zahlenInParameternUebergeben(50, 100);
    }
}
