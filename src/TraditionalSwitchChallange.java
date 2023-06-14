public class TraditionalSwitchChallange {

    public static void main(String[] args) {
        System.out.println(charToNato('g'));
    }

    public static String charToNato(char letter) {
       return switch (letter) {
            case 'a' -> "Able";
            case 'b' -> "Baker";
            case 'c' -> "Charlie";
            case 'd' -> "Dog";
            case 'e' -> "Easy";
            default -> "ERROR";
        };
    }
}
