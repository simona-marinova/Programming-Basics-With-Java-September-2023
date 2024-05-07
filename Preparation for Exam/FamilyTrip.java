package PreparationExam;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceOneNight = Double.parseDouble(scanner.nextLine());
       int percentageAdditionalExpenses = Integer.parseInt(scanner.nextLine());

        //. Трябва да се има предвид, че ако броят на нощувките е по-голям от 7, цената за нощувка се намаля с 5%.

       if(nights>7) {
           priceOneNight = priceOneNight - 0.05*priceOneNight;
       }


        double price = priceOneNight * nights + percentageAdditionalExpenses * budget/100;



if(price<=budget) {
    System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget-price);
} else {
    System.out.printf("%.2f leva needed.", price-budget);

}
    }
}
