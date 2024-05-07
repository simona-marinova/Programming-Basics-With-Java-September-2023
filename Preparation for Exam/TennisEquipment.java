package PreparationExam;
import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double priceOneTennisRacket = Double.parseDouble(scanner.nextLine());
        int numberTennisRackets = Integer.parseInt(scanner.nextLine());
        int numberSneakers = Integer.parseInt(scanner.nextLine());

        //той трябва да заплати 1/8 от цената, а останалите 7/8 трябва да бъдат заплатени от неговите спонсори.
        //Джокович иска да закупи n на брой тенис ракети и m чифта маратонки, както и друга екипировка, на стойност 20% от общата цена на закупените ракети и маратонки.
        //Известно е, че:
        //1 чифт маратонки = 1/6 от цената на една тенис ракета

        //Крайната цена се сформира от сумата от цената на ракетите, цената на маратонките и цената на останалата екипировка.

        double price1 = numberTennisRackets*priceOneTennisRacket + numberSneakers*priceOneTennisRacket/6.0;
        double additionalPrice = 0.20*price1;
        double priceByDjokovic = (price1+additionalPrice)/8.0;
        double priceBySponsors = (price1+additionalPrice)*7.0/8.0;

        System.out.printf("Price to be paid by Djokovic %.0f\n", Math.floor(priceByDjokovic));
        System.out.printf("Price to be paid by sponsors %.0f\n", Math.ceil(priceBySponsors));


    }
}
