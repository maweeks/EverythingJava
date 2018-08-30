public class TodoListConsole {
    private static TodoApplication app;
    public static void main(String[] args) {
        app = new TodoApplication();
        app.addTask("Task 1", "Check it works.");
        app.prettyPrint();
    }
}
