package FreeTimeTasks;
import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int initialEggs = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int storedEggs = initialEggs;
        int soldEggs=0;

        while(!command.equals("Close" )) {
            int numberEggs = Integer.parseInt(scanner.nextLine());
            if(command.equals("Buy")) {
                soldEggs=soldEggs+numberEggs;
                if(numberEggs>storedEggs) {
                    System.out.println("Not enough eggs in store!");
                    System.out.printf("You can buy only %d.", storedEggs);
                    return;}
                storedEggs=storedEggs-numberEggs;}
            else if(command.equals("Fill")) {storedEggs=storedEggs+numberEggs;}

            command= scanner.nextLine();
        }

        System.out.println("Store is closed!");
        System.out.printf("%d eggs sold.", soldEggs);
    }

}
