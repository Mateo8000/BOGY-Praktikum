import java.util.Scanner;

public class Zufallszahl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Random Number Generator");
        System.out.println("Start:");
        int start = sc.nextInt();
        sc.nextLine();
        System.out.println("Ende: ");
        int ende = sc.nextInt();

        while (true) {
            double randomNumber = start + Math.random() * (ende - start);
            int zufallszahl = (int) Math.round(randomNumber);
            System.out.println("Die zufällige Zahl ist:" + zufallszahl);
            String stop = sc.nextLine();
            if(stop.equals("stop")){
                break;
            }
        }


    }
}




