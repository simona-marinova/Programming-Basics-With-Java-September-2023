package PreparationExam;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numberBack = 0;
        int numberChest = 0;
        int numberLegs = 0;
        int numberAbs = 0;
        int numberProteinShake = 0;
        int numberProteinBar = 0;
        int numberTraining = 0;
        int numberBuying = 0;
        int allPeople = 0;


        for (int i = 1; i <= n; i++) {
            String action = scanner.nextLine(); //"Back", "Chest", "Legs", "Abs", "Protein shake" или "Protein bar")
            switch (action) {
                case "Back":
                    numberBack++;
                    numberTraining++;
                    allPeople++;
                    break;
                case "Chest":
                    numberChest++;
                    numberTraining++;
                    allPeople++;
                    break;
                case "Legs":
                    numberLegs++;
                    numberTraining++;
                    allPeople++;
                    break;
                case "Abs":
                    numberAbs++;
                    numberTraining++;
                    allPeople++;
                    break;
                case "Protein shake":
                    numberProteinShake++;
                    numberBuying++;
                    allPeople++;
                    break;
                case "Protein bar":
                    numberProteinBar++;
                    numberBuying++;
                    allPeople++;
                    break;
            }

        }

        System.out.printf("%d - back\n", numberBack);
        System.out.printf("%d - chest\n", numberChest);
        System.out.printf("%d - legs\n", numberLegs);
        System.out.printf("%d - abs\n", numberAbs);
        System.out.printf("%d - protein shake\n", numberProteinShake);
        System.out.printf("%d - protein bar\n", numberProteinBar);
        System.out.printf("%.2f%% - work out\n", numberTraining*1.0/allPeople*100);
        System.out.printf("%.2f%% - protein", numberBuying*1.0/allPeople*100);

    }
}
