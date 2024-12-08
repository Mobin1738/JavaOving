package ProgOrdEksamen2022;
import javax.swing.*;
import java.util.*;
import static javax.swing.JOptionPane.*;

public class Oppgave3 {

    public static void main(String[] args) {
        double vekt, hoyde;
        try {
           vekt = Double.parseDouble(JOptionPane.showInputDialog(null, "Hva er din vekt?: "));
           hoyde = Double.parseDouble(JOptionPane.showInputDialog(null, "Hva er din høyde?: "));
        }
        catch(Exception e){
            vekt = 0;
            hoyde = 0;
        }
        if (vekt <= 0 || hoyde <= 0){
            showMessageDialog(null, "Du har oppgitt ugyldige verdier","Error", ERROR_MESSAGE);
        }
        else {
            double bmi = ( 1.3 * vekt) / Math.pow((hoyde/100), 2.5 );
            showMessageDialog(null, "Din BMI er: "+String.format("%.2f", bmi));

        }

    }

}
