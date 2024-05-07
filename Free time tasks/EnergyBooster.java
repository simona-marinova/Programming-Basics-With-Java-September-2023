package FreeTimeTasks;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int numberSets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = 56*2;
                } else if (size.equals("big")) {
                    price = 28.70*5;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = 36.66*2;
                } else if (size.equals("big")) {
                    price = 19.60*5;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = 42.10*2;
                } else if (size.equals("big")) {
                    price = 24.80*5;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = 20*2;
                } else if (size.equals("big")) {
                    price = 15.20*5;
                }
                break;

        }
        double fullPrice = price * numberSets;

        if (fullPrice >= 400 && fullPrice <= 1000) {
            fullPrice = fullPrice - 0.15 * fullPrice;
        } else if (fullPrice > 1000) {
            fullPrice = fullPrice - 0.5 * fullPrice;
        }

        System.out.printf("%.2f lv.", fullPrice);


    }
}