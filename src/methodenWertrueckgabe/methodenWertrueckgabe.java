package methodenWertrueckgabe;

public class methodenWertrueckgabe {

    // Mit dieser Methode wird durch den Befehl "return" ein String zurückgegeben.
    public static String TextRueckgabe(){
        return "Hallo - ich wurde zurückgegeben!";
    }

    // Dieser Methode wird beim Aufrufen ein String-Parameter übergeben
    public static void TextRueckgabeMitParameter(String textEmpfang){

        // Hier wird der übergebene String-Parameter in der Konsole ausgegeben.
        System.out.println(textEmpfang);    }
}
