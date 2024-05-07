package ConditionalStatements;

import java.util.Scanner;


public class WorldSwimmingRecord1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double oneMeterTimeSeconds = Double.parseDouble(scanner.nextLine());

        double time = distanceMeters*oneMeterTimeSeconds;
        double slow =Math.floor(distanceMeters/15);
        double slow2 = slow*12.5;

        double timeAll = time + slow2;
        double notEnoughSeconds = timeAll - recordSeconds;


                if(time<recordSeconds) {System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeAll);}
              else {System.out.printf("No, he failed! He was %.2f seconds slower.", notEnoughSeconds);}




    }
}
