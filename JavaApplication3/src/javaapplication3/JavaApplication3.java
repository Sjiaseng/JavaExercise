package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        question4();
    }
    
    static void question1(){
        
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        
        try{
            for (int i = 0 ; i < 5 ; i++){
                System.out.print("Enter a number:");
                int number = scanner.nextInt(); 

                if (i == 0){
                    result = number;
                }
                else if (number > result){
                    result = number;
                }
            }
            System.out.println (result + " is the largest number!");
        }
        catch(Exception e){
            System.out.println("Only integers are accepted!");
        }
    }
    
    static void question2(){
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int small = 0;
        int middle = 0;
        int large = 0;
        
        try{
            for (int i = 0 ; i < 10 ; i++){
                System.out.print("Enter a number:");
                int x = scanner.nextInt(); 
                
                total += x;
                
                if ( x > 100){
                    large += 1;
                }
                else if (x < 0){
                    small += 1; 
                }
                else{
                    middle += 1;
                }
            }
            System.out.println("Total: "+ total);
            System.out.println("Large: "+ large);
            System.out.println("Middle: "+ middle);
            System.out.println("Small: "+ small);
        }
        catch(Exception e){
            System.out.println("Only integers are accepted!");
        }
    }
    
    static void question3(){
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        int number;
        try{
            do{
                System.out.print("Enter a number:");
                number = scanner.nextInt();
                if (number < 0){
                    break;
                }
                result *= number;
            }while(number > 0);

            System.out.println("The total product is: " + result);
            }
        catch (Exception e){
            System.out.println("Only integers are accepted");
        }
    }
    
    static void question4(){
        Scanner scanner = new Scanner(System.in);
        int number;
        int result = 0;
        int average = 0;
        int averageresult=0;
        int largest=0;
        int smallest=0;
        
        try{
            for (int i = 1 ; i < 999 ; i++){
                System.out.print("Enter marks:");
                number = scanner.nextInt(); 

                if (number == -1){
                    System.out.println("Average is: " + average);
                    System.out.println("Largest is : " + largest);
                    System.out.println("Smallest is : " + smallest);
                    break;
                }
                else{            
                    average = (averageresult += number)/i;

                    if ( i == 1){
                        result = number;
                        largest = number;
                        smallest = number;
                    }
                    else if (number > largest){
                        largest = number;
                    }
                    else if (number < smallest){
                        smallest = number;
                    }
                }
            }
        }
        catch (Exception e){
            System.out.println("Only integers are accepted!");
        }
    }
    
    static void question5a(){
        
        for (int i = 1 ; i < 6 ; i++ ){
            for (int j = 0 ; j<i ; j++){
            System.out.print(i);
            }
            System.out.println();
        }
    }
    
    static void question5b(){
        
        for (int i = 1; i < 6; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(' ');
        }
        for (int k = 0; k < i; k++) {
            System.out.print('*');
      }
        System.out.println();
      }
    }
}
