package models;

public class Pointer {

    private int x1, y1;

    int getX1() {

        return this.x1;
    }

    void setX1(int X1) {

        this.x1=X1;
    }

    int getY1() {

        return this.y1;
    }

    void setY1(int Y1) {

        this.y1=Y1;
    }


    double distance() {
        double distance;
        distance = Math.sqrt(Math.pow(getX1(),2) + Math.pow(getY1(),2));
        return distance;
    }

    double distance(int x, int y) {
        double distance;
        distance = Math.sqrt(Math.pow(x-getX1(),2) + Math.pow(y-getY1(),2));
        return distance;
    }
}
