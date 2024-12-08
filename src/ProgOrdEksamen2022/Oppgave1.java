package ProgOrdEksamen2022;

public class Oppgave1 {


    public static void main(String[] Args) {

        // Oppgave 1a)
        int[] array = {-3, 41, 5, -3, 2, 49};
        int teller = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > 10) teller++;
        }
        System.out.println("Antall tall større enn 10: " + teller);

        //b)

        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }

        //c og d)

        int summen = 0;
        int tellerpos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                summen = summen + array[i];
                tellerpos++;
            }
        }

        System.out.println("Summen av de positive tallene: "+summen);
        double avg = summen/tellerpos;
        System.out.println("Gjennomsnittet av de positive tallene: "+avg);
    }

}



