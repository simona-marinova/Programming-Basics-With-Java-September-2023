package FreeTimeTasks;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        //Един козунак струва 4лв.
        //Едно яйце струва 0.45лв.

        double numberEasterBread = Math.ceil(guests * 1.0 / 3);
        int numberEggs = guests * 2;
        double price = numberEasterBread * 4 + numberEggs * 0.45;

        if (price <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.\n", numberEasterBread, numberEggs);
            System.out.printf("He has %.2f lv. left.", budget - price);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", price - budget);
        }
    }
}
