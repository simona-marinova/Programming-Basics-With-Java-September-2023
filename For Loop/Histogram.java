package ForLoop;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // 1-1000


       double p1 = 0.00;
      double p2 = 0.00;
       double p3 = 0.00;
        double p4 = 0.00;
       double p5 = 0.00;


        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber < 200) {
                p1++;
            } else if (currentNumber <= 399) {
                p2++;
            } else if (currentNumber <= 599) {
                p3++;
            } else if (currentNumber <= 799) {
                p4++;
            } else {
                p5++;
            }
        }

        System.out.printf("%.2f%%\n",p1/n*100);
        System.out.printf("%.2f%%\n",p2/n*100);
        System.out.printf("%.2f%%\n",p3/n*100);
        System.out.printf("%.2f%%\n", p4/n*100);
        System.out.printf("%.2f%%\n", p5/n*100);

        }
    }
