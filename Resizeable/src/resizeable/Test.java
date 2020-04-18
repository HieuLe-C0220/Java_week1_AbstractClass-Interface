package resizeable;

import circle.Circle;
import rectangel.Rectangle;
import square.Square;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Circle circle = new Circle();
//        System.out.println(circle);
//        System.out.println("Nhập phần trăm diện tích muốn tăng lên:");
//        double percent = input.nextDouble();
//        System.out.println("Diện tích sau khi tăng là: "+circle.resize(percent));
//        Rectangle rectangle = new Rectangle(3.5,4.5,"brown",false);
//        System.out.println(rectangle);
//        System.out.println("Nhập phần trăm diện tích muốn tăng lên:");
//        double per = input.nextDouble();
//        System.out.println("Diện tích sau khi tăng là: "+rectangle.resize(per));
        Square square = new Square(3.5,"red",false);
        System.out.println(square);
        double per = Math.random()*100;
        System.out.println("Phần trăm diện tích sẽ tăng lên là: "+per+", diện tích sau khi tăng là: "+square.resize(per));
    }
}
