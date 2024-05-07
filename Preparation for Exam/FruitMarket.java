package PreparationExam;
import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceStrawberries = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberrriesKg = Double.parseDouble(scanner.nextLine());

        //цената на малините е на половина по-ниска от тази на ягодите;
        //цената на портокалите е с 40% по-ниска от цената на малините;
        //цената на бананите е с 80% по-ниска от цената на малините.

        double moneyRaspberries = priceStrawberries - 0.5*priceStrawberries;
        double moneyOrangs = moneyRaspberries - 0.4*moneyRaspberries;
        double moneyBananas = moneyRaspberries-0.8*moneyRaspberries;

        double moneyAll = priceStrawberries*strawberrriesKg + moneyBananas*bananasKg + moneyOrangs*orangesKg + moneyRaspberries*raspberriesKg;

        System.out.printf("%.2f", moneyAll);


    }
}
