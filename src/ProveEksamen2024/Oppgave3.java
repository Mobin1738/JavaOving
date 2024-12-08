package ProveEksamen2024;

public class Oppgave3 {

    public static char[] reverserRekkefølge(char[] array){
        char[] reversertArray = new char[array.length];
        for (int i = array.length-1; i >= 0; i--){
            reversertArray[array.length-1-i] = array[i];
        }
        return reversertArray;
    }

    public static void main(String[] args) {



        char[] charArray = {'A', 'B', 'C', 'D', 'E'};
        System.out.println(reverserRekkefølge(charArray));
    }


}
