package colorable;

import rectangel.Rectangle;
import shape.Shape;
import square.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Shape("red",false);
        shapes[1] = new Square(2.5,"black",true);
        shapes[2] = new Rectangle(1.5,3.0,"pink",false);
        shapes[3] = new Square(4.5,"red",false);
        for (int i=0;i<shapes.length;i++) {
            System.out.println(shapes[i].toString());
            if (shapes[i] instanceof Square) {
                Square square = (Square)shapes[i];
                square.howToColor();
            }
        }
    }
}
