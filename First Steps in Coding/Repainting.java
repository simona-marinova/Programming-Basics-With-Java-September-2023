package FirstStepsInCoding;

import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nailonKvM = Integer.parseInt(scanner.nextLine());
        int paintLiter =  Integer.parseInt(scanner.nextLine());
        int thinnerLiter = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());;

        //Предпазен найлон - 1.50 лв. за кв. метъr
        //· Боя - 14.50 лв. за литъr
        //· Разредител за боя - 5.00 лв. за литър

        //За всеки случай, към необходимите материали, Румен иска да добави още 10% от количеството
        // боя и 2 кв.м. найлон, разбира се и 0.40 лв. за торбички. Сумата, която се заплаща на майсторите
        // за 1 час работа, е равна на 30% от сбора на всички разходи за материали.

        double nailonLv = nailonKvM*1.50 + 2*1.50;
        double paintLv = paintLiter*14.50 + 0.10*paintLiter*14.50;
        double thinnerLv= thinnerLiter*5.00;
        double bags = 0.40;

        double expenses = nailonLv + paintLv + thinnerLv + bags;
        double oneHourExpenses = 0.3*(expenses)*hours;
double allExpenses = oneHourExpenses + expenses;


        System.out.println(allExpenses);



    }
}
