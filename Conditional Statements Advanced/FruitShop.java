package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        //. При невалиден ден от седмицата или невалидно име на плод да се отпечата "error".

        // Магазин за плодове през работните дни работи на следните цени:
        //плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //цена	2.50	1.20	0.85	1.45	2.70	5.50	3.85
        //Събота и неделя магазинът работи на по-високи цени:
        //плод	banana	apple	orange	grapefruit	kiwi	pineapple	grapes
        //цена	2.70	1.25	0.90	1.60	3.00	5.60	4.20

        double price = 0;


        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday"))
        { if (fruit.equals("banana")) {price=2.50;}
        else if(fruit.equals("apple")) {price=1.20;} else if(fruit.equals("orange")) {price = 0.85;}
        else if(fruit.equals("grapefruit")) {price=1.45;} else if(fruit.equals("kiwi")) {price=2.70;}
        else if(fruit.equals("pineapple")) {price=5.50;} else if(fruit.equals("grapes")) {price=3.85;}}


        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday"))
        { if (fruit.equals("banana")) {price=2.70;}
        else if(fruit.equals("apple")) {price=1.25;} else if(fruit.equals("orange")) {price = 0.90;}
        else if(fruit.equals("grapefruit")) {price=1.60;} else if(fruit.equals("kiwi")) {price=3.00;}
        else if(fruit.equals("pineapple")) {price=5.60;} else if(fruit.equals("grapes")) {price=4.20;}}

        boolean isValid = fruit.equals("apple") || fruit.equals("banana") || fruit.equals("orange")
                || fruit.equals("grapefruit") || fruit.equals("kiwi") || fruit.equals("pineapple")
                || fruit.equals("grapes");
        boolean isValid2 = dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday")
                || dayOfWeek.equals("Sunday");


  
        double sum = price*quantity;

if (!isValid2|| !isValid) {System.out.println("error");}
else {System.out.printf("%.2f", sum);}

    }
    }

