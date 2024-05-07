package FreeTimeTasks;
import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberEasterBread = Integer.parseInt(scanner.nextLine());
        int numberEggShells = Integer.parseInt(scanner.nextLine());
        int kgCookies = Integer.parseInt(scanner.nextLine());

        //Козунак  – 3.20 лв.
        //Яйца –  4.35 лв. за кора с 12 яйца
        //Курабии – 5.40 лв. за килограм
        //Боя за яйца - 0.15 лв. за яйце

        double priceAll = numberEasterBread*3.20 + numberEggShells*4.35 + kgCookies*5.40 + 0.15*12*numberEggShells;

        System.out.printf("%.2f", priceAll);
    }
}
