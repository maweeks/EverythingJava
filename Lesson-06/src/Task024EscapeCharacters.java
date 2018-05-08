public class Task024EscapeCharacters {
    public static void main(String[] args) {
        System.out.println("This\nis\na\nmutli\nline\nstring");

        breakOutput();

        System.out.println("Use \" to store strings");

        breakOutput();

        System.out.println("In Java, \\ is the escape character");

        breakOutput();

        int[] array = new int[3];
        array[0] = 14;
        array[1] = 1;
        array[2] = 1000;
        arrayToTable(array);
    }

    public static void breakOutput() {
        System.out.println("\n-------------------------------\n");
    }

    public static void arrayToTable(int[] array) {
        System.out.println("|-------|");
        for (int i = 0; i < array.length; i++) {
            System.out.println("| " + array[i] + "\t|");
        }
        System.out.println("|-------|");
    }
}
