package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class HotelRoomTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        //Да се отпечатат на конзолата 2 реда:
        //⦁	На първия ред: "Apartment: {цена за целият престой} lv."
        //⦁	На втория ред: "Studio: {цена за целият престой} lv."
        //Цената за целия престой форматирана с точност до два знака след десетичната запетая.

        double priceOfapartment = 0;
        double priceOfStudio = 0;

        switch (month) {
            case ("May"):
            case ("October"):
                priceOfStudio = 50;
                priceOfapartment = 65;
                break;
            case ("June"):
            case ("September"):
                priceOfStudio = 75.20;
                priceOfapartment = 68.70;
                break;
            case ("July"):
            case ("August"):
                priceOfStudio = 76;
                priceOfapartment = 77;
                break;
        }

        // За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
        //За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
        //За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
        //За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.

        double discountStudio = 0;
        double discountApartment = 0;

        if (month.equals("May") || month.equals("October")) {
            if (nights > 7 && nights<14) {
                discountStudio = 0.05 * (priceOfStudio * nights);
            } else if (nights > 14) {
                discountStudio = 0.30 * (priceOfStudio * nights);}
        } else if (month.equals("June") || month.equals("September")) {
            if (nights > 14) {
                discountStudio = 0.20 * (priceOfStudio * nights);}}

            if (nights > 14) {
                discountApartment = 0.1 * (priceOfapartment * nights);
            }


        System.out.printf("Apartment: %.2f lv.\n", (priceOfapartment * nights - discountApartment));
        System.out.printf("Studio: %.2f lv.", (priceOfStudio * nights - discountStudio));

    }
}

