package FreeTimeTasks;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double priceOneDay = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    priceOneDay = 45000;
                } else if (season.equals("Summer")) {
                    priceOneDay = 40000;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    priceOneDay = 17000;
                } else if (season.equals("Summer")) {
                    priceOneDay = 12500;
                }
                break;
            case "London":
                if (season.equals("Winter")) {
                    priceOneDay = 24000;
                } else if (season.equals("Summer")) {
                    priceOneDay = 20250;
                }
                break;
        }

        double priceAll = priceOneDay * days;

        if (destination.equals("Dubai")) {
            priceAll = priceAll - 0.30 * priceAll;
        }
        if (destination.equals("Sofia")) {
            priceAll = priceAll + priceAll * 0.25;
        }

        if (priceAll <= budget) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - priceAll);
        } else {
            System.out.printf("The director needs %.2f leva more!", priceAll - budget);
        }
    }
}