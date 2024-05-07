package ForLoop;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberTournament = Integer.parseInt(scanner.nextLine());
        int firstPoints = Integer.parseInt(scanner.nextLine());
        int wonTournaments = 0;
        int tournamentPoints = 0;

        for (int i=1; i<=numberTournament; i++) {
            String stageReached = scanner.nextLine(); // "W", "F" или "SF"

            switch (stageReached) {
                case "W":
                   tournamentPoints+=2000;
                    wonTournaments++;
                    break;
                case "F":
                  tournamentPoints+=1200;
                    break;
                case "SF":
                    tournamentPoints+=720;
                    break;
            }
        }

        //Напишете програма, която изчислява колко ще са точките на Григор след изиграване на всички турнири,
        // като знаете с колко точки стартира сезона. Също изчислете колко точки средно печели от всички изиграни турнири и
        // колко процента от турнирите е спечелил.

        int totalPoints = tournamentPoints+firstPoints;
        double averagePoints = Math.floor(tournamentPoints*1.00/numberTournament);
        double percentWins = wonTournaments*1.00/numberTournament*100;


        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %.0f\n", averagePoints);
        System.out.printf("%.2f%%",percentWins);


    }
}
