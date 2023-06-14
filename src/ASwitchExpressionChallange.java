public class ASwitchExpressionChallange {
    public static void main(String[] args) {
        printDayOfWeekButIf(0);
        printDayOfWeekButIf(1);
        printDayOfWeekButIf(2);
        printDayOfWeekButIf(3);
        printDayOfWeekButIf(4);
        printDayOfWeekButIf(5);
        printDayOfWeekButIf(6);
        printDayOfWeekButIf(7);
    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek;
        switch (day) {
         case 0 -> dayOfTheWeek = "sunday";
         case 1 -> dayOfTheWeek = "monday";
         case 2 -> dayOfTheWeek = "tuesday";
         case 3 -> dayOfTheWeek = "wednesday";
         case 4 -> dayOfTheWeek = "thursday";
         case 5 -> dayOfTheWeek = "friday";
         case 6 -> dayOfTheWeek = "saturday";
         default -> dayOfTheWeek = "invalid";
        }
        System.out.println("day " + day + " is " + dayOfTheWeek);
    }

    public static void printDayOfWeekButIf(int day) {
        String dayOfTheWeek;
        if (day == 0) {
            dayOfTheWeek = "sunday";
        } else if (day == 1) {
            dayOfTheWeek = "monday";
        } else if (day == 2) {
            dayOfTheWeek = "tuesday";
        } else if (day == 3)  {
            dayOfTheWeek = "wednesday";
        } else if (day == 4)  {
            dayOfTheWeek = "thursday";
        } else if (day == 5)  {
            dayOfTheWeek = "friday";
        } else if (day == 6)  {
            dayOfTheWeek = "saturday";
        } else {
            dayOfTheWeek = "invalid";
        }
        System.out.println("day " + day + " is " + dayOfTheWeek);
    }

}

