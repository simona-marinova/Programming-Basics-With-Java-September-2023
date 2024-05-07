package FreeTimeTasks;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            System.out.printf("%s hasn't played any games during this season.", name);
            return;
        }
        int points = 0;
        int numberWins = 0;
        int numberEqual = 0;
        int numberLosses = 0;


        for (int i = 1; i <= number; i++) {
            char result = scanner.nextLine().charAt(0);
            if (result == 'W') {
                numberWins++;
                points = points + 3;
            } else if (result == 'D') {
                numberEqual++;
                points = points + 1;
            } else if (result == 'L') {
                numberLosses++;
            }
        }
        if(number>=1) {
            System.out.printf("%s has won %d points during this season.\n", name, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d\n", numberWins);
            System.out.printf("## D: %d\n", numberEqual);
            System.out.printf("## L: %d\n", numberLosses);
            System.out.printf("Win rate: %.2f%%\n", numberWins*1.0/number*100);
        }
    }
}
