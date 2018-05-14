public class Task027Rectangle {
    public int height;
    public int width;

    public Task027Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int area() {
        return height * width;
    }

    public int perimeter() {
        return 2 * (height + width);
    }
}
