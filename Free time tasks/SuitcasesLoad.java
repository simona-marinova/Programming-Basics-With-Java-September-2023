package FreeTimeTasks;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());

        String input=scanner.nextLine();
        double usedSpace = 0;
        int count=0;

        while (!input.equals("End")) {
            double volumeSuitcase = Double.parseDouble(input);
            if(capacity-usedSpace<volumeSuitcase) {
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.", count);
                return;}
            count++;
            if(count%3==0) {volumeSuitcase=volumeSuitcase+0.10*volumeSuitcase;}
usedSpace = usedSpace+volumeSuitcase;

            input = scanner.nextLine();
        }
        System.out.println("Congratulations! All suitcases are loaded!");
        System.out.printf("Statistic: %d suitcases loaded.", count);
    }
}
