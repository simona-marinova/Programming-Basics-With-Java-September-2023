package PreparationExam;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            boolean isDividedBy2 = currentNumber % 2 == 0;
            boolean isDividedBy3 = currentNumber % 3 == 0;
            boolean isDividedBy4 = currentNumber % 4 == 0;
            if (isDividedBy2) {
                p1++;
            }
            if (isDividedBy3) {
                p2++;
            }
            if (isDividedBy4) {
                p3++;
            }

        }
        System.out.printf("%.2f%%\n",  p1*1.0/n*100);
        System.out.printf("%.2f%%\n",  p2*1.0/n*100);
        System.out.printf("%.2f%%\n",  p3*1.0/n*100);


    }
}