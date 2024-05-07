package PreparationExam;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDays=0;
        double totalSum=0;

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double priceSum =0;
        for (int currentDay = 1; currentDay <= days; currentDay++) {
            numberDays++;
            priceSum=0;
            for (int currentHour = 1; currentHour <= hours; currentHour++) {
                if (currentDay % 2 == 0 && currentHour % 2 != 0) {
                    price = 2.50;
                } else if (currentDay % 2 != 0 && currentHour % 2 == 0) {
                    price = 1.25;
                } else {
                    price = 1.0;
                }
                priceSum=priceSum+price;
                totalSum=totalSum+price;

            }
            System.out.printf("Day: %d - %.2f leva\n", numberDays, (priceSum));
        }

        System.out.printf("Total: %.2f leva\n", totalSum);

    }
}

