package PreparationExam;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        for (int number1 = 2; number1 <= n1; number1 += 2) {
            for (int number2 = 2; number2 <= n2; number2++) {
                for (int number3 = 2; number3 <= n3; number3 += 2) {
                 if(number2==2 || number2==3 || number2 ==5 || number2==7)   {System.out.printf("%d %d %d\n", number1, number2, number3);}
                }
            }
        }

}
}
