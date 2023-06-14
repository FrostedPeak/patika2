import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You can finish the program by entering a character instead of a number.\nYou can enter an integer or a double number.\nFor doubles please use ',' instead of '.'.");
        boolean loop = true;
        int i = 1;
        double number =     0, maxNumber = -Double.MAX_VALUE, minNumber = Double.MAX_VALUE;
        do {
            System.out.print("Input your " + i + ". number : ");
            String numberString = input.nextLine();
            try {
                number = Double.parseDouble(numberString);
            } catch (NumberFormatException e) {
                if (i == 1) {
                    System.out.println("No valid data was entered.");
                    break;
                }
                System.out.println("Okay, the loop is now finished.\nYour MAX number was : " + maxNumber + "\nYour MIN number was : " + minNumber);
                loop = false;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
            i++;
        } while (loop);
    }
}