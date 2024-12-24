package javaapplication6;
import java.util.Scanner;


public class JavaApplication6 {

    public static void main(String[] args) {
        
    }
    
}

class Account{
    protected double balance;
    
    public Account(double balance){
        
        if(balance>=0){
            this.balance = balance;
        } 
        else{
            this.balance = 0.0;
            System.out.println("Invalid initial balance!");
        }
    }
    
    public void deposit(double amount){
        if (amount > 0 ){
            balance += amount;
        }
        else{
            System.out.println("Unable to deposit negative numeber!");
        }
    }
    
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
        } else{
            System.out.println("Withdrawal amount exceeded account balance!");
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double amount){
        this.balance = amount;
    }
}

class SavingAccount extends Account{
    private double interestRate;
    
    SavingAccount(double balance, double interest){
        super(balance);
        interestRate = interest;     
    }
    
    public double calculateInterest(){
        return balance * interestRate;
    }
}

