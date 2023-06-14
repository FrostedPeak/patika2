public class TheForStatementChallange {
    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            System.out.println("For 100 amount of money with " + rate + " interest rate the calculations would be : " + calculateInterest(100, rate));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate / 100));
    }
}
