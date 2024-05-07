package PreparationExam;
import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int number1 = n1; number1 <=n2 ; number1++) {
            for (int number2 = n1; number2 <=n2 ; number2++) {
                for (int number3 =n1; number3 <=n2 ; number3++) {
                    for (int number4 = n1; number4 <=n2 ; number4++) {
                        boolean isSpecial = (number1%2==0&&number4%2!=0 || number1%2!=0 && number4%2==0) && number1>number4 && (number2+number3)%2==0;
                        if(isSpecial) {
                            System.out.printf("%d%d%d%d ", number1, number2, number3, number4);
                        }

                    }

                }

            }

        }
    }
}
