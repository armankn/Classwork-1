package Main;

import Circle.Circle;
import Triangle.Triangle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        circle.calculateArea();
        circle.calculatePerimeter();

        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
