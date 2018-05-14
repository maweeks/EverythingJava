public class Task027MultipleClasses {

    public static void main(String[] args) {
        Task027Person person1 = new Task027Person("Bill", 140);

        System.out.println("Name: " + person1.name);
        System.out.println("Height: " + person1.height + "cm");

        breakOutput();

        Task027Vehicle vehicle1 = new Task027Vehicle("BMW", "S1100RR", 2, 193);
        Task027Vehicle vehicle2 = new Task027Vehicle("Chevrolet", "Camero ZL1", 4, 650);
        Task027Vehicle vehicle3 = new Task027Vehicle("Ford", "Mustang", 4, 480);

        System.out.println("Make: " + vehicle1.make);
        System.out.println("Model: " + vehicle1.model);
        System.out.println("Wheels: " + vehicle1.wheels);
        System.out.println("BHP: " + vehicle1.bhp);
        System.out.println();
        System.out.println("Make: " + vehicle2.make);
        System.out.println("Model: " + vehicle2.model);
        System.out.println("Wheels: " + vehicle2.wheels);
        System.out.println("BHP: " + vehicle2.bhp);
        System.out.println();
        System.out.println("Make: " + vehicle3.make);
        System.out.println("Model: " + vehicle3.model);
        System.out.println("Wheels: " + vehicle3.wheels);
        System.out.println("BHP: " + vehicle3.bhp);

        breakOutput();

        Task027Rectangle rectangle1 = new Task027Rectangle(5, 8);
        System.out.println(rectangle1.height);
        System.out.println(rectangle1.width);
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.perimeter());
    }

    public static void breakOutput() {
        System.out.println("\n-------------------------------\n");
    }
}
