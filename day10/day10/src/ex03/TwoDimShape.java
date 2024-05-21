package ex03;

public abstract class TwoDimShape extends Shape{
    protected double area;
    // 추상 메서드
    public abstract void calcArea();

    public TwoDimShape() {
    }

    public TwoDimShape(int x, int y) {
        super(x, y);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
