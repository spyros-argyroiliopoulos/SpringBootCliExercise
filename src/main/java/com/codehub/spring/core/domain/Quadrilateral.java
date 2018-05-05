package com.codehub.spring.core.domain;

import com.codehub.spring.core.domain.basic.Line;

public class Quadrilateral extends Shape {

    private Line sideA;
    private Line sideB;

    public Quadrilateral(Line sideA, Line sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.name = "Quadrilateral";
    }

    @Override
    public double circumference() {
        double aLength = this.sideA.distance();
        double bLength = this.sideB.distance();
        return 2 * aLength + 2 * bLength;
    }

    @Override
    public double area() {
        double aLength = this.sideA.distance();
        double bLength = this.sideB.distance();
        return aLength * bLength;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Line getSideA() {
        return sideA;
    }

    public void setSideA(Line sideA) {
        this.sideA = sideA;
    }

    public Line getSideB() {
        return sideB;
    }

    public void setSideB(Line sideB) {
        this.sideB = sideB;
    }
}
