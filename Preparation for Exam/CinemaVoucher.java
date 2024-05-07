package PreparationExam;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 0;
        int voucher = Integer.parseInt(scanner.nextLine());
        int tickets = 0;
        double moneyLeft = voucher;
        int otherPurchase = 0;


        while (moneyLeft > 0) {
            String purchase = scanner.nextLine();
            if (purchase.equals("End")) {
                System.out.printf("%d\n", tickets);
                System.out.printf("%d\n", otherPurchase);
                return;
            }
            int numberSymbols = purchase.length();
            char symbol0 = purchase.charAt(0);
            char symbol1 = purchase.charAt(1);

            if (numberSymbols > 8) {
                price = symbol0 + symbol1;
                boolean isTrue = moneyLeft >= price;
                if (isTrue) {
                    tickets++;
                    ;
                }
            } else {
                price = symbol0;
                boolean isTrue = moneyLeft >= price;
                if (isTrue) {
                    otherPurchase++;
                }
            }
            moneyLeft=moneyLeft-price;
        }
        System.out.printf("%d\n", tickets);
        System.out.printf("%d\n", otherPurchase);
    }
}