public class MethodOverloadingChallange {

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6));
        System.out.println(convertToCentimeters(6,0));
    }

    public static double convertToCentimeters(int inches) {
        double centimeters = inches*2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int feet, int inches) {
        inches = feet*12 + inches;
        return convertToCentimeters(inches);
    }

}
