package ForLoop;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//На края програмата трябва да изпечата процента на студенти с оценка между 2.00 и 2.99,
// между 3.00 и 3.99, между 4.00 и 4.99, 5.00 или повече. Също така и средният успех на изпита.
        int n = Integer.parseInt(scanner.nextLine()); // брой студенти
        double gradeTwo = 0;
        double gradeThree = 0;
       double gradeFour = 0;
        double gradeFive = 0;
double sumGrade =0;


        for (int i = 1; i <= n; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 2.00 && grade <= 2.99) {
               gradeTwo ++;
               sumGrade=sumGrade+grade;
            } else if (grade >= 3.00 && grade <= 3.99) {
                gradeThree++;
                sumGrade=sumGrade+grade;
            } else if (grade >= 4.00 && grade <= 4.99) {
                gradeFour++;
                sumGrade=sumGrade+grade;
            } else {
                gradeFive++;
                sumGrade=sumGrade+grade;
            }
        }

        double average = sumGrade/n;


        System.out.printf("Top students: %.2f%%\n",gradeFive/n*100 );
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", gradeFour/n*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", gradeThree/n*100);
        System.out.printf("Fail: %.2f%%\n", gradeTwo/n*100);
        System.out.printf("Average: %.2f\n", average);






    }
}
