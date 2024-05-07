package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberFisherman = Integer.parseInt(scanner.nextLine());
        double rent = 0;

        //В зависимост от броя си групата ползва отстъпка:
//⦁	Ако групата е до 6 човека включително  –  отстъпка от 10%.
//⦁	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
//⦁	Ако групата е от 12 нагоре  –  отстъпка от 25%.
//Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.


if (season.equals("Spring")) {
    rent = 3000;
}
else if (season.equals("Summer")) {
    rent = 4200;
}
else if(season.equals("Autumn")) {
    rent = 4200;
}
else if(season.equals("Winter")) {
    rent = 2600;
}

double discount = 0;

 if (numberFisherman<=6) {
     discount = 0.1 * rent;
 }
 else if (numberFisherman>7 && numberFisherman<=11) {
    discount = 0.15*rent;
        }
else {
    discount = 0.25 * rent;
 }

double additionaDiscount = 0;

if ((numberFisherman%2==0 ) ) {
    if (season.equals ("Summer") || season.equals("Winter") || season.equals("Spring")) {
        additionaDiscount = (rent - discount)*0.05;
    }
else {
    additionaDiscount = 0;
    }}
else {
        additionaDiscount = 0;
    }

rent = rent - discount - additionaDiscount;

        if (budget>=rent) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - rent));
        }
        else if (budget<rent) {
            System.out.printf("Not enough money! You need %.2f leva.", (rent - budget));
        }

    }
}




