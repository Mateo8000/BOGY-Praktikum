import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RateSpiel {
    public static void main(String[] args) {
        List<Integer> tries = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        boolean game = true;
        System.out.println("Errate die Zahl von 1 bis 100!");
        while (game) {
            int number = rn.nextInt(1, 100);
            int attempt = sc.nextInt();


            while (attempt != number) {
                if (number > attempt) {
                    if (!tries.contains(attempt)) {
                        tries.add(attempt);
                        System.out.println("zu klein");
                    } else {
                        System.out.println("Schon geraten");
                    }

                }
                if (number < attempt) {
                    if (!tries.contains(attempt)) {
                        tries.add(attempt);
                        System.out.println("zu groß");
                    } else {
                        System.out.println("Schon geraten");
                    }

                }

                attempt = sc.nextInt();
            }


            tries.add(attempt);
            System.out.println(tries);
            System.out.println("Die Zahl war wirklich " + number);
            System.out.println("Anzahl der Versuche: " + tries.size());
            System.out.println("Willst du nochmal spielen? (ja/nein)");
            String antwort = sc.next();
            if (antwort.equals("nein")) {
                System.out.println("Schade, vielleicht nächstes Mal!");
                game = false;
            }
            if (antwort.equals("ja")) {
                tries.clear();
                System.out.println("Errate die neue Zahl!");
            }


        }

    }
}
//Montag/ Dienstag Separate Aufgabe
