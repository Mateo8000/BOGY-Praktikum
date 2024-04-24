import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class EinkaufsListe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> einkaufsliste = new ArrayList<>();
        System.out.println("Soll ich etwas hinzufügen? (ja/nein)");
        String answer = sc.next();
        System.out.println(answer);
        while (answer.equals("ja")) {
            System.out.println("Was möchten Sie hinzufügen?");
            String eingabe = sc.next();
            einkaufsliste.add(eingabe);
            System.out.println("Soll ich noch etwas hinzufügen? (ja/nein)");
            answer = sc.next();

            if (answer.equals("nein")) {
                break;
            }
        }

        System.out.println("Die Einkaufsliste enthält:" + einkaufsliste);
        System.out.println("Anzahl der Produkte: " + einkaufsliste.size());
    }
}
//Montag Aufgabe 6

