/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7Q1;

/**
 *
 * @author user
 */
public class MovableCircle implements Movable {
    int radius, x, y, xSpeed, ySpeed;
    
    public MovablePoint center;
    
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
        this.radius = radius;
    }
    
    public void moveUp(){
        System.out.println("Moving Up");
    }
    
    public void moveDown(){
         System.out.println("Moving Down");
    }
    
    public void moveLeft(){
         System.out.println("Moving Left");
    }
    
    public void moveRight(){
         System.out.println("Moving Right");
    }
    

    public String toString(){
        String a = Integer.toString(x);
        String b = Integer.toString(y);
        String c = Integer.toString(xSpeed);
        String d = Integer.toString(ySpeed);
        String e = Integer.toString(radius);
        
        return a + b + c + d + e + center;
        
    }
 
    
    
}
