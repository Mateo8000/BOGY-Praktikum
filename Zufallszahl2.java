import java.util.Scanner;
import java.util.Random;

public class Zufallszahl2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Min:");
        int minimum = sc.nextInt();
        System.out.println("Max: ");
        int maximum = sc.nextInt();
        Random random = new Random();

        while (true) {
            int zufallszahl = random.nextInt(minimum, maximum + 1);
            System.out.println("Die Zufallszahl ist:" + zufallszahl);
            String stop = sc.nextLine();
            if(stop.equals("stop")){
                break;
            }
        }
    }
}
