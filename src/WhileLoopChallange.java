public class WhileLoopChallange {

    public static void main(String[] args) {
        int number = 5, odd = 0, even = 0;

        while (number <= 20) {
            if (isEvenNumber(number)) {
                even++;
                System.out.println("Even number is found : " + number);
            } else {
                odd++;
            }
            number++;
            if (even == 5) {
                System.out.println("Count of even numbers that were found : " + even + "\nCount of odd numbers that were found : " + odd);
                break;
            }
        }
    }

    public static boolean isEvenNumber  (int number) {
        if (number%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
