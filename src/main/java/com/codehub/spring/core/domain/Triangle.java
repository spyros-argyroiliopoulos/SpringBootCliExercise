package com.codehub.spring.core.domain;

import com.codehub.spring.core.domain.basic.Line;
import com.codehub.spring.core.domain.basic.Point;


public class Triangle extends Shape {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.name = "Quadrilateral Triangle";
    }

    @Override
    public double circumference() {
        double aLength = new Line(pointB, pointC).distance();
        double bLength = new Line(pointA, pointC).distance();
        double cLength = new Line(pointA, pointB).distance();
        return aLength + bLength + cLength;
    }

    @Override
    public double area() {
        double[][] matrix = {{pointB.getX() - pointA.getX(), pointB.getY() - pointA.getY()},
                            {pointC.getX() - pointA.getX(), pointC.getY() - pointA.getY()}};
        double det = ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
        return Math.abs(det) * 0.5;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
