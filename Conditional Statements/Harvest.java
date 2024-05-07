package ConditionalStatements;

import java.util.Scanner;


public class Harvest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int wineYardKvM = Integer.parseInt(scanner.nextLine());
        double grapeOneKvM = Double.parseDouble(scanner.nextLine());
        int littersWineNeeded = Integer.parseInt(scanner.nextLine());
        int numberWorkers = Integer.parseInt(scanner.nextLine());

        double wineYardForWine = 0.4*wineYardKvM;
        double grapeKg = wineYardForWine*grapeOneKvM;
        double littersWineProduced = grapeKg/2.5;
        double litersPerWorker = (littersWineProduced-littersWineNeeded)/numberWorkers;

        //1 liter wine need 2.5 kg grape

        if(littersWineProduced<=littersWineNeeded) {System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(littersWineNeeded - littersWineProduced));}
if (littersWineProduced>littersWineNeeded) {System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(littersWineProduced));
    System.out.println();
    System.out.printf("%.0f liters left -> %.0f liters per person.",littersWineProduced-littersWineNeeded, litersPerWorker);}
    }
}


