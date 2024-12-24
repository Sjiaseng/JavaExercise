package javaapplication7;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;  
import java.io.FileNotFoundException;

public class JavaApplication7 {
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        LocalDateTime localDate = LocalDateTime.now();
        
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        
            // use .toString() function to convert into string data.
        
        while (true){
            System.out.println("1. Write File");
            System.out.println("2. Read File");
            System.out.println("3. Exit");
            System.out.print("Enter your Options:");
            
            int option = scanner.nextInt();

            if (option == 1){
                Scanner scanner2 = new Scanner(System.in);
                    
                for (int i = 1 ; i <=5 ; i++ ){
                    System.out.println("Enter Annual Interest Rate [" + i + "] :");
                    double annualInterestRate = scanner2.nextDouble();
                    System.out.println("Enter Loan Amount [" + i + "] :");
                    double loanAmount = scanner2.nextDouble();
                    System.out.println("Enter Number of Years [" + i + "] :");
                    int numberOfYears = scanner2.nextInt();

                    Loan loan = new Loan(annualInterestRate, loanAmount, numberOfYears, dateformatter.format(localDate));
                       
                    FileWriter fw = new FileWriter("C:/Users/user/Desktop/Netbeans/JavaApplication7/src/javaapplication7/Loan.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                    bw.newLine();
                    bw.write("Annual Interest Rate:" + loan.getAnnualInterestRate() + "\n");
                    bw.write("Loan Amount:" + loan.getLoanAmount() + "\n");
                    bw.write("Number of Years:" + loan.getNumberOfYears() + "\n");
                    bw.write("Date:" + loan.getLoanDate()+ "\n");
                    bw.write("Total Payment:" + loan.getTotalPayment()+ "\n");
                    bw.write("Monthly Payment:" + loan.getMonthlyPayment()+ "\n");
                    bw.newLine();
                    
                    bw.close();
                }      
            }
            else if (option == 2){
                File loanfile = new File("C:/Users/user/Desktop/Netbeans/JavaApplication7/src/javaapplication7/Loan.txt");
                Scanner myReader = new Scanner(loanfile);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }     
      myReader.close();
            }
            
            else if (option == 3){
                break;
            }
            else{
                System.out.println("Invalid Options Please Try Again!");
            }    
        }
        
        //System.out.println(dateformatter.format(localDate));
        
    }
    
}


class Loan{
    private double annualInterestRate, loanAmount, totalPayment, monthlyPayment;
    private int numberOfYears;  
    private String loanDate;
    
    public Loan(double annualInterestRate, double loanAmount, int numberOfYears, String loanDate){
        this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
        this.loanDate = loanDate;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public int getNumberOfYears(){
        return numberOfYears;
    }
    
    public double getLoanAmount(){
        return loanAmount;
    }
    
   public String getLoanDate(){
        return loanDate;
    }
   
   public void setAnnualInterestRate(double annualInterestRate){
       this.annualInterestRate = annualInterestRate;
   }
   
   public void setNumberOfYears(int numberOfYears){
       this.numberOfYears = numberOfYears;
   }
   
   public void setLoanAmount(double loanAmount){
       this.loanAmount = loanAmount;
   }
   
   public double getTotalPayment(){
       return totalPayment = loanAmount + (annualInterestRate/numberOfYears) / 12;
   }
   
   public double getMonthlyPayment(){
       return monthlyPayment = (totalPayment/numberOfYears) /12 ;
   }
   
   public void display(){
       System.out.println("Annual Interest Rate:" + annualInterestRate);
       System.out.println("Loan Amount:" + loanAmount);
       System.out.println("Number of Years:" + numberOfYears);
       System.out.println("Loan Date:" + loanDate);
       System.out.println("AnnualInterestRate:" + annualInterestRate);
       System.out.println("Total Payment:" + totalPayment);
       System.out.println("Monthly Payment:" + monthlyPayment);    
   }
}