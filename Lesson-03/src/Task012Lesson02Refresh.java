import java.util.Scanner;

public class Task012Lesson02Refresh {
    public static void main(String[] args) {
        String myString = "Billy";
        String myString2 = "Jim";
        int int1 = 73;
        int int2 = 37;
        boolean bool = false;

        if (int2 >= int1) {
            System.out.println("int2 is greater than or equal to int1.");
        }
        else if ((int1 > 0) && (int2 > 0)) {
            System.out.println("Both integers are larger than zero.");
        }
        else if (myString.equals("Billy")) {
            System.out.println("myString is Billy.");
        }
        else {
            System.out.println("All conditions were false.");
        }

        // Extension
        if (bool == false) {
            System.out.println("bool is false 1");
        }
        if (bool != true) {
            System.out.println("bool is false 2");
        }
        if (!bool) {
            System.out.println("bool is false 3 (best option)");
        }

        if (myString.equals(myString2) && ((int1 > int2) || bool)) {
            System.out.println("Strings are the same and int1 is larger than int2 or bool");
        }

        if (myString.contains(myString2)) {
            System.out.println("mystring is contained in mystring2.");
        }

        Scanner sc = new Scanner(System.in);
        int newInt = sc.nextInt();
        if (((int1 > newInt)&&(newInt > int2)) || ((int2 > newInt)&&(newInt > int1))) {
            System.out.println("User integer is between int1 and int2.");
        }
    }
}
