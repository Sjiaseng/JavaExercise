/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7;

/**
 *
 * @author user
 */
public class FullTime extends Employee implements SalaryCalculation{ 
//implements more than 1 interface also can (use "," )
    
    public double CalcSalary(){
        salary = 800;
        return salary;
    }
    
    FullTime(String name, int noh, double sal){
        this.name = name;
        this.hoursWorked= noh;
        this.salary = sal;
    }
    
    
    
        
}
