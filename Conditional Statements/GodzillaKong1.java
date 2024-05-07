package ConditionalStatements;

import java.util.Scanner;


public class GodzillaKong1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        int numberSupernumerary = Integer.parseInt(scanner.nextLine());
        double clothesOneSupernumerary = Double.parseDouble(scanner.nextLine());
        double decorPrice = 0.1*budjet;
        double price = numberSupernumerary*clothesOneSupernumerary + decorPrice;

        if (numberSupernumerary>150) {price= (numberSupernumerary*clothesOneSupernumerary - (numberSupernumerary*clothesOneSupernumerary)*0.1 + decorPrice);}


        if (price>budjet) {System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", price-budjet);}

        else { System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budjet-price);}




    }
}
