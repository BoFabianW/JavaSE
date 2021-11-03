package Enums;

public enum Muenze {

    zweiEuro(200),
    einEuro(100),
    fuenfzigCent(50),
    zwanzigCent(20),
    zehnCent(10),
    fuenfCent(5),
    zweiCent(2),
    einCent(1);

    private int wert;

    // Konstruktor
    Muenze(int wert) {
        this.wert = wert;
    }

    // Getter
    public int getWert() {
        return wert;
    }

    // Kleine Methode zum Ausgeben von Wechselgeld. Der Methode wird das auszugebende Wechselgeld übergeben.
    static void wechselgeld(int wechselgeld) {

        int wgeld = wechselgeld;

        for (Muenze e : Muenze.values()) {

            for (int i = 0 ; i < Muenze.values().length ; i++) {

                if (e.wert <= wgeld) {
                    System.out.println(e.getWert());
                    wgeld = wgeld - e.getWert();
                    i = -1;
                }
            }
        }
    }
}