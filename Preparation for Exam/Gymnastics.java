package PreparationExam;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine(); //("Russia", "Bulgaria" или "Italy")
        String text = scanner.nextLine(); //("ribbon", "hoop" или "rope")

        double markDifficulty = 0;
        double markPerformance= 0;

        switch (country) {
            case "Russia":
                if (text.equals("ribbon")) {
                    markDifficulty = 9.100;
                    markPerformance = 9.400;
                } else if (text.equals("hoop")) {
                    markDifficulty = 9.300;
                    markPerformance = 9.800;
                } else if (text.equals("rope")) {
                    markDifficulty = 9.600;
                    markPerformance = 9.000;
                }
                break;
            case "Bulgaria":
                if (text.equals("ribbon")) {
                    markDifficulty = 9.600;
                   markPerformance = 9.400;
                } else if (text.equals("hoop")) {
                    markDifficulty = 9.550;
                    markPerformance = 9.750;
                } else if (text.equals("rope")) {
                    markDifficulty = 9.500;
                    markPerformance = 9.400;
                }
                break;
            case "Italy":
                if (text.equals("ribbon")) {
                    markDifficulty = 9.200;
                    markPerformance = 9.500;
                } else if (text.equals("hoop")) {
                    markDifficulty = 9.450;
                   markPerformance= 9.350;
                } else if (text.equals("rope")) {
                    markDifficulty = 9.700;
                    markPerformance = 9.150;
                }
                break;
        }

        //Първи ред: "The team of {държава} get {обща оценка} on {уред}."
        //Втори ред:  "{процентът, който не им достига до максималния брой точки}%"

        double mark = markDifficulty+markPerformance;

      double pointsMissing = 20 - mark;
      double percentage = pointsMissing/20*100;

        System.out.printf("The team of %s get %.3f on %s.\n",country,mark,text );
        System.out.printf("%.2f%%", percentage);
    }
}
