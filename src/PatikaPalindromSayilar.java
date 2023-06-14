public class PatikaPalindromSayilar {

    public static void main(String[] args) {
        System.out.println(isPalindrom(5));

    }

    public static boolean isPalindrom(int number) {
        int digit = howManyDigits(number);
        int reversedNumber = 0, temporaryNumber = number, lastDigit;
        while (temporaryNumber != 0) {
            lastDigit = temporaryNumber%10;
            reversedNumber += lastDigit*Math.pow(10,digit-1);
            digit--;
            temporaryNumber /= 10;
        }
        if (reversedNumber == number) {
            return true;
        } else {
            return false;
        }
    }

    public static int howManyDigits(int number) {
        int digit = 0;
        if (number == 0) {
            digit = 1;
            return digit;
        }
        while (number != 0) {
            number /= 10;
            digit++;
        }
        return digit;
    }

}
