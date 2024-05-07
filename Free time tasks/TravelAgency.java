package FreeTimeTasks;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (town) {
            case "Bansko":
            case "Borovets":
                if (pack.equals("withEquipment")) {
                    price = 100;
                    if (vip.equals("yes")) {
                        price = price - 0.10 * price;
                    }
                } else if (pack.equals("noEquipment")) {
                    price = 80;
                    if (vip.equals("yes")) {
                        price = price - 0.05 * price;
                    }
                }
                break;
            case "Varna":
            case "Burgas":
                if (pack.equals("withBreakfast")) {
                    price = 130;
                    if (vip.equals("yes")) {
                        price = price - 0.12 * price;
                    }
                } else if (pack.equals("noBreakfast")) {
                    price = 100;
                    if (vip.equals("yes")) {
                        price = price - 0.07 * price;
                    }
                }
                break;
        }
        if (days > 7) {
            days = days - 1;
        }
        double fullPrice = price * days;

        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else if (!town.equals("Bansko") && !town.equals("Borovets") && !town.equals("Varna") && !town.equals("Burgas")
                || !pack.equals("withEquipment") && !pack.equals("noEquipment") && !pack.equals("withBreakfast") && !pack.equals("noBreakfast")
        ) {
            System.out.println("Invalid input!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", fullPrice);

        }
    }
}
