package javaapplication4;
import java.util.Scanner;
import java.util.Arrays;

public class JavaApplication4 {

    public static void main(String[] args) {
        question3c();
    }
    
    static void question1(){
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter total numbers to read:");
        int amount = scanner.nextInt();
        
        int[] number = new int[amount];
        
        for (int i = 0 ; i < amount ; i++){
            System.out.println("Enter " + amount + " numbers:");
            int numb = scanner.nextInt();
            
            number[i] = numb;
                       
        }
        
        int productnumber = 0;
        int productresult = 0;
        
        for (int j = 0 ; j < number.length ; j++){
            
            if (j == 0){
                productnumber = number[j];
            }
            else{
                productresult = productnumber * number[j];
                
            }
        }
        
        System.out.println("Result is: " + productresult);
        
    }
    
    static void question2(){
        Scanner scanner= new Scanner(System.in);
        
        int oddnumber = 0;
        int evennumber = 0; 
        
        System.out.println("Enter total numbers to read:");
        int amount = scanner.nextInt();
        
        int[] number = new int[amount];
        
        for (int i = 0 ; i < amount ; i++){
            System.out.println("Enter " + amount + " numbers:");
            int numb = scanner.nextInt();
            
            number[i] = numb;
                       
        }
        for (int j = 0 ; j < number.length ; j++){
            if (number[j] % 2 ==0){
                evennumber++;
            }
            else{
                oddnumber++;
            }
        }
        
        System.out.println("Total even number: " + evennumber);
        System.out.println("Total odd number: " + oddnumber);
    }
    
    // question 3 starts here
    static void question3a(){
        Scanner scanner = new Scanner(System.in);
        
        int[] A = new int[6];
        int[] B = new int[6];
        
        for (int i = 0 ; i < 6 ; i++){
            System.out.println("Enter 6 numbers:");
            int numb = scanner.nextInt();
            
            A[i] = numb;
                       
        }
              
        for (int j = 0 ; j < 6 ; j++){
            if (j==0){
                B[0] = A[0];
            }
            else {
                B[j] = B[j-1] + A[j];
            }
        }
        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
    
    static void question3b(){
        Scanner scanner = new Scanner(System.in);
        
        int[] A = new int[6];
        int[] C = new int[5];
        
        for (int i = 0 ; i < 6 ; i++){
            System.out.println("Enter 6 numbers:");
            int numb = scanner.nextInt();
            
            A[i] = numb;
                       
        }
        
        for (int i = 0 ; i < 5 ; i++){
            C[i] = A[i+1] - A[i];
 
        }
        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(C));
    }
    
    static void question3c(){
        Scanner scanner = new Scanner(System.in);
        
        int[] A = new int[6];
        int[] D = new int[4];
        
        for (int i = 0 ; i < 6 ; i++){
            System.out.println("Enter 6 numbers:");
            int numb = scanner.nextInt();
            
            A[i] = numb;
                       
        }
        
        for (int i = 0 ; i < 4; i++){
            D[i] = (A[i] + A[i+1] + A[i+2])/3;
 
        }
        
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(D));  
    }
    
}
