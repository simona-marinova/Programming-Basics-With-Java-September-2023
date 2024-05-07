package FreeTimeTasks;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double taxOnePerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (guests >= 10 && guests <= 15) {
            taxOnePerson = taxOnePerson - taxOnePerson * 0.15;
        } else if (guests > 15 &&guests <= 20) {
            taxOnePerson = taxOnePerson - 0.20 * taxOnePerson;
        } else if (guests > 20) {
            taxOnePerson = taxOnePerson - 0.25 * taxOnePerson;
        }
        double priceCake = 0.10 * budget;

        double price = guests * taxOnePerson + priceCake;

        if (price <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - price);
        } else {
            System.out.printf("No party! %.2f leva needed.", price - budget);
        }

    }
}

