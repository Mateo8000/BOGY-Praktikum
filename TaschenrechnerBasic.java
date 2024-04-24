import java.util.Scanner;


public class TaschenrechnerBasic {
    public static Double sum(Double i, Double j) {
        return i + j;
    }

    public static Double diff(Double i, Double j) {
        return i - j;
    }

    public static Double prod(Double i, Double j) {
        return i * j;
    }

    public static Double quot(Double i, Double j) {
        return i / j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nm1 = sc.nextDouble();
        String symbol = sc.next();
        double nm2 = sc.nextDouble();

        if (symbol.equals("+")){
            double mySum = sum(nm1, nm2);
            System.out.println("= " + mySum);
        }
        if (symbol.equals("-")){
            double myDiff = diff(nm1, nm2);
            System.out.println("= " + myDiff);
        }
        if (symbol.equals("*")){
            double myProd = prod(nm1, nm2);
            System.out.println("= " + myProd);
        }
        if (symbol.equals("/")){
            double myQuot = quot(nm1, nm2);
            System.out.println("= " + myQuot);
        }


    }

}

//Dienstag E-Mail Aufgabe