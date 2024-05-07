package FreeTimeTasks;

import java.util.Scanner;

public class BirthdayParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//•	Торта  – цената ѝ е 20% от наема на залата
//•	Напитки – цената им е 45% по-малко от тази на тортата
//•	Аниматор – цената му е 1/3 от цената за наема на залата

        double rent = Double.parseDouble(scanner.nextLine());

        double priceCake = 0.20*rent;
        double beverage = priceCake-0.45*priceCake;
        double animator = rent/3;

    double fullPrice = rent+priceCake+beverage+animator;

        System.out.printf("%.2f", fullPrice);

    }
}
