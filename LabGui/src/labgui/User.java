package labgui;

import java.io.FileWriter;
import java.io.PrintWriter;



public class User {
    private String name;
    private String gender;
    private String dob;
    private String username;
    private String password;

    public User(String n, String g, String d, String u, String p)
    {
        name = n;
        gender = g;
        dob = d;
        username = u;
        password = p;
    }
 
    public String writeRecord()
    {
        try
        {
                FileWriter fw = new FileWriter("C:/Users/user/Desktop/Netbeans/LabGui/src/labgui/user.txt",true);
                PrintWriter outputFile = new PrintWriter(fw);
                outputFile.println(name);
                outputFile.println(username);
                outputFile.println(password);
                outputFile.println(gender);
                outputFile.println(dob);
                outputFile.close();
                return "Success";

            }
        catch (Exception ex)
        {
            return ex.toString();

        }
    }
}