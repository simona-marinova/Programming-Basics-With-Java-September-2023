package PreparationExam;
import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String nameOfMovie = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int numberTickets = Integer.parseInt(scanner.nextLine());
        double priceOneTicket = Double.parseDouble(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

       double profit = numberTickets*priceOneTicket*days;
       double profitNet= profit-(profit*percentage/100);

        System.out.printf("The profit from the movie %s is %.2f lv.", nameOfMovie, profitNet);
    }
}
