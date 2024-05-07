package Exam;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"room for one person" – 18.00 лв за нощувка
        //"apartment" – 25.00 лв за нощувка
        //"president apartment" – 35.00 лв за нощувка
        //пример: 11 дни = 10 нощувки)
        //вид помещение	по-малко от 10 дни	между 10 и 15 дни	повече от 15 дни
        //room for one person	не ползва намаление	не ползва намаление	не ползва намаление
        //apartment	30% от крайната цена	35% от крайната цена	50% от крайната цена
        //president apartment	10% от крайната цена	15% от крайната цена	20% от крайната цена

        //След престоя си в хотела, оценката на Дядо Коледа за услугите на хотела може да е позитивна
        // (positive) или негативна (negative). Ако оценката му е позитивна, към цената с вече приспаднатото намаление
        // Дядо Коледа добавя 25%  към нея. Ако оценката му е негативна приспада от цената 10%.

        int days = Integer.parseInt(scanner.nextLine());
        String place = scanner.nextLine(); // –  "room for one person",  "apartment" или "president apartment"
        String mark = scanner.nextLine(); // - "positive"  или "negative"

        double price = 0;

        switch (place) {
            case "room for one person":
                price = 18.00 * (days - 1);
                break;
            case "apartment":
                price = 25.00 * (days - 1);
                if (days < 10) {
                    price = price - 0.30 * price;
                } else if (days <= 15) {
                    price = price - 0.35 * price;
                }
                else {
                    price = price - 0.50*price;
                }
        break;
        case "president apartment":
        price = 35.00 * (days - 1);
            if (days < 10) {
                price = price - 0.10 * price;
            } else if (days <= 15) {
                price = price - 0.15 * price;
            }
            else {
                price = price - 0.20*price;
            }
        break;
    }
if(mark.equals("positive")) {
    price = price + 0.25*price;
}
else if(mark.equals("negative")) {
    price = price - 0.10*price;
}
        System.out.printf("%.2f", price);
}
}
