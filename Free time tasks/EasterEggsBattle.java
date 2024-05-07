package FreeTimeTasks;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEggs = Integer.parseInt(scanner.nextLine());
        int secondEggs = Integer.parseInt(scanner.nextLine());

        int eggsOne = firstEggs;
        int eggsTwo = secondEggs;

        String text = scanner.nextLine();

        while (!text.equals("End")) {
            if (text.equals("one")) {
                eggsTwo -= 1;
            } else if (text.equals("two")) {
                eggsOne -= 1;
            }
            if (eggsOne == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsTwo);
                return;
            }
            else if (eggsTwo==0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsOne);
            }

            text = scanner.nextLine();

        }

        System.out.printf("Player one has %d eggs left.\n", eggsOne);
        System.out.printf("Player two has %d eggs left.", eggsTwo);
    }
}
