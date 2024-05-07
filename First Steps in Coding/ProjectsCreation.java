package FirstStepsInCoding;

import java.util.Scanner;

public class ProjectsCreation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        int hours = num * 3;
        System.out.println("The architect" + " " + name + " " + "will need" + " " + hours + "hours to complete" +  num + " " + "project/s.");


        // "The architect" + " " + name + " " + "will need" + " " + hours + "hours to complete" +  num + " " + "project/s."


    }

}
