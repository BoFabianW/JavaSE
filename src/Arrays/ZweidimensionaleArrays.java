package Arrays;

public class ZweidimensionaleArrays {
    
    public static void zweiD(){

        // Deklaration eines Arrays mit der Länge und der Höhe 3.
        String [][] zweiD = new String [3][3];

        // Array initialisieren.
        zweiD[0][0] = "Spalte 0 | Zeile 0";
        zweiD[0][1] = "Spalte 0 | Zeile 1";
        zweiD[0][2] = "Spalte 0 | Zeile 2";

        zweiD[1][0] = "Spalte 1 | Zeile 0";
        zweiD[1][1] = "Spalte 1 | Zeile 1";
        zweiD[1][2] = "Spalte 1 | Zeile 2";

        zweiD[2][0] = "Spalte 2 | Zeile 0";
        zweiD[2][1] = "Spalte 2 | Zeile 1";
        zweiD[2][2] = "Spalte 2 | Zeile 2";

        // Durchlaufen eines zweidimensionalen Arrays mit einer 'forEach-Schleife'.
        for(String[] subarray : zweiD)
            for(String number : subarray)
                System.out.println(number);

        // Konsolenausgabe.
        System.out.println("\nAusgabe von bestimmten Werten aus dem Array:");

        System.out.println(zweiD[0][2]);
        System.out.println(zweiD[2][2]);
    }
}