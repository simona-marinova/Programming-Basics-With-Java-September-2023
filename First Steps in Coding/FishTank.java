package FirstStepsInCoding;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lengthSm = Integer.parseInt(scanner.nextLine());
        int widthSm = Integer.parseInt(scanner.nextLine());
        int heightSm = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.

        int volume = lengthSm*widthSm*heightSm;
       double volumeLiters = volume*0.001;
       double neededLiters = volumeLiters*(1-percentage/100);

       System.out.println(neededLiters);




    }
}
