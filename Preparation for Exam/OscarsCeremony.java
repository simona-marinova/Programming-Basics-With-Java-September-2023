package PreparationExam;
import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

       int rent = Integer.parseInt(scanner.nextLine());

       //Статуетки  – цената им е 30% по-малка от наема на залата
        //Кетъринг – цената му е 15% по-малка от тази на статуетките
        //Озвучаване – цената му е 1 / 2 от цената за кетъринг

        double statuette = rent - 0.30*rent;
double catering = statuette - 0.15*statuette;
double music = catering-0.50*catering;

double expenses = rent + statuette+ catering + music;

        System.out.printf("%.2f", expenses);


    }
}
