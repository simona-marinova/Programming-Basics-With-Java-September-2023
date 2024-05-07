package FreeTimeTasks;
import java.util.Scanner;


public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
int numberPeople = Integer.parseInt(scanner.nextLine());
double taxEntranceOne = Double.parseDouble(scanner.nextLine());
double priceOneLounge = Double.parseDouble(scanner.nextLine());
double priceOneUmbrella = Double.parseDouble(scanner.nextLine());

double taxEntrance = taxEntranceOne*numberPeople;
double numberUmbrella = Math.ceil(numberPeople*1.0/2);
double taxUmbrella = numberUmbrella*priceOneUmbrella;
double numberLounge = Math.ceil(0.75*numberPeople);
double taxLounge = priceOneLounge*numberLounge;

double fullPrice = taxEntrance+taxUmbrella+taxLounge;

        System.out.printf("%.2f lv.", fullPrice);


    }
}
