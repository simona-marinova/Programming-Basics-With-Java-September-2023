package NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int countCombination = 0;
        boolean isFound=false;

        for (int i = number1; i <= number2; i++) {
            for (int j = number1; j <= number2; j++) {
                int sum = i + j;
                countCombination++;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", countCombination, i, j, magicNumber);
                    isFound=true;
                    break;
                }

            }
            if (isFound) {
                break;
            }

        }

           if(!isFound){
                   System.out.printf("%d combinations - neither equals %d", countCombination, magicNumber);}

    }
}