package Klassen;

// Dies ist eine äußere Klasse
public class BeispielInnereKlassen {

    /*
     Diese Variablen sind duch die deklaration 'private' für die gesamte Klasse inkl. innere Klassen erreichbar.
     Ein Zugriff ausserhalb der Klasse ist nur durch eine "Getter-Methode" oder "Setter-Methode" möglich.
     */
    private String name;
    private String nachname;

    /*
     Mit diesem Kontruktor werden die beiden Instanzvariablen 'name' und 'nachname' initialisiert.
     Der Konstruktor wurd automatisch beim Aufrufen der Klasse ausgeführt.
     */
    public BeispielInnereKlassen(){

        name = "Max";
        nachname = "Mustermann";

        System.out.println("Die Variablen der 'name' und 'nachname' äusseren Klasse wurden initialisiert: name " + name + " nachname " + nachname + "\n");
    }

            // Diese Klasse ist eine innere Klasse, weil sie sich innerhalb einer Klasse befindet.
            public static class InnereKlasse {

                /*
                 Diese Variablen sind durch die Deklaration 'private' nur innerhalb der Klasse 'InnereKlasse' erreichbar.
                 Ein Zugriff ausserhalb der Klasse ist nur durch eine "Getter-Methode" oder "Setter-Methode" möglich.
                 */
                private String name;
                private String nachname;

                // Hier werden in dem KOnstruktor wieder die Instanzvariablen 'name' und 'nachname' initialisiert.
                public InnereKlasse(){

                    name = "Tyler";
                    nachname = "Wilmes";
                    System.out.println("Die Variablen 'name' und 'nachname' der inneren Klasse wurden initialisiert: name " + name + " nachname " + nachname + "\n");
                }

                // Hier werden die "Getter" und "Setter" der inneren Klasse 'InnereKlasse' erstellt.
                public String getName2() {
                    return name;
                }

                public void setName2(String name2) {
                    this.name = name2;
                }

                public String getNachname2() {
                    return nachname;
                }

                public void setNachname2(String nachname2) {
                    this.nachname = nachname2;
                }
            }

    // Hier werden die "Getter" und "Setter" der äußeren Klasse 'BeispielInnereKlassen' erstellt
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getNachname() {

        return nachname;
    }

    public void setNachname(String nachname) {

        this.nachname = nachname;
    }
}
