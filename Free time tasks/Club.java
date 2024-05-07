package FreeTimeTasks;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profitTarget = Double.parseDouble(scanner.nextLine());
        String cocktailName = scanner.nextLine();
        double price =0;
        double fullPrice=0;

        while(!cocktailName.equals("Party!")) {
          double priceCocktail = cocktailName.length();
            int numberCocktails = Integer.parseInt(scanner.nextLine());
price=numberCocktails*priceCocktail;
if(price%2!=0) {price=price-0.25*price;}
fullPrice=fullPrice+price;
if(fullPrice>=profitTarget) {
    System.out.println("Target acquired.");
    System.out.printf("Club income - %.2f leva.", fullPrice);
    return;
}
            cocktailName=scanner.nextLine();
        }
        System.out.printf("We need %.2f leva more.\n", profitTarget-fullPrice );
        System.out.printf("Club income - %.2f leva.", fullPrice);
    }
}
