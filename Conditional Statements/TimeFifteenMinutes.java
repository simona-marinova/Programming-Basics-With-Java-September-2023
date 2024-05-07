package ConditionalStatements;

import java.util.Scanner;


public class TimeFifteenMinutes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int inputHours = Integer.parseInt(scanner.nextLine());
        int inputMinutes = Integer.parseInt(scanner.nextLine());
         int afterFifteenMinutes  = (inputHours*60) + inputMinutes + 15;

         int hours = afterFifteenMinutes/60;
         int minutes = afterFifteenMinutes%60;
if (hours>23) {hours =0;}
         if (minutes<=9) {System.out.printf("%d:0%d", hours,minutes);}
         else {System.out.printf("%d:%d", hours,minutes);}







    }
}
