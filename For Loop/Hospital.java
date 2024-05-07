package ForLoop;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // период за изчисления (дните)

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= n; i++) {
            int currentPatients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                if (treatedPatients < untreatedPatients) {
                    doctors++;
                }
            }
            if (currentPatients <= doctors) {
                treatedPatients +=currentPatients;
            } else {
                treatedPatients +=doctors;
                untreatedPatients = untreatedPatients+(currentPatients - doctors);
            }


        }
        System.out.printf("Treated patients: %d.\n", treatedPatients);
        System.out.printf("Untreated patients: %d.",untreatedPatients);


    }
}

