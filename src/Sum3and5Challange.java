public class Sum3and5Challange {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i%15 == 0) {
                sum += i;
                count++;
            }
            if (count == 5) {
                System.out.println("Breaking the loop now because we found 5 numbers in total.\n" +
                        "Count of those numbers were : " + sum);
                break;
            }
        }
    }
}
