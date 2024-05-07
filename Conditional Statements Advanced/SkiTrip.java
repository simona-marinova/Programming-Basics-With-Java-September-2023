package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //⦁	"room for one person" – 18.00 лв за нощувка
        //⦁	"apartment" – 25.00 лв за нощувка
        //⦁	"president apartment" – 35.00 лв за нощувка

        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine(); // "room for one person", "apartment" или "president apartment"
        String mark = scanner.nextLine(); // "positive"  или "negative"

        double price = 0;
        int nights = days - 1;
        double discount = 0;
;
        //Намаленията са както следва:
        //вид помещение/по-малко от 10 дни/	/между 10 и 15 дни/	/повече от 15 дни/
        //room for one person	/не ползва намаление/	/не ползва намаление/	/не ползва намаление/
        //apartment	/30% от крайната цена/	35% от крайната цена/	/50% от крайната цена/
        //president apartment	/10% от крайната цена/	/15% от крайната цена/	/20% от крайната цена/

        switch(place) {
            case "room for one person":
                price = nights*18.00;
                discount = 0;
                break;
            case "apartment":
                price = nights*25.00;
                break;
            case "president apartment":
                price = nights*35.00;
                break;
        }

  if (days<10 && place.equals("apartment")) {discount = 0.3*price;}
  else if ((days>10 && days<15) && place.equals("apartment")) {discount=0.35*price;}
  else if (days>15 && place.equals("apartment")) {discount = 0.5*price;}

        if (days<10 && place.equals("president apartment")) {discount = 0.1*price;}
        else if ((days>10 && days<15) && place.equals("president apartment")) {discount=0.15*price;}
        else if (days>15 && place.equals("president apartment")) {discount = 0.2*price;}

        //След престоя, оценката на Атанас за услугите на хотела може да е позитивна (positive) или негативна (negative) .
// Ако оценката му е позитивна, към цената с вече приспаднатото намаление Атанас добавя 25% от нея.
// Ако оценката му е негативна приспада от цената 10%.

        if (mark.equals("positive")) {price = (price-discount) + 0.25*(price-discount);}
        if (mark.equals("negative")) {price = (price-discount) - 0.1*(price-discount);}

        System.out.printf("%.2f",price);


    }
}
