package FreeTimeTasks;

import java.util.Scanner;

public class MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = a1; i <=a2-1; i++) {
            if(i%2==0) {continue;}
            char c = (char)i;
            for (int j = 1; j <= n-1; j++) {
                for (int k = 1; k <=n/2-1 ; k++) {
                    for (int l = a1; l <=a2-1 ; l++) {
                        int asciiValue = (int) c;
                        if((j+k+asciiValue)%2==0) {
                            continue;}
                        System.out.printf("%c-%d%d%d%n", c, j,k,asciiValue);
                        break;
                    }
                    
                }
                
            }
            
        }

    }
}
