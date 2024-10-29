package Projekat;

public class ProjekatBingo {
    public static void main(String[] args) {
        int[] niz = unesiBrojeve();
        int[] niz2 = generisi();
        int[] nizPogodaka = bingo(niz, niz2);
        stampa(nizPogodaka);

    }

    public static int[] unesiBrojeve() {

        int[] niz = new int[6];
        int max = 90;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < niz.length; i++) {
            int rand = (int) (Math.random() * range + min);
            niz[i] = rand;
        }
        return niz;
    }

    public static int[] generisi() {
        int[] niz = new int[30];
        int max = 90;
        int min = 1;
        int range = max - min + 1;
        for (int i = 0; i < niz.length; i++) {
            int rand = (int) (Math.random() * range * min);
            niz[i] = rand;
        }
        return niz;
    }

    public static int[] bingo(int[] niz, int[] niz2) {

        int[] nizPogodaka = new int[niz.length];
        int pogodak = niz[0];
        int pogodak1 = niz[1];
        int pogodak2 = niz[2];
        int pogodak3 = niz[3];
        int pogodak4 = niz[4];
        int pogodak5 = niz[5];

        for (int i = 0; i < niz2.length; i++) {
            if (pogodak == niz2[i]) {
                nizPogodaka[0] = pogodak;
            }
            if (pogodak1 == niz2[i]) {
                nizPogodaka[1] = pogodak1;
            }
            if (pogodak2 == niz2[i]) {
                nizPogodaka[0] = pogodak2;
            }
            if (pogodak3 == niz2[i]) {
                nizPogodaka[3] = pogodak3;
            }
            if (pogodak4 == niz2[i]) {
                nizPogodaka[4] = pogodak4;
            }
            if (pogodak5 == niz2[i]) {
                nizPogodaka[5] = pogodak5;
            }

        }
        return nizPogodaka;
    }

    public static void stampa(int[] niz) {

        int brojac = 0;
        for (int i = 0; i < niz.length; i++) {
            if (niz[i] != 0) {
                brojac++;
            }
        }
        if (brojac == 0) {
            System.out.println("Niste imali pogodjenih brojeva, vise srece sledeci put!");
        } else if (brojac == 1) {
            System.out.println("Imali ste " + brojac + " pogodak.");
        } else if (brojac == 2 || brojac == 3 || brojac == 4) {
            System.out.println("Imali ste " + brojac + " pogotka.");
        } else if (brojac == 5) {
            System.out.println("Imali ste " + brojac + " pogodaka.");
        } else {
            System.out.println("Bingo!");
        }
    }
}
