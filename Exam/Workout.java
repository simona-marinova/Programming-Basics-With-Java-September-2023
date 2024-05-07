package Exam;
import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double kmFirstDay = Double.parseDouble(scanner.nextLine());
        double kmAll = 0;
        double kmADay=kmFirstDay;

        for (int i = 1; i <= days; i++) {
            int percentage = Integer.parseInt(scanner.nextLine());
            kmADay=kmADay+ percentage*kmADay/100;
kmAll= kmAll + kmADay;
        }
       if(kmAll+kmFirstDay>=1000) {
           System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil((kmAll+kmFirstDay)-1000));
       }
       else {
           System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - (kmAll+kmFirstDay)));
       }
    }
}
