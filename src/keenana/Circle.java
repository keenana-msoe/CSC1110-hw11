/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW11
 * Name: Andrew Keenan
 * Created: 11-9-23
 */
package keenana;

/**
 * class for the circle object
 */
public class Circle implements Shape {
    private final int radius;

    /**
     * public constructor for the Circle
     * @param radius the radius of the circle
     */
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.pow((double) radius, 2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }
    /**
     * formats the status of the shape
     * @return string of the status of the shape
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(Color.GREEN.color).append("Circle \n");
        sb.append("radius = ").append(radius).append("\n");
        sb.append("area = ").append(FORMATTER.format(calculateArea())).append("\n");
        sb.append("perimeter = ").append(FORMATTER.format(calculatePerimeter())).append("\n");
        sb.append(Color.RESET.color);
        return sb.toString();
    }

    /**
     * overriding the equals method
     * @param o the object passed in
     * @return if it is equal to this instance of Circle
     */
    public boolean equals(Object o){
        if(!(o instanceof Circle)){
            return false;
        } else if (o == this){
            return true;
        } else {
            return radius == ((Circle) o).radius;
        }
    }
}
