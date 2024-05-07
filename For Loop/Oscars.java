package ForLoop;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine()); //брой оценяващи


        // точки = първоначални точки + оценка от всеки един оценяващ
        // точки = дължина на име на оценяващ *точки които дава/ 2;
        //Ако резултатът в някой момент надхвърли 1250.5 програмата трябва да прекъсне
        // и да се отпечата, че дадения актьор е получил номинация.

        for (int i=1; i<=n; i+=1) {
String judgeName = scanner.nextLine();
double judgePoints = Double.parseDouble(scanner.nextLine());
points += judgeName.length()*judgePoints/2;
if (points>1250.50) {
    System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, points);
    return; }
        }

        System.out.printf("Sorry, %s you need %.1f more!",name, (1250.5 - points));
    }
}
