public class Task026Lesson06Refresh {
    public static final String APP_AUTHOR = "Matt";
    public static final float GRAVITY_ACCELERATION = 9.8f;

    public static void main(String[] args) {
        System.out.println("I can use \" and \\ in strings!");

        breakOutput();

        System.out.println(APP_AUTHOR);

        breakOutput();

        System.out.println("snake\tincome\tship\nwire\trecord\tcherries");

        breakOutput();

        System.out.println(velocityAtTime(5));
    }

    public static void breakOutput() {
        System.out.println("\n-------------------------------\n");
    }

    public static float velocityAtTime(float time) {
        return time * GRAVITY_ACCELERATION;
    }
}
