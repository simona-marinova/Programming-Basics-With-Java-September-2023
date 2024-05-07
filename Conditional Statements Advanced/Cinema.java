package ConditionalStatementsAdvanced;

import java.util.Scanner;


public class Cinema {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String typeOfProjections = scanner.nextLine();
        int lines = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        //⦁	Premiere – премиерна прожекция, на цена 12.00 лева.
        //⦁	Normal – стандартна прожекция, на цена 7.50 лева.
        //⦁	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        int numberCustomers = lines*columns;
        double income = 0;

        if (typeOfProjections.equals("Premiere")) {income = numberCustomers*12;}
        else if (typeOfProjections.equals("Normal")) {income= numberCustomers*7.50;}
        else if (typeOfProjections.equals("Discount")) {income = numberCustomers*5.00;}

        System.out.printf("%.2f leva",income);









    }
}
