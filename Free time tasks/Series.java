package FreeTimeTasks;
import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberSeries = Integer.parseInt(scanner.nextLine());
        double allPrice = 0;

        for (int i = 1; i <= numberSeries; i++) {
            String name = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            if (name.equals("Thrones")) {
                price = price - 0.5 * price;
            } else if (name.equals("Lucifer")) {
                price = price - 0.40 * price;
            } else if (name.equals("Protector")) {
                price = price - price * 0.30;
            } else if (name.equals("TotalDrama")) {
                price = price - price * 0.20;
            } else if (name.equals("Area")) {
                price = price - 0.10 * price;
            }
            allPrice = allPrice + price;
        }

        if (budget >= allPrice) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - allPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", allPrice - budget);
        }
    }
}