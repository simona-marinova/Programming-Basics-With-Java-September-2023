package FreeTimeTasks;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        String packet = scanner.nextLine();
        int numberTickets = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (projection) {
            case "John Wick":
                if (packet.equals("Drink")) {
                    price = 12;
                } else if (packet.equals("Popcorn")) {
                    price = 15;
                } else if (packet.equals("Menu")) {
                    price = 19;
                }
                break;
            case "Star Wars":
                if (packet.equals("Drink")) {
                    price = 18;
                } else if (packet.equals("Popcorn")) {
                    price = 25;
                } else if (packet.equals("Menu")) {
                    price = 30;
                }
                if(numberTickets>=4) {price=price-0.30*price;}
                break;
            case "Jumanji":
                if (packet.equals("Drink")) {
                    price = 9;
                } else if (packet.equals("Popcorn")) {
                    price = 11;
                } else if (packet.equals("Menu")) {
                    price = 14;
                }
                if(numberTickets==2) {price=price-0.15*price;}
                break;
        }
       double priceAll = price*numberTickets;

        System.out.printf("Your bill is %.2f leva.",priceAll );

    }
}
