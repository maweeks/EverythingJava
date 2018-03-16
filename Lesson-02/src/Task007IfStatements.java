public class Task007IfStatements {
    public static void main(String[] args) {
        boolean a = false, b = true;
        if (a) {
            System.out.println("The variable a is true.");
        }
        else {
            System.out.println("The variable a is false.");
        }
        if (b) {
            System.out.println("The variable b is true.");
        }
        else {
            System.out.println("The variable b is false.");
        }


        if (true) {
            System.out.println("Condition one is true (if, else if)");
        }
        else if (true) {
            System.out.println("Condition two is true (if, else if)");
        }

        if (true) {
            System.out.println("Condition one is true (if, if)");
        }
        if (true) {
            System.out.println("Condition two is true (if, if)");
        }
        System.out.println("If you use else if, it will only get run if the if/else if statements before it are false.");
    }
}
