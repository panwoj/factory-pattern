package factory;

public final class Circle implements Shape {
    final String name;
    final double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.PI * Math.pow(radius, 2.0);
    }
}
