package square;

import square.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(3.6);
        System.out.println(square);
        square = new Square(5.8,"black",false);
        System.out.println(square);
    }
}
