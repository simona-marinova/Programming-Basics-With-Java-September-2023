package PreparationExam;

import java.util.Scanner;

public class Skeleton {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine()); //Вашата програма получава контролата в минути,
        // която трябва да бъде достигната или подобрена, за да може Марин да вземе
        //Също така програмата ще получи разстоянието на улея в метри, и времето в секунди, за което той изминава 100 метра.
        //Трябва да се има предвид, че поради наклона на улея, на всеки 120 метра неговото време намаля с 2.5 секунди.
        int seconds = Integer.parseInt(scanner.nextLine());
        double lengthMeters = Double.parseDouble(scanner.nextLine());
        int secondsHundredMeters = Integer.parseInt(scanner.nextLine());

        int minutesInSeconds = minutes * 60 + seconds;
        double slowDownTimes = lengthMeters / 120;
        double allSlowDown = slowDownTimes * 2.5;
        double time = lengthMeters / 100 * secondsHundredMeters - allSlowDown;

        if (time <= minutesInSeconds) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", time);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", Math.abs(minutesInSeconds - time));
        }

    }
}




