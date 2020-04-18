package rectangel;

import shape.Shape;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    protected Rectangle() {
    }
    protected Rectangle(double width,double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return this.width*this.length;
    }
    public double getPerimeter() {
        return (this.length +this.width)*2;
    }
    @Override
    public String toString() {
        return "A rectangel.Rectangle with width = "+ getWidth()
                +" and "+ getLength()
                +", the Area is "+getArea()
                +", the Perimeter "+getPerimeter()
                +", which is a subclass of "+super.toString();
    }
}
