package FirstStepsInCoding;

import java.util.Scanner;

public class TrapeziodArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double formula = (b1 + b2) * h/2;

        System.out.printf("%.2f",formula);


    }
}
