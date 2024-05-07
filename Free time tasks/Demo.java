package FreeTimeTasks;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double leva = Double.parseDouble(console.nextLine());
        double euro = leva/1.95583;
        System.out.println(euro);
    }
}
