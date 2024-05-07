package ForLoop;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int moves =Integer.parseInt(scanner.nextLine());
        int numberInvalid=0;
        int number0to9 =0;
        int number10to19 =0;
        int number20to29 =0;
        int number30to39 =0;
        int number40to50 =0;
        double points = 0;
        double sumPoints=0;

        //От 0 до <=9> 20 % от числото
        //От 10 до 19  30 % от числото
        //От 20 до 29  40 % от числото
        //От 30 до 39  50 точки
        //От 40 до 50  100 точки
        //Невалидно число  резултата се дели на 2

        for (int i =1; i<=moves; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number<0 || number>50) {
                numberInvalid ++;
            }
           else if(number>=0 && number<=9) {
                number0to9++;
               points = 0.2*number;
                sumPoints += points;
            }
            else if (number<=19) {
                number10to19++;
                points = 0.3*number;
                sumPoints += points;
            }
            else if (number<=29) {
                number20to29++;
                points = 0.4*number;
                sumPoints +=points;
            }
            else if (number<=39) {
                number30to39++;
                points = 50;
                sumPoints+=points;
            }
            else  {
                number40to50++;
                points=100;
                sumPoints+=points;
            }
            if (number<0 || number>50) {
                sumPoints = sumPoints/2;
            }

        }
        System.out.printf("%.2f\n",sumPoints);
        System.out.printf("From 0 to 9: %.2f%%\n", number0to9*1.00/moves*100);
        System.out.printf("From 10 to 19: %.2f%%\n",number10to19*1.00/moves*100);
        System.out.printf("From 20 to 29: %.2f%%\n", number20to29*1.00/moves*100);
        System.out.printf("From 30 to 39: %.2f%%\n", number30to39*1.00/moves*100);
        System.out.printf("From 40 to 50: %.2f%%\n", number40to50*1.00/moves*100);
        System.out.printf("Invalid numbers: %.2f%%\n", numberInvalid*1.00/moves*100);



    }
}
