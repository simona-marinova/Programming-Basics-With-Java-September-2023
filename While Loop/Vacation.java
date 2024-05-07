package WhileLoop;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int daysMoneySpent = 0;
        int days = 0;


        while (money < vacationPrice) {

            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());

            days++;

            if (action.equals("spend")) {
                money -= sum;
                if (money < 0) {
                    money = 0;
                }
                daysMoneySpent++;
            } else if (action.equals("save")) {
                daysMoneySpent = 0;
                money += sum;
            }

            if (daysMoneySpent == 5) {
                System.out.println("You can't save the money.");
                System.out.printf("%d", daysMoneySpent);
                return;
            }

        }


        System.out.printf("You saved the money for %d days.", days);
    }
}
