import java.util.Scanner;

public class AusgabeSumme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte erste Zahl eingeben:");
        Integer eingabe1 = sc.nextInt();
        System.out.println("Bitte zweite Zahl eingeben:");
        Integer eingabe2 = sc.nextInt();
        System.out.println("Ergebnis:");
        int summe = eingabe1 + eingabe2;
        System.out.println(summe);

    }
}
