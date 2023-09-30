/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicholas Peng Gen
 */
public class Customer extends User{
    int id = 1;
    
    String fname;
    String lname;
    char[] pass;
    char[] passConfirm;
    String email;
    String number;
    String securityQ;
    String securityAns;
    boolean closeRegister = false;
    
    Customer(String username1, String fname1, String lname1, char[] pass1, char[] passConfirm1, String email1, String number1, String securityQ1, String securityAns1){
        username = username1;
        fname = fname1;
        lname = lname1;
        pass = pass1;
        passConfirm = passConfirm1;
        email = email1;
        number = number1;
        securityQ = securityQ1;
        securityAns = securityAns1;
    }
    void updateUsers(){
     try  
        {  
            File file = new File("files/users.txt");
            if (file.exists())
            {
                BufferedReader data;
                data = new BufferedReader(new FileReader(file));
                String line;
                data.readLine(); // Read the header row
                while((line = data.readLine()) != null)
                {
                   id = Integer.parseInt(line.split("\t")[0]) + 1;

                }//while

                data.close();
            }
            
        }  
        catch(IOException e)  
        {  
            e.printStackTrace();  
        }
        
        //First check length
        if(username.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Username cannot be empty", "Username Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try  
        {  
            File file = new File("files/users.txt");
            if (file.exists())
            {
                BufferedReader data;
                data = new BufferedReader(new FileReader(file));
                String line;
                data.readLine(); // Read the header row
                while((line = data.readLine()) != null)
                {

                    if(username.compareTo(line.split("\t")[1]) == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Username already taken", "Username Error", JOptionPane.ERROR_MESSAGE);
                        data.close();
                        return;
                    }

                }//while

                data.close();
            }
                
        }  
        catch(IOException e)  
        {  
            
            e.printStackTrace();  
        }
        if(username.length() < 5)
        {
            JOptionPane.showMessageDialog(null, "Username length cannot be less than 5", "Username Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(username.length() > 15)
        {
            JOptionPane.showMessageDialog(null, "Username length cannot be more than 15", "Username Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Check the first letter
        char a = username.charAt(0);
        if(!((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')))
        {
            JOptionPane.showMessageDialog(null, "Username must start with a letter", "Username Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Check for alpha numeric and -_.
        for (int i = 0; i < username.length(); i++)
        {
            char b = username.charAt(i);
            if (!((b >= 'a' && b <= 'z') || (b >= 'A' && b <= 'Z') || (b >= '0' && b <= '9') || b == '-' || b == '_' || b == '.'))
            {
                JOptionPane.showMessageDialog(null, "Username can only contain letters, numbers, dot, dash and underscore", "Username Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        
        
        
        //First Name validity
        if(fname.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "First Name cannot be empty", "First Name Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Last Name validity
        if(lname.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Last Name cannot be empty", "Last Name Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Pass length 8-20
        if(pass.length == 0)
        {
            JOptionPane.showMessageDialog(null, "Password cannot be empty", "Password Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(pass.length < 8)
        {
            JOptionPane.showMessageDialog(null, "Password length cannot be less than 8", "Password Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(pass.length > 20)
        {
            JOptionPane.showMessageDialog(null, "Password length cannot be more than 20", "Password Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Confirm Pass                
        if (!(Arrays.equals(pass, passConfirm)))
        {
            JOptionPane.showMessageDialog(null, "Passwords do not match", "Password Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Email validity
        if(email.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Email cannot be empty", "Email Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!email.endsWith("@mail.apu.edu.my") && !email.endsWith("@staffmail.apu.edu.my") && !email.endsWith("@apu.edu.my"))
        {
            JOptionPane.showMessageDialog(null, "Email must be an APU email", "Email Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try  
        {  
              
            BufferedReader data;
            data = new BufferedReader(new FileReader("files/users.txt"));
            String line;
            data.readLine(); // Read the header row
            while((line = data.readLine()) != null)
            {
                if(email.compareTo(line.split("\t")[4]) == 0)
                {
                    JOptionPane.showMessageDialog(null, "There is an account with this email already.", "Email Error", JOptionPane.ERROR_MESSAGE);
                    data.close();
                    return;
                }

            }//while

            data.close();
        }  
        catch(IOException e)  
        {  
            
            e.printStackTrace();  
        }
        
        //Phone Number validity
        if(number.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Phone Number cannot be empty", "Phone Number Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!number.matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Phone Number Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Phone Number validity
        if(securityQ.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Security Question cannot be empty", "Security Question Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Phone Number validity
        if(securityAns.length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Security Answer cannot be empty", "Security Answer Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        
        
        try {
            File folder = new File("files");
            if(!folder.exists())
                folder.mkdir();
            
            
            File file = new File("files/users.txt");

            if (file.createNewFile()){
                FileWriter fw;
                fw = new FileWriter("files/users.txt", true);

                fw.write("ID\tUsername\tFirst Name\tLast Name\tEmail\tPassword\tNumber\tStatus\tSecurity Q\tSecurity Ans\n");
                fw.close();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        try 
        {
        //Check if exist
        //If it exists append
        //If doesnt exist crete file and write header row then append
           
            FileWriter fw;
            fw = new FileWriter("files/users.txt", true);
        
        
            fw.write(id + "\t" + username + "\t"+ fname + "\t"+ lname + "\t" + email + "\t" +  String.valueOf(pass) + "\t" + number + "\tPending\t" + securityQ + "\t" + securityAns + "\n");
            fw.close();
        } 
        catch (IOException e) {
            
            e.printStackTrace(); //IDK WHAT IS THIS FOR
        }
        
        JOptionPane.showMessageDialog(null, "Registered Successfully", "Registration Message", JOptionPane.INFORMATION_MESSAGE);
        
        
        closeRegister = true;
    }
    
    public boolean getFlag(){
        return closeRegister;
    }
}
