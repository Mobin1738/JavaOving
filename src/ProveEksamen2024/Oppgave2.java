package ProveEksamen2024;
import javax.swing.JOptionPane.*;
import java.util.Scanner;




public class Oppgave2 {

    static void displayWordOfWisdom() {

    }

    ;

    static void displayWeather() {
    }

    static void exitProgram() {
    }


    // Input fra bruker
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velg: 1 for å motta visdomsord. 2 for å se dagens vær. 3 for å avslutte programmet.");
        int i = scanner.nextInt();
        boolean gyldigNummer = false;
        while (!gyldigNummer) {
            if (i > 0 && i < 4) {

                if (i == 1) displayWordOfWisdom(); gyldigNummer = true;


                if (i == 2) {
                    displayWeather();
                    gyldigNummer = true;
                }


                else exitProgram();
            }

            else break;

        }
    }
}