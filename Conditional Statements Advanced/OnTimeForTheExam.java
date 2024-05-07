package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine()); //0-23
        int minuteExam = Integer.parseInt(scanner.nextLine()); //0-59
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int exam = hourExam * 60 + minuteExam;
        int arrival = hourArrival * 60 + minutesArrival;

        //На първият ред отпечатайте:
        //⦁	"Late", ако студентът пристига по-късно от часа на изпита.
        //⦁	"On time", ако студентът пристига точно в часа на изпита или до 30 минути по-рано.
        //⦁	"Early", ако студентът пристига повече от 30 минути преди часа на изпита.
        int difference = Math.abs(exam - arrival);

        if (arrival > exam) {
            System.out.println("Late");
        } else if (arrival == exam || difference <= 30) { ///arrival<exam
            System.out.println("On time");
        } else { //arrival < exam  difference > 30)
            System.out.println("Early");
        }
//Ако студентът пристига с поне минута разлика от часа на изпита, отпечатайте на следващия ред:
//⦁	"mm minutes before the start" за идване по-рано с по-малко от час.
//⦁	"hh:mm hours before the start" за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:05.
//⦁	 "mm minutes after the start" за закъснение под час.
//⦁	"hh:mm hours after the start" за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:03.

        boolean oneMinute = difference!=0;

        if (oneMinute) {
            if (arrival<exam && difference<60) {
                System.out.printf("%d minutes before the start", difference);
            }
            else if(arrival<exam &&difference>=60) {
                System.out.printf("%d:%02d hours before the start", difference/60, difference%60);
            }
            else if (arrival>exam && difference<60) {
                System.out.printf("%d minutes after the start", difference);
            }
            else if (arrival>exam && difference>=60) {
                System.out.printf("%d:%02d hours after the start", difference/60, difference%60);
            }
        }
        }




    }
