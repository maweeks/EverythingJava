public class Task013Arrays {
    public static void main(String[] args) {
        String[] shoppingList  = new String[5];
        shoppingList[0] = "Pizza";
        shoppingList[1] = "Chicken";
        shoppingList[2] = "Burgers";
        shoppingList[3] = "Chips";
        shoppingList[4] = "Cheese";

        int[] numbers = new int[5];
        numbers[0] = 73;
        numbers[1] = 13;
        numbers[2] = 7;
        numbers[3] = 3;
        numbers[4] = 1024;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("You cannot extend arrays, you must create a new one a copy the values over.");

        int[] numbers2 = new int[numbers.length + 1];

        System.arraycopy(numbers, 0, numbers2, 0, numbers.length);

        numbers2[5] = 123;

        System.out.println(numbers2[0]);
        System.out.println(numbers2[1]);
        System.out.println(numbers2[2]);
        System.out.println(numbers2[3]);
        System.out.println(numbers2[4]);
        System.out.println(numbers2[5]);
    }
}
