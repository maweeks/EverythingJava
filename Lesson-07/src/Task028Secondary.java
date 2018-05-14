public class Task028Secondary {
    private String privateVar;
    public String publicVar;

    public Task028Secondary(String variable) {
        this.privateVar = variable;
        this.publicVar = variable;
    }

    private String privateMethod() {
        return "private";
    }

    public String publicMethod() {
        return "public";
    }
}
