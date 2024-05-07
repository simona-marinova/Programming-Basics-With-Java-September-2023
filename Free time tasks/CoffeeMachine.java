package FreeTimeTasks;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int numberOfDrinks = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    price = 0.90 - 0.90 * 0.35;
                } else if (sugar.equals("Normal")) {
                    price = 1;
                } else if (sugar.equals("Extra")) {
                    price = 1.20;
                }
                if (numberOfDrinks >= 5) {
                    price = price - 0.25 * price;
                }
                break;
            case "Cappuccino":
                if (sugar.equals("Without")) {
                    price = 1.00 - 1.00 * 0.35;
                } else if (sugar.equals("Normal")) {
                    price = 1.20;
                } else if (sugar.equals("Extra")) {
                    price = 1.60;
                }
                break;
            case "Tea":
                if (sugar.equals("Without")) {
                    price = 0.50 - 0.50 * 0.35;
                } else if (sugar.equals("Normal")) {
                    price = 0.60;
                } else if (sugar.equals("Extra")) {
                    price = 0.70;
                }
                break;

        }

        double fullPrice = price * numberOfDrinks;
        if (fullPrice > 15) {
            fullPrice = fullPrice - 0.20 * fullPrice;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", numberOfDrinks, drink, fullPrice);
    }
}