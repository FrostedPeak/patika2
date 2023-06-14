import java.util.Scanner;

public class Methods1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int position, score;

        while (true) {
            System.out.print("Enter your name : ");
            name = input.nextLine();
            input.nextLine();
            System.out.print("Enter your score : ");
            score = input.nextInt();
            position = calculateHighScorePosition(score);
            displayHighScorePosition(name, position);
        }

    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
