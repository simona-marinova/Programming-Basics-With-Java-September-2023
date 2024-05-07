package NestedLoops;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        //x1 + x2 + x3 = n

        for (int number1 = 0; number1 <= n; number1++) {
            for (int number2 = 0; number2 <= n; number2++) {
                for (int number3 = 0; number3 <= n; number3++) {
                    sum = number1 + number2 + number3;
                    if (sum == n) {
                        count++;
                    }

                }

            }


        }

        System.out.println(count);
    }
}
