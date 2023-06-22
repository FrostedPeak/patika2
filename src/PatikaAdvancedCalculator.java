import java.util.InputMismatchException;
import java.util.Scanner;

public class PatikaAdvancedCalculator {

    //*************PLUS***************\\
    public static double plus(double result) {
        Scanner input = new Scanner(System.in);
        double number;
        String userInput;
        System.out.println("****************PLUS******************\nM - Back to Menu\nC - Clear\nNOTE: You have to use UPPERCASE LETTER for 'M' and 'C'.\nRESULT : " + result);
        while (true) {
            System.out.print("NUMBER : ");
            userInput = input.nextLine();
            if (userInput.equals("M")) {
                return result;
            } else if (userInput.equals("C")) {
                result = 0;
                System.out.println("RESULT : " + result);
            } else {
                try {
                    number = Double.parseDouble(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("INCORRECT INPUT");
                    continue;
                }
                result += number;
                System.out.println("RESULT : " + result);
            }
        }
    }

    //*************MINUS***************\\
    public static double minus(double result) {
        Scanner input = new Scanner(System.in);
        double number;
        String userInput;
        System.out.println("****************MINUS******************\nM - Back to Menu\nC - Clear\nNOTE: You have to use UPPERCASE LETTER for 'M' and 'C'.\nRESULT : " + result);
        while (true) {
            System.out.print("NUMBER : ");
            userInput = input.nextLine();
            if (userInput.equals("M")) {
                return result;
            } else if (userInput.equals("C")) {
                result = 0;
                System.out.println("RESULT : " + result);
            } else {
                try {
                    number = Double.parseDouble(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("INCORRECT INPUT");
                    continue;
                }
                result -= number;
                System.out.println("RESULT : " + result);
            }
        }
    }

    //*************TIMES***************\\
    public static double times(double result) {
        Scanner input = new Scanner(System.in);
        double number;
        String userInput;
        if (result == 0) {
            result = 1;
        }
        System.out.println("****************TIMES******************\nM - Back to Menu\nC - Clear\nNOTE: You have to use UPPERCASE LETTER for 'M' and 'C'.");
        if (result != 1) {
            System.out.println("RESULT : " + result);
        }
        while (true) {
            System.out.print("NUMBER : ");
            userInput = input.nextLine();
            if (userInput.equals("M")) {
                return result;
            } else if (userInput.equals("C")) {
                result = 1;
                System.out.println("RESULT : " + result);
            } else {
                try {
                    number = Double.parseDouble(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("INCORRECT INPUT");
                    continue;
                }
                result *= number;
                System.out.println("RESULT : " + result);
            }
        }
    }

    //*************DIVIDE***************\\
    public static double divide(double result) {
        Scanner input = new Scanner(System.in);
        double number;
        String userInput;
        System.out.println("****************DIVIDE******************\nM - Back to Menu\nC - Clear\nNOTE: You have to use UPPERCASE LETTER for 'M' and 'C'.");
        if (result != 0) {
            System.out.println("RESULT : " + result);
        }
        while (true) {
            System.out.print("NUMBER : ");
            userInput = input.nextLine();
            if (userInput.equals("M")) {
                return result;
            } else if (userInput.equals("C")) {
                result = 0;
                System.out.println("RESULT : " + result);
            } else {
                try {
                    number = Double.parseDouble(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("INCORRECT INPUT");
                    continue;
                }
                if (result == 0) {
                    result = number;
                } else {
                    result /= number;
                }
                System.out.println("RESULT : " + result);
            }
        }
    }

    //*************POWER***************\\
    public static double power(double result) {
        Scanner input = new Scanner(System.in);
        double number, tempResult;
        String userInput;
        System.out.println("****************POWER******************\nM - Back to Menu\nC - Clear\nNOTE: You have to use UPPERCASE LETTER for 'M' and 'C'.\nRESULT : " + result);
        while (true) {
            System.out.print("NUMBER : ");
            userInput = input.nextLine();
            if (userInput.equals("M")) {
                return result;
            } else if (userInput.equals("C")) {
                result = 0;
                System.out.println("RESULT : " + result);
            } else {
                try {
                    number = Double.parseDouble(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("INCORRECT INPUT");
                    continue;
                }
                tempResult = result;
                if (number == 0) {
                    result = 1;
                    System.out.println("RESULT : " + result);
                    continue;
                }
                for (;number-1 > 0; number--) {
                    result *= tempResult;
                }
                System.out.println("RESULT : " + result);
            }
        }
    }

    //*************FACTORIAL***************\\
    public static double factorial() {
        Scanner input = new Scanner(System.in);
        double number;
        String userInput;
        System.out.println("****************FACTORIAL******************\nM - Back to Menu\nNOTE: You have to use UPPERCASE LETTER for 'M'.");
        double result = 1;
        while (true) {
            System.out.print("NUMBER : ");
            userInput = input.nextLine();
            if (userInput.equals("M")) {
                return result;
            } else {
                try {
                    number = Double.parseDouble(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("INCORRECT INPUT");
                    continue;
                }
                result = 1;
                for (double i = number; i > 1; i--) {
                    result *= i;
                }
                System.out.println("RESULT : " + result);
            }
        }
    }

    //*************MODE***************\\
    public static void mode() {
        Scanner input = new Scanner(System.in);
        double number, mode, result;
        String userInput;
        System.out.println("****************MODE******************\nM - Back to Menu\nNOTE: You have to use UPPERCASE LETTER for 'M'.");
        while (true) {
            System.out.print("NUMBER : ");
            userInput = input.nextLine();
            if (userInput.equals("M")) {
                return;
            } else {
                try {
                    number = Double.parseDouble(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("INCORRECT INPUT");
                    continue;
                }
                System.out.print("MODE : ");
                userInput = input.nextLine();
                if (userInput.equals("M")) {
                    return;
                } else {
                    try {
                        mode = Double.parseDouble(userInput);
                    } catch (NumberFormatException e) {
                        System.out.println("INCORRECT INPUT");
                        continue;
                    }
                    result = number % mode;
                    System.out.println("RESULT : " + result);
                }
            }
        }
    }

    //*************RECTANGLE***************\\
    public static void rectangle() {
        Scanner input = new Scanner(System.in);
        double number1, number2, area, perimeter;
        String userInput;
        System.out.println("****************RECTANGLE******************\nM - Back to Menu\nNOTE: You have to use UPPERCASE LETTER for 'M'.");
        while (true) {
            System.out.print("RECTANGLE FIRST SIDE : ");
            userInput = input.nextLine();
            if (userInput.equals("M")) {
                return;
            } else {
                try {
                    number1 = Double.parseDouble(userInput);
                } catch (NumberFormatException e) {
                    System.out.println("INCORRECT INPUT");
                    continue;
                }
                System.out.print("RECTANGLE SECOND SIDE : ");
                userInput = input.nextLine();
                if (userInput.equals("M")) {
                    return;
                } else {
                    try {
                        number2 = Double.parseDouble(userInput);
                    } catch (NumberFormatException e) {
                        System.out.println("INCORRECT INPUT");
                        continue;
                    }
                    area = number1*number2;
                    perimeter = (number1+number2)*2;
                    System.out.println("AREA : " + area + "\nPERIMETER : " + perimeter);
                }
            }
        }
    }

    //*************MAIN***************\\
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1 - Plus\n"
                + "2 - Minus\n"
                + "3 - Times\n"
                + "4 - Divide\n"
                + "5 - Power\n"
                + "6 - Factorial\n"
                + "7 - Mode\n"
                + "8 - Rectangle Perimeter and Area Calculation\n"
                + "9 - Clear the Result\n"
                + "10 - Leave\n"
                + "Your choice : ";

        double result = 0;
        while (true) {
            System.out.print(menu);
            try {
                select = input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine();
                continue;
            }
            switch (select) {
                case 1:
                    result = plus(result);
                    break;
                case 2:
                    result = minus(result);
                    break;
                case 3:
                    result = times(result);
                    break;
                case 4:
                    result = divide(result);
                    break;
                case 5:
                    result = power(result);
                    break;
                case 6:
                    result = factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 9:
                    result = 0;
                    break;
                case 10:
                    return;
            }
        }
    }
}