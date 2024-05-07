package FreeTimeTasks;
import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int timePhotos = Integer.parseInt(scanner.nextLine());
        int numberScenes = Integer.parseInt(scanner.nextLine());
        int timeOneScene = Integer.parseInt(scanner.nextLine());

       double timePreparation = 0.15*timePhotos;
        double timeAll = timePreparation + numberScenes*timeOneScene;

        if (timeAll<=timePhotos) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timePhotos-timeAll);
        }
        else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", (timeAll-timePhotos));}

    }
}
