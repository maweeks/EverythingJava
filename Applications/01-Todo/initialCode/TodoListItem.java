public class TodoListItem {
    private String title;
    private String description;

    public TodoListItem() {}

    public TodoListItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void prettyPrint() {
        System.out.println(title + " - " + description);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
