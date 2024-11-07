/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW11
 * Name: Andrew Keenan
 * Created: 11-9-23
 */
package keenana;

/**
 * class for the rectangle object
 */
public class Rectangle implements Shape {
    private final int length;
    private final int width;

    /**
     * constructor for the Rectangle
     * @param length length of the rectangle
     * @param width width of the rectangle
     */
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public boolean isSquare(){
        return length == width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return length + length + width + width;
    }
    /**
     * formats the status of the shape
     * @return string of the status of the shape
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (isSquare()){
            sb.append(Color.BLUE.color);
            sb.append("Square \n");
        } else {
            sb.append(Color.RED.color);
            sb.append("Rectangle \n");
        }
        sb.append("length = ").append(length).append("\n");
        sb.append("width = ").append(width).append("\n");
        sb.append("Area = ").append(FORMATTER.format(calculateArea())).append("\n");
        sb.append("Perimeter = ").append(FORMATTER.format(calculatePerimeter())).append("\n");
        sb.append(Color.RESET.color);
        return sb.toString();
    }
}
