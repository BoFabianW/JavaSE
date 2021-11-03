package Vererbung;

public abstract class Tier {

    // Anlegen der Variablen (Eigenschaften)
    private int alter;
    private String name;
    private String farbe;

        // Konstriktor.
        public Tier(int alter, String name, String farbe) {
            this.alter = alter;
            this.name = name;
            this.farbe = farbe;
}

        public void schlafen(){

            // Konsolenausgabe.
            System.out.println("Dieses Tier kann schlafen .....");
        }

        public void fressen(){

            // Konsolenausgabe.
            System.out.println("Diese Tier kann fressen ....");
        }

        public void trinken(){

            // Konsolenausgabe.
            System.out.println("Diese Tier kann trinken ....");
        }

        // Abstracte Methode - Zwingt die erbenden Klassen zum Implementieren dieser Methode.
        public abstract void sprechen();

        // ############################# Setzen der Getter und Setter ######################################

        public int getAlter() {
                return alter;
        }

        public void setAlter(int alter) {

                /*
                 Hier wird aus z.B. geprüft, ob das übergebene Alter höher als 25 ist.
                 Sollte dies der Fall sein, wird der Wert der Variable "alter" nicht verändert.
                 Ansonsten erhält die Variable den neuen übergebenen Wert.
                 */
                if (alter > 25) {
                    System.out.println("So alt wird dieses Tier nicht!");
                } else {
                    this.alter = alter;
                }
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFarbe() {
            return farbe;
        }

        public void setFarbe(String farbe) {
            this.farbe = farbe;
        }
}


