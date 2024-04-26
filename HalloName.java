import java.util.Scanner;

public class HalloName {
    public static void main(String[] args) {
        System.out.println("Hallo,wie ist dein Name?");
        Scanner sc = new Scanner(System.in);
        String eingabe = sc.next();
        System.out.println("Hallo " + eingabe);
    }

}
