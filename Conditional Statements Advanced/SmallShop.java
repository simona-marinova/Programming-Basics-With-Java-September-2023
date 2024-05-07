package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        //град / продукт	coffee	water	beer	sweets	peanuts
        //Sofia	0.50	0.80	1.20	1.45	1.60
        //Plovdiv	0.40	0.70	1.15	1.30	1.50
        //Varna	0.45	0.70	1.10	1.35	1.55

if (city.equals("Sofia")) {
 if (product.equals("coffee")) {System.out.println(quantity*0.50);}
    else if (product.equals("water")) {System.out.println(quantity*0.80);}
        else if (product.equals("beer")) {System.out.println(quantity*1.20);}
        else if (product.equals("sweets")) {System.out.println(quantity*1.45);}
    else if (product.equals("peanuts")) {System.out.println(quantity*1.60);}}

        if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {System.out.println(quantity*0.40);}
            else if (product.equals("water")) {System.out.println(quantity*0.70);}
            else if (product.equals("beer")) {System.out.println(quantity*1.15);}
            else if (product.equals("sweets")) {System.out.println(quantity*1.30);}
            else if (product.equals("peanuts")) {System.out.println(quantity*1.50);}}


        if (city.equals("Varna")) {
            if (product.equals("coffee")) {System.out.println(quantity*0.45);}
            else if (product.equals("water")) {System.out.println(quantity*0.70);}
            else if (product.equals("beer")) {System.out.println(quantity*1.10);}
            else if (product.equals("sweets")) {System.out.println(quantity*1.35);}
            else if (product.equals("peanuts")) {System.out.println(quantity*1.55);}}




    }
}
