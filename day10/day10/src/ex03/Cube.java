package ex03;

public class Cube extends ThrDimShape{
    private double length;
    private double height;
    private double width;

    public Cube() {
        super();
    }

    public Cube(double volume, double length, double height, double width) {
        super(volume);
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public Cube(int x, int y, double width, double length, double height) {
    }

    @Override
    public void calcVolume() {
        volume = length * height * width;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "volume=" + volume +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
