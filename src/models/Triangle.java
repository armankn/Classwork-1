package models;

public class Triangle extends Shape {

    private int a, b, c;

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

    public int getC() {
        return this.c;
    }

    public void setC(int C) {
        this.c=C;
    }


    double calculateArea() {
        double area;
        area = 1/2 * (getA() + getB() + getC());
        return area;
    }

    double calculatePerimeter() {
        double perimeter;
        perimeter = getA() + getB() + getC();
        return perimeter;
    }
}
