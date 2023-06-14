import java.util.Scanner;

public class AkinSatirSutun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input how many rows: ");
        int inputRow = input.nextInt();
        System.out.print("Input how many columns: ");
        int inputColumn = input.nextInt();

        int star = 1;
        boolean growing = true;
        for (int row = 1; row <= inputRow; row++) {
            for (int column = 1; column <= inputColumn; column++) {
                if (column == 1 || column == inputColumn) {
                    System.out.print("|");
                } else if (star+1 == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (star == inputColumn-2) {
                growing = false;
            } else if (star == 1) {
                growing = true;
            }
            if (growing) {
                star++;
            } else {
                star--;
            }
            System.out.println();
        }
    }
}