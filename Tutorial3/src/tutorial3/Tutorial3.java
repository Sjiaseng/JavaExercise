package tutorial3;

import java.util.GregorianCalendar;

public class Tutorial3 {

    public static void main(String[] args) {

        q6a();
        
    }
    
    static void q1a(){
        Account myaccount = new Account(1222, 20000, 4.5); 
        myaccount.withdraw(2500);
        myaccount.display();
    }
    
    static void q1b(){
        Account myaccount = new Account(1222, 20000, 4.5); 
        myaccount.deposit(2500);
        myaccount.display();
    }
    
    static void q2a(){
        Rectangle rec1 = new Rectangle(5, 50);
        rec1.setColor("yellow");
        rec1.getArea();
        rec1.display();
        
        Rectangle rec2 = new Rectangle(5, 50);
        rec2.getArea();
        rec2.display();
    }
    
    static void q3a(){
        Fan fan1 = new Fan(1, true, 123, "yellow");
        fan1.display();
    }
    
    static void q4a(){
        GregorianCalendar calendar = new GregorianCalendar();
        
        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1;
        int day = calendar.get(GregorianCalendar.DATE);

        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
    
    static void q5a(){
        Time currentTime = new Time();
        System.out.println("Current Time (GMT):");
        System.out.println("Hour: " + currentTime.getHour());
        System.out.println("Minute: " + currentTime.getMinute());
        System.out.println("Second: " + currentTime.getSecond());
    }
    
    static void q6a(){
        Time[] timeArray = new Time[10];  
        for (int i = 0; i < timeArray.length; i++) {
            timeArray[i] = new Time();
            try {
                Thread.sleep(5000);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Time time : timeArray) {
            System.out.println(time.toString());
        }
    }
  }


class Account{
    int id;
    double balance,annualInterestRate;
    
    public Account(int id, double balance, double annualInterestRate){
        this.id=id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
        } else{
            System.out.println("Withdrawal amount exceeded account balance!");
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
    
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Balance: " + balance);
        System.out.println("annualInterestRate: " + annualInterestRate);
    }
    
}

class Rectangle{
    double width, height, area;
    static String color;
    
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void getArea(){
        area = width * height;
    }
    
    public void display(){
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
        System.out.println("\n");
    }

}

class Fan{
    int speed;
    Boolean on;
    double radius;
    String color, speedlevel;
    
    public Fan(int speed, Boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    
    public String toString(){
        return "Speed: " + speed + "\nOn: " + on + "\nRadius: " + radius + "\nColor: " + color;
    }


    public void display(){
        
        if(speed == 1){
            speedlevel = "slow";
        }else if(speed == 2){
            speedlevel = "medium";
        }else{
            speedlevel = "fast";
        }
        
        System.out.println("Speed: " + speed);
        System.out.println("Speed Level: " + speedlevel);
        System.out.println("On: " + on);
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
    }
}

class Time{
    private long milliseconds;
    
    public Time() {
        this.milliseconds = System.currentTimeMillis();
    }
    
    public int getHour() {
        return (int) ((milliseconds / (1000 * 60 * 60)) % 24);
    }

    public int getMinute() {
        return (int) ((milliseconds / (1000 * 60)) % 60);
    }

    public int getSecond() {
        return (int) ((milliseconds / 1000) % 60);
    }
    
     public String toString() {
        return String.format("%d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}


    



