package PreparationExam;

import java.util.Scanner;

        public class TouristShop {
            public static void main(String[] args) {
                Scanner scanner = new Scanner (System.in);

                double budget = Double.parseDouble(scanner.nextLine());
                String product = scanner.nextLine();
                int count =0;
                int numberProducts=0;
                double totalPrice =0;

                 while(!product.equals("Stop")) {
                     double price = Double.parseDouble(scanner.nextLine());
                     count++;
                     numberProducts++;
                     if(count==3) {price=price - 0.5*price;
                     count=0;}
                     totalPrice = totalPrice  + price;
                     if(price>budget) {
                         System.out.println("You don't have enough money!");
                         System.out.printf("You need %.2f leva!", price-budget);
                         return;
                     }
                     budget = budget - price;
                     product= scanner.nextLine();
                 }

                System.out.printf("You bought %d products for %.2f leva.\n", numberProducts, totalPrice);
                 }
            }