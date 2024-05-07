package NestedLoops;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int primeNumbers = 0;
        int nonPrimeNumbers = 0;

        while (!number.equals("stop")) {
            int currentNumber = Integer.parseInt(number);
            if (currentNumber < 0) {
                System.out.print("Number is negative.\n");
            } else {
                boolean isPrime = true;

                for (int divisor = 2; divisor <= currentNumber - 1; divisor++) {
                    if (currentNumber % divisor == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primeNumbers += currentNumber;
                } else {
                    nonPrimeNumbers += currentNumber;
                }
            }

            number = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", primeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d\n", nonPrimeNumbers);

    }
    }


