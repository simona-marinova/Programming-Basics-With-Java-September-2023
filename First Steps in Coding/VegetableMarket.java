package FirstStepsInCoding;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double kgPriceVegetables = Double.parseDouble(scanner.nextLine());
        double kgPriceFruits = Double.parseDouble(scanner.nextLine());
        int allKgVegetables = Integer.parseInt(scanner.nextLine());
        int allKgFruits = Integer.parseInt(scanner.nextLine());

        double vegetables = kgPriceVegetables*allKgVegetables;
        double fruits = kgPriceFruits*allKgFruits;
        double allEuro = (vegetables + fruits)/1.94;

        System.out.printf("%.2f",allEuro);



    }
}
