package FreeTimeTasks;
import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int redBalls =0;
        int orangeBalls = 0;
        int yellowBalls =0;
        int whiteBalls =0;
        int otherColors =0;
        int divided = 0;


        for (int i = 1; i <=number; i++) {
            String color = scanner.nextLine();
         if(color.equals("red")) {
             redBalls++;
             points = points + 5;
         } else if (color.equals("orange")) {
             orangeBalls++;
                  points = points + 10;}
              else if (color.equals("yellow")) {
                  yellowBalls++;
                  points = points +15;}
              else if (color.equals("white")) {
                  whiteBalls++;
                  points = points + 20;}
              else if (color.equals("black")) {
                  divided++;
                  points = points/2;
            }
              else {otherColors++;
              }

        }

        System.out.printf("Total points: %d\n", points);
        System.out.printf("Red balls: %d\n", redBalls);
        System.out.printf("Orange balls: %d\n", orangeBalls);
        System.out.printf("Yellow balls: %d\n", yellowBalls);
        System.out.printf("White balls: %d\n", whiteBalls);
        System.out.printf("Other colors picked: %d\n", otherColors);
        System.out.printf("Divides from black balls: %d", divided);

    }
}
