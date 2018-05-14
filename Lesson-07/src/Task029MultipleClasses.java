public class Task029MultipleClasses {

    public static void main(String[] args) {
        Task029Person person1 = new Task029Person("Bill", 140);

        System.out.println("Name: " + person1.getName());
        System.out.println("Height: " + person1.getHeight() + "cm");

        breakOutput();

        Task029Vehicle vehicle1 = new Task029Vehicle("BMW", "S1100RR", 2, 193);
        Task029Vehicle vehicle2 = new Task029Vehicle("Chevrolet", "Camero ZL1", 4, 650);
        Task029Vehicle vehicle3 = new Task029Vehicle("Ford", "Mustang", 4, 480);

        System.out.println("Make: " + vehicle1.getMake());
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Wheels: " + vehicle1.getWheels());
        System.out.println("BHP: " + vehicle1.getBhp());
        System.out.println();
        System.out.println("Make: " + vehicle2.getMake());
        System.out.println("Model: " + vehicle2.getModel());
        System.out.println("Wheels: " + vehicle2.getWheels());
        System.out.println("BHP: " + vehicle2.getBhp());
        System.out.println();
        System.out.println("Make: " + vehicle3.getMake());
        System.out.println("Model: " + vehicle3.getModel());
        System.out.println("Wheels: " + vehicle3.getWheels());
        System.out.println("BHP: " + vehicle3.getBhp());

        breakOutput();

        Task029Rectangle rectangle1 = new Task029Rectangle(5, 8);
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.perimeter());
    }

    public static void breakOutput() {
        System.out.println("\n-------------------------------\n");
    }
}
