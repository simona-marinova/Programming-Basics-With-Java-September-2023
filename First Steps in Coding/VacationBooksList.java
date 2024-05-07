package FirstStepsInCoding;

import java.util.Scanner;

public class VacationBooksList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int allPages = Integer.parseInt(scanner.nextLine());
        int pagesHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
int hoursTotal = allPages/pagesHour;
int hoursPerDay = hoursTotal/days;

System.out.println(hoursPerDay);


    }
}
