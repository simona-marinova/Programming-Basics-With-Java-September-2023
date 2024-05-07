package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CinemaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String typeOfProjections = scanner.nextLine();
        int lines = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        //⦁	Premiere – премиерна прожекция, на цена 12.00 лева.
        //⦁	Normal – стандартна прожекция, на цена 7.50 лева.
        //⦁	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        switch (typeOfProjections) {
        case "Premiere":
            System.out.printf("%.2f leva", (lines*columns*12.00));
            break;
            case "Normal":
                System.out.printf("%.2f leva", (lines*columns*7.50));
                break;
            case"Discount":
                System.out.printf("%.2f leva", (lines*columns*5.00));
                break;}





    }
}
