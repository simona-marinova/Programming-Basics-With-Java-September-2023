package PreparationExam;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine(); // A Star Is Born", "Bohemian Rhapsody","Green Book" или "The Favourite")
        String hall = scanner.nextLine(); // normal", "luxury" или "ultra luxury"
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        //Филм	normal	luxury	ultra luxury
        //A Star Is Born	7.50 лв.	10.50 лв.	13.50 лв.
        //Bohemian Rhapsody	7.35 лв.	9.45 лв.	12.75 лв.
        //Green Book	8.15 лв.	10.25 лв.	13.25 лв.
        //The Favourite	8.75 лв.	11.55 лв.	13.95 лв.

        switch (name) {
            case "A Star Is Born":
                if (hall.equals("normal")) {
                    price = 7.50;
                } else if (hall.equals("luxury")) {
                    price = 10.50;
                } else if (hall.equals("ultra luxury")) {
                    price = 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (hall.equals("normal")) {
                    price = 7.35;
                } else if (hall.equals("luxury")) {
                    price = 9.45;
                } else if (hall.equals("ultra luxury")) {
                    price = 12.75;
                }
                break;
            case "Green Book":
                if (hall.equals("normal")) {
                    price = 8.15;
                } else if (hall.equals("luxury")) {
                    price = 10.25;
                } else if (hall.equals("ultra luxury")) {
                    price = 13.25;
                }
                break;
            case "The Favourite":
                if (hall.equals("normal")) {
                    price = 8.75;
                } else if (hall.equals("luxury")) {
                    price = 11.55;
                } else if (hall.equals("ultra luxury")) {
                    price = 13.95;
                }
                break;
        }
double income = price*tickets;
        System.out.printf("%s -> %.2f lv.", name, income);
    }
}
