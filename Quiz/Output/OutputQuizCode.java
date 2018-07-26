public class OutputQuizCode {
    public static void main(String[] args) {
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
}
