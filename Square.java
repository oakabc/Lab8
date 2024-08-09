/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_2;

/**
 *
 * @author chanakarnkin
 */
public class Square extends Rectangle {
    
    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
    
        super(side,side,color,filled);
    }
    
    public double getSide(){
    
        return super.getLength();
    }
    public void setSide(double side){
        
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setWidth(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    
    public String toString() {
    
        return "A Square with side="+getSide()+", which is a subclass of "+super.toString();
    }
}
