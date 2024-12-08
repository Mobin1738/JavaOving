package KonteEksamen2022;

public class Oppgave1 {
    public static void main(String[] args) {

        //a)
        int summen = 0;
        for(int i = 10; i <= 1000;i+=10){
            summen = summen + i;
        }
        System.out.println("Summen for hvert 10.tall fra 0 til 1000:"+"\n"+"="+summen);



        //b)

        summen = 0;
        int i = 10;
        while(i <= 1000){
            summen = summen + i;
            i+=10;
        }
        System.out.println("Summen for hvert 10.tall fra 0 til 1000:"+"\n"+"="+summen);

        //c)

        for (int j = 10; j >= -10; j--){
            if (j>-10) {
                System.out.print(j + ", ");
            }
            else{
                System.out.print(j);

            }
        }

    }
}
