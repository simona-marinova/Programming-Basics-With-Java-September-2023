package FreeTimeTasks;
import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberEasterBread = Integer.parseInt(scanner.nextLine());
        int allPoints=0;
        int maxPoints = Integer.MIN_VALUE;
        String nameMax="";

        for (int i = 1; i <=numberEasterBread ; i++) {
            String name = scanner.nextLine();
            String gradeOne= scanner.nextLine();
            while(!gradeOne.equals("Stop")) {
              int grade = Integer.parseInt(gradeOne);
            allPoints=allPoints+grade;
            if(allPoints>=maxPoints) {maxPoints=allPoints;}
            gradeOne=scanner.nextLine();
            }
            System.out.printf("%s has %d points.\n", name, allPoints);
            if (maxPoints==allPoints) {
                nameMax=name;
                System.out.printf("%s is the new number 1!\n", name);}
                allPoints=0;

        }
        System.out.printf("%s won competition with %d points!\n", nameMax, maxPoints);
    }
}
