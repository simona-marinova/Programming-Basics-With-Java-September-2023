package WhileLoop;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volumeHome = width * length * height;


        String numberCarton = scanner.nextLine();

        while (!numberCarton.equals("Done")) {
            int volume = Integer.parseInt(numberCarton);
            volumeHome -= volume;
            if (volumeHome < 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volumeHome));
                break;
            }
            numberCarton = scanner.nextLine();
        }

        if (volumeHome >= 0) {
            System.out.printf("%d Cubic meters left.", volumeHome);


        }
    }
}