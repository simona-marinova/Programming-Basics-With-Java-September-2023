package FreeTimeTasks;
import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String destination = scanner.nextLine();
        String dates= scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceOneNight = 0;

        switch (destination) {
            case "France":
                if (dates.equals("21-23")) {priceOneNight=30;}
                else if (dates.equals("24-27")) {priceOneNight=35;}
                else if(dates.equals("28-31")) {priceOneNight=40;}
                break;
            case "Italy":
                if (dates.equals("21-23")) {priceOneNight=28;}
                else if (dates.equals("24-27")) {priceOneNight=32;}
                else if(dates.equals("28-31")) {priceOneNight=39;}
                break;
            case "Germany":
                if (dates.equals("21-23")) {priceOneNight=32;}
                else if (dates.equals("24-27")) {priceOneNight=37;}
                else if(dates.equals("28-31")) {priceOneNight=43;}
                break;
        }

        double priceAll = priceOneNight*nights;

        System.out.printf("Easter trip to %s : %.2f leva.", destination, priceAll);
    }
}
