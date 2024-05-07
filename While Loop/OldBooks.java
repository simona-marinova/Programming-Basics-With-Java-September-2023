package WhileLoop;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String nameOfBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        int numberOfBooks =0;

        while(!nameOfBook.equals(currentBook)) {
           if (currentBook.equals("No More Books")) {
               System.out.printf("The book you search is not here!\n");
               System.out.printf("You checked %d books.",numberOfBooks);
return;
           }
            currentBook = scanner.nextLine();
            numberOfBooks++;

        }

            System.out.printf("You checked %d books and found it.", numberOfBooks);


    }
}
