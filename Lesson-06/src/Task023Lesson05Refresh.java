public class Task023Lesson05Refresh {
    public static void main(String[] args) {
        printDiff(6, 5);

        breakOutput();

        daysToSeconds(1);
        daysToSeconds(3);
        daysToSeconds(7);

        breakOutput();

        System.out.println(product(6, 5));
        System.out.println(product(2, 10));
        System.out.println(product(7, 7));

        breakOutput();

        int[] arrayInt = new int[4];
        arrayInt[0] = 6;
        arrayInt[1] = 2;
        arrayInt[2] = 9;
        arrayInt[3] = 5;
        float average = arrayAverage(arrayInt);
        System.out.println("Array average is " + average);

        breakOutput();

        System.out.println("Grade for 7 of 9 is " + calculateGrade(7, 9));
        System.out.println("Grade for 1 of 2 is " + calculateGrade(1, 2));
        System.out.println("Grade for 0 of 6 is " + calculateGrade(0, 6));
        System.out.println("Grade for 20 of 21 is " + calculateGrade(20, 21));
        System.out.println("Grade for 12 of 15 is " + calculateGrade(12, 15));
    }

    public static void breakOutput() {
        System.out.println("\n-------------------------------\n");
    }

    public static void printDiff(int int1, int int2) {
        System.out.println("First number: " + int1);
        System.out.println("Second number: " + int2);
        if (int1 > int2) {
            System.out.println("Difference: " + (int1 - int2));
        }
        else {
            System.out.println("Difference: " + (int2 - int1));
        }
    }

    public static void daysToSeconds(int days) {
        int seconds = days * 86400; // (60 seconds * 60 minutes * 24 hours)
        System.out.println(days + " days is " + seconds + " seconds.");
    }

    public static int product(int int1, int int2) {
        System.out.println("Product of " + int1 + " and " + int2);
        return int1 * int2;
    }

    public static float arrayAverage(int[] array) {
        float average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average = average / array.length;
        return average;
    }

    public static String calculateGrade(float score, float max) {
        float percentage = score / max;
        if (percentage >= 0.8) {
            return "A";
        }
        if (percentage >= 0.7) {
            return "B";
        }
        if (percentage >= 0.6) {
            return "C";
        }
        if (percentage >= 0.5) {
            return "D";
        }
        if (percentage >= 0.4) {
            return "E";
        }
        else {
            return "F";
        }
    }
}
