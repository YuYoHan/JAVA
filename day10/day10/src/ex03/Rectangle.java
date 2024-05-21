package ex03;

public class Rectangle extends TwoDimShape{
    private double width;
    private double length;

    public Rectangle() {
        super();
    }

    public Rectangle(int x, int y, double width, double length) {
        super(x, y);
        this.width = width;
        this.length = length;
    }

    @Override
    public void calcArea() {
        area = width * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
