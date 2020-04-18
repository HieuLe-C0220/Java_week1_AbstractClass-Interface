package square;

import colorable.Colorable;
import rectangel.Rectangle;
import shape.Shape;

public class Square extends Shape implements Colorable {
    private double side = 1.0;
    public Square() {
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }
    public double getSide() {
        return this.side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public String toString() {
        return "A square.Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    public void howToColor() {
        System.out.println("Color all over");
    }
}
