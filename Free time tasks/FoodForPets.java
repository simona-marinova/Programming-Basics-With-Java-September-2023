package FreeTimeTasks;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalAmount = Double.parseDouble(scanner.nextLine());
        int daysCount = 0;
        double biscuits = 0;
        double foodEaten = 0;
        double foodEatenDog = 0;
        double foodEatenCat = 0;
        double allBiscuits=0;

        for (int i = 1; i <= days; i++) {
            int foodDog = Integer.parseInt(scanner.nextLine());
            int foodCat = Integer.parseInt(scanner.nextLine());
            daysCount++;
            foodEatenDog = foodEatenDog + foodDog;
            foodEatenCat = foodEatenCat + foodCat;
           foodEaten = foodEatenCat+foodEatenDog;
            if (daysCount % 3 == 0) {
                biscuits = 0.10 * (foodCat + foodDog);
                allBiscuits=allBiscuits+biscuits;
            }
        }

        System.out.printf("Total eaten biscuits: %.0fgr.%n", allBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", foodEaten/ totalAmount * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", foodEatenDog / foodEaten * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", foodEatenCat / foodEaten* 100);
    }
}
