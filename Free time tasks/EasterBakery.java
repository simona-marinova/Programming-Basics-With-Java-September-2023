package FreeTimeTasks;
import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceOneKgFlour = Double.parseDouble(scanner.nextLine());
        double kgFlour = Double.parseDouble(scanner.nextLine());
        double kgSugar = Double.parseDouble(scanner.nextLine());
        int numberEggShells = Integer.parseInt(scanner.nextLine());
        int packetsYeast = Integer.parseInt(scanner.nextLine());

        //цената на килограм захар е с 25% по-ниска от тази на килограм брашно
        //цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
        //цената на един пакет мая е с 80% по-ниска от цената на килограм захар

        double priceSugarKg  = priceOneKgFlour- 0.25*priceOneKgFlour;
        double oneEggShellPrice = priceOneKgFlour + 0.1*priceOneKgFlour;
        double onePacketYeast = priceSugarKg - 0.80*priceSugarKg;
double priceSugar = kgSugar*priceSugarKg;
double priceFlour =  priceOneKgFlour*kgFlour;
double priceEggs = numberEggShells*oneEggShellPrice;
double priceYeast = packetsYeast*onePacketYeast;

        double priceAll =  priceSugar + priceFlour + priceYeast + priceEggs;


        System.out.printf("%.2f", priceAll);
    }
}
