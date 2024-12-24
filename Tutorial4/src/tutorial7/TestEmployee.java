/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7;

/**
 *
 * @author user
 */
public class TestEmployee {
    public static void main(String[] args) {
        FullTime ft = new FullTime("FullTime", 40, 700);
        PartTime pt = new PartTime("PartTime", 6, 5.5);
        Assistant ast = new Assistant ("Assistant", 2);
        
        System.out.println("FullTime Salary: " + ft.CalcSalary());
        System.out.println("PartTime Salary: " + pt.CalcSalary());
        System.out.println("Assistant Salary: " + ast.CalcSalary());   
    }
    
}