package PreparationExam;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int counter = 0;


        for (int currentTable = 1; currentTable <= tables; currentTable++) {
            for (int currentMan = 1; currentMan <= men; currentMan++) {
                for (int currentWomen = 1; currentWomen <= women; currentWomen++) {
                    System.out.printf("(%d <-> %d) ", currentMan, currentWomen);
                    counter++;
                    if (counter == tables || men + women == currentMan + currentWomen) {
                        return;
                    }
                }
            }
        }
    }
}
