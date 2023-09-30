/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;
import java.io.*;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
/**
 *
 * @author Nicholas Peng Gen
 */
public class Login extends javax.swing.JFrame {
    private final String managerUsername = "manager";
    private final String managerPass = "password";
    /**
     * Creates new form MainMenu2
     */
    public Login() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel1.setMaximumSize(new java.awt.Dimension(340, 460));
        jPanel1.setMinimumSize(new java.awt.Dimension(340, 460));
        jPanel1.setPreferredSize(new java.awt.Dimension(340, 460));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 172, 100, 35));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome to APU Cafeteria!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 31, 380, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 103, 110, 30));

        jPasswordField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 177, 200, 30));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 106, 200, 30));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 140, 45));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 325, 140, 45));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Don't have an account?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 290, 170, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Forgot Password?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 375, 160, 30));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reset Password");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 180, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 380, 470));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/pexels-rajesh-tp-1600727 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        setBounds(0, 0, 1296, 739);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = jTextField1.getText();
        char[] pass = jPasswordField1.getPassword();
        
        //Manager Login
        try  
        {  
            File file = new File("files/managers.txt");
            if (file.exists())
            {
                BufferedReader data;
                data = new BufferedReader(new FileReader(file));
                String line;
                data.readLine(); // Read the header row
                while((line = data.readLine()) != null)
                {
                    if(username.compareTo(line.split("\t")[0]) == 0 && String.valueOf(pass).compareTo(line.split("\t")[1]) == 0)
                    {
                        //System.out.println(line);

//                        JOptionPane.showMessageDialog(this, "Manager Login Successful", "Login Msg", JOptionPane.INFORMATION_MESSAGE);
                        data.close();

                        this.setVisible(false);
                        ManagerDashboard mdf = new ManagerDashboard();
                        
                        mdf.setLocation(this.getLocation());
                        mdf.setResizable(false);
                        mdf.setVisible(true);
                        return;
                    }


                }
            }
            else if(username.compareTo(this.managerUsername) == 0 && String.valueOf(pass).compareTo(this.managerPass) == 0)
            {
//                JOptionPane.showMessageDialog(this, "Manager Login Successful", "Login Msg", JOptionPane.INFORMATION_MESSAGE);
                
                try {
                    File folder = new File("files");
                    if(!folder.exists())
                        folder.mkdir();

                    if (file.createNewFile()){
                        FileWriter fw;
                        fw = new FileWriter("files/managers.txt", true);

                        fw.write("Username\tPassword\n");
                        fw.write(username + "\t" + String.valueOf(pass) + "\n");
                        fw.close();
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }

                this.setVisible(false);
                ManagerDashboard mdf = new ManagerDashboard();
                
                mdf.setLocation(this.getLocation());
                mdf.setResizable(false);
                mdf.setVisible(true);
                return;

                
            }
            
            
            
        }  
        catch(IOException e)  
        {  
            e.printStackTrace();  
            
            
            
            
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
                    if(username.compareTo(line.split("\t")[1]) == 0 && String.valueOf(pass).compareTo(line.split("\t")[5]) == 0)
                    {
                        //System.out.println(line);

//                        JOptionPane.showMessageDialog(this, "Login Successful", "Login Msg", JOptionPane.INFORMATION_MESSAGE);
                        data.close();
                        if(username.compareTo("manager") == 0)
                        {
                            this.setVisible(false);
                            ManagerDashboard mdf = new ManagerDashboard();
                            
                            mdf.setLocation(this.getLocation());
                            mdf.setResizable(false);
                            mdf.setVisible(true);

                        }
                        else if(line.split("\t")[7].compareTo("Active") == 0)
                        {
                            this.setVisible(false);
                            CustomerMenu cm = new CustomerMenu(line, null);
                            
                            cm.setLocation(this.getLocation());
                            cm.setResizable(false);
                            cm.setVisible(true);
                        }
                        else if(line.split("\t")[7].compareTo("Pending") == 0)
                        {
                            this.setVisible(false);
                            Pending pf = new Pending();
                            
                            pf.setLocation(this.getLocation());
                            pf.setResizable(false);
                            pf.setVisible(true);
                        }
                        else if(line.split("\t")[7].compareTo("Rejected") == 0)
                        {
                            this.setVisible(false);
                            RejectedPage rf = new RejectedPage();
                            
                            rf.setLocation(this.getLocation());
                            rf.setResizable(false);
                            rf.setVisible(true);
                        }

                        return;
                    }


                }
                data.close();
            }
            
            JOptionPane.showMessageDialog(this, "Login Failed. Username and password do not match.", "Login Error", JOptionPane.ERROR_MESSAGE);
            //while

            
        }
        catch(FileNotFoundException e)  
        {  
            JOptionPane.showMessageDialog(this, "Login Failed. Username and password do not match.", "Login Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();  
        }
        catch(IOException e)  
        {  
            JOptionPane.showMessageDialog(this, "Login Failed. Username and password do not match.", "Login Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();  
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        Register rf = new Register();
        
        rf.setLocation(this.getLocation());
        rf.setResizable(false);
        rf.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        ResetPassRequest rpf = new ResetPassRequest();
        
        rpf.setLocation(this.getLocation());
        rpf.setResizable(false);
        rpf.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.jButton1.doClick();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private Object ArraystoString(char[] pass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
