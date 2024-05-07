package FreeTimeTasks;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chineseYuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        //•	1 биткойн = 1168 лева.
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева.1.95;
        //Обменното бюро има комисионна от 0 до 5 процента от крайната сума в евро.

        double bitcoinsEuro = bitcoins*1168/1.95;
        double chineseYuanEuro= chineseYuan*0.15*1.76/1.95;
        double money= (bitcoinsEuro+chineseYuanEuro) - commission*(bitcoinsEuro+chineseYuanEuro)/100;

        System.out.printf("%.2f", money);
    }
}
