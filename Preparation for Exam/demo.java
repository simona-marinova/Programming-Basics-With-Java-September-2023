package PreparationExam;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String num = scanner.nextLine();
        int sumPrime =0;
        int sumNonPrime=0;


        while(!num.equals("stop")) {

            int number = Integer.parseInt(num);
            if(number<0) {
                System.out.println("Number is negative.");
                } else {
                boolean isPrime =true;
                for (int divisor = 2; divisor <= number - 1; divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        break;
                    } else {
                        isPrime = true;
                    }
                }
                if (isPrime) {
                    sumPrime = sumPrime + number;
                } else {sumNonPrime = sumNonPrime + number;}

            }
            num= scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d\n",sumNonPrime);
    }
}
