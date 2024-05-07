package ForLoop;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());
        double monthExpense = 0;
        double water = 0;
        double internet = 0;
        double other = 0;
        double sumElectricity = 0;
        double sum = 0;

        for (int i = 1; i <= months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            water = water + 20;
            internet = internet + 15;
            other += electricityBill + 20 + 15 + (electricityBill + 20 + 15) * 0.20;
            sumElectricity += electricityBill;
            sum = electricityBill + water + internet + other;
        }
        double average =  (water+sumElectricity+internet+other)/months;

        System.out.printf("Electricity: %.2f lv\n",sumElectricity );
        System.out.printf("Water: %.2f lv\n",water);
        System.out.printf("Internet: %.2f lv\n",internet);
        System.out.printf("Other: %.2f lv\n", other);
        System.out.printf("Average: %.2f lv\n", average);


    }
}