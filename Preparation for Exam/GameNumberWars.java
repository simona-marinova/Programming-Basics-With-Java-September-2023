package PreparationExam;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        int pointsFirstPlayer = 0;
        int allPointsFirstPlayer = 0;
        int pointsSecondPlayer = 0;
        int allPointsSecondPlayer = 0;


        int card1 = Integer.parseInt(scanner.nextLine());
        String number1 = card1 + "";
        card1 = Integer.parseInt((number1));

        while (!number1.equals("End of game")) {
            int card2 = Integer.parseInt(scanner.nextLine());
            if (card1 > card2) {
                pointsFirstPlayer = card1 - card2;
                allPointsFirstPlayer = allPointsFirstPlayer + pointsFirstPlayer;
            } else if (card2 > card1) {
                pointsSecondPlayer = card2 - card1;
                allPointsSecondPlayer = allPointsSecondPlayer + pointsSecondPlayer;
            } else if (card1 == card2) {
                card1 = Integer.parseInt(scanner.nextLine());
                card2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Number wars!");
                if (card1 > card2) {
                    System.out.printf("%s is winner with %d points\n", name1, allPointsFirstPlayer);
                } else {
                    System.out.printf("%s is winner with %d points\n", name2, allPointsSecondPlayer);
                }
                return;
            }
number1= scanner.nextLine();
            if(number1.equals("End of game")) {
                continue;
            }
card1=Integer.parseInt(number1);
        }

        System.out.printf("%s has %d points\n", name1, allPointsFirstPlayer);
        System.out.printf("%s has %d points", name2, allPointsSecondPlayer);

    }

}
