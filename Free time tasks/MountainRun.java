package FreeTimeTasks;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double distanceM = Double.parseDouble(scanner.nextLine());
        double secondsOneMeter = Double.parseDouble(scanner.nextLine());

        //наклона на терена го забавя на всеки 50 м. с 30 секунди.

        double timeClimb = secondsOneMeter * distanceM + Math.floor(distanceM / 50) * 30;
        double diff = Math.abs(timeClimb - recordSec);

        if (timeClimb < recordSec) {
            System.out.printf(" Yes! The new record is %.2f seconds.", timeClimb);
        } else {
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }
    }
}