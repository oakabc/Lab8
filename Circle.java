/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_2;

/**
 *
 * @author chanakarnkin
 */
public class Circle extends Shape {
    
    // Instance Variable
    private double radius;
    
    public Circle(){}
    
    public Circle (double radius) {
    
        this.radius = radius;
    }
    public Circle (double radius, String color, boolean filled){
    
        super(color,filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
      
        return Math.PI * Math.pow(getRadius(),2);
    }

    @Override
    public double getPerimeter() {
    
        return 2*Math.PI*getRadius();
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public String toString() {
    
    return "A Circle with radius= "+getRadius()+ ", which is a subclass of "+super.toString();
    
    }
    
}
