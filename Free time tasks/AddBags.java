package FreeTimeTasks;
import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceLuggageOver20 = Double.parseDouble(scanner.nextLine());
        double kgLuggage = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int numberLuggage = Integer.parseInt(scanner.nextLine());

        //до 10кг – 20% от цената на багаж над 20кг
        //между 10кг и 20кг вкл. – 50% от цената на багаж над 20кг.
        //над 20кг – таксата се чете от конзолата

        double price =0;

        if(kgLuggage<=10) {price=0.20*priceLuggageOver20;}
        else if (kgLuggage<=20) {price = 0.50*priceLuggageOver20;}
        else {price=priceLuggageOver20;}

        //повече от 30 дни - цената на багажа се оскъпява с 10%
        //между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%
        //по-малко от 7 дни - цената на багажа се оскъпява с 40%

        if(days>30) {price=price + price*0.10;}
        else if(days>=7 && days<=30) { price = price + price*0.15;}
        else {price=price+price*0.40;}

        double priceAll = price*numberLuggage;

        System.out.printf("The total price of bags is: %.2f lv.", priceAll);
    }
}
