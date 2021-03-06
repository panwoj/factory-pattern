package factory;

public class Rectangle implements Shape {
    final String name;
    final double width;
    final double length;

    public Rectangle(String name, double width, double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return width * length;
    }
}
