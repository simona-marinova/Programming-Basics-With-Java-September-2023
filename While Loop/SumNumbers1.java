package WhileLoop;

import java.util.Scanner;

public class SumNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        while (sum<number) {
            int num = Integer.parseInt(scanner.nextLine());
            sum +=num;
        }

        System.out.println(sum);
    }
}
