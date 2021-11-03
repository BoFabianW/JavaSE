package Strings;

public class Main {

    public static void main(String[] args) {

       StringsErzeugen.StringsVergleichen();
       StringsErzeugen.StringErzeugenErzwingen();
       StringsErzeugen.StringInhaltVergleichen();

       StringsErzeugen.StringTrennen();

       System.out.println(StringsErzeugen.StringUmdrehen("Hallo"));
       System.out.println(StringsErzeugen.StringAufZiffernPruefen("000 fabian5881"));
       System.out.println("Das gesuchte Wort kommt " + StringsErzeugen.StringZaehlen("viel", "viel vor viel dahinter, noch viel viel mehr vor, aber viel viel weniger dahinter") + " mal vor\n");

        ZusatzFunktionen.kleinschreiben("Max Mustermann");
        ZusatzFunktionen.grossschreiben("MaX MuStErMaNn");
        ZusatzFunktionen.stringAufInhaltPruefen("Ich bin ein Test-String", "bin");
    }
}
