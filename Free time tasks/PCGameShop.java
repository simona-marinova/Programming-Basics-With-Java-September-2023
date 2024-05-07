package FreeTimeTasks;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soldGames = Integer.parseInt(scanner.nextLine());
        int numberHearthstone = 0;
        int numberFornite = 0;
        int numberOverwatch = 0;
        int numberOthers = 0;

        for (int i = 1; i <= soldGames; i++) {
            String nameOfGame = scanner.nextLine();
            if (nameOfGame.equals("Hearthstone")) {
                numberHearthstone++;
            } else if (nameOfGame.equals("Fornite")) {
                numberFornite++;
            } else if (nameOfGame.equals("Overwatch")) {
                numberOverwatch++;
            } else {
                numberOthers++;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", numberHearthstone*1.0/soldGames*100);
        System.out.printf("Fornite - %.2f%%%n", numberFornite*1.0/soldGames*100);
        System.out.printf("Overwatch - %.2f%%%n", numberOverwatch*1.0/soldGames*100);
        System.out.printf("Others - %.2f%%%n", numberOthers*1.0/soldGames*100);
    }
}
