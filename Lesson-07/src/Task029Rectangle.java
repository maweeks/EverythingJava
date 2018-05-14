public class Task029Rectangle {
    private int height;
    private int width;

    public Task029Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area() {
        return height * width;
    }

    public int perimeter() {
        return 2 * (height + width);
    }
}
