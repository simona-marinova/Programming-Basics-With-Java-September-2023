package PreparationExam;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wishedHeight = Integer.parseInt(scanner.nextLine());
        int unsuccessfulCount = 0;
        int jumpsCount = 0;
        int stickHeight = wishedHeight - 30;

        while (stickHeight <= wishedHeight) {
            int jumpHeight = Integer.parseInt(scanner.nextLine());
            jumpsCount++;
            if (jumpHeight > stickHeight) {
                if (stickHeight >= wishedHeight) {
                    System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", stickHeight, jumpsCount);
                    return;
                }
                stickHeight = stickHeight + 5;
                unsuccessfulCount = 0;
            } else {
                unsuccessfulCount++;
                if (unsuccessfulCount == 3) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", stickHeight, jumpsCount);
return;
                }
            }
        }
    }
}
