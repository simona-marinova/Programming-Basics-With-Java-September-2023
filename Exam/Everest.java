package Exam;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int metersSum = 5364;
        int days = 1;
        //8848-5364=3484;

        while (!input.equals("END")) {
            int meters = Integer.parseInt(scanner.nextLine());
            if (input.equals("Yes")) {
                days++;
            } else {
                days = days;
            }
            if(days<=5) {metersSum += meters;}
            if (metersSum>=8848) {
                System.out.printf("Goal reached for %d days!", days);
                return;
            }
            else if(metersSum<8848 &&days>5) {
                System.out.println("Failed!");
                System.out.printf("%d", metersSum);
              return;
            }


            input = scanner.nextLine();
        }


        if (metersSum >= 8848) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", metersSum);
        }


    }

}

