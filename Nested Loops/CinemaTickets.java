package NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfMovie = scanner.nextLine();


        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int allTickets =0;
        int totalTickets = 0;


        while (!nameOfMovie.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());
            int places = freePlaces;
            String typeOfTicket = scanner.nextLine();
allTickets =0;
            while (!typeOfTicket.equals("End")) {
                switch (typeOfTicket) {
                    case "student":
                        studentTickets++;
                        allTickets++;
                        totalTickets++;
                        places--;
                        break;
                    case "standard":
                        standardTickets++;
                        allTickets++;
                        totalTickets++;
                        places--;
                        break;
                    case "kid":
                        kidTickets++;
                        totalTickets++;
                        allTickets++;
                        places--;
                        break;
                }
                if (places == 0) {
                    break;
                }

                typeOfTicket = scanner.nextLine();

            }
            System.out.printf("%s - %.2f%% full.\n", nameOfMovie, allTickets* 1.0 / freePlaces * 100);

            nameOfMovie = scanner.nextLine();
        }

        double studentPercentage = studentTickets * 1.0 / totalTickets * 100;
        double standardPercentage = standardTickets * 1.0 / totalTickets * 100;
        double kidPercentage = kidTickets * 1.0 / totalTickets * 100;


        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", studentPercentage);
        System.out.printf("%.2f%% standard tickets.\n", standardPercentage);
        System.out.printf("%.2f%% kids tickets.\n", kidPercentage);
    }


}

