package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {
    
    // execute question here
    public static void main(String[] args) {
        question1();
    }
    
    static void question1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0 ){
            System.out.println("Is " + number + " an even number? True");
        }
        else{
            System.out.println("Is " + number + " an even number? False");
        }
    }
    
    static void question2(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Side A: ");
            int sideA = scanner.nextInt();
            System.out.println("Enter Side B: ");
            int sideB = scanner.nextInt();
            System.out.println("Enter Side C: ");
            int sideC = scanner.nextInt();
            
            int perimeter = sideA + sideB + sideC;
            
            System.out.println("Perimeter is: " + perimeter + "cm");
            
            if (sideA + sideB > sideC){
                System.out.println("Number Exists!");
            }
            else if (sideA + sideC > sideB){
                System.out.println("Number Exists!");
            }
            else if (sideB + sideC > sideA){
                System.out.println("Number Exists!");
            }
            else if (sideA + sideB + sideC <= 0){
                System.out.println("Number doesn't Exists!");
            }

        }
        catch (Exception e){
            System.out.println("Input Invalid");
        }
        
    }
    
    
    static void question3(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the month:");
        int month = scanner.nextInt();
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        
        String nameofmonth = "";
        int numberofday = 0;
        
        switch(month){
            case 1 : 
                nameofmonth = "January";
                numberofday= 31;
                break;
            
            case 2 :
                nameofmonth = "February";
                if (year % 4 == 0){
                    numberofday = 29;
                }
                else{
                    numberofday = 28;
                }
                break;
            
            case 3 :
                nameofmonth = "March";
                numberofday = 31;
                break;
               
            case 4 :
                nameofmonth = "April";
                numberofday = 30;
                break;
            
            case 5 :
                nameofmonth = "May";
                numberofday = 31;
                break;
        
            case 6 :
                nameofmonth = "June";
                numberofday = 30;
                break;
            
            case 7 :
                nameofmonth = "July";
                numberofday = 31;
                break;
            
            case 8 :
                nameofmonth = "August";
                numberofday = 31;
                break;
                
            case 9 :
                nameofmonth = "September";
                numberofday = 30;
                break;
            
            case 10 :
                nameofmonth = "October";
                numberofday = 31;
                break;
             
            case 11 :
                nameofmonth = "November";
                numberofday = 30;
                break;
                
            case 12 :
                nameofmonth = "December";
                numberofday = 31;
                break;
        }
        
        System.out.println("The date of " + nameofmonth + " " + year + " : ");
        System.out.println("Has " + numberofday + " days");
    }
    
    static void question4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Assignment Mark: ");
        int mark = scanner.nextInt();
        
        if (mark >= 0 && mark <=40){
            System.out.println("Grade F : Fail");
        }
        else if (mark >= 40 && mark <=49){
            System.out.println("Grade F+ : Marginal Fail");
        }
        else if (mark >= 50 && mark <=54){
            System.out.println("Grade D : Pass");
        }
        else if (mark >= 55 && mark <=64){
            System.out.println("Grade C : Pass");
        }
        else if (mark >= 65 && mark <=69){
            System.out.println("Grade B : Credit");
        }
        else if (mark >= 70 && mark <=74){
            System.out.println("Grade B+ : Credit");
        }
        else if (mark >= 75 && mark <=79){
            System.out.println("Grade A : Distinction");
        }
        else if (mark >= 80 && mark <=100){
            System.out.println("Grade A+ : Distinction");
        }
        else{
            System.out.println("Invalid Marks Entered!");
        }
    }
    
}