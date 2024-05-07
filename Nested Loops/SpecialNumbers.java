package NestedLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            String number = Integer.toString(i);
            int num = 0;
            for (int position = 0; position < number.length(); position++) {
                int currentDigit = Integer.parseInt(number.charAt(position) + "");
                if (currentDigit!=0 &&n%currentDigit == 0) {
                    num++;
                } else {
                    break;
                }
                if (num == 4) {
                    System.out.print(number+" ");
                }



            }

        }
    }
}