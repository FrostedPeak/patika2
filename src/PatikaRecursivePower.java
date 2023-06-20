import java.util.Scanner;
public class PatikaRecursivePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number : ");
        int number = input.nextInt();
        System.out.print("Input the power : ");
        int power = input.nextInt();
        System.out.print(power(number, power));
    }
    public static int power(int number, int power) {
        if (power == 0) {
            return 1;
        }
        return number*power(number, power-1);
    }
}
