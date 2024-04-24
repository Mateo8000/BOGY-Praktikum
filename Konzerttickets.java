//Mittwoch E-Mail Aufgabe


import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Konzerttickets {

    public static boolean price1(Date date1, final Integer preis) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date dateK = sdf.parse("2024-02-03 10:00");
        Date dateK2 = sdf.parse("2024-02-03 20:00");
        int result = date1.compareTo(dateK);
        if (result < 0) {
            return(preis == 30);
        }
        if (result == 0) {
            return(preis == 35);
        }
        if (result > 0) {
            int result2 = date1.compareTo(dateK2);
            if (result2 < 0) {



            }

        }
       return true;
    }

    public static Integer price2(Date date3) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Scanner sc = new Scanner(System.in);
        int preis = 0;

        return preis;
    }


    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        System.out.println("Bitte heutiges Datum eingeben:");
        Date today = sdf.parse(sc.next());
        System.out.println("Bitte Anzahl Tickets eingeben:");
        int ticket1 = sc.nextInt();
        boolean result = price1(today, ticket1);
        if(result){
            System.out.println();
        }

    }

}


//  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
//  Date date1 = sdf.parse("2024-02-03 19:59");
//  Date date2 = sdf.parse("2024-02-03 20:00");
//
//        System.out.println("date1 : " + sdf.format(date1));
//        System.out.println("date2 : " + sdf.format(date2));
//
//  int result = date1.compareTo(date2);
//        System.out.println("result: " + result);
//
//        if (result >= 0) {
//        System.out.println("Date1 is equal to Date2");
//        } else {
//                System.out.println("Date1 is before Date2");

// * Code-Part by https://mkyong.com/java/how-to-compare-dates-in-java/