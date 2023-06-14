public class SecondsAndMinutesChallange {

    public static void main(String[] args) {
        getDurationString(-3945);
        getDurationString(-65,45);
        getDurationString(65,145);
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid number of seconds.");
        } else {
            getDurationString(seconds / 60, seconds % 60);
        }
    }

    public static void getDurationString(int minutes, int seconds) {
        if (seconds < 0 || seconds > 60 || minutes < 0) {
            System.out.println("Invalid number of minutes or seconds.");
        } else {
            System.out.println(minutes / 60 + "H " + minutes % 60 + "M " + seconds + "S");
        }
    }

}
