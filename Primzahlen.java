

public class Primzahlen {
    public static boolean isPrime(final long value) {
        if (value <= 2) {
            return (value == 2);
        }
        for (long i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }



    static int i = 2;
    public static boolean isPrimerecursive(int n) {

        // Corner cases
        if (n == 0 || n == 1) {
            return false;
        }

        // Checking Prime
        if (n == i)
            return true;

        // Base cases
        if (n % i == 0) {
            return false;
        }
        i++;
        return isPrimerecursive(n);
    }



    // effizienter Primzahlentest
    public static boolean isPrim(final long value) {
        if (value <= 16) {
            return (value == 2 || value == 3 || value == 5 || value == 7 || value == 11 || value == 13);
        }
        if (value % 2 == 0 || value % 3 == 0 || value % 5 == 0 || value % 7 == 0) {
            return false;
        }
        for (long i = 10; i * i <= value; i += 10) {
            if (value % (i+1) == 0) {  // 11, 21, 31, 41, 51, ...
                return false;
            }
            if (value % (i+3) == 0) {  // 13, 23, 33, 43, 53, ...
                return false;
            }
            if (value % (i+7) == 0) {  // 17, 27, 37, 47, 57, ...
                return false;
            }
            if (value % (i+9) == 0) {  // 19, 29, 39, 49, 59, ...
                return false;
            }
        }
        return true;
    }


    static boolean isPrimesqrt(int n)
    {

        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

            // Check if number is 2
        else if (n == 2)
            return true;

            // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
        double n_sqrt = Math.sqrt(n);
        // If not, then just check the odds
        for (int i = 3; i <= n_sqrt; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int count = 0;
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < 200000; j++) {
            boolean prim = isPrim(j);
            if (prim) {
               System.out.println(j);
                count++;
            }


        }
        long now = System.currentTimeMillis();
        System.out.println("Es sind " + count + " Primzahlen.");
        System.out.println("Es sind " + (now - startTime) + " ms vergangen.");
    }
}
//Dienstag E-Mail Aufgabe