package PreparationExam;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String firstGame = scanner.nextLine();
        String secondGame = scanner.nextLine();
        String thirdGame = scanner.nextLine();
        int countWon=0;
        int countLoss=0;
        int countEquality =0;

        //"Team won {брой спечелени мачове} games."
        //"Team lost {брой загубени мачове} games."
        //" Drawn games: {брой равни мачове}"
char symbol1= firstGame.charAt(0);
String symbolEdno =firstGame.charAt(0) + "";
int symbolOne = Integer.parseInt(symbolEdno);

char symbol2 = firstGame.charAt(2);
String symbolDwe = firstGame.charAt(2) + "";
int symbolTwo = Integer.parseInt(symbolDwe);

if(symbolOne>symbolTwo) {
    countWon++;
}
else if(symbolOne==symbolTwo) {
    countEquality++;
}
else {
    countLoss++;
}

char simbol1 =secondGame.charAt(0);
String simbolEdno = secondGame.charAt(0) + "";
int simbolOne = Integer.parseInt(simbolEdno);

char simbol2 = secondGame.charAt(2);
String simbolDwe = secondGame.charAt(2) + "";
int simbolTwo = Integer.parseInt(simbolDwe);

        if(simbolOne>simbolTwo) {
            countWon++;
        }
        else if(simbolOne==simbolTwo) {
            countEquality++;
        }
        else {
            countLoss++;
        }

        char symvol1 = thirdGame.charAt(0);
        String simvolEdno = thirdGame.charAt(0) +"";
        int symvolOne = Integer.parseInt(simvolEdno);

        char symvol2 = thirdGame.charAt(2);
        String simvolDwe = thirdGame.charAt(2) +"";
        int symvolTwo = Integer.parseInt(simvolDwe);

        if(symvolOne>symvolTwo) {
            countWon++;
        }
        else if(symvolOne==symvolTwo) {
            countEquality++;
        }
        else {
            countLoss++;
        }


        System.out.printf("Team won %d games.\n", countWon);
        System.out.printf("Team lost %d games.\n", countLoss);
        System.out.printf("Drawn games: %d", countEquality);

    }
}
