package SwitchCase;

public class BeispielSwitchCase {

    /*
     * Die Switch-Case-Anweisung ist vom Prinzip mit der If-Anweisung vergleichbar.
     * Allerdings ist sie übersichtlicher und codesparender
     * @param buchstabe wird beim Aufrufen der Methode übergeben
     */

    public static void SwitchCase(char buchstabe) {

        // Hier wird geprüft, welcher Buchstabe übergeben wurde.
        switch (buchstabe) {

            case 'a':
                System.out.println("Es wurde ein a eingegeben.");
                break;

            case 'b':
                System.out.println("Es wurde ein b eingegeben.");
                break;

            case 'c':
                System.out.println("Es wurde ein c eingegeben.");
                break;

                // default kann benutzt werden, wenn ein völlig anderer Wert der Variable übergeben wurde.
            default:
                System.out.println("Etwas anderes");
            }

        System.out.println("--------------------------------------------\n");
        }


        // Hier eine Switch-Anweisung mit int.
        public static void SwitchInt(int monat){

            switch (monat) {

                // Der Wert der Variable 'monat' kann 12,1,2 sein.
                case 12:
                case 1:
                case 2:
                    System.out.println("Es ist Winter !!!");
                    break; // Beendet die 'Switch-Anweisung'.

                // Der Wert der Variable 'monat' kann 3,4,5 sein.
                case 3:
                case 4:
                case 5:
                    System.out.println("Es ist Frühling !!!");
                    break; // Beendet die 'Switch-Anweisung'.

                // Der Wert der Variable 'monat' kann 6,7,8 sein.
                case 6:
                case 7:
                case 8:
                    System.out.println("Es ist Sommer");
                    break; // Beendet die 'Switch-Anweisung'.

                // Der Wert der Variable 'monat' kann 9,10,11 sein.
                case 9:
                case 10:
                case 11:
                    System.out.println("Es ist Herbst !!!");
            }

            System.out.println("--------------------------------------------\n");
        }
    }

