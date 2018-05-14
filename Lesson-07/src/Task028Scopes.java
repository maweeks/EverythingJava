public class Task028Scopes {
    public static void main(String[] args) {
        Task028Secondary test = new Task028Secondary("a");

        // System.out.println(test.privateVar); // Will fail to compile when trying to access a private variable / method.
        System.out.println(test.publicVar);

        // System.out.println(test.privateMethod()); // Will fail to compile when trying to access a private variable / method.
        System.out.println(test.publicMethod());

        breakOutput();

        System.out.println("Scopes should be used to restrict availability of information and allow the ability to check that the data is valid before storing it.");
    }

    public static void breakOutput() {
        System.out.println("\n-------------------------------\n");
    }
}
