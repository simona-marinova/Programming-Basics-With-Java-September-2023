package PreparationExam;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double litersFuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double price = litersFuel * 2.10 + 100;
        if (day.equals("Saturday")) {
            price = price - 0.1 * price;
        } else if (day.equals("Sunday")) {
            price = price - 0.2 * price;
        }

        if (budget >= price) {
            System.out.printf("Safari time! Money left: %.2f lv.\n", budget - price);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", price - budget);}
    }
}

