public class Task021Methods {
    public static void main(String[] args) {
        helloWorld();
        helloName("Bob");
        addTogether(12, 42);
    }

    private static void helloWorld() {
        System.out.println("Hello world!");
    }

    private static void helloName(String name) {
        System.out.println("Hello " + name);
    }

    private static void addTogether(int inta, int intb) {
        System.out.println(inta+intb);
    }
}
