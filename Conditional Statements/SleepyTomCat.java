package ConditionalStatements;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int restDays = Integer.parseInt(scanner.nextLine());

        int workDays = 365 - restDays;
       int timePlay = restDays*127 + workDays*63;


        int hoursA = Math.abs(timePlay - 30000)/60;
        double minutes = (timePlay-30000)%60.00;


         if (timePlay>30000) {System.out.println("Tom will run away");
        System.out.printf ("%d hours and %.0f minutes more for play", (hoursA),Math.abs(minutes));}
        else { System.out.println("Tom sleeps well");
        System.out.printf("%d hours and %.0f minutes less for play",(hoursA),Math.abs(minutes));}

    }
}
