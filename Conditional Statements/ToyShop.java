package ConditionalStatements;

import java.util.Scanner;


public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double priceTour = Double.parseDouble(scanner.nextLine());
        int numberPuzzles = Integer.parseInt(scanner.nextLine());
        int talkingDolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int buses = Integer.parseInt(scanner.nextLine());

        //Цени на играчките:
        //⦁	Пъзел - 2.60 лв.
        //⦁	Говореща кукла - 3 лв.
        //⦁	Плюшено мече - 4.10 лв.
        //⦁	Миньон - 8.20 лв.
        //⦁	Камионче - 2 лв.

        //Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        // От спечелените пари Петя трябва да даде 10% за наема на магазина.
        // Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.

        double totalCost = numberPuzzles*2.60 + talkingDolls*3 + bears*4.10 + minions*8.20 + buses*2;
        double earnedMoney = 0;


        if (numberPuzzles+talkingDolls+bears+minions+buses>=50) {earnedMoney = totalCost - 0.25*totalCost;}
        else {earnedMoney=totalCost;}

        double earnedMoneyNet = earnedMoney - 0.1*earnedMoney;


        if (priceTour<=earnedMoneyNet) { System.out.print("Yes! ");
            System.out.printf("%.2f",(earnedMoneyNet-priceTour));
            System.out.print(" lv left.");}

        else {System.out.print("Not enough money! ");
            System.out.printf("%.2f",Math.abs(priceTour-earnedMoneyNet));
            System.out.print( " lv needed.");}


    }
}





