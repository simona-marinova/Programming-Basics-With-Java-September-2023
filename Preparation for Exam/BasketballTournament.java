package PreparationExam;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournament = scanner.nextLine();
        int number = 0;
        int wonGames =0;
        int lostGames =0;
        int allGames=0;

        while (!tournament.equals("End of tournaments")) {
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= n; i++) {
                allGames++;
                int pointsDesi = Integer.parseInt(scanner.nextLine());
                int pointsOthers = Integer.parseInt(scanner.nextLine());
                number++;
                if (pointsDesi > pointsOthers) {
                    wonGames++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", number, tournament, pointsDesi - pointsOthers);
                } else {
                    lostGames++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", number, tournament, pointsOthers - pointsDesi);

                }
            }
            number=0;
            tournament = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win\n", wonGames*1.0/allGames*100);
        System.out.printf("%.2f%% matches lost\n", lostGames*1.0/allGames*100);
    }
}