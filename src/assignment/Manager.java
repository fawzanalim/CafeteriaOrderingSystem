/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author Nicholas Peng Gen
 */
public class Manager extends User{
    private char[] oldPass;
    private char[] pass;
    private char[] passConfirm;
    
    public char[] getNewPass(){
    //get method
        return pass;
    }
    
    public void setNewPass(char[] oldPassword, char[] password, char[] passwordConfirm){
        oldPass = oldPassword;
        pass = password;
        passConfirm = passwordConfirm;
          //Pass length 8-20
        if(oldPass.length == 0)
        {
            JOptionPane.showMessageDialog(null, "Must provide old pass", "Password Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try  
        {  
            
            BufferedReader data;
            data = new BufferedReader(new FileReader("files/managers.txt"));
            StringBuilder inputBuffer = new StringBuilder();
            String line;
            line = data.readLine(); // Read the header row
            inputBuffer.append(line).append("\n");
            
            
            
            
                
            line = data.readLine();
            data.close();
            if(String.valueOf(oldPass).compareTo(line.split("\t")[1]) != 0)
            {
                JOptionPane.showMessageDialog(null, "Incorrect Old Password", "Password Error", JOptionPane.ERROR_MESSAGE);
                return;

            }

           
    
            
            
        }  
        catch(IOException e)  
        {  
           
            e.printStackTrace();  
            flag = false;
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
            JOptionPane.showMessageDialog(null, "New passwords do not match", "Password Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        flag = true;

    }
}
