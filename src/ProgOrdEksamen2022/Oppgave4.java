package ProgOrdEksamen2022;
import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.util.*;
public class Oppgave4 {
    class KonverterTemperatur{

        public static double tilCelsius(double innFahrenheit){
            return (innFahrenheit - 32) / 1.8;
        }
        public static double tilFahrenheit(double innCelsius){
            return innCelsius * 1.8 + 32;
        }
    }

    public static void main(String[] args) {
        double fahrenheit = 91;
        System.out.println(fahrenheit+" Fahrenheit er i Celsius: "+KonverterTemperatur.tilCelsius(fahrenheit));
        double celsius = 37.6;
        System.out.println(celsius+" Celsius er i Fahrenheit: "+KonverterTemperatur.tilFahrenheit(celsius));
    }
}
