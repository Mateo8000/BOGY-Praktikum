import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Notendurchschnitt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> grades = new ArrayList<>();
        double grade;
        System.out.println("Willkommen beim Notendurchschnittsrechner\n");
        System.out.println("Wenn du fertig bist, gib irgendeine Zahl größer als 5.\n");
        System.out.println("Bitte Noten eingeben im Bereich von 1-5:");
        while (true) {
            grade = sc.nextDouble();
            grades.add(grade);
            System.out.println(grades);
            if (grade > 5) {
                grades.removeLast();
                System.out.println(grades);
                double sum = grades.stream().mapToDouble(Double::doubleValue).sum();
                double average1 = sum/grades.size() ;
                double average2 = (double) Math.round(average1*100) /100.0;
                System.out.println("\nDein Notendurchschnitt ist:" + average2);
                break;
            }


        }


    }


}
//Dienstag E-Mail Aufgabe

