import java.util.Scanner;

public class Task015Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is a loop.");
        }

        System.out.println("--------------");

        for (int i = 0; i < 10; i++) {
            System.out.println("Pointer i is " + (i + 1));
        }

        System.out.println("--------------");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        for (int i = 0; i < 12; i++) {
            System.out.println(i + " x " + number + " = " + (i * number));
        }

        System.out.println("--------------");

        String[] shoppingList  = new String[5];
        shoppingList[0] = "Pizza";
        shoppingList[1] = "Chicken";
        shoppingList[2] = "Burgers";
        shoppingList[3] = "Chips";
        shoppingList[4] = "Cheese";

        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }

        System.out.println("--------------");

        for (int i = shoppingList.length; i > 0; i--) {
            System.out.println(shoppingList[i - 1]);
        }
    }
}
