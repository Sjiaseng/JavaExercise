package javaapplication5;

public class JavaApplication5 {

    public static void main(String[] args) {
        //create object
        //className objectName = new constructor
        
        /*
        Pal obj1 = new Pal("Ali","Imran");
        obj1.display();
        Pal obj2 = new Pal("Abu","Bakar",5);
        obj2.display();
        
        obj2.setAge(18);
        System.out.println("Age of obj1: " +obj1.getAge());
        */
        
        /* cannot work because variable is private [information hiding]
        obj1.age=18;
        */
        
        //main();
        
        StudentGrade testing = new StudentGrade(123, "abc", 90, 100);
        testing.display();
    }
    
    static void main(){
        Movie myFavouriteMovie = new Movie("abc","abc",123);
        myFavouriteMovie.display();
    }
    
}

//demo question
class Pal{
    
    //data members/attributes -> variables [private - info hiding]
    private String firstName, lastName;
    private int age;
    
    //constructor method 1
    public Pal(String f, String l){
        firstName = f;
        lastName = l;
    }
    
    //constructor method 2 [parameter from argument to variable]
    public Pal(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    
    //constructors -> method to create object
    /*
    constructor must be same name as class
    no return type
    to assign values to attributes (variables)
    may have more than one constructor (constructor overloading)
    */
    
    // member method/behaviour -> methods
    public void display(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    } 
    
    // modify data [private] SET METHOD
    public void setAge(int age){
        this.age = age;
    }
    
    //accessor GET METHOD
    public int getAge(){
        return age;
    }
}

//question 1
class Movie{
    private String title, name;
    private int year;
    
    public Movie(String title, String name, int year){
        this.title = title;
        this.name = name;
        this.year = year;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void setDirector(String name){
        this.name = name;
    }
    
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
    } 
}

//question 2
class BankAccount{
    private String name, accountNumber, typeofAccount;
    private double balance;
    
    public BankAccount(String name, String accountNumber, String typeofAccount, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.typeofAccount = typeofAccount;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        if (amount > 0 ){
            balance += amount;
        } else{
            System.out.println("Unable to deposit negative amount!");
        }
    }
    
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
        } else{
            System.out.println("Withdrawal amount exceed account balance!");
        }
    }
    
    public void showInfo(){
        System.out.println("Name: " + name + "\nBalance: RM " + balance);
    }
}

class StudentGrade{
    int id, testScores, possiblePoints;
    String grade, name;
    
    public StudentGrade(int id, String name, int testScores, int possiblePoints){
        this.id = id;
        this.name = name;
        this.testScores = testScores;
        
        if (possiblePoints == 0){
            this.possiblePoints = 1;
        }else if(possiblePoints < 0){
            System.out.println("Score can't be lesser than 0!");
        }else if (possiblePoints > 100){
            System.out.println("Score can't be more than 100!");
        }else{
            this.possiblePoints = possiblePoints;
        }
        
        this.grade = grade();
        
    }
    
    public void display(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Test Score: " + testScores);
        System.out.println("Possible Point: " + possiblePoints);
        System.out.println("Grade: " + grade);
    }
    
    public String grade(){
        int percentage = testScores / possiblePoints * 100;
        
        System.out.println(testScores);
        System.out.println(possiblePoints);
        System.out.println(percentage);
        
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F ";
        }
        
    }
    
}