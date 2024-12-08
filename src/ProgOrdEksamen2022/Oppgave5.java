package ProgOrdEksamen2022;

import java.util.ArrayList;

class Bok {
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Tittel: " + tittel + "\n" + "Forfatter: " + forfatter + "\n" + "Pris: " + pris;
    }
}

class Papirbok extends Bok{
    private int ISBN;

    public Papirbok(String tittel, String forfatter, double pris, int ISBN) {
        super(tittel, forfatter, pris);
        this.ISBN = ISBN;
    }


    @Override
    public String toString() {
        return super.toString()+ "\n"+"ISBN: "+ISBN;
    }
}


class Lydbok extends Bok{
    private int lengdelminutter;

    public Lydbok(String tittel, String forfatter, double pris, int lengdelminutter) {
        super(tittel, forfatter, pris);
        this.lengdelminutter = lengdelminutter;
    }


    @Override
    public String toString() {
        return super.toString()+ "\n"+"lengdelminutter: "+lengdelminutter;
    }
}



    public class Oppgave5 {
        public static void main(String[] args) {
            Lydbok l1 = new Lydbok("Blood Meridian", "Cormac McCarthy" , 217.99 , 697 );
            Papirbok p1 = new Papirbok("Mistborn: The Final Empire", "Brandon Sanderson", 559.99,456757865);

            ArrayList<Bok> boksamling = new ArrayList<>();
            boksamling.add(l1);
            boksamling.add(p1);

            for (Bok i : boksamling){

                System.out.println(i.toString()+"\n");
            }

        }
    }

