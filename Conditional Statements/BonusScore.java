package ConditionalStatements;

import java.util.Scanner;


public class BonusScore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int startPoints = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;


        if (startPoints<=100) {  bonusPoints = 5;}
        else if (startPoints<=1000)  { bonusPoints = 0.2*startPoints; }
       else { bonusPoints=0.1*startPoints; }


        if (startPoints%2==0) { bonusPoints = bonusPoints + 1;}
        if (startPoints%10==5) { bonusPoints = bonusPoints + 2;}

        System.out.println(bonusPoints);
        System.out.println(bonusPoints+startPoints);
    }
}
