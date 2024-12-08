package ProveEksamen2024;

import java.util.Scanner;
public class Oppgave2LF {

    public static void simpleMenu() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        String userHelp = "Vennligst velg et tall mellom 1 og 3";
        while (choice != 3) {
            System.out.println("Du har tre valg (1-3)");
            System.out.println("1: Motta dagens visdomsord");
            System.out.println("2: Se dagens værmelding");
            System.out.println("3: Avslutte programmet");
            boolean userHasEnteredValidNumber = false;
            while (!userHasEnteredValidNumber) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice > 0 && choice < 4) {
                        userHasEnteredValidNumber = true;
                    } else {
                        System.out.println(userHelp);
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println(userHelp);
                }
            }
            switch (choice) {
                case 1 -> displayWordOfWisdom();
                case 2 -> displayWeather();
                case 3 -> exitProgram();
                default -> System.out.println(userHelp);
            }
        }
    }

    private static void exitProgram() {
        System.out.println("Bye!");
    }

    /**
     * Not part of the delivery, but created to be able to compile project.
     **/
    private static void displayWeather() {
        System.out.println("Viser været");
    }

    /**
     * Not part of the delivery, but created to be able to compile project.
     **/
    private static void displayWordOfWisdom() {
        System.out.println("Viser visdomsord");
    }



    public static void main(String[] args) {
        simpleMenu();
    }
}
