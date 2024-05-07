package ForLoop;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //⦁	До 3 тона – микробус (200 лева на тон)
        //⦁	От 4 до 11 тона – камион (175 лева на тон)
        //⦁	12 и повече тона – влак (120 лева на тон)

        //Вашата задача е да изчислите средната цена на тон превозен товар, както и процента на тоновете
        // превозвани с всяко превозно средство, спрямо общото тегло(в тонове) на всички товари.

        int n = Integer.parseInt(scanner.nextLine());
        double priceBus = 0;
        double priceTruck = 0;
        double priceTrain = 0;
        double averagePrice = 0;
        int sumTons = 0;
        int tonsBus=0;
        int tonsTruck=0;
        int tonsTrain =0;

        for (int i = 1; i <= n; i++) {
            int tons = Integer.parseInt(scanner.nextLine());

            if (tons <= 3) {
                priceBus = priceBus +(200 * tons);
                tonsBus+=tons;
                sumTons += tons;
            } else if (tons <= 11) {
                priceTruck = priceTruck+ (175 * tons);
                tonsTruck +=tons;
                sumTons += tons;
            } else {
                priceTrain = priceTrain+(120 * tons);
                tonsTrain=tons;
                sumTons += tons;
            }

            averagePrice = (priceTruck + priceBus + priceTrain) / sumTons;

        }
//Да се отпечатат на конзолата 4 реда, както следва:
//⦁	Първи ред – средната цена на тон превозен товар (закръглена до втория знак след дес. запетая);
//⦁	Втори ред – процентът тона превозвани с микробус (процент между 0.00% и 100.00%);
//⦁	Трети ред – процентът  тона превозвани с камион (процент между 0.00% и 100.00%);
//⦁	Четвърти ред – процентът тона превозвани с влак (процент между 0.00% и 100.00%).


        System.out.printf("%.2f\n", averagePrice);
        System.out.printf("%.2f%%\n",tonsBus*1.00/(tonsBus+tonsTruck+tonsTrain)*100);
        System.out.printf("%.2f%%\n", tonsTruck*1.00/(tonsBus+tonsTruck+tonsTrain)*100);
        System.out.printf("%.2f%%\n", tonsTrain*1.00/(tonsBus+tonsTruck+tonsTrain)*100);
    }
}
