import java.util.Scanner;

public class Task022CalculatorHelp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Really awesome calculator!!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        boolean keepRunning = true;
        while(keepRunning) {
            System.out.print("Please enter the operation you would like to perform: ");

            String operation = sc.next();
            if (operation.equals("exit")) {
                keepRunning = false;
            }
            else if (operation.equals("help")) {
                outputHelp();
            }
            else {
                System.out.print("Please enter the first number: ");
                int int1 = sc.nextInt();
                System.out.print("Please enter the second number: ");
                int int2 = sc.nextInt();
                int result = 0;
                if (operation.equals("add") || operation.equals("+")) {
                    result = int1 + int2;
                }
                else if (operation.equals("minus") || operation.equals("-")) {
                    result = int1 - int2;
                }
                else if (operation.equals("times") || operation.equals("*")) {
                    result = int1 * int2;
                }
                else if (operation.equals("divide") || operation.equals("/")) {
                    result = int1 / int2;
                }
                else {
                    System.out.println("Unrecognised command, please try again.");
                }
                System.out.println("Operation: " + operation);
                System.out.println("First number: " + int1);
                System.out.println("Second number: " + int2);
                System.out.println("Result: " + result);
            }
        }
        System.out.println("Thank you for using the really awesome calculator!");
    }

    private static void outputHelp() {
        System.out.println("The Really Awesome Calculator currently has the following functionality.");
        System.out.println("shortcut | command | description");
        System.out.println("---------|---------|------------------------------------------------------");
        System.out.println(" h       | help    | explains how to use the calculator");
        System.out.println(" x       | exit    | closes the program");
        System.out.println(" +       | add     | outputs the value of two numbers added together");
        System.out.println(" -       | minus   | outputs the value of two numbers added together");
        System.out.println(" *       | times   | outputs the value of two numbers multiplied together");
        System.out.println(" /       | divide  | outputs the value of dividing one number from another");
        System.out.println();
    }
}
