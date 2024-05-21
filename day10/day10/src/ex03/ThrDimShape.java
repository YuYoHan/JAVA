package ex03;

public abstract class ThrDimShape extends Shape{
    protected double volume;

    public ThrDimShape(double volume) {
    }

    public abstract void calcVolume();

    public ThrDimShape() {
        super();
    }

    public ThrDimShape(int x, int y) {
        super(x, y);
    }

    public double getVolume() {
        return volume;
    }

}
