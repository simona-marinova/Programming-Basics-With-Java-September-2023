package FreeTimeTasks;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int sum = 0;
        double points = 0;
        double maxPoints =Integer.MIN_VALUE;
        String maxWord = "";


        while (!word.equals("End of words")) {
            int length = word.length();
            for (char i = 0; i < length; i++) {
                char symbol = word.charAt(i);
                int asciiValue = (int) symbol;
                sum = sum + asciiValue;
                char firstLetter = word.charAt(0);
                boolean isTRue = firstLetter == 'a' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u' || firstLetter == 'y' || firstLetter == 'e' || firstLetter == 'A' || firstLetter == 'I' || firstLetter == 'O' || firstLetter == 'U' || firstLetter == 'Y' || firstLetter == 'E';

                if (isTRue) {
                    points = sum * length;
                    if(points>maxPoints) {maxPoints=points;
                        maxWord=word;
                    }
                } else {
                    points = Math.floor(sum * 1.0 / length);
                    if(points>maxPoints) {maxPoints=points;
                    maxWord=word;}
                }

            }
            points=0;
            sum=0;
            word = scanner.nextLine();

        }
        System.out.printf("The most powerful word is %s - %.0f",maxWord,maxPoints );
    }

}


