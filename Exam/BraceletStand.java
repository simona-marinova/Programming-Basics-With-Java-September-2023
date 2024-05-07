package Exam;
import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double dailyMoney = Double.parseDouble(scanner.nextLine());
        double earnedMoneyDay = Double.parseDouble(scanner.nextLine());
        double allExpenses = Double.parseDouble(scanner.nextLine());
        double priceGift =  Double.parseDouble(scanner.nextLine());

        double sum = 5*earnedMoneyDay + 5*dailyMoney;
        double sumNet = sum  - allExpenses;

        if(sumNet>=priceGift) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", sumNet);}
            else {
                System.out.printf("Insufficient money: %.2f BGN.", priceGift-sumNet);
            }

        }
    }

