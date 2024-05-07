package FreeTimeTasks;

import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int sum = 0;
        int points = 0;
        int count = 1;
        int maxSum = Integer.MIN_VALUE;
        String nameMax = "";

        while (!name.equals("STOP")) {
            int length = name.length();
            for (char i = 0; i < length; i++) {
                points = 0;
                char index = name.charAt(i);
                int value = (int) index;
                points = points + value;
                if (Character.isUpperCase(index)) {
                    points = points - length;
                } else if (Character.isLowerCase(index)) {
                    points = points - 2 * length;
                }
                sum = sum + points;
                if (sum > maxSum) {
                    maxSum = sum;
                    nameMax = name;
                }

            }
            sum = 0;
            count++;
            if (count > 7) {
                System.out.println("The limit is reached.");
               break;
            }
            name = scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %d ASCII sum.", nameMax, maxSum);
    }


}

