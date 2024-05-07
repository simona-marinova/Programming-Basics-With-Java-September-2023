package FirstStepsInCoding;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {

        //Пакет химикали - 5.80 лв.
        //• Пакет маркери - 7.20 лв.
        //• Препарат - 1.20 лв (за литър)

        //Брой пакети химикали - цяло число в интервала [0...100]
        //· Брой пакети маркери - цяло число в интервала [0...100]
        //· Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //· Процент намаление - цяло число в интервала [0...100]

        Scanner scanner = new Scanner(System.in);

        int numPens = Integer.parseInt(scanner.nextLine());
        int numMarkers = Integer.parseInt(scanner.nextLine());
        int litterDetergent = Integer.parseInt(scanner.nextLine());
        int percentegeReduction = Integer.parseInt(scanner.nextLine());

        double onePackagePens = 5.80;
        double onePackageMarkers = 7.20;
        double oneLitterDetergent = 1.20;

        double Price = onePackagePens*numPens + numMarkers*onePackageMarkers + litterDetergent*oneLitterDetergent;
        double priceWithDiscount = Price - ( Price*percentegeReduction/100);

        System.out.println(priceWithDiscount);


    }

}
