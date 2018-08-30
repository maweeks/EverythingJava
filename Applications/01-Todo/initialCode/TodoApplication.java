public class TodoApplication {
    private TodoList todoList;
    public TodoApplication() {
        todoList = new TodoList();
    }

    public void addTask(String title, String description) {
        todoList.addItem(title, description);
    }

    public void prettyPrint() {
        todoList.prettyPrint();
    }
}
