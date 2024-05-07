package NestedLoops;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());


        for (int currentNumber = n1; currentNumber <= n2; currentNumber++) {

            String currentN = Integer.toString(currentNumber);
            int evenSum = 0;
            int oddSum = 0;

            for (int position = 0; position < currentN.length(); position++) {
                int currentDigit = Integer.parseInt(currentN.charAt(position) + "");
                if (position % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }

            }

            if (evenSum == oddSum) {
                System.out.print(currentNumber + " ");
            }
        }


    }

}
