package org.lessons.java;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainPrice {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Inserisci la distanza in km da percorrere");
        int distance = Scanner.nextInt();
        System.out.println("Inserisci la tua età");
        int userAge = Scanner.nextInt();

        double price = distance * 0.21;
        if (userAge > 65) {
            price = price * 0.60;
        } else if(userAge < 18) {
            price = price * 0.80;
        }


        String finalPrice = new DecimalFormat("#########.##").format(price);
        System.out.println("Il prezzo per te è di € " + finalPrice);
    }

}