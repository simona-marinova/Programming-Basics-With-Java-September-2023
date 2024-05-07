package FreeTimeTasks;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double budgetLeft = budget;

        String name = scanner.nextLine();
        while (!name.equals("ACTION")) {
            int symbol = name.length();
            if (symbol <= 15) {
                double income = Double.parseDouble(scanner.nextLine());
                budgetLeft = budgetLeft - income;
                if (budgetLeft < 0) {
                    System.out.printf("We need %.2f leva for our actors.", Math.abs(budgetLeft));
                    return;
                }
            } else {
                double incomeTwo = 0.20 * budgetLeft;
                budgetLeft = budgetLeft - incomeTwo;
                if (budgetLeft < 0) {
                    System.out.printf("We need %.2f leva for our actors.", Math.abs(budgetLeft));
                    return;
                }
            }
            name = scanner.nextLine();
        }
        if (budgetLeft > 0) {
            System.out.printf("We are left with %.2f leva.", budgetLeft);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budgetLeft));


        }

    }
}