package ConditionalStatementsAdvanced;

import java.util.Scanner;


public class WorkingHoursBoolean {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfweek = scanner.nextLine();
        boolean isWorkingDays = dayOfweek.equals("Monday") ||
                dayOfweek.equals("Tuesday") ||
                dayOfweek.equals("Wednesday") ||
                dayOfweek.equals("Thursday") ||
                dayOfweek.equals("Friday") ||
                dayOfweek.equals("Saturday");

        boolean isWorkingHours = hour>=10 && hour<=18;

        if(isWorkingDays && isWorkingHours) {System.out.println("open");}
        else {System.out.println("closed");}



    }
}
