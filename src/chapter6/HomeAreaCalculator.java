package chapter6;
/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {
    public static void main(String[] args) {
        /**
         * RECTANGLE 1
         */
        //Create instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("areaOfRoom1 = " + areaOfRoom1);

        /**
         * RECTANGLE 2
         */
        Rectangle room2 = new Rectangle(60,30);
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("areaOfRoom2 = " + areaOfRoom2);

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms: " + totalArea);

    }
}
