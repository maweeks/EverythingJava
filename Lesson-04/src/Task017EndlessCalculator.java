import java.util.Scanner;

public class Task017EndlessCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Really awesome calculator!!");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        while(true) {
            System.out.print("Please enter the operation you would like to perform: ");
            String operation = sc.next();
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
}
