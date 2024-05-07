package FirstStepsInCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numTwo = Double.parseDouble(scanner.nextLine());
        double priceDogs = numTwo*2.50;
        double num = Double.parseDouble(scanner.nextLine());
        double priceCats = num*4.0;
        System.out.print(priceCats+priceDogs + " " + "lv.");


    }
}
