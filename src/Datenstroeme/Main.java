package Datenstroeme;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        DatenSchreiben.schreibenWriter();
        DatenSchreiben.schreibenOutputStream();

        DatenEinlesen.lesenReader();
        DatenEinlesen.lesenInputStream();

    }
}

