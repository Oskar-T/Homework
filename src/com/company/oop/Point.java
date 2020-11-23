package com.company.oop;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean isOnTheX(double x) {
        return x == 0;
    }

    public String toString() {
        return ("Point has coordinates x:" + x + " y:" + y);
    }

    public boolean ifHasSameCoordinates(Point a, Point b) {
        boolean xIsEqual = a.x == b.x;
        boolean yIsEqual = a.y == b.y;
        return xIsEqual && yIsEqual;
    }

    public static double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow((a.x-b.x), 2) + Math.pow((a.y - b.y), 2));
    }

    public static boolean isInUnitCircle(Point a) {
        return Math.pow(a.x, 2) + Math.pow(a.y, 2) == 1;
    }

    public static Point middlePoint(Point a, Point b) {
       return new Point((a.x + b.x)/2, (a.y + b.y)/2);
    }



}
