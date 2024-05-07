package Exam;
import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int percentageFats = Integer.parseInt(scanner.nextLine());
        int percentageProteins = Integer.parseInt(scanner.nextLine());
        int percentageCarbohydrates = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int percentageWater = Integer.parseInt(scanner.nextLine());

         double gramFats = (percentageFats*1.0*allCalories/100/9);
         double gramProtein = percentageProteins*1.0*allCalories/100/4;
         double gramCarbohydrates = percentageCarbohydrates*1.0*allCalories/100/4;

         double weight = gramFats + gramProtein+gramCarbohydrates;
         double oneGramCalories = allCalories*1.0/weight;
         double withoutWater = 100 - percentageWater;
         double calories = withoutWater/100*oneGramCalories;

        System.out.printf("%.4f", (calories));


    }
}
