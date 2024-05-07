package PreparationExam;

import java.util.Scanner;

public class WorldSnookerChampionship {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//	Четвъртфинал	Полуфинал	Финал
//Стандартен	55.50 £/бр.	75.88 £/бр.	110.10 £/бр.
//Премиум	105.20 £/бр.	125.22 £/бр.	160.66 £/бр.
//ВИП	118.90 £/бр.	300.40 £/бр.	400 £/бр.

        //При закупуване на билет, зрителят може да избере опция, снимка с трофея, на цена 40 лири.
        //При достигане на определена сума има отстъпки:
        //Над 4000 лири има 25% отстъпка и безплатни снимки с трофея (ако  опцията за снимки е избрана, таксата от 40 лири за билет не се включва)
        //Над 2500 лири има 10% отстъпка
        //При избрана опция за снимки с трофея, цената се начислява след изчисляването на отстъпките.

        String stage = scanner.nextLine(); //“Quarter final ”, “Semi final” или “Final”
        String typeTicket = scanner.nextLine(); //- “Standard”, “Premium” или “VIP”
        int numberTickets = Integer.parseInt(scanner.nextLine());
        String photo = scanner.nextLine(); //'Y' (да) или 'N' (не)
        double price = 0;
        double additionalPrice = 0;

        switch (typeTicket) {
            case "Standard":
                if (stage.equals("Quarter final")) {
                    price = 55.50;
                } else if (stage.equals("Semi final")) {
                    price = 75.88;
                } else if (stage.equals("Final")) {
                    price = 110.10;
                }
                break;
            case "Premium":
                if (stage.equals("Quarter final")) {
                    price = 105.20;
                } else if (stage.equals("Semi final")) {
                    price = 125.22;
                } else if (stage.equals("Final")) {
                    price = 160.66;
                }
                break;
            case "VIP":
                if (stage.equals("Quarter final")) {
                    price = 118.90;
                } else if (stage.equals("Semi final")) {
                    price = 300.40;
                } else if (stage.equals("Final")) {
                    price = 400;
                }
                break;


        }

        double priceAll = price * numberTickets;

        if (priceAll > 4000) {
            priceAll = priceAll - 0.25 * priceAll;
        } else if (priceAll > 2500) {
            if (photo.equals("Y")) {
                priceAll = priceAll - 0.10 * priceAll;
                additionalPrice = numberTickets * 40;
                priceAll = priceAll + additionalPrice;
            } else {
                priceAll = priceAll - 0.10 * priceAll;
            }

        } else {
            priceAll = priceAll;
            if (photo.equals("Y")) {
                additionalPrice = numberTickets * 40;
                priceAll = priceAll + additionalPrice;

            }

        }
        System.out.printf("%.2f", priceAll);

    }
}