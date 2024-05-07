package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String flower = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budjet = Integer.parseInt(scanner.nextLine());

        //цвете	Роза	Далия	Лале	Нарцис	Гладиола
        //Цена на брой в лева	5	3.80	2.80	3	2.50

        //⦁	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
        //⦁	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
        //⦁	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
        //⦁	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
        //⦁	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%

        double priceRoses = numberOfFlowers*5;
        double priceDahlias = numberOfFlowers*3.80;
        double priceTulips = numberOfFlowers*2.80;
        double priceNarcissus = numberOfFlowers*3.00;
        double priceGladiolus = numberOfFlowers*2.50;

switch (flower) {
    case "Roses":
        if (numberOfFlowers > 80) {
            priceRoses = priceRoses - 0.1 * priceRoses;
        } else {
            priceRoses = priceRoses;
        }
        break;
    case "Dahlias":
        if (numberOfFlowers > 90) {
            priceDahlias = priceDahlias - priceDahlias * 0.15;
        } else {
            priceDahlias = priceDahlias;
        }
        break;
    case "Tulips":
        if (numberOfFlowers > 80) {
            priceTulips = priceTulips - priceTulips * 0.15;
        } else {
            priceTulips = priceTulips;
        }
        break;
    case "Narcissus":
        if (numberOfFlowers < 120) {
            priceNarcissus = priceNarcissus + priceNarcissus * 0.15;
        } else {
            priceNarcissus = priceNarcissus;
        }
        break;
    case "Gladiolus":
        if (numberOfFlowers < 80) {
            priceGladiolus = priceGladiolus + 0.2 * priceGladiolus;
        }
        break;
}

// ⦁Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
//⦁	Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."

        if (flower.equals("Roses")) {
            if (budjet>=priceRoses)
            {System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberOfFlowers,flower,(budjet-priceRoses));}
            else if (budjet<priceRoses) {
                System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budjet-priceRoses));}
        }

        else if (flower.equals("Tulips")) {
            if (budjet >= priceTulips) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flower, (budjet - priceTulips));}
            else if  (budjet<priceTulips) {System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budjet-priceTulips));}
        }


        else if (flower.equals("Dahlias")) {
            if (budjet >= priceDahlias) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flower, (budjet - priceDahlias));}
            else if  (budjet<priceDahlias) {System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budjet-priceDahlias));}
        }

        else if (flower.equals("Narcissus")) {
            if (budjet >= priceNarcissus) {
                System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, flower, (budjet - priceNarcissus));}
            else if  (budjet<priceNarcissus) {System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budjet-priceNarcissus));}
        }
        if (flower.equals("Gladiolus")) {
            if (budjet>=priceGladiolus)
            {System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberOfFlowers,flower,(budjet-priceGladiolus));}
            else if (budjet<priceGladiolus) {
                System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budjet-priceGladiolus));}
        }


    }
    }