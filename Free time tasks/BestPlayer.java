package FreeTimeTasks;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bestPlayer = "";
        int maxValue = Integer.MIN_VALUE;
        int goals = 0;
        String name = scanner.nextLine();
        boolean hatTrick = false;

        while (!name.equals("END")) {
            goals = Integer.parseInt(scanner.nextLine());
            if (goals > maxValue) {
                maxValue = goals;
                bestPlayer = name;
            }
            if (goals >= 3) {
                hatTrick = true;
            }
            if (goals >=10) {
                System.out.printf("%s is the best player!\n", bestPlayer);
                if (hatTrick) {
                    System.out.printf("He has scored %d goals and made a hat-trick !!!\n", goals);
                } else {
                    System.out.printf("He has scored %d goals.", goals);

                }
                return;
            }

            name = scanner.nextLine();
        }

        System.out.printf("%s is the best player!\n", bestPlayer);
        if (hatTrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!\n", goals);
        } else {
            System.out.printf("He has scored %d goals.", goals);

        }
    }
}
