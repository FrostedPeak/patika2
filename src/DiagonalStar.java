import java.util.Scanner;

public class DiagonalStar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        printSquareStar(number);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        //This loop is for our rows.
        for (int row = 1; row <= number; row++) {
            //This loop is for our columns.
            for (int column = 1; column <= number; column++) {
                if (column == 1 || row == 1 || column == number || row == number || row == column || row+column == number+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}