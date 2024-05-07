package ConditionalStatements;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int volumeLiters = Integer.parseInt(scanner.nextLine());
        int litersForOneHourP1 = Integer.parseInt(scanner.nextLine());
        int litersForOneHourP2 = Integer.parseInt(scanner.nextLine());
        double hoursAbsence = Double.parseDouble(scanner.nextLine());

        double filling = litersForOneHourP1*hoursAbsence + litersForOneHourP2*hoursAbsence;
        double fillingPercentageAll = (filling/volumeLiters)*100;
        double fillingPercentageP1 = (litersForOneHourP1*hoursAbsence/filling)*100;
        double fillingPercentageP2 = (litersForOneHourP2*hoursAbsence/filling)*100;
        double overflow = filling - volumeLiters;


        if (fillingPercentageAll<=100) {System.out.printf("The pool is %.2f%c full. Pipe 1: %.2f%c Pipe 2: %.2f%c ",fillingPercentageAll,'%', fillingPercentageP1, '%', fillingPercentageP2, '%');}
        else
        { System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursAbsence, overflow);}

    }
}
