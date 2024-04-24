import java.util.Scanner;

public class EuroDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte den Euro Betrag eingeben:");
        int eingabe = sc.nextInt();
        double umrechnung = 1.0659;
        double dollar = eingabe * umrechnung;
        double dollargerundet = Math.round(dollar * 100) /100.0;
        System.out.println("US-Dollar Betrag:");
        System.out.println(dollargerundet);
    }
}
//Montag Aufgabe 4