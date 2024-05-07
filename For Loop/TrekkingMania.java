package ForLoop;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // броя на групите от катерачи – цяло число в интервала [1...1000
        int peopleMusala = 0;
        int peopleMonblan = 0;
        int peopleKilimandjaro = 0;
        int peopleK2 = 0;
        int peopleEverest = 0;
        int totalPeople = 0;

//⦁	Група до 5 човека включително – изкачват Мусала
//⦁	Група от 6 до 12 човека включително – изкачват Монблан
//⦁	Група от 13 до 25 човека включително – изкачват Килиманджаро
//⦁	Група от 26 до 40 човека включително –  изкачват К2
//⦁	Група от 41 (включително) или повече човека – изкачват Еверест

        for (int i = 0; i <n; i++) {
            int numberPeople = Integer.parseInt(scanner.nextLine());
            totalPeople += numberPeople;
            if (numberPeople <= 5) {
                peopleMusala +=numberPeople;
            } else if (numberPeople <= 12) {
                peopleMonblan +=numberPeople;
            } else if (numberPeople <= 25) {
                peopleKilimandjaro +=numberPeople;
            } else if (numberPeople <= 40) {
                peopleK2 +=numberPeople;
            } else {
                peopleEverest +=numberPeople;
            }
        }
        System.out.printf("%.2f%%\n",peopleMusala*1.00/totalPeople*100);
        System.out.printf("%.2f%%\n", peopleMonblan*1.00/totalPeople*100);
        System.out.printf("%.2f%%\n", peopleKilimandjaro*1.00/totalPeople*100);
        System.out.printf("%.2f%%\n",peopleK2*1.00/totalPeople*100);
        System.out.printf("%.2f%%\n", peopleEverest*1.00/totalPeople*100);



        }


    }

