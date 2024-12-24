package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Testing {

    public static void main(String[] args) throws FileNotFoundException, IOException {
            File file = new File("C:/Users/user/Desktop/Java/assignment/Login.txt");
            Scanner scanner = new Scanner(file);
            int count = 0;
            int line = 0;
            
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                count++;
            }
            scanner.close();
            
            System.out.println(count/6+1);
                   
    }
}