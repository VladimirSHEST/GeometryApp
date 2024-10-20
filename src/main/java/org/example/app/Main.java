package org.example.app;


import com.example.utils.GeometryUtils;
import org.example.geometry.Circle;
import org.example.geometry.Rectangle;
import org.example.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

        double lengthInCm = 100;
        double lengthInMeters = GeometryUtils.convertToMeters(lengthInCm, "cm");
        System.out.println("Length in meters: " + lengthInMeters);
    }
}