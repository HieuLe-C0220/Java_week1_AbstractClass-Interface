package circle;

import shape.Shape;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle() {
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI*radius*radius;
    }
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
    @Override
    public String toString() {
        return "A circle.Circle with radius = "+ getRadius()
                +", the Area is "+getArea()
                +", the Perimeter "+getPerimeter()
                +", which is a subclass of "+super.toString();
    }
}
