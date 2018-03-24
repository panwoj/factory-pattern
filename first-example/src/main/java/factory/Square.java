package factory;

public class Square implements Shape {
    final String name;
    final double width;

    public Square(String name, double width) {
        this.name = name;
        this.width = width;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(width, 2.0);
    }
}
