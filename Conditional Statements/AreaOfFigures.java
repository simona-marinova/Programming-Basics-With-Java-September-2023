package ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String shape = scanner.nextLine();
        double area = 0.000;


        if (shape.equals("square")) { double side = Double.parseDouble(scanner.nextLine());
             area = side*side;}
        else if (shape.equals("rectangle")) {double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            area = side1*side2;}
        else if (shape.equals("circle")) {double radius = Double.parseDouble(scanner.nextLine());
            area = radius*radius*Math.PI;}
        else if (shape.equals("triangle")) {double sideTriangle = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = sideTriangle*height/2;}
System.out.printf("%.3f",area);


    }
}
