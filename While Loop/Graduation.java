package WhileLoop;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int poorGrades = 0;
        int year = 1;
        double sumGrades = 0;
        while (year <= 12) {
            if (poorGrades > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                poorGrades++;
                continue;
            }

            sumGrades = sumGrades + grade;
            year++;
        }
        if (poorGrades > 1) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double avgGrade = sumGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);

        }
    }
}