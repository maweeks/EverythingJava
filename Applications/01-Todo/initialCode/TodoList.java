import java.util.ArrayList;

public class TodoList {
    private ArrayList<TodoListItem> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public TodoList(ArrayList<TodoListItem> todoList) {
        this.todoList = todoList;
    }

    public int getNumberOfTasks() {
        return todoList.size();
    }

    public void addItem(String title, String description) {
        todoList.add(new TodoListItem(title, description));
    }

    public void prettyPrint() {
        System.out.println("My todo list:");
        for (TodoListItem item : todoList) {
            item.prettyPrint();
        }
    }
}
