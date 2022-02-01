package com.Day19;

public class Circle extends Shape{
    private double area;
    private double perimeter;

    @Override
    protected double getArea() {
        return area;
    }
    @Override
    protected double getPerimeter() {
        return perimeter;
    }
}
