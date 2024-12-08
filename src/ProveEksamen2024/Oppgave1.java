package ProveEksamen2024;

public class Oppgave1 {
    public void investigateStringArray(String[] strings){

        int nullverdier = 0;
        int tegn = 0;
        for (String str : strings){
            if(str != null) {
                tegn += str.length();
                if(str.contains("a")){
                    System.out.println(str);
                }

           }
            else nullverdier++;

        }
        System.out.println("Antall tegn: "+tegn);
        System.out.println("Antall nullverdier: "+nullverdier);





    }

    public static void main(String[] args) {
        Oppgave1 test = new Oppgave1();
        String[] string1 = {"Tikka Masala", "Stick Dinner", "Potato Potato",null};
        test.investigateStringArray(string1);
    }
}
