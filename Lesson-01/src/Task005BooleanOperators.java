public class Task005BooleanOperators {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        boolean c = !(a&&b);

        boolean question1 = !a;
        boolean question2 = a&&b;
        boolean question3 = a^b;
        boolean question4 = a^c;
        boolean question5 = !(c||(a&&b));

        System.out.println("When a = " + a + ", b = " + b + " and c = " + c + ":");
        System.out.println("!a = " + question1);
        System.out.println("a&&b = " + question2);
        System.out.println("a^b = " + question3);
        System.out.println("a^c = " + question4);
        System.out.println("!(c||(a&&b)) = " + question5);
    }
}
