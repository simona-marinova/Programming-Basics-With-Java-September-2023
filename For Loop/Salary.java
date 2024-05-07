package ForLoop;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // брой отворени табове
       int salary = Integer.parseInt(scanner.nextLine());
        int faceFine = 0;
        int instagramFine = 0;
        int redditFine = 0;

        for (int i = 1; i <= n; i++) {
            String web = scanner.nextLine();
            switch (web) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary<=0) {
                System.out.println("You have lost your salary.");
                return;
            }

        }

        System.out.println(salary);
    }
}
