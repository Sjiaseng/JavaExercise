package javaapplication1;
import java.util.Scanner;
import java.lang.Math;
import java.util.*;

public class JavaApplication1 {
    
    //change according to function
    public static void main(String[] args) {
        question0();
    }
    
    //demo question
    static void question0(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Feet:");
        double feet = scanner.nextDouble();
        
        double result = feet * 0.305;
        
        System.out.println(result + " Meter");
    }
    
    static void question1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celcius = (fahrenheit - 32) * 5/9;
        System.out.println("Answer is: " + celcius + " Celcius");
        
    }
    
    static void question2(){
        Scanner scanner = new Scanner(System.in);
        double PI = 3.142;
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();
        System.out.println("Enter length");
        double length = scanner.nextDouble();
        
        double area = radius * radius * PI;
        double volume = area * length;
        
        System.out.println("Area is: " + area);
        System.out.println("Volume is: " + volume);
    }

    static void question3 (){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter a number between 0 to 1000: ");
        int number = scanner.nextInt();
        
        System.out.println(number);
        
        if (number <= 0 || number >= 1000){
            System.out.println("Number doesn't exist!");
        }
        else{
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            
            System.out.println("Total sum is: " + sum);
        }

    }
    
    static void question4(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String result = scanner.nextLine();
        System.out.println(result.toLowerCase());
        
    }
    
    static void question5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an ASCII Code:");
        
        int ASCII = scanner.nextInt();
        
        char character = (char) ASCII;
        
        System.out.print("The character is: " + character + "\n");
    }
    
    static void question6(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = number % 2;
        
        if (result == 0){
            System.out.println("Is " + result + " an even number? True");
        }
        else{
            System.out.println("Is " + result + " an even number? False");
        }
    }
    
    static void question7(){      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        int division5 = number % 5;
        int division6 = number % 6;
        
        if (division5 == 0 && division6 == 0){
            System.out.println("Is "+ number + " divisible by 5 or 6? true");
        }
        else if (division5 == 0 && division6 != 0){
            System.out.println("Is "+ number + " divisible by 5 or 6 but not both? true");
        }
        else if (division5 != 0 && division6 == 0){
            System.out.println("Is "+ number + " divisible by 5 or 6 but not both? true");
        }
        else{
            System.out.println("Is "+ number + " divisible by 5 or 6? false");
        }

    }
    
    static void question8(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter investment amount:");
        double investmentamount = scanner.nextDouble();
        
        System.out.println("Enter yearlylyinterest rate:");
        double annuallyinterestrate = scanner.nextDouble();
        
        double monthlyinterestrate = annuallyinterestrate / 12;
        
        System.out.println("Enter number of years:");
        double numberofyears = scanner.nextDouble();
        
        double futureinvestmentvalue = investmentamount *(Math.pow(1 + monthlyinterestrate, numberofyears * 12));
        
        System.out.println(futureinvestmentvalue);
    }
        
    }
