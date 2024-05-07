package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if (number2==0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", number1);
            return;
        }

        double result = 0.00;

if(operator.equals("+")) {
    result = number1 + number2;
} else if (operator.equals("-")) {
    result = number1-number2;
} else if (operator.equals("*")) {
result = number1*number2;
} else if (operator.equals("/")) {
result = number1*1.00/number2;
} else if (operator.equals("%")){
    result = number1%number2;
}
String evenOrOdd = "";

if (result%2==0) {evenOrOdd="even";}
else {evenOrOdd = "odd";}

if (operator.equals("+") || (operator.equals("-") || (operator.equals("*")))) {
    System.out.printf("%d %s %d = %.0f - %s\n", number1, operator, number2, result, evenOrOdd);
}
else if (operator.equals("/")) {
    System.out.printf("%d / %d = %.2f", number1, number2, result);
    }
else if (operator.equals("%")) {
    System.out.printf("%d %s %d = %.0f\n",number1, operator,number2,result );
}


    }
}
