package ForLoop;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWM = Double.parseDouble(scanner.nextLine());
        int priceOneToy = Integer.parseInt(scanner.nextLine());

double lilyMoney = 0.00;
double birthdayMoney = 10.00;
int toysCount = 0;


        for (int currentBirthday = 1; currentBirthday <= age; currentBirthday++) {
            if (currentBirthday % 2 == 0) {
               lilyMoney = lilyMoney + birthdayMoney;
               birthdayMoney = birthdayMoney +10;
               lilyMoney = lilyMoney - 1.00;
            } else {
                toysCount++;
            } }

        lilyMoney = lilyMoney + toysCount*priceOneToy;

             if (lilyMoney>=priceWM) {
                 System.out.printf("Yes! %.2f", lilyMoney - priceWM);
             } else {
                     System.out.printf("No! %.2f",priceWM-lilyMoney );}


            }

        }




