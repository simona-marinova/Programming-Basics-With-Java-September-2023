package FirstStepsInCoding;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        //Пилешко меню – 10.35 лв.
        //• Меню с риба – 12.40 лв.
        //• Вегетарианско меню – 8.15 лв.

// Напишете програма, която изчислява колко ще струва на група хора да си поръчат храна за вкъщи.
//Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
//Цената на доставка е 2.50 лв и се начислява най-накрая.

        //От конзолата се четат 3 реда:
        //· Брой пилешки менюта – цяло число в интервала [0 … 99
        //· Брой менюта с риба – цяло число в интервала [0 … 99
        //· Брой вегетариански менюта – цяло число в интервала [0 … 99]

        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegeterian = Integer.parseInt(scanner.nextLine());

        double ckickenPrice = chicken*10.35;
        double fishPrice = fish*12.40;
        double vegeterianPrice = vegeterian*8.15;

       double sum = ckickenPrice+fishPrice+vegeterianPrice;
        double dessert = 0.2*sum;
        double all = sum + dessert + 2.50;

        System.out.println(all);




    }
}
