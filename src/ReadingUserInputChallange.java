import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadingUserInputChallange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First please enter how many number will you enter for addition : ");
        int howManyNumbers = input.nextInt();
        double sum = 0;
        for (int i = 1; i <= howManyNumbers; i++) {
            System.out.print("Input your " + i + ". number : ");
            double number = 0;
            try {
                number = input.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(" Please try again.");
                input.nextLine();
                i--;
            }
            sum += number;
        }
        System.out.println("Sum of all the numbers you gave us were : " + sum);
    }
}