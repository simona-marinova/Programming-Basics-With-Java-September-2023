package WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        double totalSum=0;

        while (!text.equals("NoMoreMoney")) {
            double income = Double.parseDouble(text);
            if (income<0) {
                System.out.println("Invalid operation!" );
                break;
            }
            totalSum = totalSum + income;
            System.out.printf("Increase: %.2f\n", income);
            text = scanner.nextLine();
        }

        System.out.printf("Total: %.2f",totalSum);
    }
}
