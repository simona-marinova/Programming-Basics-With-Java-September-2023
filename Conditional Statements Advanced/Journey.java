package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        //Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи. Ако е лято ще почива на къмпинг,
        // а зимата в хотел. Ако е в Европа, независимо от сезона ще почива в хотел. Всеки къмпинг или хотел,
        // според дестинацията, има собствена цена която отговаря на даден процент от бюджета:
        //⦁	При 100лв. или по-малко – някъде в България
        //⦁	Лято – 30% от бюджета
        //⦁	Зима – 70% от бюджета
        //⦁	При 1000лв. или по малко – някъде на Балканите
        //⦁	Лято – 40% от бюджета
        //⦁	Зима – 80% от бюджета
        //⦁	При повече от 1000лв. – някъде из Европа
        //⦁	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.

        //⦁	Първи ред – "Somewhere in {дестинация}" измежду "Bulgaria", "Balkans" и "Europe"
        //⦁	Втори ред – "{Вид почивка} – {Похарчена сума}"
        //⦁	Почивката може да е между "Camp" и "Hotel"
        //⦁	Сумата трябва да е закръглена с точност до вторият знак след десетичната запетая

        String destination = "";
        double price = 0;
        String restHouse = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case ("summer"):
                    price = 0.3 * budget;
                    restHouse = "Camp";
                    break;
                case ("winter"):
                    price = 0.7 * budget;
                    restHouse = "Hotel";
                    break;
            }
        }

            else if(budget<=1000) {
            destination = "Balkans";
            switch (season) {
                case ("summer"):
                    price = 0.4 * budget;
                    restHouse = "Camp";
                    break;
                case ("winter"):
                    price = 0.8 * budget;
                    restHouse = "Hotel";
                    break;
            }
        }
        else  {
            destination ="Europe";
            price = 0.9*budget;
            restHouse = "Hotel";
        }

        System.out.printf("Somewhere in %s",destination);
        System.out.println();
        System.out.printf("%s - %.2f", restHouse, price);

    }
}
