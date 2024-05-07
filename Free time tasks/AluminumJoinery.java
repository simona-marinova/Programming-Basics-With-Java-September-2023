package FreeTimeTasks;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double priceOne = 0;
        double priceAll = 0;

        if (number < 10) {
            System.out.println("Invalid order");
            return;
        }


        switch (type) {
            case "90X130":
                priceOne = 110;
                priceAll = priceOne * number;
                if (number > 30 && number < 60) {
                    priceAll = priceAll - 0.05 * priceAll;
                } else if (number > 60) {
                    priceAll = priceAll - 0.08 * priceAll;
                }
                break;
            case "100X150":
                priceOne = 140;
                priceAll = priceOne * number;
                if (number > 40 && number < 80) {
                    priceAll = priceAll - 0.06 * priceAll;
                } else if (number > 80) {
                    priceAll = priceAll - 0.10 * priceAll;
                }
                break;
            case "130X180":
                priceOne = 190;
                priceAll = priceOne * number;
                if (number > 20 && number < 50) {
                    priceAll = priceAll - 0.07 * priceAll;
                } else if (number > 50) {
                    priceAll = priceAll - 0.12 * priceAll;
                }
                break;
            case "200X300":
                priceOne = 250;
                priceAll = priceOne * number;
                if (number > 25 && number < 50) {
                    priceAll = priceAll - 0.09 * priceAll;
                } else if (number > 50) {
                    priceAll = priceAll - 0.14 * priceAll;
                }
                break;

        }

        if (delivery.equals("With delivery")) {
            priceAll = priceAll + 60;
        }

        if (number > 99) {
            priceAll = priceAll - 0.04 * priceAll;

        }
        System.out.printf("%.2f BGN", priceAll);
    }
}

