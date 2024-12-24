/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7Q2;

/**
 *
 * @author user
 */
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius){
        super(radius);
    }
    
    public int resize(int percent){
        return percent;
    }
}
