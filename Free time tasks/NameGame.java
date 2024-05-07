package FreeTimeTasks;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int points = 0;
        int maxPoints = Integer.MIN_VALUE;
        String nameMaxPoints = "";
        while (!name.equals("Stop")) {
            int length = name.length();
            for (char i = 0; i <= length - 1; i++) {
                int number = Integer.parseInt(scanner.nextLine());
                char symbol = name.charAt(i);
                int asciiValue = (int) symbol;
                if (number == asciiValue) {
                    points = points + 10;
                } else {
                    points = points + 2;
                }
                if (points >= maxPoints) {
                    maxPoints = points;
                    nameMaxPoints=name;
                }
            }
            name = scanner.nextLine();
            points = 0;
        }
        System.out.printf("The winner is %s with %d points!", nameMaxPoints, maxPoints);
    }
}