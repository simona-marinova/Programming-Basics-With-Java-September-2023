package FreeTimeTasks;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceOneNight = Integer.parseInt(scanner.nextLine());
        int percentageAdditionalCosts = Integer.parseInt(scanner.nextLine());

//Трябва да се има предвид, че ако броят на нощувките е по-голям от 7,
// цената за нощувка се намаля с 5%.

        if (nights > 7) {
            priceOneNight = priceOneNight - priceOneNight * 0.05;
        }
        double priceNights = nights * priceOneNight;
        double priceAdditionalCosts = percentageAdditionalCosts*1.0/100 * budget;

        double fullPrice = priceNights + priceAdditionalCosts;

        if (fullPrice <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", (budget - fullPrice));
        } else {
            System.out.printf("%.2f leva needed.", (fullPrice - budget));
        }

    }
}