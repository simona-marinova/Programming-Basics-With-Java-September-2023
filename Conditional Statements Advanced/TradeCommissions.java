package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
//Град	0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
//Sofia	5%	7%	8%	12%
//Varna	4.5%	7.5%	10%	13%
//Plovdiv	5.5%	8%	12%	14.5%
        boolean validData = true;
        double profit = 0;


        if (city.equals("Sofia")) { if(sales>=0 && sales<=500) {profit = 0.05*sales;}
            else if (sales>500 && sales<=1000) {profit=0.07*sales;}
            else if (sales>1000 && sales <= 10000) {profit = 0.08*sales;}
            else if (sales >10000) {profit=0.12*sales;}
            else {validData = false;}}


      else if (city.equals("Varna")) { if(sales>=0 && sales<=500) {profit = 0.045*sales;}
            else if (sales>500 && sales<=1000) {profit=0.075*sales;}
           else  if (sales>1000 && sales <= 10000) {profit = 0.1*sales;}
           else  if (sales >10000) {profit=0.13*sales;}
           else {validData = false;}}


        else if (city.equals("Plovdiv")) { if(sales>=0 && sales<=500) {profit = 0.055*sales;}
           else if (sales>500 && sales<=1000) {profit=0.08*sales;}
           else if (sales>1000 && sales <= 10000) {profit = 0.12*sales;}
           else if (sales >10000) {profit=0.145*sales;}
           else {validData=false;}}
else {validData=false;}


if (validData==false) {System.out.println("error");}
    else {System.out.printf("%.2f",profit);}



    }
}
