/*
 * Course: CS1110 - 131
 * Fall 2023
 * Homework 11
 * Name: Andrew Keenan
 * Last Updated: 11-9-23
 */
package keenana;

import java.text.DecimalFormat;

/**
 * the shape interface for the circles and rectangles
 */
public interface Shape {
    /**
     * the constant decimal format that is used throughout the program
     */
    public final static DecimalFormat FORMATTER = new DecimalFormat("#.##");

    /**
     * calculates the area for the shape
     * @return the area as a double
     */
    public abstract double calculateArea();

    /**
     * calculates the perimeter of the shape
     * @return perimeter in form of a double
     */
    public abstract double calculatePerimeter();

    /**
     * formats the status of the shape
     * @return string of the status of the shape
     */
    public abstract String toString();

}
