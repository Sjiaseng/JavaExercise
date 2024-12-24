/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7Q1;

/**
 *
 * @author user
 */
public class MovablePoint implements Movable{
    int x, y, xSpeed, ySpeed;
    
    
    
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
        
        return a + b + c + d;
        
    }
}
