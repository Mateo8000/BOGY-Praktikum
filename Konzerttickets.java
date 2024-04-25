//Mittwoch begonnen/ Donnerstag fertig E-Mail Aufgabe
// Am Mittwoch zusätzlich GitHub eingeführt + an einem Metting teilgenommen über Service von Website einer Firma;
// also welche Funktionen es hat wie 24/7 Support etc.



import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Konzerttickets {

    public static double price1(Date date1) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date dateK = sdf.parse("02.05.2024 10:00");
        Date dateK2 = sdf.parse("02.05.2024 20:00");
        double ticketpreis = 30.00;
        if (date1.before(dateK)) {
            return ticketpreis;
        }
        if (date1.equals(dateK)) {
            return ticketpreis + 5.00;
        }
        if (date1.after(dateK) && date1.before(dateK2)) {
            for ( int i=10; i<= 19; i++){
                Date dateK3 = sdf.parse("02.05.2024 " + i + ":00");
                if (date1.after(dateK3)){
                    int hours = date1.getHours();
                    double depend = (hours - 10) * 2.00;
                    return ticketpreis + 5.00 + depend;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String datumString = "02.05.2024 19:59";
        Date today = sdf.parse(datumString);
        System.out.println("Datum: " + today);
        System.out.println("Anzahl der Tickets eingeben: ");
        int ticketnumber = sc.nextInt();
        double result = price1(today);
        double gesamt = price1(today) * ticketnumber;
        if(price1(today) <= 0){
            System.out.println("Tickets sind nicht mehr verfügbar.");
        }
        else {
            System.out.println("Aktueller Einzelticketpreis: " + result + " Euro");
            System.out.println("Der Gesamtpreis wäre: " + gesamt + " Euro");
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