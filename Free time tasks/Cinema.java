package FreeTimeTasks;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int seats = Integer.parseInt(scanner.nextLine());
        double sum=0;
        double allSum=0;
       int busySeats=0;

        String people = scanner.nextLine();

        while(!people.equals("Movie time!")) {
            int numberPeople = Integer.parseInt(people);
            busySeats=busySeats+numberPeople;
            if(busySeats>seats) {
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %.0f lv.", allSum);
                return;}
sum=numberPeople*5;
if(numberPeople%3==0) {sum=sum-5;}
allSum=allSum+sum;

            people= scanner.nextLine();
        }

        System.out.printf("There are %d seats left in the cinema.\n", seats-busySeats);
        System.out.printf("Cinema income - %.0f lv.", allSum);
    }
}
