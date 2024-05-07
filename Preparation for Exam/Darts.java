package PreparationExam;
import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int firstPoints = 301;
        int allPoints =firstPoints;
        int shot =0;
        int shotUnsuccessful = 0;

        String name = scanner.nextLine();
        String field = scanner.nextLine();

        while(!field.equals("Retire" )) {
             //("Single", "Double" или "Triple")
            int points = Integer.parseInt(scanner.nextLine());
if(field.equals("Single")) {points=points;
    boolean isSuccessful = points<=allPoints;
    if(isSuccessful) {shot++;}
    else {shotUnsuccessful++;
        field = scanner.nextLine();
        continue;}
    allPoints=allPoints-points;}
else if(field.equals("Double")) {points = points*2;
    boolean isSuccessful = points<=allPoints;
    if(isSuccessful) {shot++;}
    else {shotUnsuccessful++;
        field = scanner.nextLine();
        continue;}
    allPoints=allPoints-points;}
else if(field.equals("Triple")) {
    points=points*3;
    boolean isSuccessful = points<=allPoints;
    if(isSuccessful){shot++;}
    else {shotUnsuccessful++;
        field = scanner.nextLine();
        continue;}
    allPoints=allPoints-points;
}
if(allPoints==0) {
    System.out.printf("%s won the leg with %d shots.\n", name, shot);
    return;
}
            field = scanner.nextLine();
        }

        System.out.printf("%s retired after %d unsuccessful shots.\n", name, shotUnsuccessful);
    }
}
