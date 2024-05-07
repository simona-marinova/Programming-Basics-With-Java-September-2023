package Exam;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = Integer.parseInt(scanner.nextLine()); //0-8
        int L = Integer.parseInt(scanner.nextLine()); // 0-9
        int M = Integer.parseInt(scanner.nextLine()); // 0-8;
        int N = Integer.parseInt(scanner.nextLine());//0-9
        int count =0;

        for (int figure1 = K; figure1 <=8; figure1++) {
            if(figure1%2!=0){continue;}
            for (int figure2 = 9; figure2 >=L ; figure2--) {
                if(figure2 %2==0) {continue;}
                for (int figure3 = M; figure3 <= 8; figure3++) {
                    if (figure3%2!=0){continue;}
                    for (int figure4 = 9; figure4 >=N ; figure4--) {
                        if(figure4 %2==0) {continue;}
                         if(figure1==figure3 && figure2==figure4) {  System.out.print("Cannot change the same player.\n");}
                         else {count++; if (count<=6) {
                             System.out.printf("%d%d - %d%d\n", figure1, figure2,figure3,figure4);}}
                         if(count>6) {
                             return;}
                         }
                    }

                }
            }

            }
        }
            
