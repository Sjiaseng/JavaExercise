/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7Q2;

/**
 *
 * @author user
 */
public class Circle implements GeometricObject{
    
    double radius = 1.0;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getPerimeter(){        
        return 2 * Math.PI * radius;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
