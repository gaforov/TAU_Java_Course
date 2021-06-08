package chapter11;

public class ShapeTest {

    public static void main(String[] args) {

        Shape rectangle = new Shape() {  // HOW WAS THIS POSSIBLE? Abstract is not supposed to instantiate
            @Override
            double calculateArea() {
                return 0;
            }
        };

        rectangle.print();
        System.out.println(rectangle.calculateArea());

        Shape rectangle2 = new Rectangle(10,5);
        rectangle2.print();
        System.out.println(rectangle2.calculateArea());


    }
}
