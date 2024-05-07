package PreparationExam;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char lastSector = scanner.nextLine().charAt(0);
        int rowsFirstSector = Integer.parseInt(scanner.nextLine());
        int rowsCounter = rowsFirstSector;
        int seatsOddRow = Integer.parseInt(scanner.nextLine());
        int totalSeats = 0;

        for (int currentSector = 'A'; currentSector <= lastSector; currentSector++) {
            if (currentSector != 'A') {
                rowsCounter++;
            }
            for (int currentRow = 1; currentRow <= rowsCounter; currentRow++) {
                if (currentRow % 2 != 0) {
                    for (int places = 1; places <= seatsOddRow; places++) {
                        for (char place = 'a'; place <= 'd'; place++) {
                            System.out.printf("%c%d%c ", currentSector, currentRow, place);
                        }

                    }
                } else {
                    for (int places = 1; places <= seatsOddRow + 2; places++) {
                        for (char place = 'a'; place <= 'd'; place++) {
                            System.out.printf("%c%d%c ", currentSector, currentRow, place);
                        }

                    }


                }
            }

        }
    }
}
            

