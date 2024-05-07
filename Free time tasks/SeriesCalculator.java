package FreeTimeTasks;
import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int series = Integer.parseInt(scanner.nextLine());
        double timeOneSeries = Double.parseDouble(scanner.nextLine());

      double realTimeOneSeries = timeOneSeries+0.20*timeOneSeries;
      double lastSeries = timeOneSeries+10 + 0.2*(timeOneSeries+10);
       double time = Math.floor(seasons*series*timeOneSeries + seasons*series*0.2*timeOneSeries+seasons*10);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",name, time );
    }
}
