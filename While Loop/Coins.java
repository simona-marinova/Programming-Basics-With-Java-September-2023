package WhileLoop;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double sum = Math.round(change*100);
        int coins =0;

        while (sum > 0) {

            if (sum>=200) {
                coins++;
                sum-=200;
            }
           else if (sum>=100) {
                coins++;
                sum-=100;
            }
            else if(sum>=50) {
                coins++;
                sum-=50;
            }
            else if(sum>=20) {
                coins++;
                sum-=20;
            }
            else if (sum>=10) {
                coins++;
                sum-=10;
            }
            else if(sum>=5) {
                coins++;
                sum-=5;
            }
            else if(sum>=2) {
                coins++;
                sum-=2;
            }
            else if(sum>=1) {
                coins++;
                sum-=1;
            }
        }

        System.out.println(coins);
    }
}
