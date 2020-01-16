package models;

public class Pointer {

    private int x1, y1, x2, y2;

    public int getX1() {
        return this.x1;
    }

    public void setX1(int X1) {
        this.x1=X1;
    }

    public int getY1() {
        return this.y1;
    }

    public void setY1(int Y1) {
        this.y1=Y1;
    }

    public int getX2() {
        return this.x2;
    }

    public void setX2(int X2) {
        this.x2=X2;
    }

    public int getY2() {
        return this.y2;
    }

    public void setY2(int Y2) {
        this.y2=Y2;
    }


    double distance() {

        double distance;
        distance = Math.sqrt((getX1()-0)*(getX1()-0) + (getY1()-0)*(getY1()-0));
        return distance;
    }

    double distance(int x, int y) {
        double distance;
        double a,b;
        a= getX2()-getX1()* (getX2()-getX1());
        b= getX2()-getX1()* (getX2()-getX1());
        distance = Math.sqrt(a*a + b*b);
        return distance;
    }
}
