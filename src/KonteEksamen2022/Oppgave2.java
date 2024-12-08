package KonteEksamen2022;
import java.util.ArrayList;
public class Oppgave2 {
    public static void main(String[] args) {
        ValutaKalkulator kalk1 = new ValutaKalkulator();
        System.out.println("USD = "+String.format("%.2f", kalk1.beregnKurs("USD")));
        System.out.println("DKK = "+String.format("%.2f", kalk1.beregnKurs("DKK")));
        System.out.println("SEK = "+String.format("%.2f", kalk1.beregnKurs("SEK")));

    }
}

class Valuta{
    private String valuta;
    private double kurs;
    public Valuta(String valuta, double kurs) {
        this.valuta = valuta;
        this.kurs = kurs;
    }
    public String getValuta() {
        return valuta;
    }
    public double getKurs() {
        return kurs;
    }
}

class ValutaKalkulator {
    private ArrayList<Valuta> valutakurser = new ArrayList<>();
    public ValutaKalkulator(){
        Valuta usd = new Valuta("USD", 11.50);
        valutakurser.add(usd);
        Valuta dkk = new Valuta("DKK", 100.64);
        valutakurser.add(dkk);

    }
    public double beregnKurs(String valuta) {

        for (Valuta i : valutakurser){
            if (i.getValuta() == valuta){
                return i.getKurs();
            }
        }
        return 0;
    }
}
