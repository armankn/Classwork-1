package Circle;
import java.lang.Math;

public class Circle extends Shape {
    private int radius;

    void setRadius(int r) {
        this.radius = r;
    }

    int getRadius() {
        return this.radius;
    }

    double calculateArea() {
        double area;
        area = Math.PI * Math.sqrt(getRadius());
        return area;
    }

    double calculatePerimeter() {
        double perimeter;
        perimeter = 2*Math.PI*getRadius();
        return perimeter;
    }
}
