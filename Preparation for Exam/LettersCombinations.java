package PreparationExam;
import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //char letter1 = (char)System.in.read();
        char letter1 = scanner.next().charAt(0);
        char letter2 = scanner.next().charAt(0);
        char letter3 = scanner.next().charAt(0);
        // char letter2 = (char)System.in.read();
        // char letter3 = (char)System.in.read();
        int number=0;

        for (char one = letter1; one <= letter2; one++) {
            for (char two = letter1; two <= letter2; two++) {
                for (char three = letter1; three <= letter2; three++) {
                    if (one!=letter3 && two!=letter3 && three!=letter3 ) {
                        number++;
                        System.out.printf("%c%c%c ", one, two, three);
                    }

                }

            }
        }
        System.out.printf("%d", number);
    }
}