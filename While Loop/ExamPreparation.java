package WhileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int lowGrades = Integer.parseInt(scanner.nextLine());
        String nameOfTask = scanner.nextLine();


        int numberLowGrades =0;
        int numberOfProblems = 0;
        int sumOfGrades=0;
        String lastName ="";


        while (!nameOfTask.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            numberOfProblems++;
            sumOfGrades = sumOfGrades+grade;
            if (grade<=4) {
                numberLowGrades++;
                if (numberLowGrades==lowGrades) {
                    System.out.printf("You need a break, %d poor grades.", numberLowGrades);
                    return;
                }
            }
 lastName = nameOfTask;
nameOfTask = scanner.nextLine();

        }


       double averageScore = sumOfGrades*1.00/numberOfProblems;
        System.out.printf("Average score: %.2f\n", averageScore);
        System.out.printf("Number of problems: %d\n", numberOfProblems);
        System.out.printf("Last problem: %s", lastName);
    }
}
