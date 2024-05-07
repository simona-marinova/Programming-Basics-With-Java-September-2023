package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        if (timeOfDay.equals("Morning")) {
            if (degree>=10 && degree<=18) { System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degree); }
            else if (degree>18 && degree<=24) {System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);}
            else if (degree>=25) {System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);}
        }
        else if (timeOfDay.equals("Afternoon"))  {
            if (degree>=10 && degree<=18) { System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree); }
            else if (degree>18 && degree<=24) {System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);}
            else if (degree>=25) {System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degree);}
            }

        else if (timeOfDay.equals("Evening")) {
            if (degree>=10 && degree<=18) { System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree); }
            else if (degree>18 && degree<=24) {System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);}
            else if (degree>=25) {System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);}
            }


//"It's %d degrees, get your Shirt and  Moccasins", degree


    }
}
