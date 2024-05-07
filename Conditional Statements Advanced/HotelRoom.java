package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        //Да се отпечатат на конзолата 2 реда:
        //⦁	На първия ред: "Apartment: {цена за целият престой} lv."
        //⦁	На втория ред: "Studio: {цена за целият престой} lv."
        //Цената за целия престой форматирана с точност до два знака след десетичната запетая.

        double priceOfapartment = 0.00;
        double priceOfStudio = 0.00;

        switch (month) {
            case "May":
            case "October":
                priceOfStudio = 50 * nights;
                priceOfapartment = 65 * nights;
                break;
            case "June":
            case "September":
                priceOfStudio = 75.20 * nights;
                priceOfapartment = 68.70 * nights;
                break;
            case "July":
            case "August":
                priceOfStudio = 76 * nights;
                priceOfapartment = 77 * nights;
                break;
        }

        // За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
        //За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
        //За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
        //За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.

        if((month.equals("May") || month.equals("October")) && (nights>7 && nights<14) ) {
            priceOfStudio = priceOfStudio - 0.05*priceOfStudio;
        }
        else if ((month.equals("May") || month.equals("October")) && nights>14) {
            priceOfStudio = priceOfStudio - priceOfStudio*0.3;
        }
        else if ((month.equals("June") || month.equals("September")) && nights>14 ) {
            priceOfStudio = priceOfStudio - 0.2*priceOfStudio;
        }
        if (nights>14) {
            priceOfapartment = priceOfapartment - priceOfapartment*0.10;
        }

        System.out.printf("Apartment: %.2f lv.\n", priceOfapartment);
        System.out.printf("Studio: %.2f lv.", priceOfStudio);

    }
}
