package FreeTimeTasks;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double bill = 0;
        double allBill = 0;
        int number = 0;

        for (int i = 1; i <= clients; i++) {
            String purchase = scanner.nextLine();
            while (!purchase.equals("Finish")) {
                switch (purchase) {
                    case "basket":
                        bill = bill + 1.50;
                        break;
                    case "wreath":
                        bill = bill + 3.80;
                        break;
                    case "chocolate bunny":
                        bill = bill + 7.00;
                        break;
                }
                number++;
                purchase = scanner.nextLine();
            }
            if(number%2==0) {bill = bill-0.20*bill;}
            else {bill=bill;}
            System.out.printf("You purchased %d items for %.2f leva.\n", number, bill);
            allBill = allBill + bill;
            bill = 0;
            number=0;
        }

        double average = allBill / clients;
        System.out.printf("Average bill per client is: %.2f leva.", average);

    }
}
