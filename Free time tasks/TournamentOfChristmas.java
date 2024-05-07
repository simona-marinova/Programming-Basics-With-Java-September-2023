package FreeTimeTasks;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double money = 0;
        int losses = 0;
        int wins = 0;
        double sumDay = 0;
        double sumAll = 0;
int lossesDaily=0;
int winsDaily=0;

        for (int i = 1; i <= days; i++) {
            String sport = scanner.nextLine();
            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                   winsDaily++;
                    wins++;
                    money = 20;
                    sumDay = sumDay + money;
                } else if (result.equals("lose")) {
                    lossesDaily++;
                    losses++;
                }
                sport = scanner.nextLine();
            }
            if (winsDaily > lossesDaily) {
                sumDay = sumDay + sumDay * 0.10;
                sumAll = sumAll + sumDay;
            }
            else {sumDay=sumDay;
                sumAll=sumAll+sumDay;
                }
            money = 0;
            sumDay = 0;
            winsDaily=0;
            lossesDaily=0;
        }
        if (wins > losses) {
            sumAll = sumAll + 0.20 * sumAll;
            System.out.printf("You won the tournament! Total raised money: %.2f", sumAll);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", sumAll);
        }
    }

}




