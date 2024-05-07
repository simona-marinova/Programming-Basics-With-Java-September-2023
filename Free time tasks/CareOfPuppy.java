package FreeTimeTasks;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKg = Integer.parseInt(scanner.nextLine());
        int allFoodGrams = foodKg*1000;
        int eatenFoodAll =0;

        String input = scanner.nextLine();

        while(!input.equals("Adopted")) {
         int eatenFoodGrams = Integer.parseInt(input);
eatenFoodAll=eatenFoodAll+eatenFoodGrams;
input=scanner.nextLine();

        }

        if(eatenFoodAll<=allFoodGrams) {
            System.out.printf("Food is enough! Leftovers: %d grams.", (allFoodGrams-eatenFoodAll));
        }
        else {
            System.out.printf("Food is not enough. You need %d grams more.", eatenFoodAll-allFoodGrams);
        }
    }
}
