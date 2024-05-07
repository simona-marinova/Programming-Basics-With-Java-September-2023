package ConditionalStatements;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String nameOfSerial = scanner.nextLine();
        int durationOfEpisode = Integer.parseInt(scanner.nextLine());
        int durationOfBreak = Integer.parseInt(scanner.nextLine());


      double timeForEating = durationOfBreak/8.00;
      double timeForResting = durationOfBreak/4.00;
      double freeTime = durationOfBreak-timeForResting-timeForEating;


        if (freeTime>=durationOfEpisode) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfSerial,Math.ceil(freeTime-durationOfEpisode));}
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameOfSerial,Math.ceil(durationOfEpisode-freeTime));}



    }
}
