package WhileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int pieces = width*length;

        while (pieces>0) {
            String stop = scanner.nextLine();
            if(stop.equals("STOP")) {
                System.out.printf("%d pieces are left.", pieces );
                return;
            }
            int currentPieces = Integer.parseInt(stop);
            pieces=pieces-currentPieces;
        }
        System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
    }
}
