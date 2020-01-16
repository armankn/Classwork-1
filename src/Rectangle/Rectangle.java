package Rectangle;

public class Rectangle extends Shape {

    private int a, b;

    public int getA() {
        return this.a;
    }

    public void setA(int A) {
        this.a=A;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int B) {
        this.b=B;
    }

    double calculateArea() {
        double area;
        area = 1/2 * (getA() + getB());
        return area;
    }

    double calculatePerimeter() {
        double perimeter;
        perimeter = 2 * (getA() + getB());
        return perimeter;
    }
}
