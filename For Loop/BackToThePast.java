package ForLoop;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Иванчо е на 18 години и получава наследство, което се състои от X сума пари и машина на времето.
        // Той решава да се върне до 1800 година, но не знае дали парите ще са достатъчни, за да живее без да работи.
        // Напишете програма, която пресмята, дали Иванчо ще има достатъчно пари, за да не се налага да работи до
        // дадена година включително. Като приемем, че за всяка четна (1800, 1802 и т.н.) година ще харчи 12 000 лева.
        // За всяка нечетна (1801,1803  и т.н.) ще харчи 12 000 + 50 * [годините, които е навършил през дадената година].

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        //Иванчо ще има достатъчно пари, за да не се налага да работи до дадена година включително.

        // сега сме 1800 г. и той е на 18 г., 1801 е на 19 год.

        int spentMoney = 0;
        double leftMoney = 0;
        int years = 17;



        for (int currentYear = 1800; currentYear <= year; currentYear++ ) {
            if (currentYear % 2 == 0) {
                years = years +1;
                spentMoney += 12000;
                leftMoney = inheritedMoney - spentMoney;
            } else {
                years = years +1;
                spentMoney = spentMoney + (12000 + (50 * years));
                leftMoney = leftMoney - spentMoney;
            }
        }


        if (leftMoney>0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", leftMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(leftMoney));
        }



    }
}
