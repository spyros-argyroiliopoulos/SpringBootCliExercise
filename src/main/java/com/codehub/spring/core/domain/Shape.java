package com.codehub.spring.core.domain;

public abstract class Shape {

     String name;

    public abstract double circumference();

    public abstract double area();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}