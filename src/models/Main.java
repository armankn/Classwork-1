package models;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimeter();

        Triangle triangle = new Triangle();
        triangle.calculateArea();
        triangle.calculatePerimeter();

        Pointer pointer = new Pointer();
        pointer.setX1(4);
        pointer.setY1(3);
        System.out.println("Distance from P1 to 0 is " + pointer.distance());
        System.out.println("Distance from P1 to given P2 is " + pointer.distance(4,-3));
    }
}
