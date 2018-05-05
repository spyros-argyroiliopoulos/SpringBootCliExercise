package com.codehub.spring.core.domain.basic;

public class Point {

    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double setX(double x) {
        this.x = x;
        return this.x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public String printYourCoordinates() {
        return "X= " + this.x + ", Y= " + this.y;
    }
}
