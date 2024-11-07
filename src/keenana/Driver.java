/*
 * Course: CS1110 - 131
 * Fall 2023
 * Homework 11
 * Name: Andrew Keenan
 * Last Updated: 11-9-23
 */
package keenana;

import java.util.ArrayList;

/**
 * the driver class for the project
 */
public class Driver {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(4));
        shapes.add(new Rectangle(4,5));
        shapes.add(new Rectangle(6,6));
        for (Shape s: shapes){
            System.out.println(s.toString());
        }
    }
}
