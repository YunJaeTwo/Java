package java_basic.lecture3;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.assign(7,9);
        rectangle.area = rectangle.rectangleArea();
        rectangle.perimeter = rectangle.rectanglePerimeter();
        rectangle.isSquare();
    }
}
