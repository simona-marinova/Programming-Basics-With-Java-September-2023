package PreparationExam;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String term = scanner.nextLine(); //"one", или "two"
        String type = scanner.nextLine(); // "Small",  "Middle", "Large"или "ExtraLarge"
        String mobileNet = scanner.nextLine(); //"yes" или "no"
        int months = Integer.parseInt(scanner.nextLine());
        double tax = 0;

        switch (term) {
            case "one":
                if (type.equals("Small")) {
                    tax = 9.98;
                } else if (type.equals("Middle")) {
                    tax = 18.99;
                } else if (type.equals("Large")) {
                    tax = 25.98;
                } else if (type.equals("ExtraLarge")) {
                    tax = 35.99;
                }
                break;
            case "two":
                if (type.equals("Small")) {
                    tax = 8.58;
                } else if (type.equals("Middle")) {
                    tax = 17.09;
                } else if (type.equals("Large")) {
                    tax = 23.59;
                } else if (type.equals("ExtraLarge")) {
                    tax = 31.79;
                }
                break;
        }
        if(mobileNet.equals("yes")) {
            if (tax<=10) {tax=tax+5.50;}
            else if (tax<=30) { tax = tax + 4.35;}
            else  {tax = tax + 3.85;}


        }
            double money = tax*months;
        if(term.equals("two")) {
            money = money - money*0.0375;}

        System.out.printf("%.2f lv.", money);
    }
}
