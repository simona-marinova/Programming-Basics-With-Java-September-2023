package WhileLoop;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int sumSteps = 0;
        int goalSteps = 10000;



        while(sumSteps<goalSteps) {
            String home = scanner.nextLine();
            if(home.equals("Going home")) {
                int steps = Integer.parseInt(scanner.nextLine());
                sumSteps = sumSteps + steps;
                if (sumSteps>=goalSteps) {
                    System.out.println("Goal reached! Good job!\n");
                    System.out.printf("%d steps over the goal!",sumSteps-goalSteps );}
                else if (sumSteps<goalSteps) {
                    System.out.printf("%d more steps to reach goal.", goalSteps-sumSteps);
                }
                return;
            }
            int steps = Integer.parseInt(home);
            sumSteps+=steps;


        }
        System.out.println("Goal reached! Good job!");
        System.out.printf("%d steps over the goal!", (sumSteps-goalSteps));

    }
}

