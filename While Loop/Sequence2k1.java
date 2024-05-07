package WhileLoop;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNumber = 1;
       // System.out.println(currentNumber);

     //   while (currentNumber<n) {
       //     currentNumber = (currentNumber*2)+1;
       //     if (currentNumber<=n) {System.out.println(currentNumber);}
      //  }

        while (currentNumber <= n) {

            System.out.println(currentNumber);
            currentNumber = (currentNumber*2)+1;
        }


    }
}
