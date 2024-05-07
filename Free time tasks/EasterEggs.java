package FreeTimeTasks;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberEggs = Integer.parseInt(scanner.nextLine());
        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;
        int maxValue = Integer.MIN_VALUE;
        String colorMax = "";

        for (int i = 1; i <= numberEggs; i++) {
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    redEggs++;
                    if (redEggs > maxValue) {
                        maxValue = redEggs;
                        colorMax = "red";
                    }
                    break;
                case "orange":
                    orangeEggs++;
                    if (orangeEggs > maxValue) {
                        maxValue = orangeEggs;
                        colorMax = "orange";
                    }
                    break;
                case "blue":
                    blueEggs++;
                    if (blueEggs > maxValue) {
                        maxValue = blueEggs;
                        colorMax = "blue";
                    }
                    break;
                case "green":
                    greenEggs++;
                    if (greenEggs > maxValue) {
                        maxValue = greenEggs;
                        colorMax = "green";
                    }
                    break;
            }

        }

        System.out.printf("Red eggs: %d\n", redEggs);
        System.out.printf("Orange eggs: %d\n", orangeEggs);
        System.out.printf("Blue eggs: %d\n", blueEggs);
        System.out.printf("Green eggs: %d\n", greenEggs);
        System.out.printf("Max eggs: %d -> %s", maxValue, colorMax);

    }
}
