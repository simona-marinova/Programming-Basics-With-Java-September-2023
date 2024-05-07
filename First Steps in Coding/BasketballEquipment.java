package FirstStepsInCoding;

import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {

        // Джеси решава, че иска да се занимава с баскетбол, но за да тренира е нужна екипировка.
        // Напишете програма, която изчислява какви разходи ще има Джеси, ако започне да тренира,
        // като знаете колко е таксата за тренировки по баскетбол за период от 1 година. Нужна екипировка:

        //• Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //• Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //• Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //• Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка


        Scanner scanner = new Scanner (System.in);

        int annualTax = Integer.parseInt(scanner.nextLine());

       double ketsovePrice =annualTax - 0.4 * annualTax;
       double ekip = ketsovePrice - 0.2*ketsovePrice;
       double ball = 0.25*ekip;
       double accessories = 0.2*ball;

       double allExpenses = ketsovePrice+ekip+ball+accessories+annualTax;


       System.out.println(allExpenses);




    }
}
