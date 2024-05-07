package PreparationExam;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberMovies = Integer.parseInt(scanner.nextLine());
        double ratingSum = 0;
        double minValue = Double.MAX_VALUE;
        double maxValue = Double.MIN_VALUE;

        String movieMax = "";
        String movieMin = "";

        for (int i = 1; i <= numberMovies; i++) {
            String nameOfMovie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            ratingSum = ratingSum + rating;
            if (rating > maxValue) {
                maxValue = rating;
            }
            if (rating < minValue) {
                minValue = rating;
            }
            if(rating==minValue) {movieMin=nameOfMovie;}
            if (rating==maxValue) {movieMax=nameOfMovie;}
        }

        System.out.printf("%s is with highest rating: %.1f\n", movieMax, maxValue);
        System.out.printf("%s is with lowest rating: %.1f\n", movieMin, minValue);
        System.out.printf("Average rating: %.1f", ratingSum/numberMovies);
    }
}
