/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Nicholas Peng Gen
 */
public class Payment extends javax.swing.JFrame {

    private final String user;
    DefaultTableModel table;
    /**
     * Creates new form Receipt
     * @param user
     * @param table
     */
    public Payment(String user, DefaultTableModel table) {
        initComponents();
        this.user = user;
        this.table = table;
        jTable1.setModel(this.table);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);

        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel9.setText("RM " + String.format("%.2f", total));
        
        jTextField1.setText(user.split("\t")[2] + " " + user.split("\t")[3]);
        jTextField9.setText(user.split("\t")[4]);
        jTextField10.setText(user.split("\t")[6]);
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:mm:ss a");  
  
        LocalDateTime now = LocalDateTime.now(); 
        jTextField2.setText(df.format(now));
        jTextField3.setText(tf.format(now));
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        rightRenderer.setHorizontalAlignment( JLabel.RIGHT );
        jTable1.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jTable1.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        
        jTable1.getColumnModel().getColumn(3).setCellRenderer( rightRenderer );
    }

    private Payment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("APU Cafeteria Payment Page");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 410, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Time:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 202, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 202, -1));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 202, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 202, -1));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField10.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 202, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Telephone:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 410, 250));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Grand Total:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Receipt");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 740, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("RM 0.00");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 540, 158, -1));

        jTable1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Unit Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setRowHeight(18);
        jTable1.setShowGrid(false);
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 660, 470));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 740, 640));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APU Cafeteria Payment Page");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 410, -1));

        jTextField6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 50, 20));

        jTextField4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 202, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Card Number:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jTextField5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 200, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Expiry Date: ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("/");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        jTextField7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 50, 20));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CSV:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTextField8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 50, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 240, 125, 45));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 125, 45));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 410, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/pexels-ella-olsson-1640772.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String card = jTextField4.getText();  
        String cardHolder = jTextField5.getText();
        String expiryM = jTextField6.getText();
        String expiryY = jTextField7.getText();
        String CSV = jTextField8.getText();
        
        //Luhn Algorithm: https://www.youtube.com/watch?v=o5P6OvW7QBw&ab_channel=MaxO%27Didily
        //Card validation: https://www.tutorialspoint.com/java-program-for-credit-card-number-validation#:~:text=Step%202%20%E2%88%92%20Starting%20from%20right,the%20number%20is%20not%20valid.
        //Length either 13 or 16

        if (!card.matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(this, "Invalid Card Number", "Card Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (card.length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Must provide Card Number", "Card Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!(card.length() >= 13 && card.length() <= 16))
        {
            JOptionPane.showMessageDialog(this, "Invalid Card number.\nMake sure you did not put any spaces in between numbers", "Card Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (Character.compare(card.charAt(0), '4') != 0 && Character.compare(card.charAt(0), '5') != 0 && Character.compare(card.charAt(0), '6') != 0 && card.substring(0, 2).compareTo("37") != 0 && card.substring(0, 2).compareTo("34") != 0)
        {
            JOptionPane.showMessageDialog(this, "Invalid Card number", "Card Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Convert card number to int array
        int[] cardInt = new int[card.length()];
        
        for (int i = 0; i < card.length(); i++)
        {
            cardInt[i] = Integer.parseInt(card.substring(i, i+1));
        }
        
        //Starting from right, double each other digit, if greater than 9 mod 10 and 1 to the remainder
        for (int i = cardInt.length - 2; i>= 0; i-=2)
        {
            int temp = cardInt[i];
            temp *= 2;
            if(temp > 9)
            {
                temp = temp % 10 + 1;
            }
            cardInt[i] = temp;
        }
        
        //Add all digits
        int total = 0;
        for (int i = 0; i < cardInt.length; i++)
        {
            total += cardInt[i];
        }
        
        if (total%10 != 0)
        {
            JOptionPane.showMessageDialog(this, "Invalid Card number", "Card Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (cardHolder.length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Must provide Card Holder Name", "Name Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        DateTimeFormatter yf = DateTimeFormatter.ofPattern("yy");
        DateTimeFormatter mf = DateTimeFormatter.ofPattern("MM");  
  
        LocalDateTime now = LocalDateTime.now(); 
        jTextField2.setText(yf.format(now));
        
        if(expiryM.length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Must provide Expiry Month", "Expiry Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!expiryM.matches("[0-9]+") || Integer.parseInt(expiryM) <= 0 || Integer.parseInt(expiryM) > 12)
        {
            JOptionPane.showMessageDialog(this, "Invalid Month", "Expiry Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(expiryY.length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Must provide Expiry Year", "Expiry Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!expiryY.matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(this, "Invalid Year", "Expiry Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(expiryY.length() != 2)
        {
            JOptionPane.showMessageDialog(this, "Year must be 2 digit only", "Expiry Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (Integer.parseInt(expiryY) == Integer.parseInt(yf.format(now)))
        {
            
            if (Integer.parseInt(expiryM) < Integer.parseInt(mf.format(now)))
            {
                JOptionPane.showMessageDialog(this, "Card Expired", "Expiry Date Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        else if (Integer.parseInt(expiryY) < Integer.parseInt(yf.format(now)))
        {
            JOptionPane.showMessageDialog(this, "Card Expired", "Expiry Date Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(CSV.length() != 3 || !CSV.matches("[0-9]+"))
        {
            JOptionPane.showMessageDialog(this, "Invalid CSV", "CSV Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int orderId = 1;
        //ID
        try  
        {  
            File file = new File("files/orders.txt");
            if (file.exists())
            {
                BufferedReader data;
                data = new BufferedReader(new FileReader(file));
                String line;
                data.readLine(); // Read the header row
                while((line = data.readLine()) != null)
                {

                   orderId = Integer.parseInt(line.split("\t")[0]) + 1;

                }//while

                data.close();
            }
            
        }  
        catch(IOException e)  
        {  
            e.printStackTrace();  
        }
        
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:mm:ss a");  

        now = LocalDateTime.now(); 
        String date = df.format(now);
        String time = tf.format(now);
        
        try {
            File folder = new File("files");
            if(!folder.exists())
                folder.mkdir();
            
            
            File file = new File("files/orders.txt");

            if (file.createNewFile()){
                FileWriter fw;
                fw = new FileWriter("files/orders.txt", true);

                fw.write("ID\tDate\tTime\tUser ID\tCard Holder\tLast 4 digit of card\tOrders\tOverall Review\tFood Review\tFeedback\n");
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
            fw = new FileWriter("files/orders.txt", true);
        
            
            fw.write(orderId + "\t" + date + "\t"+ time + "\t"+ this.user.split("\t")[0] + "\t" + cardHolder + "\t" + card.substring(card.length()-4) + "\t");
            for(int i = 0; i < jTable1.getRowCount(); i++)
            {
                for (int j = 0; j < jTable1.getColumnCount(); j++)
                {
                    fw.write(jTable1.getValueAt(i, j).toString());
                    fw.write("\t");
                }
                    
            }
            fw.write("None\tNone\tNone\n");
            fw.close();
        } 
        catch (IOException e) {
            
            e.printStackTrace(); //IDK WHAT IS THIS FOR
        }
        
        JOptionPane.showMessageDialog(this, "Payment Completed Successfully", "Payment Success", JOptionPane.INFORMATION_MESSAGE);
        
        this.setVisible(false);
        Feedback ff = new Feedback(orderId);
        ff.setLocation(this.getLocation());
        ff.setResizable(false);
        ff.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        CustomerMenu cm = new CustomerMenu(this.user, this.table);
        cm.setLocation(this.getLocation());
        cm.setResizable(false);
        cm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.jTextField5.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.jTextField6.requestFocus();
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.jTextField7.requestFocus();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.jTextField8.requestFocus();
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.jButton1.doClick();
        }
    }//GEN-LAST:event_jTextField8KeyPressed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
