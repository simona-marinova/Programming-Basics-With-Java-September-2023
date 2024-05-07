package FreeTimeTasks;
import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String name = scanner.nextLine();
        int ticketsAdults = Integer.parseInt(scanner.nextLine());
        int ticketsKids = Integer.parseInt(scanner.nextLine());
        double priceAdultsNet = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        //Нетната цена на билета за възрастен се определя от авиокомпанията,
        // а детският билет е със 70% по-евтин. Агенцията добавя към нетната цена на всеки билет такса обслужване.
        // Крайната печалба на Агенцията е 20% от общата цена на всички билети.

        double priceKidsNet = priceAdultsNet - 0.70*priceAdultsNet;
        double priceAdult = priceAdultsNet + tax;
        double priceKids = priceKidsNet+tax;

double allPrice = ticketsAdults*priceAdult + ticketsKids*priceKids;
double income = 0.20*allPrice;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, income);


    }
}
