package FreeTimeTasks;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int percentage = Integer.parseInt(scanner.nextLine());

int litersPaint = Integer.parseInt(scanner.nextLine());
String paint = litersPaint+"";

int area = 4*height*width;
double areaPaint = Math.ceil(area - percentage*1.0/100*area);
double areaPaintLeft=areaPaint-litersPaint;

while(!paint.equals("Tired!")) {
int paintLiters = Integer. parseInt(paint);
areaPaintLeft=areaPaint-paintLiters;
if(areaPaintLeft<=0) {
    if (paintLiters > areaPaintLeft) {
        System.out.printf("All walls are painted and you have %.0f l paint left!",Math.abs(areaPaintLeft));
        return;
    } else {
        System.out.println("All walls are painted! Great job, Pesho!");
        return;
    }

}
areaPaint=areaPaint-paintLiters;
    paint=scanner.nextLine();

}
        System.out.printf("%.0f quadratic m left.%n", areaPaintLeft);

    }
}
