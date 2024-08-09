/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_2;

/**
 *
 * @author chanakarnkin
 */
public class Rectangle extends Shape {
    
    // Instance Variables
    private double length;
    private double width;

    public Rectangle () {
    
        this(0,0);
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    public Rectangle (double length, double width, String color, boolean filled){
    
        super(color,filled);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
    
        return width * getLength();
    }

    @Override
    public double getPerimeter() {
    
        return 2 * width + 2 * getLength();
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public String toString(){
    
        return "A Rectangle with width= "+ getWidth() +" and length= "+getLength()+", which is a subclass of "+super.toString();
    }
    
}
