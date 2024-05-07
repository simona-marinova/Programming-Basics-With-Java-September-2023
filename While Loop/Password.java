package WhileLoop;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

       // while (true) {
          //  String currentPAss = scanner.nextLine();
          //  if (currentPAss.equals(password)) {
           //    break;
          //  }

        //}
        String currentPAss = scanner.nextLine();
        while (!currentPAss.equals(password)) {
            currentPAss= scanner.nextLine();
        }

        System.out.printf("Welcome %s!", username);
        
    }
}
