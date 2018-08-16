import java.util.ArrayList;
import java.util.Arrays;

public class OutputQuizCode {
    public static void main(String[] args) {
        qu01();
    }

    private static void qu01() {
        System.out.println("Hello, world!");
    }

    private static void qu02(String name) {
        System.out.println("Hello, " + name + "!");
    }

    private static void qu03(int number) {
        System.out.println("My number is " + number);
    }

    private static void qu04(int first, int second) {
        System.out.println(first + second);
    }

    private static void qu05(int first, int second) {
        System.out.println(first + " + " + second + " = " + (first + second));
    }

    private static void qu06(int x) {
        int y = x + 5;
        System.out.println("x: " + x);
    }

    private static void qu07(int x) {
        int y = x + 5;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    private static void qu08(int x) {
        int y = x + 5;
        System.out.println("x + 1: " + (x + 1));
        System.out.println("y + 2: " + (y + 2));
    }

    private static void qu09(int x) {
        int y = x - 5;
        System.out.println("x - y: " + (x - y));
    }

    private static void qu10(int x) {
        int y = x - 5;
        System.out.println("x / y: " + (x / y));
    }

    private static void qu11(boolean x) {
        System.out.println(x);
    }

    private static void qu12(boolean x) {
        System.out.println(!x);
    }

    private static void qu13(boolean x, boolean y) {
        System.out.println(x&&y);
    }

    private static void qu14(boolean x, boolean y) {
        System.out.println(x||y);
    }

    private static void qu15(boolean x, boolean y) {
        System.out.println(!(x||y));
    }

    private static void qu16(int x) {
        if (x > 5) {
            System.out.println("X is greater than 5");
        }
    }

    private static void qu17(int x) {
        if (x > 8) {
            System.out.println("A");
        }
        else if (x > 6) {
            System.out.println("B");
        }
        else if (x > 4) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }

    private static void qu18(String str) {
        if (str.contains("abc")) {
            System.out.println("abc is in the string.");
        }
        else {
            System.out.println("abc is not in the string.");
        }
    }

    private static void qu19(String str) {
        if (str.equals("abc")) {
            System.out.println("string is 'abc'.");
        }
        else {
            System.out.println("string is not 'abc'.");
        }
    }

    private static void qu20() {
        System.out.println("Hello.");
        for (int i = 0; i < 3; i++) {
        }
        System.out.println("Bye.");
    }

    private static void qu21() {
        System.out.println("Hello.");
        for (int i = 0; i < 3; i++) {
            System.out.println("...");
        }
        System.out.println("Bye.");
    }

    private static void qu22() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

    private static void qu23(int x) {
        System.out.println("Hello.");
        for (int i = 0; i < x; i++) {
            System.out.println("...");
        }
        System.out.println("Bye.");
    }

    private static void qu24(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(i);
        }
    }

    private static void qu25(int x) {
        System.out.println("i % 2");
        for (int i = 0; i < x; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
        }
    }

    private static void qu26(int x) {
        System.out.println("i % 2");
        for (int i = 0; i < x; i++) {
            if ((i % 2) == 1) {
                System.out.println(i);
            }
        }
    }

    private static void qu27(int x, int y) {
        System.out.println("i % y");
        for (int i = 0; i < x; i++) {
            if ((i % y) == 0) {
                System.out.println(i);
            }
        }
    }

    private static void qu28() {
        System.out.println("Start");
        while (true) {
            System.out.println("running");
        }
    }

    private static void qu29(boolean run) {
        System.out.println("Start");
        while (run) {
            System.out.println("...");
            run = false;
        }
        System.out.println("End");
    }

    private static void qu30(boolean run, int max) {
        System.out.println("Start");
        int i = 0;
        while (run && (i < max)) {
            System.out.println(i);
            i++;
        }
        System.out.println("End");
    }

    private static void qu31(int size) {
        String[] words = new String[size];
        System.out.println(words.length);
        System.out.println(Arrays.toString(words));
    }

    private static void qu32(int size) {
        int[] numbers = new int[size];
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }

    private static void qu33(int number) {
        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 13;
        numbers[2] = 73;
        numbers[3] = 37;
        numbers[4] = number;
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + ": " + numbers[i]);
        }
    }

    private static void qu34(int newNumber1, int newNumber2) {
        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 13;
        numbers[2] = 73;
        numbers[3] = 37;
        numbers[4] = 21;
        System.out.println(Arrays.toString(numbers));
        numbers[2] = newNumber1;
        numbers[3] = newNumber2;
        System.out.println(Arrays.toString(numbers));
    }

    private static void qu35(String name) {
        String[] dogName = new String[5];
        dogName[0] = "Bella";
        dogName[1] = "Lucy";
        dogName[2] = name;
        dogName[3] = "Amber";
        dogName[4] = "Lola";
        System.out.println(Arrays.toString(dogName));
    }

    private static void qu36(int number) {
        Object[] things = new Object[5];
        things[0] = "dog";
        things[1] = number;
        things[2] = "Storm";
        things[3] = 4.21f;
        things[4] = 'c';
        System.out.println(Arrays.toString(things));
    }

    private static void qu37() {
        ArrayList<String> todo = new ArrayList<>();
        todo.add("Step 1: Learn to code");
        todo.add("Step 2: Create an app");
        todo.add("Step 3: ...");
        todo.add("Step 4: Profit");
        System.out.println(todo.toString());
    }

    private static void qu38() {
        ArrayList<String> todo = new ArrayList<>();
        todo.add("Step 1: Learn to code");
        todo.add("Step 2: Create an app");
        todo.add("Step 3: ...");
        todo.add("Step 4: Profit");
        for (String item : todo) {
            System.out.println(item);
        }
    }

    private static void qu39() {
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("chicken");
        shoppingList.add("pizza");
        shoppingList.add("beef");
        shoppingList.add("pasta");
        shoppingList.add("tomato");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(shoppingList.size() - i - 1));
        }
    }

    private static void qu40(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void qu41(int[] numbers) {
        int min = 0, max = 0, sum = 0;
        for (int number : numbers) {
            System.out.println(number);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            sum += number;
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
    }

    private static void qu42(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            else if (numbers[i] > max) {
                max = numbers[i];
            }
            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
    }

    private static void qu43(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }

    private static void qu44(String month) {
        switch (month) {
            case "Jan":
                System.out.println("01 - January (Jan)");
                break;
            case "Feb":
                System.out.println("01 - February (Feb)");
                break;
            case "Mar":
                System.out.println("01 - March (Mar)");
                break;
            case "Apr":
                System.out.println("01 - April (Apr)");
                break;
            case "May":
                System.out.println("01 - May (May)");
                break;
            case "Jun":
                System.out.println("01 - June (Jun)");
                break;
            case "Jul":
                System.out.println("01 - July (Jul)");
                break;
            case "Aug":
                System.out.println("01 - August (Aug)");
                break;
            case "Sep":
                System.out.println("01 - September (Sep)");
                break;
            case "Oct":
                System.out.println("01 - October (Oct)");
                break;
            case "Nov":
                System.out.println("01 - November (Nov)");
                break;
            case "Dec":
                System.out.println("01 - December (Dec)");
                break;
            default:
                System.out.println("-1 - Invalid month");
                break;
        }
    }

    private static void qu45(char grade) {
        switch (grade) {
            case 'S':
                System.out.println(100);
                break;
            case 'A':
                System.out.println(90);
                break;
            case 'B':
                System.out.println(80);
                break;
            case 'C':
                System.out.println(70);
                break;
            case 'D':
                System.out.println(60);
                break;
            case 'E':
                System.out.println(50);
                break;
            case 'F':
                System.out.println(30);
                break;
            case 'U':
                System.out.println(0);
                break;

        }
    }

    private static void qu46(int score) {
        switch (score/10) {
            case 10:
                System.out.println('S');
                break;
            case 9:
                System.out.println('A');
                break;
            case 8:
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            case 6:
                System.out.println('D');
                break;
            case 5:
                System.out.println('E');
                break;
            case 4:
            case 3:
                System.out.println('F');
                break;
            default:
                System.out.println('U');
        }
    }
}
