import java.util.ArrayList;
import java.util.Scanner;

public class Task016Lesson03Refresh {
    public static void main(String[] args) {
        String[] todoList = new String[3];
        todoList[0] = "Finish code.";
        todoList[1] = "Create presentations.";
        todoList[2] = "Commit to git.";

        for (int i = 0; i < todoList.length; i++) {
            System.out.println(todoList[i]);
        }


        ArrayList<String> todoArrayList = new ArrayList<String>();
        todoArrayList.add("Finish code.");
        todoArrayList.add("Create presentations.");
        todoArrayList.add("Commit to git.");

        for (int i = 0; i < todoArrayList.size(); i++) {
            System.out.println(todoArrayList.get(i));
        }

        for (int i = todoArrayList.size(); i > 0; i--) {
            System.out.println(todoArrayList.get(i - 1));
        }

        Scanner sc = new Scanner(System.in);
        boolean stillAddingToList = true;
        while(stillAddingToList) {
            System.out.print("New item in list: ");
            String newItem = sc.nextLine();
            if (newItem.toUpperCase().equals("FINISHED")) {
                stillAddingToList = false;
            }
            else {
                todoArrayList.add(newItem);
            }
        }
        System.out.println("List completed!");
        System.out.println(todoArrayList);
    }
}
