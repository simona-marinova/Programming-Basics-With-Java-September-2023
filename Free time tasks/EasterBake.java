package FreeTimeTasks;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());
        int allFlour = 0;
        int allSugar = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= easterBread; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            allSugar = allSugar + sugar;
            int flour = Integer.parseInt(scanner.nextLine());
            if (flour > maxFlour) {
                maxFlour = flour;
            }
            allFlour = allFlour + flour;
        }
        //Един пакет захар е 950 грама, а един пакет брашно е 750 грама.
        double packetSugar = Math.ceil(allSugar*1.0 / 950);
        double packetFlour = Math.ceil(allFlour*1.0 / 750);

        System.out.printf("Sugar: %.0f\n", packetSugar);
        System.out.printf("Flour: %.0f\n", packetFlour);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.",maxFlour, maxSugar);

    }
}
