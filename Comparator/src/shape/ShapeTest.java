package shape;

import circle.Circle;
import rectangel.Rectangle;
import shape.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);
        Shape sh = new Circle(10,"pink",false);//Ép kiểu ngầm định
        System.out.println(sh);
        Object o = new Circle(15,"orange",false);//Ép kiểu ngầm định
        System.out.println(o);
        Shape rec = new Rectangle(6,8,"nâu",false);
        System.out.println(rec);
        Circle c = (Circle)sh;//Ép kiểu tường minh
        System.out.println(c);
    }
}
