package ProgOrdEksamen2022;

public class Oppgave2 {
    class Liste {

        public static int positiv(int[] liste) {
            int antall = 0;
            for (int i = 0; i < liste.length; i++) {
                if (liste[i] > 0) antall++;
            }
            return antall;
        }

        public static int antallForekomster(int[] liste, int tall) {
            int antall = 0;
            for (int i : liste) {
                if (i == tall) antall++;
            }
            return antall;

        }
        public static int storst(int[] liste) {
            int maks = liste[0];
            for (int i : liste) {
                if (i > maks) maks = i;
            }
            return maks;
        }

        }

    public static void main(String[] args) {
        int [] liste = {-2,4,1,6,10,7,4,5,-17};

        System.out.println("Her er alle de positive tallene: "+Liste.positiv(liste));
        System.out.println("Antall firere: "+Liste.antallForekomster(liste, 4));
        System.out.println("Største verdien i lista: "+Liste.storst(liste));
    }

}
