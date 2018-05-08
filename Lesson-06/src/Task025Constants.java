public class Task025Constants {
    public static final String APP_NAME = "Task 25";
    public static final String APP_DESCRIPTION = "Constants examples.";
    public static final float PI = 3.1415926f;

    public static void main(String[] args) {
        System.out.println("App name: " + APP_NAME);

        breakOutput();

        System.out.println("App description: " + APP_DESCRIPTION);

        breakOutput();

        int circleRadius = 5;
        System.out.println("Circle radius: " + circleRadius);
        System.out.println("Circle area: " + circleArea(circleRadius));
        System.out.println("Circle circumference: " + circleCircumference(circleRadius));
        circleRadius = 9;
        System.out.println("Circle radius: " + circleRadius);
        System.out.println("Circle area: " + circleArea(circleRadius));
        System.out.println("Circle circumference: " + circleCircumference(circleRadius));
    }

    public static void breakOutput() {
        System.out.println("\n-------------------------------\n");
    }

    public static float circleArea(float r) {
        return (PI * r * r);
    }

    public static float circleCircumference(float r) {
        return (2 * PI * r);
    }
}
