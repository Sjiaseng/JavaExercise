/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7;

/**
 *
 * @author user
 */
public class PartTime extends Employee {
    
    double hourlyRate;
    
    public double CalcSalary(){
        return hourlyRate * hoursWorked;
    }
    
    PartTime(String name, int noh, double rate){
        this.name = name;
        this.hoursWorked = noh;
        this.hourlyRate = rate;
    }
    
    
    
    
    
}
