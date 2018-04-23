import java.util.ArrayList;

public class Task014ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();

        shoppingList.add("Pizza");
        shoppingList.add("Chicken");
        shoppingList.add("Burgers");
        shoppingList.add("Chips");
        shoppingList.add("Cheese");

        System.out.println(shoppingList);

        shoppingList.add("Pasta");
        shoppingList.add("Bread");

        System.out.println(shoppingList);

        shoppingList.remove("Chips");

        System.out.println(shoppingList);

        System.out.println("Use an array when you have a fixed list size, e.g. sorting data etc.");
        System.out.println("Use an ArrayList when you may need to extend the list, e.g. history of actions.");
    }
}
