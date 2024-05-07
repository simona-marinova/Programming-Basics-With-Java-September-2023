package NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberGrades =0;
        int numberJury = Integer.parseInt(scanner.nextLine());
        String namePresentation = scanner.nextLine();

        double gradeSum =0;
        double averageGradeOne = 0;
       double gradeSumTotal =0;


        while (!namePresentation.equals("Finish")) {

            for (int i = 1; i <=numberJury ; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                numberGrades ++;
                gradeSum = gradeSum + grade;
                gradeSumTotal = gradeSumTotal +grade;

            }
            averageGradeOne = gradeSum/numberJury;
            System.out.printf( "%s - %.2f.\n", namePresentation, averageGradeOne);
gradeSum =0;

            namePresentation = scanner.nextLine();

        }
        System.out.printf("Student's final assessment is %.2f.", gradeSumTotal/numberGrades );
    }
}
