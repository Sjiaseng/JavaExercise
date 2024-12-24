/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial9;

/**
 *
 * @author user
 */
public class Lab9Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        try{
            int [] myArray = new int[100];
            for (int i = 0; i<100; i++){
                myArray[i] = (int) Math.random() * 1000;
            }
            for (int i:myArray){
              System.out.println("MyArray: ["+i+"]: "+ myArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds!");

        }
    }
    
}
