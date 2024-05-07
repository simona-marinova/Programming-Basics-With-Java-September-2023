package FreeTimeTasks;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     String n1 = scanner.nextLine();
     String n2  =scanner.nextLine();

char oneN1 = n1.charAt(0);
char oneN2 = n2.charAt(0);

char twoN1 = n1.charAt(1);
char twoN2 = n2.charAt(1);

char threeN1 = n1.charAt(2);
char threeN2 = n2.charAt(2);

char fourN1 = n1.charAt(3);
char fourN2 = n2.charAt(3);

        for (char c = oneN1; c <=oneN2 ; c++) {
            if(c%2==0) {continue;}
            for (char i = twoN1; i <=twoN2 ; i++) {
                if(i%2==0) {continue;}
                for (char j = threeN1; j <=threeN2 ; j++) {
                    if(j%2==0) {continue;}
                    for (char k = fourN1; k <=fourN2 ; k++) {
                        if(k%2==0) {continue;}
                        System.out.printf("%c%c%c%c ",c,i,j,k);
                    }

                }

            }
        }


    }


}




