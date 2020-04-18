package rectangel;

import rectangel.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(6.5,8.5);
        System.out.println(rectangle);
        rectangle = new Rectangle(10,12.5,"yellow",false);
        System.out.println(rectangle);
    }
}
