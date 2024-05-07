package ConditionalStatements;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        int videoCard = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        //⦁	Видеокарта – 250 лв./бр.
        //⦁	Процесор – 35% от цената на закупените видеокарти/бр.
        //⦁	Рам памет – 10% от цената на закупените видеокарти/бр.

        double price = videoCard*250+ processor*0.35*videoCard*250 + ram*0.1*videoCard*250;

        if (videoCard>processor) {price = price-0.15*price;}
        else {price=price;}

        if (budjet>=price) {
            System.out.printf("You have %.2f leva left!", budjet-price);}
        else {System.out.printf("Not enough money! You need %.2f leva more!", price-budjet);}

    }
}
