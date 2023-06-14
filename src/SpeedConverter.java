import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;

        System.out.print("Enter the value of KM/H : ");
        km = input.nextDouble();
        printConversion(km);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            long milesPerHour = Math.round(kilometersPerHour*0.621371192);
            return milesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h" );
    }
}
