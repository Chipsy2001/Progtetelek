package Progtetelek;

public class Progtetelek {

    private static final String SEP = System.lineSeparator();
    private static final int[] sorozat = {3, 4, 12, 1, 8};

    public static void main(String[] args) {
        progTetelekFelhaszn();

    }

    private static void progTetelekFelhaszn() {
        osszegzes();
        megszamlalas();
        minKivalasztas();
        maxKivalasztas();
        kivalasztas();
        eldontesEgy();
        eldontesMind();
        linKereses();
        konzolraIr("Osszegzes: " + osszegzes() + SEP);
        konzolraIr("Megszamlalas: " + megszamlalas() + SEP);
        konzolraIr("Maximum Kivalasztas: " + maxKivalasztas() + SEP);
        konzolraIr("Minimum Kivalasztas: " + minKivalasztas() + SEP);
        konzolraIr("Kivalasztas: " + kivalasztas() + SEP);
        konzolraIr("Eldontes Egy: " + eldontesEgy() + SEP);
        konzolraIr("Eldontes Mind: " + eldontesMind() + SEP);
        konzolraIr("Linearis Kereses: " + linKereses() + SEP);
    }

    private static int osszegzes() {
        int osszead = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszead += sorozat[i];
        }
        return osszead;
    }

    private static int megszamlalas() {
        int db = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] > 0) {
                db++;
            }
        }
        return db;
    }

    private static int minKivalasztas() {
        int minIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if (sorozat[i] < sorozat[minIndex]) {
                minIndex = i;
            }
        }
        return sorozat[minIndex];
    }

    private static int maxKivalasztas() {
        int maxIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if (sorozat[i] > sorozat[maxIndex]) {
                maxIndex = i;
            }
        }
        return sorozat[maxIndex];
    }

    private static int kivalasztas() {
           int ker = 5;
        int i = 0;
        while(!(sorozat[i] < ker)){
            i++;
        }
        return i;  
    }

    private static boolean eldontesEgy() {
        int ker = 1;
        int i = 0;
        while (i < sorozat.length && !(sorozat[i] > ker)) {
            i++;
        }
        return i < sorozat.length;
    }

    private static boolean eldontesMind() {
        int ker = 2;
        int i = 0;
        while (i < sorozat.length && (sorozat[i] > ker)) {
            i++;
        }
        return i >= sorozat.length;
    }

    private static boolean linKereses() {
        int ker = 3;
        int i = 0;
        while (i < sorozat.length && !(sorozat[i] > ker)) {
            i++;
        }
        boolean van = i < sorozat.length;
        return van;
    }

    private static void konzolraIr(String kimenet) {
        System.out.println(kimenet);
    }

}
