package FirstStepsInCoding;

import java.util.Scanner;

public class WeatherForecast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String day = scanner.nextLine();

        if (day.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }

    }

}

