import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number>0) {
            System.out.println("The number is positive");
        }else if (number==0){
            System.out.println("The value equals 0");
        }else {
            System.out.println("The number is negative");
        }
    }

}