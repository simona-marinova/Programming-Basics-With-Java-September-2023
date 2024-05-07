package PreparationExam;
import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int annualTax = Integer.parseInt(scanner.nextLine());

        double basketballSneakers = annualTax - 0.40*annualTax;
        double basketballOutfit = basketballSneakers - 0.20*basketballSneakers;
        double basketBallBall = basketballOutfit/4;
        double basketBallAccessories = basketBallBall/5;
        double allPrice = annualTax+basketballSneakers+basketballOutfit+basketBallBall+basketBallAccessories;

        System.out.printf("%.2f", allPrice);
    }


}
