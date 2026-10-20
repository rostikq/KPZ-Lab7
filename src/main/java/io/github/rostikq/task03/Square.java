package io.github.rostikq.task03;

public class Square implements Shape {
    private final double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side must be positive");
        }
        this.side = side;
    }

    public double getSide() { return side; }

    @Override
    public double getArea() {
        return side * side;
    }
}