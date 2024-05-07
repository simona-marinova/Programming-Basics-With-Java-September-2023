package FirstStepsInCoding;

import java.util.Scanner;

public class Fishland {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //⦁	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
        //⦁	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
        //⦁	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
        //⦁	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
        //⦁	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]

        double priceМackerelKg = Double.parseDouble(scanner.nextLine());
        double priceSprinkleKg = Double.parseDouble(scanner.nextLine());
        double kgBonito = Double.parseDouble(scanner.nextLine());
        double kgSafid = Double.parseDouble(scanner.nextLine());
        double kgMussels = Double.parseDouble(scanner.nextLine());

        // ⦁Паламуд – 60% по-скъп от скумрията
        //⦁	Сафрид – 80% по-скъп от цацата
        //⦁	Миди – 7.50 лв. за килограм

        double priceBonito = (priceМackerelKg + 0.6*priceМackerelKg)*kgBonito;
        double priceSafrid = (priceSprinkleKg + 0.8*priceSprinkleKg)*kgSafid;
        double priceMussels = 7.50*kgMussels;

        double money = priceBonito + priceSafrid + priceMussels;

        System.out.printf("%.2f",money);




    }
}
