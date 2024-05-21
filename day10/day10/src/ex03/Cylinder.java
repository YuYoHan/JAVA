package ex03;

public class Cylinder extends ThrDimShape{
    public static final double PI = 3.141592;
    private double radius;
    private double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double volume, double radius, double height) {
        super(volume);
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(int x, int y, double radius, double height) {
    }

    @Override
    public void calcVolume() {
        volume = PI * radius * radius * height;
    }
}
