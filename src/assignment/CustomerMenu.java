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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicholas Peng Gen
 */
public class CustomerMenu extends javax.swing.JFrame {

    private final String user;
    DefaultTableModel table;
    /**
     * Creates new form newFrame
     * @param user
     * @param table
     */
    public CustomerMenu(String user, DefaultTableModel table) {
        initComponents();
        this.user = user;
        updateMenu();
        if(table != null)
        {
            jTable2.setModel(table);
            double total = 0;
            for (int j = 0; j < table.getRowCount(); j++)
            {
                total += Double.parseDouble(table.getValueAt(j, 3).toString());
            }
            jLabel5.setText("RM " + String.format("%.2f", total));   
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(300);
        }
        
        
        
        this.table = (DefaultTableModel) jTable2.getModel();
        
        jTextField1.setText(user.split("\t")[2] + " " + user.split("\t")[3]);
        jTextField2.setText(user.split("\t")[4]);
        
        
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        rightRenderer.setHorizontalAlignment( JLabel.RIGHT );
        jTable2.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        jTable2.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        
        jTable2.getColumnModel().getColumn(3).setCellRenderer( rightRenderer );
        
        
    }

    private void updateMenu()
    {
        try
        {
            File file = new File("files/menu-items.txt");
            if (file.exists())
            {
                BufferedReader data;
                data = new BufferedReader(new FileReader(file));
                String line;
                data.readLine(); // Read the header row
                while((line = data.readLine()) != null)
                {
                    String itemName = line.split("\t")[0];
                    String price = line.split("\t")[1];
                    Boolean avail = line.split("\t")[2].compareTo("Available") == 0;
                    switch (itemName)
                    {
                        case "Tender Grilled Chicken":
                            item1Price.setText("RM " + price);
                            itema1price.setText("RM " + price);
                            itemd1price.setText("RM " + price);
                            itemh1price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item1BtnNeg.setEnabled(false);
                                item1BtnPos.setEnabled(false);
                                item1BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item1BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton145.setEnabled(false);
                                jButton146.setEnabled(false);
                                jButton145.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton146.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton215.setEnabled(false);
                                jButton216.setEnabled(false);
                                jButton215.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton216.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton425.setEnabled(false);
                                jButton426.setEnabled(false);
                                jButton425.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton426.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                        case "Steak with Fries":
                            item2Price.setText("RM " + price);
                            itema2price.setText("RM " + price);
                            jLabel625.setText("RM " + price);
                            itemh2price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item2BtnNeg.setEnabled(false);
                                item2BtnPos.setEnabled(false);
                                item2BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item2BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton148.setEnabled(false);
                                jButton147.setEnabled(false);
                                jButton148.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton147.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton253.setEnabled(false);
                                jButton252.setEnabled(false);
                                jButton253.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton252.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton428.setEnabled(false);
                                jButton427.setEnabled(false);
                                jButton428.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton427.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                        case "Fried Salmon":
                            item3Price.setText("RM " + price);
                            itema3price.setText("RM " + price);
                            itemb1price.setText("RM " + price);
                            itemh3price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item3BtnNeg.setEnabled(false);
                                item3BtnPos.setEnabled(false);
                                item3BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item3BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton149.setEnabled(false);
                                jButton150.setEnabled(false);
                                jButton149.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton150.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton184.setEnabled(false);
                                jButton185.setEnabled(false);
                                jButton184.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton185.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton429.setEnabled(false);
                                jButton430.setEnabled(false);
                                jButton429.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton430.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                        case "Japanese Bento Rice":
                            item4Price.setText("RM " + price);
                            itemf1price.setText("RM " + price);
                            itemg1price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item4BtnNeg.setEnabled(false);
                                item4BtnPos.setEnabled(false);
                                item4BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item4BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton343.setEnabled(false);
                                jButton74.setEnabled(false);
                                jButton343.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton74.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton413.setEnabled(false);
                                jButton76.setEnabled(false);
                                jButton413.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton76.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;    
                        case "Salad":
                            item5Price.setText("RM " + price);
                            itemj1price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item5BtnNeg.setEnabled(false);
                                item5BtnPos.setEnabled(false);
                                item5BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item5BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton379.setEnabled(false);
                                jButton367.setEnabled(false);
                                jButton379.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton367.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                        case "Strawberry Smoothie":
                            item6Price.setText("RM " + price);
                            itemi1price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item6BtnNeg.setEnabled(false);
                                item6BtnPos.setEnabled(false);
                                item6BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item6BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton485.setEnabled(false);
                                jButton473.setEnabled(false);
                                jButton485.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton473.setBackground(new java.awt.Color(204, 204, 204));

                            }
                            break;
                        case "Beef Burger":
                            item7Price.setText("RM " + price);
                            itema4price.setText("RM " + price);
                            jLabel635.setText("RM " + price);
                            itemh4price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item7BtnNeg.setEnabled(false);
                                item7BtnPos.setEnabled(false);
                                item7BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item7BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton171.setEnabled(false);
                                jButton161.setEnabled(false);
                                jButton171.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton161.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton276.setEnabled(false);
                                jButton266.setEnabled(false);
                                jButton276.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton266.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton451.setEnabled(false);
                                jButton441.setEnabled(false);
                                jButton451.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton441.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                            
                        case "Beef Noodle":
                            item8Price.setText("RM " + price);
                            itema5price.setText("RM " + price);
                            jLabel633.setText("RM " + price);
                            iteme1price.setText("RM " + price);
                            itemg2price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item8BtnNeg.setEnabled(false);
                                item8BtnPos.setEnabled(false);
                                item8BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item8BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton172.setEnabled(false);
                                jButton160.setEnabled(false);
                                jButton172.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton160.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton313.setEnabled(false);
                                jButton299.setEnabled(false);
                                jButton313.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton299.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton417.setEnabled(false);
                                jButton405.setEnabled(false);
                                jButton417.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton405.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton277.setEnabled(false);
                                jButton265.setEnabled(false);
                                jButton277.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton265.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                            
                        case "Japanese Noodle":
                            item9Price.setText("RM " + price);
                            iteme2price.setText("RM " + price);
                            itemg3price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item9BtnNeg.setEnabled(false);
                                item9BtnPos.setEnabled(false);
                                item9BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item9BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton313.setEnabled(false);
                                jButton299.setEnabled(false);
                                jButton313.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton299.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton418.setEnabled(false);
                                jButton404.setEnabled(false);
                                jButton418.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton404.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                            
                        case "Kimchi":
                            item10Price.setText("RM " + price);
                            itemg4price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item10BtnNeg.setEnabled(false);
                                item10BtnPos.setEnabled(false);
                                item10BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item10BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton419.setEnabled(false);
                                jButton409.setEnabled(false);
                                jButton419.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton409.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                            
                        case "Lasagna":
                            itemh6price.setText("RM " + price);
                            item11Price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item11BtnNeg.setEnabled(false);
                                item11BtnPos.setEnabled(false);
                                item11BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item11BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton455.setEnabled(false);
                                jButton443.setEnabled(false);
                                jButton455.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton443.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                            
                        case "Coffee":
                            item12Price.setText("RM " + price);
                            itemi2price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item12BtnNeg.setEnabled(false);
                                item12BtnPos.setEnabled(false);
                                item12BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item12BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton491.setEnabled(false);
                                jButton477.setEnabled(false);
                                jButton491.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton477.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                            
                        case "Fruit Juice":
                            item13Price.setText("RM " + price);
                            itemi3price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item13BtnNeg.setEnabled(false);
                                item13BtnPos.setEnabled(false);
                                item13BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item13BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton494.setEnabled(false);
                                jButton482.setEnabled(false);
                                jButton494.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton482.setBackground(new java.awt.Color(204, 204, 204));

                            }
                            break;
                            
                        case "Spaghetti":
                            item14Price.setText("RM " + price);
                            iteme3price.setText("RM " + price);
                            itemh5price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item14BtnNeg.setEnabled(false);
                                item14BtnPos.setEnabled(false);
                                item14BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item14BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton318.setEnabled(false);
                                jButton306.setEnabled(false);
                                jButton318.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton306.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton458.setEnabled(false);
                                jButton446.setEnabled(false);
                                jButton458.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton446.setBackground(new java.awt.Color(204, 204, 204));
                                
                            }
                            break;
                            
                        case "Water":
                            item15Price.setText("RM " + price);
                            itemi4price.setText("RM " + price);
                            if(!avail)
                            {
                                item15BtnNeg.setEnabled(false);
                                item15BtnPos.setEnabled(false);
                                item15BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item15BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton492.setEnabled(false);
                                jButton480.setEnabled(false);
                                jButton492.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton480.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                            
                        case "Avacado Slice":
                            item16Price.setText("RM " + price);
                            itemj2price.setText("RM " + price);
                            if(!avail)
                            {
                                item16BtnNeg.setEnabled(false);
                                item16BtnPos.setEnabled(false);
                                item16BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item16BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                            
                                jButton228.setEnabled(false);
                                jButton225.setEnabled(false);
                                jButton228.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton225.setBackground(new java.awt.Color(204, 204, 204)); 
                            }
                            break;
                            
                        case "Edamame":
                            item17Price.setText("RM " + price);
                            itemg5price.setText("RM " + price);
                            itemj3price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item17BtnNeg.setEnabled(false);
                                item17BtnPos.setEnabled(false);
                                item17BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item17BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton235.setEnabled(false);
                                jButton226.setEnabled(false);
                                jButton235.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton226.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton227.setEnabled(false);
                                jButton223.setEnabled(false);
                                jButton227.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton223.setBackground(new java.awt.Color(204, 204, 204));
                                
                            }
                            break;
                            
                        case "Chicken Chop":
                            item18Price.setText("RM " + price);
                            itema6price.setText("RM " + price);
                            itemd2price.setText("RM " + price);
                            itemh7price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item18BtnNeg.setEnabled(false);
                                item18BtnPos.setEnabled(false);
                                item18BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item18BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton204.setEnabled(false);
                                jButton195.setEnabled(false);
                                jButton204.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton195.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton224.setEnabled(false);
                                jButton198.setEnabled(false);
                                jButton224.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton198.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton236.setEnabled(false);
                                jButton201.setEnabled(false);
                                jButton236.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton201.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                            
                        case "Fried Rice":
                            item19Price.setText("RM " + price);
                            itemf2price.setText("RM " + price);
                            itemg7price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item19BtnNeg.setEnabled(false);
                                item19BtnPos.setEnabled(false);
                                item19BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item19BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton234.setEnabled(false);
                                jButton231.setEnabled(false);
                                jButton234.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton231.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton244.setEnabled(false);
                                jButton241.setEnabled(false);
                                jButton244.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton241.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                        
                        case "Curry Rice":
                            item20Price.setText("RM " + price);
                            itemf3price.setText("RM " + price);
                            itemg8price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item20BtnNeg.setEnabled(false);
                                item20BtnPos.setEnabled(false);
                                item20BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item20BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton233.setEnabled(false);
                                jButton230.setEnabled(false);
                                jButton233.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton230.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton243.setEnabled(false);
                                jButton238.setEnabled(false);
                                jButton243.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton238.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                            
                        case "Steamed Fish":
                            item21Price.setText("RM " + price);
                            itema7price.setText("RM " + price);
                            itemb2price.setText("RM " + price);
                            itemg9price.setText("RM " + price);
                            if(!avail)
                            {
                                item21BtnNeg.setEnabled(false);
                                item21BtnPos.setEnabled(false);
                                item21BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item21BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton218.setEnabled(false);
                                jButton212.setEnabled(false);
                                jButton218.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton212.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton222.setEnabled(false);
                                jButton219.setEnabled(false);
                                jButton222.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton219.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton242.setEnabled(false);
                                jButton237.setEnabled(false);
                                jButton242.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton237.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                            
                            
                        case "Bowl of Strawberries":
                            item22Price.setText("RM " + price);
                            itemj4price.setText("RM " + price);
                            if(!avail)
                            {
                                item22BtnNeg.setEnabled(false);
                                item22BtnPos.setEnabled(false);
                                item22BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item22BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton240.setEnabled(false);
                                jButton239.setEnabled(false);
                                jButton240.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton239.setBackground(new java.awt.Color(204, 204, 204));

                            }
                            break;
                            
                        case "Sushi":
                            item23Price.setText("RM " + price);
                            itema8price.setText("RM " + price);
                            itemb3price.setText("RM " + price);
                            itemg6price.setText("RM " + price);
                            
                            if(!avail)
                            {
                                item23BtnNeg.setEnabled(false);
                                item23BtnPos.setEnabled(false);
                                item23BtnNeg.setBackground(new java.awt.Color(204, 204, 204)); 
                                item23BtnPos.setBackground(new java.awt.Color(204, 204, 204)); 
                                
                                jButton217.setEnabled(false);
                                jButton213.setEnabled(false);
                                jButton217.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton213.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton221.setEnabled(false);
                                jButton220.setEnabled(false);
                                jButton221.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton220.setBackground(new java.awt.Color(204, 204, 204));
                                
                                jButton248.setEnabled(false);
                                jButton247.setEnabled(false);
                                jButton248.setBackground(new java.awt.Color(204, 204, 204)); 
                                jButton247.setBackground(new java.awt.Color(204, 204, 204));
                            }
                            break;
                    }
                    
                }//while

                data.close();
            }
            else
            {
                try 
                {
                    File folder = new File("files");
                    if(!folder.exists())
                        folder.mkdir();


                    //File file = new File("files/menu-items.txt");

                    if (file.createNewFile()){
                        FileWriter fw;
                        fw = new FileWriter("files/menu-items.txt", true);

                        fw.write("Item Name\tPrice\tAvailability\n");
                        
                        fw.write(item1Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item2Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item3Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item4Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item5Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item6Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item7Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item8Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item9Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item10Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item11Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item12Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item13Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item14Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item15Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item16Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item17Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item18Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item19Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item20Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item21Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item22Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        fw.write(item23Title.getText() + "\t" + item1Price.getText().substring(3) + "\tAvailable\n");
                        
                        
                        fw.close();
                    }
                }
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
        catch(IOException e)  
        {  
            
            e.printStackTrace();  
        }
        
    }
    private CustomerMenu() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel369 = new javax.swing.JLabel();
        jButton93 = new javax.swing.JButton();
        jLabel370 = new javax.swing.JLabel();
        jLabel371 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        jLabel373 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jLabel377 = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        jLabel379 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jLabel381 = new javax.swing.JLabel();
        jLabel382 = new javax.swing.JLabel();
        jLabel383 = new javax.swing.JLabel();
        jLabel384 = new javax.swing.JLabel();
        jLabel385 = new javax.swing.JLabel();
        jLabel386 = new javax.swing.JLabel();
        jButton94 = new javax.swing.JButton();
        jLabel387 = new javax.swing.JLabel();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jLabel388 = new javax.swing.JLabel();
        jLabel389 = new javax.swing.JLabel();
        jLabel390 = new javax.swing.JLabel();
        jLabel391 = new javax.swing.JLabel();
        jLabel392 = new javax.swing.JLabel();
        jButton99 = new javax.swing.JButton();
        jLabel393 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jLabel395 = new javax.swing.JLabel();
        jLabel396 = new javax.swing.JLabel();
        jLabel397 = new javax.swing.JLabel();
        jLabel398 = new javax.swing.JLabel();
        jLabel399 = new javax.swing.JLabel();
        jLabel400 = new javax.swing.JLabel();
        jLabel401 = new javax.swing.JLabel();
        jButton100 = new javax.swing.JButton();
        jLabel402 = new javax.swing.JLabel();
        jButton101 = new javax.swing.JButton();
        jLabel403 = new javax.swing.JLabel();
        jLabel404 = new javax.swing.JLabel();
        jButton102 = new javax.swing.JButton();
        jLabel405 = new javax.swing.JLabel();
        jLabel406 = new javax.swing.JLabel();
        jLabel407 = new javax.swing.JLabel();
        jLabel408 = new javax.swing.JLabel();
        jLabel409 = new javax.swing.JLabel();
        jLabel410 = new javax.swing.JLabel();
        jLabel411 = new javax.swing.JLabel();
        jLabel412 = new javax.swing.JLabel();
        jLabel413 = new javax.swing.JLabel();
        jButton103 = new javax.swing.JButton();
        jLabel414 = new javax.swing.JLabel();
        jButton104 = new javax.swing.JButton();
        jLabel415 = new javax.swing.JLabel();
        jLabel416 = new javax.swing.JLabel();
        jButton105 = new javax.swing.JButton();
        jLabel417 = new javax.swing.JLabel();
        jLabel418 = new javax.swing.JLabel();
        jLabel419 = new javax.swing.JLabel();
        jLabel420 = new javax.swing.JLabel();
        jLabel421 = new javax.swing.JLabel();
        jLabel422 = new javax.swing.JLabel();
        jLabel423 = new javax.swing.JLabel();
        jLabel424 = new javax.swing.JLabel();
        jLabel425 = new javax.swing.JLabel();
        jButton106 = new javax.swing.JButton();
        jLabel426 = new javax.swing.JLabel();
        jButton107 = new javax.swing.JButton();
        jLabel427 = new javax.swing.JLabel();
        jLabel428 = new javax.swing.JLabel();
        jButton118 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel13 = new javax.swing.JPanel();
        item1BtnNeg = new javax.swing.JButton();
        item4BtnPos = new javax.swing.JButton();
        item1BtnPos = new javax.swing.JButton();
        item2BtnPos = new javax.swing.JButton();
        item2BtnNeg = new javax.swing.JButton();
        item3BtnNeg = new javax.swing.JButton();
        item3BtnPos = new javax.swing.JButton();
        item5BtnPos = new javax.swing.JButton();
        item6BtnPos = new javax.swing.JButton();
        item9BtnPos = new javax.swing.JButton();
        item8BtnPos = new javax.swing.JButton();
        item7BtnPos = new javax.swing.JButton();
        item12BtnPos = new javax.swing.JButton();
        item11BtnPos = new javax.swing.JButton();
        item10BtnPos = new javax.swing.JButton();
        item15BtnPos = new javax.swing.JButton();
        item14BtnPos = new javax.swing.JButton();
        item13BtnPos = new javax.swing.JButton();
        item4BtnNeg = new javax.swing.JButton();
        item5BtnNeg = new javax.swing.JButton();
        item6BtnNeg = new javax.swing.JButton();
        item7BtnNeg = new javax.swing.JButton();
        item8BtnNeg = new javax.swing.JButton();
        item9BtnNeg = new javax.swing.JButton();
        item10BtnNeg = new javax.swing.JButton();
        item11BtnNeg = new javax.swing.JButton();
        item12BtnNeg = new javax.swing.JButton();
        item15BtnNeg = new javax.swing.JButton();
        item14BtnNeg = new javax.swing.JButton();
        item13BtnNeg = new javax.swing.JButton();
        item18BtnPos = new javax.swing.JButton();
        item17BtnPos = new javax.swing.JButton();
        item16BtnPos = new javax.swing.JButton();
        item18BtnNeg = new javax.swing.JButton();
        item17BtnNeg = new javax.swing.JButton();
        item16BtnNeg = new javax.swing.JButton();
        item21BtnPos = new javax.swing.JButton();
        item20BtnPos = new javax.swing.JButton();
        item19BtnPos = new javax.swing.JButton();
        item21BtnNeg = new javax.swing.JButton();
        item20BtnNeg = new javax.swing.JButton();
        item19BtnNeg = new javax.swing.JButton();
        item22BtnPos = new javax.swing.JButton();
        item22BtnNeg = new javax.swing.JButton();
        item23BtnPos = new javax.swing.JButton();
        item23BtnNeg = new javax.swing.JButton();
        item2Title = new javax.swing.JLabel();
        item5Price = new javax.swing.JLabel();
        item5Title = new javax.swing.JLabel();
        item1Price = new javax.swing.JLabel();
        item1Title = new javax.swing.JLabel();
        item4Price = new javax.swing.JLabel();
        item4Title = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        item3Price = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        item3Title = new javax.swing.JLabel();
        item6Title = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        item2Price = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        item6Price = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        item8Price = new javax.swing.JLabel();
        item8Title = new javax.swing.JLabel();
        item7Price = new javax.swing.JLabel();
        item7Title = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        item9Title = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        item9Price = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        item11Price = new javax.swing.JLabel();
        item11Title = new javax.swing.JLabel();
        item10Price = new javax.swing.JLabel();
        item10Title = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        item12Title = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        item12Price = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        item14Price = new javax.swing.JLabel();
        item14Title = new javax.swing.JLabel();
        item13Price = new javax.swing.JLabel();
        item13Title = new javax.swing.JLabel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        item15Title = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jLabel305 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        item15Price = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        item17Price = new javax.swing.JLabel();
        item17Title = new javax.swing.JLabel();
        item16Price = new javax.swing.JLabel();
        item16Title = new javax.swing.JLabel();
        jLabel367 = new javax.swing.JLabel();
        jLabel431 = new javax.swing.JLabel();
        item18Title = new javax.swing.JLabel();
        jLabel435 = new javax.swing.JLabel();
        jLabel436 = new javax.swing.JLabel();
        jLabel438 = new javax.swing.JLabel();
        item18Price = new javax.swing.JLabel();
        jLabel447 = new javax.swing.JLabel();
        item20Price = new javax.swing.JLabel();
        item20Title = new javax.swing.JLabel();
        item19Price = new javax.swing.JLabel();
        item19Title = new javax.swing.JLabel();
        jLabel465 = new javax.swing.JLabel();
        jLabel466 = new javax.swing.JLabel();
        item21Title = new javax.swing.JLabel();
        jLabel468 = new javax.swing.JLabel();
        jLabel469 = new javax.swing.JLabel();
        jLabel470 = new javax.swing.JLabel();
        item21Price = new javax.swing.JLabel();
        jLabel472 = new javax.swing.JLabel();
        item22Price = new javax.swing.JLabel();
        item22Title = new javax.swing.JLabel();
        jLabel480 = new javax.swing.JLabel();
        jLabel481 = new javax.swing.JLabel();
        jLabel473 = new javax.swing.JLabel();
        item23Title = new javax.swing.JLabel();
        item23Price = new javax.swing.JLabel();
        jLabel482 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel16 = new javax.swing.JPanel();
        jButton145 = new javax.swing.JButton();
        jButton146 = new javax.swing.JButton();
        jButton147 = new javax.swing.JButton();
        jButton148 = new javax.swing.JButton();
        jButton149 = new javax.swing.JButton();
        jButton150 = new javax.swing.JButton();
        jButton160 = new javax.swing.JButton();
        jButton161 = new javax.swing.JButton();
        jButton171 = new javax.swing.JButton();
        jButton172 = new javax.swing.JButton();
        jButton195 = new javax.swing.JButton();
        jButton204 = new javax.swing.JButton();
        jButton212 = new javax.swing.JButton();
        jButton218 = new javax.swing.JButton();
        jButton213 = new javax.swing.JButton();
        jButton217 = new javax.swing.JButton();
        itema2title = new javax.swing.JLabel();
        itema1price = new javax.swing.JLabel();
        itema1title = new javax.swing.JLabel();
        itema3price = new javax.swing.JLabel();
        itema3title = new javax.swing.JLabel();
        jLabel442 = new javax.swing.JLabel();
        jLabel443 = new javax.swing.JLabel();
        jLabel444 = new javax.swing.JLabel();
        itema2price = new javax.swing.JLabel();
        jLabel448 = new javax.swing.JLabel();
        jLabel450 = new javax.swing.JLabel();
        jLabel452 = new javax.swing.JLabel();
        itema5price = new javax.swing.JLabel();
        itema5title = new javax.swing.JLabel();
        itema4price = new javax.swing.JLabel();
        itema4title = new javax.swing.JLabel();
        jLabel457 = new javax.swing.JLabel();
        jLabel460 = new javax.swing.JLabel();
        jLabel461 = new javax.swing.JLabel();
        jLabel462 = new javax.swing.JLabel();
        jLabel441 = new javax.swing.JLabel();
        itema6title = new javax.swing.JLabel();
        itema6price = new javax.swing.JLabel();
        jLabel478 = new javax.swing.JLabel();
        jLabel486 = new javax.swing.JLabel();
        itema7title = new javax.swing.JLabel();
        itema7price = new javax.swing.JLabel();
        jLabel492 = new javax.swing.JLabel();
        jLabel483 = new javax.swing.JLabel();
        itema8title = new javax.swing.JLabel();
        itema8price = new javax.swing.JLabel();
        jLabel488 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel17 = new javax.swing.JPanel();
        itemb1price = new javax.swing.JLabel();
        itemb1title = new javax.swing.JLabel();
        jLabel503 = new javax.swing.JLabel();
        jButton184 = new javax.swing.JButton();
        jButton185 = new javax.swing.JButton();
        jLabel510 = new javax.swing.JLabel();
        jLabel494 = new javax.swing.JLabel();
        itemb2title = new javax.swing.JLabel();
        itemb2price = new javax.swing.JLabel();
        jButton219 = new javax.swing.JButton();
        jButton222 = new javax.swing.JButton();
        jLabel502 = new javax.swing.JLabel();
        jLabel489 = new javax.swing.JLabel();
        itemb3title = new javax.swing.JLabel();
        itemb3price = new javax.swing.JLabel();
        jButton220 = new javax.swing.JButton();
        jButton221 = new javax.swing.JButton();
        jLabel496 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jPanel18 = new javax.swing.JPanel();
        itemd1price = new javax.swing.JLabel();
        itemd1title = new javax.swing.JLabel();
        jLabel562 = new javax.swing.JLabel();
        jButton215 = new javax.swing.JButton();
        jButton216 = new javax.swing.JButton();
        jLabel568 = new javax.swing.JLabel();
        jLabel458 = new javax.swing.JLabel();
        itemd2title = new javax.swing.JLabel();
        itemd2price = new javax.swing.JLabel();
        jButton198 = new javax.swing.JButton();
        jButton224 = new javax.swing.JButton();
        jLabel507 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel609 = new javax.swing.JLabel();
        jLabel624 = new javax.swing.JLabel();
        jLabel625 = new javax.swing.JLabel();
        jLabel633 = new javax.swing.JLabel();
        jLabel634 = new javax.swing.JLabel();
        jLabel635 = new javax.swing.JLabel();
        jLabel636 = new javax.swing.JLabel();
        jLabel637 = new javax.swing.JLabel();
        jLabel640 = new javax.swing.JLabel();
        jButton252 = new javax.swing.JButton();
        jButton253 = new javax.swing.JButton();
        jButton265 = new javax.swing.JButton();
        jButton266 = new javax.swing.JButton();
        jLabel632 = new javax.swing.JLabel();
        jButton276 = new javax.swing.JButton();
        jButton277 = new javax.swing.JButton();
        jLabel642 = new javax.swing.JLabel();
        jLabel641 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jPanel20 = new javax.swing.JPanel();
        iteme1price = new javax.swing.JLabel();
        iteme1title = new javax.swing.JLabel();
        jLabel697 = new javax.swing.JLabel();
        jLabel698 = new javax.swing.JLabel();
        iteme2title = new javax.swing.JLabel();
        iteme2price = new javax.swing.JLabel();
        iteme3price = new javax.swing.JLabel();
        iteme3title = new javax.swing.JLabel();
        jLabel721 = new javax.swing.JLabel();
        jButton299 = new javax.swing.JButton();
        jButton300 = new javax.swing.JButton();
        jButton306 = new javax.swing.JButton();
        jButton312 = new javax.swing.JButton();
        jButton313 = new javax.swing.JButton();
        jButton318 = new javax.swing.JButton();
        jLabel702 = new javax.swing.JLabel();
        jLabel704 = new javax.swing.JLabel();
        jLabel726 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        itemf1price = new javax.swing.JLabel();
        itemf1title = new javax.swing.JLabel();
        jLabel321 = new javax.swing.JLabel();
        jButton74 = new javax.swing.JButton();
        jButton343 = new javax.swing.JButton();
        jLabel326 = new javax.swing.JLabel();
        itemf3price = new javax.swing.JLabel();
        itemf3title = new javax.swing.JLabel();
        itemf2price = new javax.swing.JLabel();
        itemf2title = new javax.swing.JLabel();
        jLabel517 = new javax.swing.JLabel();
        jLabel520 = new javax.swing.JLabel();
        jButton230 = new javax.swing.JButton();
        jButton231 = new javax.swing.JButton();
        jButton233 = new javax.swing.JButton();
        jButton234 = new javax.swing.JButton();
        jLabel522 = new javax.swing.JLabel();
        jLabel521 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel22 = new javax.swing.JPanel();
        itemg1price = new javax.swing.JLabel();
        itemg1title = new javax.swing.JLabel();
        jLabel801 = new javax.swing.JLabel();
        jButton76 = new javax.swing.JButton();
        itemg2price = new javax.swing.JLabel();
        itemg2title = new javax.swing.JLabel();
        jLabel817 = new javax.swing.JLabel();
        jLabel818 = new javax.swing.JLabel();
        itemg3title = new javax.swing.JLabel();
        itemg3price = new javax.swing.JLabel();
        itemg4price = new javax.swing.JLabel();
        itemg4title = new javax.swing.JLabel();
        jLabel832 = new javax.swing.JLabel();
        jButton404 = new javax.swing.JButton();
        jButton405 = new javax.swing.JButton();
        jButton409 = new javax.swing.JButton();
        jButton413 = new javax.swing.JButton();
        jButton417 = new javax.swing.JButton();
        jButton418 = new javax.swing.JButton();
        jButton419 = new javax.swing.JButton();
        jLabel833 = new javax.swing.JLabel();
        jLabel806 = new javax.swing.JLabel();
        jLabel824 = new javax.swing.JLabel();
        jLabel822 = new javax.swing.JLabel();
        itemg5price = new javax.swing.JLabel();
        itemg5title = new javax.swing.JLabel();
        jLabel518 = new javax.swing.JLabel();
        jButton226 = new javax.swing.JButton();
        jButton235 = new javax.swing.JButton();
        jLabel526 = new javax.swing.JLabel();
        itemg8price = new javax.swing.JLabel();
        itemg8title = new javax.swing.JLabel();
        itemg7price = new javax.swing.JLabel();
        itemg7title = new javax.swing.JLabel();
        jLabel537 = new javax.swing.JLabel();
        jLabel538 = new javax.swing.JLabel();
        itemg9title = new javax.swing.JLabel();
        jLabel540 = new javax.swing.JLabel();
        itemg9price = new javax.swing.JLabel();
        jButton237 = new javax.swing.JButton();
        jButton238 = new javax.swing.JButton();
        jButton241 = new javax.swing.JButton();
        jButton242 = new javax.swing.JButton();
        jButton243 = new javax.swing.JButton();
        jButton244 = new javax.swing.JButton();
        jLabel544 = new javax.swing.JLabel();
        jLabel542 = new javax.swing.JLabel();
        jLabel541 = new javax.swing.JLabel();
        jLabel549 = new javax.swing.JLabel();
        itemg6title = new javax.swing.JLabel();
        itemg6price = new javax.swing.JLabel();
        jButton247 = new javax.swing.JButton();
        jButton248 = new javax.swing.JButton();
        jLabel554 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel23 = new javax.swing.JPanel();
        itemh2title = new javax.swing.JLabel();
        itemh1price = new javax.swing.JLabel();
        itemh1title = new javax.swing.JLabel();
        itemh3price = new javax.swing.JLabel();
        itemh3title = new javax.swing.JLabel();
        jLabel862 = new javax.swing.JLabel();
        jLabel863 = new javax.swing.JLabel();
        jLabel864 = new javax.swing.JLabel();
        itemh2price = new javax.swing.JLabel();
        itemh4price = new javax.swing.JLabel();
        itemh4title = new javax.swing.JLabel();
        jLabel880 = new javax.swing.JLabel();
        itemh6price = new javax.swing.JLabel();
        itemh6title = new javax.swing.JLabel();
        jLabel889 = new javax.swing.JLabel();
        itemh5price = new javax.swing.JLabel();
        itemh5title = new javax.swing.JLabel();
        jLabel901 = new javax.swing.JLabel();
        jButton425 = new javax.swing.JButton();
        jButton426 = new javax.swing.JButton();
        jButton427 = new javax.swing.JButton();
        jButton428 = new javax.swing.JButton();
        jButton429 = new javax.swing.JButton();
        jButton430 = new javax.swing.JButton();
        jButton441 = new javax.swing.JButton();
        jButton443 = new javax.swing.JButton();
        jButton446 = new javax.swing.JButton();
        jButton451 = new javax.swing.JButton();
        jButton455 = new javax.swing.JButton();
        jButton458 = new javax.swing.JButton();
        jLabel894 = new javax.swing.JLabel();
        jLabel906 = new javax.swing.JLabel();
        jLabel881 = new javax.swing.JLabel();
        jLabel870 = new javax.swing.JLabel();
        jLabel872 = new javax.swing.JLabel();
        jLabel868 = new javax.swing.JLabel();
        jLabel525 = new javax.swing.JLabel();
        itemh7title = new javax.swing.JLabel();
        itemh7price = new javax.swing.JLabel();
        jButton201 = new javax.swing.JButton();
        jButton236 = new javax.swing.JButton();
        jLabel548 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel24 = new javax.swing.JPanel();
        jLabel918 = new javax.swing.JLabel();
        itemi1title = new javax.swing.JLabel();
        itemi1price = new javax.swing.JLabel();
        jLabel950 = new javax.swing.JLabel();
        itemi2title = new javax.swing.JLabel();
        itemi2price = new javax.swing.JLabel();
        itemi3price = new javax.swing.JLabel();
        itemi3title = new javax.swing.JLabel();
        jLabel962 = new javax.swing.JLabel();
        itemi4title = new javax.swing.JLabel();
        jLabel964 = new javax.swing.JLabel();
        itemi4price = new javax.swing.JLabel();
        jButton473 = new javax.swing.JButton();
        jButton477 = new javax.swing.JButton();
        jButton480 = new javax.swing.JButton();
        jButton482 = new javax.swing.JButton();
        jButton485 = new javax.swing.JButton();
        jButton491 = new javax.swing.JButton();
        jButton492 = new javax.swing.JButton();
        jButton494 = new javax.swing.JButton();
        jLabel965 = new javax.swing.JLabel();
        jLabel968 = new javax.swing.JLabel();
        jLabel956 = new javax.swing.JLabel();
        jLabel931 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel21 = new javax.swing.JPanel();
        itemj1price = new javax.swing.JLabel();
        itemj1title = new javax.swing.JLabel();
        jLabel736 = new javax.swing.JLabel();
        jButton367 = new javax.swing.JButton();
        jButton379 = new javax.swing.JButton();
        jLabel747 = new javax.swing.JLabel();
        itemj3price = new javax.swing.JLabel();
        itemj3title = new javax.swing.JLabel();
        itemj2price = new javax.swing.JLabel();
        itemj2title = new javax.swing.JLabel();
        jLabel440 = new javax.swing.JLabel();
        jLabel505 = new javax.swing.JLabel();
        jButton223 = new javax.swing.JButton();
        jButton225 = new javax.swing.JButton();
        jButton227 = new javax.swing.JButton();
        jButton228 = new javax.swing.JButton();
        jLabel509 = new javax.swing.JLabel();
        jLabel508 = new javax.swing.JLabel();
        itemj4price = new javax.swing.JLabel();
        itemj4title = new javax.swing.JLabel();
        jLabel535 = new javax.swing.JLabel();
        jButton239 = new javax.swing.JButton();
        jButton240 = new javax.swing.JButton();
        jLabel536 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel369.setText("Steak with Fries");
        jPanel15.add(jLabel369, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jButton93.setBackground(new java.awt.Color(153, 153, 255));
        jButton93.setForeground(new java.awt.Color(255, 255, 255));
        jButton93.setText("Add To Cart");
        jPanel15.add(jButton93, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jLabel370.setText("RM 12.00");
        jPanel15.add(jLabel370, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        jLabel371.setText("Salad");
        jPanel15.add(jLabel371, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        jLabel372.setText("RM20.00");
        jPanel15.add(jLabel372, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel373.setText("Tender Grilled Chicken");
        jPanel15.add(jLabel373, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel374.setText("RM13.00");
        jPanel15.add(jLabel374, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, -1));

        jLabel375.setText("Japanese Bento Rice");
        jPanel15.add(jLabel375, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel376.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Vegetable Image.jpg"))); // NOI18N
        jLabel376.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel376, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 200, 130));

        jLabel377.setText("RM22.00");
        jPanel15.add(jLabel377, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        jLabel378.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Drinks Image.jpg"))); // NOI18N
        jLabel378.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel378, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 200, 130));

        jLabel379.setText("Fried Salmon");
        jPanel15.add(jLabel379, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jLabel380.setText("Strawberry Smoothie");
        jPanel15.add(jLabel380, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        jLabel381.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Rice Image.jpg"))); // NOI18N
        jLabel381.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel381, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, 130));

        jLabel382.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Chicken 2.jpg"))); // NOI18N
        jLabel382.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel382, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 130));

        jLabel383.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Fish Image.jpg"))); // NOI18N
        jLabel383.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel383, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 200, 130));

        jLabel384.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Beef Image.jpg"))); // NOI18N
        jLabel384.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel384, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 200, 130));

        jLabel385.setText("RM25.00");
        jPanel15.add(jLabel385, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel386.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel386, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, 220));

        jButton94.setBackground(new java.awt.Color(153, 153, 255));
        jButton94.setForeground(new java.awt.Color(255, 255, 255));
        jButton94.setText("Add To Cart");
        jPanel15.add(jButton94, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabel387.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel387, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 200, 220));

        jButton95.setBackground(new java.awt.Color(153, 153, 255));
        jButton95.setForeground(new java.awt.Color(255, 255, 255));
        jButton95.setText("Add To Cart");
        jPanel15.add(jButton95, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jButton96.setBackground(new java.awt.Color(153, 153, 255));
        jButton96.setForeground(new java.awt.Color(255, 255, 255));
        jButton96.setText("Add To Cart");
        jPanel15.add(jButton96, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        jButton97.setBackground(new java.awt.Color(153, 153, 255));
        jButton97.setForeground(new java.awt.Color(255, 255, 255));
        jButton97.setText("Add To Cart");
        jPanel15.add(jButton97, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        jButton98.setBackground(new java.awt.Color(153, 153, 255));
        jButton98.setForeground(new java.awt.Color(255, 255, 255));
        jButton98.setText("Add to Cart");
        jPanel15.add(jButton98, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel388.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel388, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 220));

        jLabel389.setText("RM 9.00");
        jPanel15.add(jLabel389, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel390.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel390, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 200, 220));

        jLabel391.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel391, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 200, 220));

        jLabel392.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel392, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 200, 220));

        jButton99.setBackground(new java.awt.Color(153, 153, 255));
        jButton99.setForeground(new java.awt.Color(255, 255, 255));
        jButton99.setText("Add To Cart");
        jPanel15.add(jButton99, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, -1));

        jLabel393.setText("RM 14.00");
        jPanel15.add(jLabel393, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 660, -1, -1));

        jLabel394.setText("Beef Noodle");
        jPanel15.add(jLabel394, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, -1, -1));

        jLabel395.setText("RM 12.50");
        jPanel15.add(jLabel395, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, -1, -1));

        jLabel396.setText("Beef Burger");
        jPanel15.add(jLabel396, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, -1, -1));

        jLabel397.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef noodle.jpg"))); // NOI18N
        jLabel397.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel397, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 200, 130));

        jLabel398.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/japanese noodle.jpg"))); // NOI18N
        jLabel398.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel398, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 200, 130));

        jLabel399.setText("Japanese Noodle");
        jPanel15.add(jLabel399, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, -1, -1));

        jLabel400.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef burger.jpg"))); // NOI18N
        jLabel400.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel400, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 200, 130));

        jLabel401.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel401, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 200, 220));

        jButton100.setBackground(new java.awt.Color(153, 153, 255));
        jButton100.setForeground(new java.awt.Color(255, 255, 255));
        jButton100.setText("Add To Cart");
        jPanel15.add(jButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 690, -1, -1));

        jLabel402.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel402, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 200, 220));

        jButton101.setBackground(new java.awt.Color(153, 153, 255));
        jButton101.setForeground(new java.awt.Color(255, 255, 255));
        jButton101.setText("Add To Cart");
        jPanel15.add(jButton101, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 690, -1, -1));

        jLabel403.setText("RM 10.00");
        jPanel15.add(jLabel403, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, -1, -1));

        jLabel404.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel404, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 200, 220));

        jButton102.setBackground(new java.awt.Color(153, 153, 255));
        jButton102.setForeground(new java.awt.Color(255, 255, 255));
        jButton102.setText("Add To Cart");
        jPanel15.add(jButton102, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 930, -1, -1));

        jLabel405.setText("RM 15.00");
        jPanel15.add(jLabel405, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 900, -1, -1));

        jLabel406.setText("Lasagna");
        jPanel15.add(jLabel406, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 880, -1, -1));

        jLabel407.setText("RM 8.00");
        jPanel15.add(jLabel407, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 900, -1, -1));

        jLabel408.setText("Kimchi");
        jPanel15.add(jLabel408, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 880, -1, -1));

        jLabel409.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/lasagna.jpg"))); // NOI18N
        jLabel409.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel409, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 740, 200, 130));

        jLabel410.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small coffee.jpg"))); // NOI18N
        jLabel410.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel410, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 740, 200, 130));

        jLabel411.setText("Cofee");
        jPanel15.add(jLabel411, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 880, -1, -1));

        jLabel412.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/kimchi.jpg"))); // NOI18N
        jLabel412.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel412, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, 200, 130));

        jLabel413.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel413, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, 200, 220));

        jButton103.setBackground(new java.awt.Color(153, 153, 255));
        jButton103.setForeground(new java.awt.Color(255, 255, 255));
        jButton103.setText("Add To Cart");
        jPanel15.add(jButton103, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 930, -1, -1));

        jLabel414.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel414, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 740, 200, 220));

        jButton104.setBackground(new java.awt.Color(153, 153, 255));
        jButton104.setForeground(new java.awt.Color(255, 255, 255));
        jButton104.setText("Add To Cart");
        jPanel15.add(jButton104, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 930, -1, -1));

        jLabel415.setText("RM 7.00");
        jPanel15.add(jLabel415, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 900, -1, -1));

        jLabel416.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel416, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 740, 200, 220));

        jButton105.setBackground(new java.awt.Color(153, 153, 255));
        jButton105.setForeground(new java.awt.Color(255, 255, 255));
        jButton105.setText("Add To Cart");
        jPanel15.add(jButton105, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 1170, -1, -1));

        jLabel417.setText("RM 11.50");
        jPanel15.add(jLabel417, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 1140, -1, -1));

        jLabel418.setText("Spaghetti");
        jPanel15.add(jLabel418, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1120, -1, -1));

        jLabel419.setText("RM 7.00");
        jPanel15.add(jLabel419, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1140, -1, -1));

        jLabel420.setText("Fruit Juice");
        jPanel15.add(jLabel420, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1120, -1, -1));

        jLabel421.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small spaghetti.jpg"))); // NOI18N
        jLabel421.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel421, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 980, 200, 130));

        jLabel422.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/water.jpg"))); // NOI18N
        jLabel422.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel422, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 980, 200, 130));

        jLabel423.setText("Water");
        jPanel15.add(jLabel423, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 1120, -1, -1));

        jLabel424.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small juice.jpg"))); // NOI18N
        jLabel424.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel424, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 980, 200, 130));

        jLabel425.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel425, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 980, 200, 220));

        jButton106.setBackground(new java.awt.Color(153, 153, 255));
        jButton106.setForeground(new java.awt.Color(255, 255, 255));
        jButton106.setText("Add To Cart");
        jPanel15.add(jButton106, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 1170, -1, -1));

        jLabel426.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel426, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 980, 200, 220));

        jButton107.setBackground(new java.awt.Color(153, 153, 255));
        jButton107.setForeground(new java.awt.Color(255, 255, 255));
        jButton107.setText("Add To Cart");
        jPanel15.add(jButton107, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 1170, -1, -1));

        jLabel427.setText("RM 1.00");
        jPanel15.add(jLabel427, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 1140, -1, -1));

        jLabel428.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel15.add(jLabel428, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 980, 200, 220));

        jScrollPane7.setViewportView(jPanel15);

        jButton118.setBackground(new java.awt.Color(153, 153, 255));
        jButton118.setForeground(new java.awt.Color(255, 255, 255));
        jButton118.setText("+1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item1BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item1BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item1BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item1BtnNeg.setText("-1");
        item1BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item1BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        item4BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item4BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item4BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item4BtnPos.setText("+1");
        item4BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item4BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 435, 52, -1));

        item1BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item1BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item1BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item1BtnPos.setText("+1");
        item1BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item1BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        item2BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item2BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item2BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item2BtnPos.setText("+1");
        item2BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item2BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, -1, -1));

        item2BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item2BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item2BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item2BtnNeg.setText("-1");
        item2BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item2BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        item3BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item3BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item3BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item3BtnNeg.setText("-1");
        item3BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item3BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 52, -1));

        item3BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item3BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item3BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item3BtnPos.setText("+1");
        item3BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item3BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 195, 52, -1));

        item5BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item5BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item5BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item5BtnPos.setText("+1");
        item5BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item5BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 435, -1, -1));

        item6BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item6BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item6BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item6BtnPos.setText("+1");
        item6BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item6BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 435, 52, -1));

        item9BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item9BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item9BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item9BtnPos.setText("+1");
        item9BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item9BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item9BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 675, 52, -1));

        item8BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item8BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item8BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item8BtnPos.setText("+1");
        item8BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item8BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item8BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 675, -1, -1));

        item7BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item7BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item7BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item7BtnPos.setText("+1");
        item7BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item7BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item7BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 675, 52, -1));

        item12BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item12BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item12BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item12BtnPos.setText("+1");
        item12BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item12BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item12BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 915, 52, -1));

        item11BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item11BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item11BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item11BtnPos.setText("+1");
        item11BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item11BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item11BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 915, -1, -1));

        item10BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item10BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item10BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item10BtnPos.setText("+1");
        item10BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item10BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item10BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 915, 52, -1));

        item15BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item15BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item15BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item15BtnPos.setText("+1");
        item15BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item15BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item15BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 1155, 52, -1));

        item14BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item14BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item14BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item14BtnPos.setText("+1");
        item14BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item14BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item14BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 1155, -1, -1));

        item13BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item13BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item13BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item13BtnPos.setText("+1");
        item13BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item13BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item13BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 1155, 52, -1));

        item4BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item4BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item4BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item4BtnNeg.setText("-1");
        item4BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item4BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 435, 52, -1));

        item5BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item5BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item5BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item5BtnNeg.setText("-1");
        item5BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item5BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 435, 52, -1));

        item6BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item6BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item6BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item6BtnNeg.setText("-1");
        item6BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item6BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 435, 52, -1));

        item7BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item7BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item7BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item7BtnNeg.setText("-1");
        item7BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item7BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item7BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 675, 52, -1));

        item8BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item8BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item8BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item8BtnNeg.setText("-1");
        item8BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item8BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item8BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 675, 52, -1));

        item9BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item9BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item9BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item9BtnNeg.setText("-1");
        item9BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item9BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item9BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 675, 52, -1));

        item10BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item10BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item10BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item10BtnNeg.setText("-1");
        item10BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item10BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item10BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 915, 52, -1));

        item11BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item11BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item11BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item11BtnNeg.setText("-1");
        item11BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item11BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item11BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 915, 52, -1));

        item12BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item12BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item12BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item12BtnNeg.setText("-1");
        item12BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item12BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item12BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 915, 52, -1));

        item15BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item15BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item15BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item15BtnNeg.setText("-1");
        item15BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item15BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item15BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1155, 52, -1));

        item14BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item14BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item14BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item14BtnNeg.setText("-1");
        item14BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item14BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item14BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1155, 52, -1));

        item13BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item13BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item13BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item13BtnNeg.setText("-1");
        item13BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item13BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item13BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1155, 52, -1));

        item18BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item18BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item18BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item18BtnPos.setText("+1");
        item18BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item18BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item18BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 1395, 52, -1));

        item17BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item17BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item17BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item17BtnPos.setText("+1");
        item17BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item17BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item17BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 1395, -1, -1));

        item16BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item16BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item16BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item16BtnPos.setText("+1");
        item16BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item16BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item16BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 1395, 52, -1));

        item18BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item18BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item18BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item18BtnNeg.setText("-1");
        item18BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item18BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item18BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1395, 52, -1));

        item17BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item17BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item17BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item17BtnNeg.setText("-1");
        item17BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item17BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item17BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1395, 52, -1));

        item16BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item16BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item16BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item16BtnNeg.setText("-1");
        item16BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item16BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item16BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1395, 52, -1));

        item21BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item21BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item21BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item21BtnPos.setText("+1");
        item21BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item21BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item21BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 1635, 52, -1));

        item20BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item20BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item20BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item20BtnPos.setText("+1");
        item20BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item20BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item20BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 1635, 52, -1));

        item19BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item19BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item19BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item19BtnPos.setText("+1");
        item19BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item19BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item19BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 1635, 52, -1));

        item21BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item21BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item21BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item21BtnNeg.setText("-1");
        item21BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item21BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item21BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 1635, 52, -1));

        item20BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item20BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item20BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item20BtnNeg.setText("-1");
        item20BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item20BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item20BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1635, 52, -1));

        item19BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item19BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item19BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item19BtnNeg.setText("-1");
        item19BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item19BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item19BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1635, 52, -1));

        item22BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item22BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item22BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item22BtnPos.setText("+1");
        item22BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item22BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item22BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 1875, 52, -1));

        item22BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item22BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item22BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item22BtnNeg.setText("-1");
        item22BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item22BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item22BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 1875, 52, -1));

        item23BtnPos.setBackground(new java.awt.Color(153, 153, 255));
        item23BtnPos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item23BtnPos.setForeground(new java.awt.Color(255, 255, 255));
        item23BtnPos.setText("+1");
        item23BtnPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item23BtnPosActionPerformed(evt);
            }
        });
        jPanel13.add(item23BtnPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 1875, -1, -1));

        item23BtnNeg.setBackground(new java.awt.Color(153, 153, 255));
        item23BtnNeg.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        item23BtnNeg.setForeground(new java.awt.Color(255, 255, 255));
        item23BtnNeg.setText("-1");
        item23BtnNeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item23BtnNegActionPerformed(evt);
            }
        });
        jPanel13.add(item23BtnNeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 1875, 52, -1));

        item2Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item2Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item2Title.setText("Steak with Fries");
        jPanel13.add(item2Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 200, -1));

        item5Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item5Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item5Price.setText("RM 12.00");
        jPanel13.add(item5Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, -1));

        item5Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item5Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item5Title.setText("Salad");
        jPanel13.add(item5Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 200, -1));

        item1Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item1Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item1Price.setText("RM 20.00");
        jPanel13.add(item1Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, -1));

        item1Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item1Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item1Title.setText("Tender Grilled Chicken");
        jPanel13.add(item1Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, -1));

        item4Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item4Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item4Price.setText("RM 13.00");
        jPanel13.add(item4Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 200, -1));

        item4Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item4Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item4Title.setText("Japanese Bento Rice");
        jPanel13.add(item4Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, -1));

        jLabel256.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Vegetable Image.jpg"))); // NOI18N
        jLabel256.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 200, 130));

        item3Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item3Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item3Price.setText("RM 22.00");
        jPanel13.add(item3Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 200, -1));

        jLabel258.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Drinks Image.jpg"))); // NOI18N
        jLabel258.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 200, 130));

        item3Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item3Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item3Title.setText("Fried Salmon");
        jPanel13.add(item3Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 200, -1));

        item6Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item6Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item6Title.setText("Strawberry Smoothie");
        jPanel13.add(item6Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 200, -1));

        jLabel261.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Rice Image.jpg"))); // NOI18N
        jLabel261.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 130));

        jLabel262.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Chicken 2.jpg"))); // NOI18N
        jLabel262.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        jLabel263.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Fish Image.jpg"))); // NOI18N
        jLabel263.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 130));

        jLabel264.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Beef Image.jpg"))); // NOI18N
        jLabel264.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        item2Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item2Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item2Price.setText("RM 25.00");
        jPanel13.add(item2Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 200, -1));

        jLabel266.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 220));

        jLabel267.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 200, 220));

        jLabel268.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        item6Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item6Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item6Price.setText("RM 9.00");
        jPanel13.add(item6Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 200, -1));

        jLabel270.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 220));

        jLabel271.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 200, 220));

        jLabel272.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel272, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        item8Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item8Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item8Price.setText("RM 14.00");
        jPanel13.add(item8Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 200, -1));

        item8Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item8Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item8Title.setText("Beef Noodle");
        jPanel13.add(item8Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 200, -1));

        item7Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item7Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item7Price.setText("RM 12.50");
        jPanel13.add(item7Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 200, -1));

        item7Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item7Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item7Title.setText("Beef Burger");
        jPanel13.add(item7Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 200, -1));

        jLabel277.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef noodle.jpg"))); // NOI18N
        jLabel277.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel277, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 200, 130));

        jLabel278.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/japanese noodle.jpg"))); // NOI18N
        jLabel278.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 200, 130));

        item9Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item9Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item9Title.setText("Japanese Noodle");
        jPanel13.add(item9Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 200, -1));

        jLabel280.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef burger.jpg"))); // NOI18N
        jLabel280.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 130));

        jLabel281.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 220));

        jLabel282.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel282.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel282.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 200, 220));

        item9Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item9Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item9Price.setText("RM 10.00");
        jPanel13.add(item9Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 650, 200, -1));

        jLabel284.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 200, 220));

        item11Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item11Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item11Price.setText("RM 15.00");
        jPanel13.add(item11Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 890, 200, -1));

        item11Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item11Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item11Title.setText("Lasagna");
        jPanel13.add(item11Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 870, 200, -1));

        item10Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item10Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item10Price.setText("RM 8.00");
        jPanel13.add(item10Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 890, 200, -1));

        item10Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item10Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item10Title.setText("Kimchi");
        jPanel13.add(item10Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 870, 200, -1));

        jLabel289.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/lasagna.jpg"))); // NOI18N
        jLabel289.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel289, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 730, 200, 130));

        jLabel290.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small coffee.jpg"))); // NOI18N
        jLabel290.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel290, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 730, 200, 130));

        item12Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item12Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item12Title.setText("Coffee");
        jPanel13.add(item12Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 870, 200, -1));

        jLabel292.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/kimchi.jpg"))); // NOI18N
        jLabel292.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel292, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 200, 130));

        jLabel293.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel293, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 200, 220));

        jLabel294.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel294, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 730, 200, 220));

        item12Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item12Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item12Price.setText("RM 7.00");
        jPanel13.add(item12Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 890, 200, -1));

        jLabel296.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel296, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 730, 200, 220));

        item14Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item14Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item14Price.setText("RM 11.50");
        jPanel13.add(item14Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1130, 200, -1));

        item14Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item14Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item14Title.setText("Spaghetti");
        jPanel13.add(item14Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1110, 200, -1));

        item13Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item13Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item13Price.setText("RM 7.00");
        jPanel13.add(item13Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1130, 200, -1));

        item13Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item13Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item13Title.setText("Fruit Juice");
        jPanel13.add(item13Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1110, 200, -1));

        jLabel301.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small spaghetti.jpg"))); // NOI18N
        jLabel301.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel301, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 970, 200, 130));

        jLabel302.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/water.jpg"))); // NOI18N
        jLabel302.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel302, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 970, 200, 130));

        item15Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item15Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item15Title.setText("Water");
        jPanel13.add(item15Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1110, 200, -1));

        jLabel304.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small juice.jpg"))); // NOI18N
        jLabel304.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel304, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 970, 200, 130));

        jLabel305.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel305, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 970, 200, 220));

        jLabel306.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel306, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 970, 200, 220));

        item15Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item15Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item15Price.setText("RM 1.00");
        jPanel13.add(item15Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 1130, 200, -1));

        jLabel308.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel308, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 970, 200, 220));

        item17Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item17Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item17Price.setText("RM 4.00");
        jPanel13.add(item17Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1370, 200, -1));

        item17Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item17Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item17Title.setText("Edamame");
        jPanel13.add(item17Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 1350, 190, -1));

        item16Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item16Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item16Price.setText("RM 7.50");
        jPanel13.add(item16Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1370, 200, -1));

        item16Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item16Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item16Title.setText("Avacado Slice");
        jPanel13.add(item16Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1350, 200, -1));

        jLabel367.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small beans.jpg"))); // NOI18N
        jLabel367.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel367, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1210, 200, 130));

        jLabel431.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small chicken chop.jpg"))); // NOI18N
        jLabel431.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel431, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1210, 200, 130));

        item18Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item18Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item18Title.setText("Chicken Chop");
        jPanel13.add(item18Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 1350, 200, -1));

        jLabel435.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small avacado slice.jpg"))); // NOI18N
        jLabel435.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel435, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1210, 200, 130));

        jLabel436.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel436, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1210, 200, 220));

        jLabel438.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel438, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1210, 200, 220));

        item18Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item18Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item18Price.setText("RM 17.00");
        jPanel13.add(item18Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 1370, 200, -1));

        jLabel447.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel447, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1210, 200, 220));

        item20Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item20Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item20Price.setText("RM 8.50");
        jPanel13.add(item20Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1610, 200, -1));

        item20Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item20Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item20Title.setText("Curry Rice");
        jPanel13.add(item20Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1590, 200, -1));

        item19Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item19Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item19Price.setText("RM 8.00");
        jPanel13.add(item19Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1610, 200, -1));

        item19Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item19Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item19Title.setText("Fried Rice");
        jPanel13.add(item19Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1590, 200, -1));

        jLabel465.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small rice curry.jpg"))); // NOI18N
        jLabel465.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel465, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1450, 200, 130));

        jLabel466.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small steam fish.jpg"))); // NOI18N
        jLabel466.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel466, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1450, 200, 130));

        item21Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item21Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item21Title.setText("Steamed Fish");
        jPanel13.add(item21Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 1590, 190, -1));

        jLabel468.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small fried rice.jpg"))); // NOI18N
        jLabel468.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel468, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1450, 200, 130));

        jLabel469.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel469, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1450, 200, 220));

        jLabel470.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel470, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1450, 200, 220));

        item21Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item21Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item21Price.setText("RM 28.00");
        jPanel13.add(item21Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1610, 200, -1));

        jLabel472.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel472, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 1450, 200, 220));

        item22Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item22Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item22Price.setText("RM 7.50");
        jPanel13.add(item22Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1850, 200, -1));

        item22Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item22Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item22Title.setText("Bowl of Strawberries");
        jPanel13.add(item22Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1830, 200, -1));

        jLabel480.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small strawberry.jpg"))); // NOI18N
        jLabel480.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel480, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1690, 200, 130));

        jLabel481.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel481, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1690, 200, 220));

        jLabel473.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small sushi.jpg"))); // NOI18N
        jLabel473.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel473, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1690, 200, 130));

        item23Title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item23Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item23Title.setText("Sushi");
        jPanel13.add(item23Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1830, 200, -1));

        item23Price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        item23Price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        item23Price.setText("RM 10.00");
        jPanel13.add(item23Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1850, 200, -1));

        jLabel482.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel13.add(jLabel482, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 1690, 200, 220));

        jScrollPane5.setViewportView(jPanel13);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("All", jPanel3);

        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton145.setBackground(new java.awt.Color(153, 153, 255));
        jButton145.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton145.setForeground(new java.awt.Color(255, 255, 255));
        jButton145.setText("-1");
        jButton145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton145ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton145, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        jButton146.setBackground(new java.awt.Color(153, 153, 255));
        jButton146.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton146.setForeground(new java.awt.Color(255, 255, 255));
        jButton146.setText("+1");
        jButton146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton146ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton146, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        jButton147.setBackground(new java.awt.Color(153, 153, 255));
        jButton147.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton147.setForeground(new java.awt.Color(255, 255, 255));
        jButton147.setText("+1");
        jButton147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton147ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton147, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, 52, -1));

        jButton148.setBackground(new java.awt.Color(153, 153, 255));
        jButton148.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton148.setForeground(new java.awt.Color(255, 255, 255));
        jButton148.setText("-1");
        jButton148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton148ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton148, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        jButton149.setBackground(new java.awt.Color(153, 153, 255));
        jButton149.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton149.setForeground(new java.awt.Color(255, 255, 255));
        jButton149.setText("-1");
        jButton149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton149ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton149, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 52, -1));

        jButton150.setBackground(new java.awt.Color(153, 153, 255));
        jButton150.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton150.setForeground(new java.awt.Color(255, 255, 255));
        jButton150.setText("+1");
        jButton150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton150ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton150, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 195, 52, -1));

        jButton160.setBackground(new java.awt.Color(153, 153, 255));
        jButton160.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton160.setForeground(new java.awt.Color(255, 255, 255));
        jButton160.setText("+1");
        jButton160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton160ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton160, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 435, 52, -1));

        jButton161.setBackground(new java.awt.Color(153, 153, 255));
        jButton161.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton161.setForeground(new java.awt.Color(255, 255, 255));
        jButton161.setText("+1");
        jButton161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton161ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton161, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 435, 52, -1));

        jButton171.setBackground(new java.awt.Color(153, 153, 255));
        jButton171.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton171.setForeground(new java.awt.Color(255, 255, 255));
        jButton171.setText("-1");
        jButton171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton171ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton171, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 435, 52, -1));

        jButton172.setBackground(new java.awt.Color(153, 153, 255));
        jButton172.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton172.setForeground(new java.awt.Color(255, 255, 255));
        jButton172.setText("-1");
        jButton172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton172ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton172, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 435, 52, -1));

        jButton195.setBackground(new java.awt.Color(153, 153, 255));
        jButton195.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton195.setForeground(new java.awt.Color(255, 255, 255));
        jButton195.setText("+1");
        jButton195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton195ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton195, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 435, 52, -1));

        jButton204.setBackground(new java.awt.Color(153, 153, 255));
        jButton204.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton204.setForeground(new java.awt.Color(255, 255, 255));
        jButton204.setText("-1");
        jButton204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton204ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton204, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 435, 52, -1));

        jButton212.setBackground(new java.awt.Color(153, 153, 255));
        jButton212.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton212.setForeground(new java.awt.Color(255, 255, 255));
        jButton212.setText("+1");
        jButton212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton212ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton212, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 670, 52, -1));

        jButton218.setBackground(new java.awt.Color(153, 153, 255));
        jButton218.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton218.setForeground(new java.awt.Color(255, 255, 255));
        jButton218.setText("-1");
        jButton218.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton218ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton218, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 52, -1));

        jButton213.setBackground(new java.awt.Color(153, 153, 255));
        jButton213.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton213.setForeground(new java.awt.Color(255, 255, 255));
        jButton213.setText("+1");
        jButton213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton213ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton213, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 670, 52, -1));

        jButton217.setBackground(new java.awt.Color(153, 153, 255));
        jButton217.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton217.setForeground(new java.awt.Color(255, 255, 255));
        jButton217.setText("-1");
        jButton217.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton217ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton217, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, 52, -1));

        itema2title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema2title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema2title.setText("Steak with Fries");
        jPanel16.add(itema2title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 200, -1));

        itema1price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema1price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema1price.setText("RM 20.00");
        jPanel16.add(itema1price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, -1));

        itema1title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema1title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema1title.setText("Tender Grilled Chicken");
        jPanel16.add(itema1title, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 150, 190, -1));

        itema3price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema3price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema3price.setText("RM 22.00");
        jPanel16.add(itema3price, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 200, -1));

        itema3title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema3title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema3title.setText("Fried Salmon");
        jPanel16.add(itema3title, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 150, 200, -1));

        jLabel442.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Chicken 2.jpg"))); // NOI18N
        jLabel442.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel442, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        jLabel443.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Fish Image.jpg"))); // NOI18N
        jLabel443.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel443, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 130));

        jLabel444.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Beef Image.jpg"))); // NOI18N
        jLabel444.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel444, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        itema2price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema2price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema2price.setText("RM 25.00");
        jPanel16.add(itema2price, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 170, 200, -1));

        jLabel448.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel448, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        jLabel450.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel450, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 220));

        jLabel452.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel452, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        itema5price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema5price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema5price.setText("RM 14.00");
        jPanel16.add(itema5price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, -1));

        itema5title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema5title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema5title.setText("Beef Noodle");
        jPanel16.add(itema5title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 200, -1));

        itema4price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema4price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema4price.setText("RM 12.50");
        jPanel16.add(itema4price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 200, -1));

        itema4title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema4title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema4title.setText("Beef Burger");
        jPanel16.add(itema4title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 200, -1));

        jLabel457.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef noodle.jpg"))); // NOI18N
        jLabel457.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel457, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 200, 130));

        jLabel460.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef burger.jpg"))); // NOI18N
        jLabel460.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel460, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 130));

        jLabel461.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel461, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 220));

        jLabel462.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel462, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 200, 220));

        jLabel441.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small chicken chop.jpg"))); // NOI18N
        jLabel441.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel441, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 200, 130));

        itema6title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema6title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema6title.setText("Chicken Chop");
        jPanel16.add(itema6title, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 390, 200, -1));

        itema6price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema6price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema6price.setText("RM 17.00");
        jPanel16.add(itema6price, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 200, -1));

        jLabel478.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel478, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 200, 220));

        jLabel486.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small steam fish.jpg"))); // NOI18N
        jLabel486.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel486, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 130));

        itema7title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema7title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema7title.setText("Steamed Fish");
        jPanel16.add(itema7title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 200, -1));

        itema7price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema7price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema7price.setText("RM 28.00");
        jPanel16.add(itema7price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 190, -1));

        jLabel492.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel492, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 220));

        jLabel483.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small sushi.jpg"))); // NOI18N
        jLabel483.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel483, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 200, 130));

        itema8title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema8title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema8title.setText("Sushi");
        jPanel16.add(itema8title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 200, -1));

        itema8price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itema8price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itema8price.setText("RM 10.00");
        jPanel16.add(itema8price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 200, -1));

        jLabel488.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel16.add(jLabel488, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 200, 220));

        jScrollPane10.setViewportView(jPanel16);

        jTabbedPane1.addTab("Meat", jScrollPane10);

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemb1price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemb1price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemb1price.setText("RM 22.00");
        jPanel17.add(itemb1price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 170, 200, -1));

        itemb1title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemb1title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemb1title.setText("Fried Salmon");
        jPanel17.add(itemb1title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, -1));

        jLabel503.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Fish Image.jpg"))); // NOI18N
        jLabel503.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel17.add(jLabel503, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        jButton184.setBackground(new java.awt.Color(153, 153, 255));
        jButton184.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton184.setForeground(new java.awt.Color(255, 255, 255));
        jButton184.setText("-1");
        jButton184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton184ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton184, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        jButton185.setBackground(new java.awt.Color(153, 153, 255));
        jButton185.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton185.setForeground(new java.awt.Color(255, 255, 255));
        jButton185.setText("+1");
        jButton185.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton185ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton185, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        jLabel510.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel17.add(jLabel510, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        jLabel494.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small steam fish.jpg"))); // NOI18N
        jLabel494.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel17.add(jLabel494, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        itemb2title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemb2title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemb2title.setText("Steamed Fish");
        jPanel17.add(itemb2title, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 150, 190, -1));

        itemb2price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemb2price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemb2price.setText("RM 28.00");
        jPanel17.add(itemb2price, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 170, 200, -1));

        jButton219.setBackground(new java.awt.Color(153, 153, 255));
        jButton219.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton219.setForeground(new java.awt.Color(255, 255, 255));
        jButton219.setText("+1");
        jButton219.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton219ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton219, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, 52, -1));

        jButton222.setBackground(new java.awt.Color(153, 153, 255));
        jButton222.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton222.setForeground(new java.awt.Color(255, 255, 255));
        jButton222.setText("-1");
        jButton222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton222ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton222, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        jLabel502.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel17.add(jLabel502, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        jLabel489.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small sushi.jpg"))); // NOI18N
        jLabel489.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel17.add(jLabel489, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 130));

        itemb3title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemb3title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemb3title.setText("Sushi");
        jPanel17.add(itemb3title, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 200, -1));

        itemb3price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemb3price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemb3price.setText("RM 10.00");
        jPanel17.add(itemb3price, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 170, 200, -1));

        jButton220.setBackground(new java.awt.Color(153, 153, 255));
        jButton220.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton220.setForeground(new java.awt.Color(255, 255, 255));
        jButton220.setText("+1");
        jButton220.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton220ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton220, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 195, 52, -1));

        jButton221.setBackground(new java.awt.Color(153, 153, 255));
        jButton221.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton221.setForeground(new java.awt.Color(255, 255, 255));
        jButton221.setText("-1");
        jButton221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton221ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton221, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 52, -1));

        jLabel496.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel17.add(jLabel496, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 220));

        jScrollPane11.setViewportView(jPanel17);

        jTabbedPane1.addTab("Fish", jScrollPane11);

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemd1price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemd1price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemd1price.setText("RM 20.00");
        jPanel18.add(itemd1price, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, 190, -1));

        itemd1title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemd1title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemd1title.setText("Tender Grilled Chicken");
        jPanel18.add(itemd1title, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 150, 190, -1));

        jLabel562.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Chicken 2.jpg"))); // NOI18N
        jLabel562.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel18.add(jLabel562, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        jButton215.setBackground(new java.awt.Color(153, 153, 255));
        jButton215.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton215.setForeground(new java.awt.Color(255, 255, 255));
        jButton215.setText("-1");
        jButton215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton215ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton215, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        jButton216.setBackground(new java.awt.Color(153, 153, 255));
        jButton216.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton216.setForeground(new java.awt.Color(255, 255, 255));
        jButton216.setText("+1");
        jButton216.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton216ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton216, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        jLabel568.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel18.add(jLabel568, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        jLabel458.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small chicken chop.jpg"))); // NOI18N
        jLabel458.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel18.add(jLabel458, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        itemd2title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemd2title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemd2title.setText("Chicken Chop");
        jPanel18.add(itemd2title, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 150, 200, -1));

        itemd2price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemd2price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemd2price.setText("RM 17.00");
        jPanel18.add(itemd2price, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 170, 200, -1));

        jButton198.setBackground(new java.awt.Color(153, 153, 255));
        jButton198.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton198.setForeground(new java.awt.Color(255, 255, 255));
        jButton198.setText("+1");
        jButton198.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton198ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton198, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, 52, -1));

        jButton224.setBackground(new java.awt.Color(153, 153, 255));
        jButton224.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton224.setForeground(new java.awt.Color(255, 255, 255));
        jButton224.setText("-1");
        jButton224.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton224ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton224, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        jLabel507.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel18.add(jLabel507, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        jScrollPane12.setViewportView(jPanel18);

        jTabbedPane1.addTab("Chicken", jScrollPane12);

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel609.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel609.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel609.setText("Steak with Fries");
        jPanel19.add(jLabel609, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 150, 200, -1));

        jLabel624.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Beef Image.jpg"))); // NOI18N
        jLabel624.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel19.add(jLabel624, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        jLabel625.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel625.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel625.setText("RM 25.00");
        jPanel19.add(jLabel625, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, 190, -1));

        jLabel633.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel633.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel633.setText("RM 14.00");
        jPanel19.add(jLabel633, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 170, 200, -1));

        jLabel634.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel634.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel634.setText("Beef Noodle");
        jPanel19.add(jLabel634, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 150, 200, -1));

        jLabel635.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel635.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel635.setText("RM 12.50");
        jPanel19.add(jLabel635, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 170, 200, -1));

        jLabel636.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel636.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel636.setText("Beef Burger");
        jPanel19.add(jLabel636, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 150, 200, -1));

        jLabel637.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef noodle.jpg"))); // NOI18N
        jLabel637.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel19.add(jLabel637, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 130));

        jLabel640.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef burger.jpg"))); // NOI18N
        jLabel640.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel19.add(jLabel640, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        jButton252.setBackground(new java.awt.Color(153, 153, 255));
        jButton252.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton252.setForeground(new java.awt.Color(255, 255, 255));
        jButton252.setText("+1");
        jButton252.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton252ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton252, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        jButton253.setBackground(new java.awt.Color(153, 153, 255));
        jButton253.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton253.setForeground(new java.awt.Color(255, 255, 255));
        jButton253.setText("-1");
        jButton253.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton253ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton253, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        jButton265.setBackground(new java.awt.Color(153, 153, 255));
        jButton265.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton265.setForeground(new java.awt.Color(255, 255, 255));
        jButton265.setText("+1");
        jButton265.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton265ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton265, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 195, 52, -1));

        jButton266.setBackground(new java.awt.Color(153, 153, 255));
        jButton266.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton266.setForeground(new java.awt.Color(255, 255, 255));
        jButton266.setText("+1");
        jButton266.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton266ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton266, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, 52, -1));

        jLabel632.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel19.add(jLabel632, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        jButton276.setBackground(new java.awt.Color(153, 153, 255));
        jButton276.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton276.setForeground(new java.awt.Color(255, 255, 255));
        jButton276.setText("-1");
        jButton276.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton276ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton276, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        jButton277.setBackground(new java.awt.Color(153, 153, 255));
        jButton277.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton277.setForeground(new java.awt.Color(255, 255, 255));
        jButton277.setText("-1");
        jButton277.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton277ActionPerformed(evt);
            }
        });
        jPanel19.add(jButton277, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 52, -1));

        jLabel642.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel19.add(jLabel642, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 220));

        jLabel641.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel19.add(jLabel641, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        jScrollPane13.setViewportView(jPanel19);

        jTabbedPane1.addTab("Beef", jScrollPane13);

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iteme1price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iteme1price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iteme1price.setText("RM 14.00");
        jPanel20.add(iteme1price, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 170, 190, -1));

        iteme1title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iteme1title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iteme1title.setText("Beef Noodle");
        jPanel20.add(iteme1title, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 150, 190, -1));

        jLabel697.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef noodle.jpg"))); // NOI18N
        jLabel697.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel20.add(jLabel697, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        jLabel698.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/japanese noodle.jpg"))); // NOI18N
        jLabel698.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel20.add(jLabel698, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        iteme2title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iteme2title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iteme2title.setText("Japanese Noodle");
        jPanel20.add(iteme2title, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 150, 190, -1));

        iteme2price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iteme2price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iteme2price.setText("RM 10.00");
        jPanel20.add(iteme2price, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 170, 200, -1));

        iteme3price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iteme3price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iteme3price.setText("RM 11.50");
        jPanel20.add(iteme3price, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 170, 200, -1));

        iteme3title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iteme3title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iteme3title.setText("Spaghetti");
        jPanel20.add(iteme3title, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 150, 190, -1));

        jLabel721.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small spaghetti.jpg"))); // NOI18N
        jLabel721.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel20.add(jLabel721, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 130));

        jButton299.setBackground(new java.awt.Color(153, 153, 255));
        jButton299.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton299.setForeground(new java.awt.Color(255, 255, 255));
        jButton299.setText("+1");
        jButton299.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton299ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton299, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, 52, -1));

        jButton300.setBackground(new java.awt.Color(153, 153, 255));
        jButton300.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton300.setForeground(new java.awt.Color(255, 255, 255));
        jButton300.setText("+1");
        jButton300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton300ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton300, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        jButton306.setBackground(new java.awt.Color(153, 153, 255));
        jButton306.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton306.setForeground(new java.awt.Color(255, 255, 255));
        jButton306.setText("+1");
        jButton306.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton306ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton306, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 195, 52, -1));

        jButton312.setBackground(new java.awt.Color(153, 153, 255));
        jButton312.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton312.setForeground(new java.awt.Color(255, 255, 255));
        jButton312.setText("-1");
        jButton312.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton312ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton312, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        jButton313.setBackground(new java.awt.Color(153, 153, 255));
        jButton313.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton313.setForeground(new java.awt.Color(255, 255, 255));
        jButton313.setText("-1");
        jButton313.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton313ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton313, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        jButton318.setBackground(new java.awt.Color(153, 153, 255));
        jButton318.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton318.setForeground(new java.awt.Color(255, 255, 255));
        jButton318.setText("-1");
        jButton318.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton318ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton318, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 52, -1));

        jLabel702.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel20.add(jLabel702, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        jLabel704.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel20.add(jLabel704, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        jLabel726.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel20.add(jLabel726, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 220));

        jScrollPane14.setViewportView(jPanel20);

        jTabbedPane1.addTab("Noodles", jScrollPane14);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemf1price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemf1price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemf1price.setText("RM 13.00");
        jPanel14.add(itemf1price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 170, 200, -1));

        itemf1title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemf1title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemf1title.setText("Japanese Bento Rice");
        jPanel14.add(itemf1title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, -1));

        jLabel321.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Rice Image.jpg"))); // NOI18N
        jLabel321.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel14.add(jLabel321, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        jButton74.setBackground(new java.awt.Color(153, 153, 255));
        jButton74.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton74.setForeground(new java.awt.Color(255, 255, 255));
        jButton74.setText("+1");
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        jButton343.setBackground(new java.awt.Color(153, 153, 255));
        jButton343.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton343.setForeground(new java.awt.Color(255, 255, 255));
        jButton343.setText("-1");
        jButton343.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton343ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton343, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        jLabel326.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel14.add(jLabel326, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        itemf3price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemf3price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemf3price.setText("RM 8.50");
        jPanel14.add(itemf3price, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 170, 190, -1));

        itemf3title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemf3title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemf3title.setText("Curry Rice");
        jPanel14.add(itemf3title, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 150, 190, -1));

        itemf2price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemf2price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemf2price.setText("RM 8.00");
        jPanel14.add(itemf2price, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 170, 190, -1));

        itemf2title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemf2title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemf2title.setText("Fried Rice");
        jPanel14.add(itemf2title, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 150, 200, -1));

        jLabel517.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small rice curry.jpg"))); // NOI18N
        jLabel517.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel14.add(jLabel517, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 130));

        jLabel520.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small fried rice.jpg"))); // NOI18N
        jLabel520.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel14.add(jLabel520, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        jButton230.setBackground(new java.awt.Color(153, 153, 255));
        jButton230.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton230.setForeground(new java.awt.Color(255, 255, 255));
        jButton230.setText("+1");
        jButton230.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton230ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton230, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 195, 52, -1));

        jButton231.setBackground(new java.awt.Color(153, 153, 255));
        jButton231.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton231.setForeground(new java.awt.Color(255, 255, 255));
        jButton231.setText("+1");
        jButton231.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton231ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton231, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, 52, -1));

        jButton233.setBackground(new java.awt.Color(153, 153, 255));
        jButton233.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton233.setForeground(new java.awt.Color(255, 255, 255));
        jButton233.setText("-1");
        jButton233.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton233ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton233, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 52, -1));

        jButton234.setBackground(new java.awt.Color(153, 153, 255));
        jButton234.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton234.setForeground(new java.awt.Color(255, 255, 255));
        jButton234.setText("-1");
        jButton234.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton234ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton234, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        jLabel522.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel14.add(jLabel522, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 220));

        jLabel521.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel14.add(jLabel521, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        jScrollPane15.setViewportView(jPanel14);

        jTabbedPane1.addTab("Rice", jScrollPane15);

        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemg1price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg1price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg1price.setText("RM 13.00");
        jPanel22.add(itemg1price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 170, 200, -1));

        itemg1title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg1title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg1title.setText("Japanese Bento Rice");
        jPanel22.add(itemg1title, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 150, 200, -1));

        jLabel801.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Rice Image.jpg"))); // NOI18N
        jLabel801.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel801, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        jButton76.setBackground(new java.awt.Color(153, 153, 255));
        jButton76.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton76.setForeground(new java.awt.Color(255, 255, 255));
        jButton76.setText("+1");
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton76, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        itemg2price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg2price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg2price.setText("RM 14.00");
        jPanel22.add(itemg2price, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 170, 190, -1));

        itemg2title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg2title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg2title.setText("Beef Noodle");
        jPanel22.add(itemg2title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 200, -1));

        jLabel817.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef noodle.jpg"))); // NOI18N
        jLabel817.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel817, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        jLabel818.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/japanese noodle.jpg"))); // NOI18N
        jLabel818.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel818, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 130));

        itemg3title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg3title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg3title.setText("Japanese Noodle");
        jPanel22.add(itemg3title, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 200, -1));

        itemg3price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg3price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg3price.setText("RM 10.00");
        jPanel22.add(itemg3price, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 170, 190, -1));

        itemg4price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg4price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg4price.setText("RM 8.00");
        jPanel22.add(itemg4price, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 410, 190, -1));

        itemg4title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg4title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg4title.setText("Kimchi");
        jPanel22.add(itemg4title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 200, -1));

        jLabel832.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/kimchi.jpg"))); // NOI18N
        jLabel832.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel832, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 130));

        jButton404.setBackground(new java.awt.Color(153, 153, 255));
        jButton404.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton404.setForeground(new java.awt.Color(255, 255, 255));
        jButton404.setText("+1");
        jButton404.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton404ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton404, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 195, 52, -1));

        jButton405.setBackground(new java.awt.Color(153, 153, 255));
        jButton405.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton405.setForeground(new java.awt.Color(255, 255, 255));
        jButton405.setText("+1");
        jButton405.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton405ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton405, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, 52, -1));

        jButton409.setBackground(new java.awt.Color(153, 153, 255));
        jButton409.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton409.setForeground(new java.awt.Color(255, 255, 255));
        jButton409.setText("+1");
        jButton409.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton409ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton409, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 435, 52, -1));

        jButton413.setBackground(new java.awt.Color(153, 153, 255));
        jButton413.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton413.setForeground(new java.awt.Color(255, 255, 255));
        jButton413.setText("-1");
        jButton413.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton413ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton413, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        jButton417.setBackground(new java.awt.Color(153, 153, 255));
        jButton417.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton417.setForeground(new java.awt.Color(255, 255, 255));
        jButton417.setText("-1");
        jButton417.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton417ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton417, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        jButton418.setBackground(new java.awt.Color(153, 153, 255));
        jButton418.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton418.setForeground(new java.awt.Color(255, 255, 255));
        jButton418.setText("-1");
        jButton418.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton418ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton418, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 52, -1));

        jButton419.setBackground(new java.awt.Color(153, 153, 255));
        jButton419.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton419.setForeground(new java.awt.Color(255, 255, 255));
        jButton419.setText("-1");
        jButton419.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton419ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton419, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 435, 52, -1));

        jLabel833.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel833, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 220));

        jLabel806.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel806, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        jLabel824.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel824, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 220));

        jLabel822.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel822, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        itemg5price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg5price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg5price.setText("RM 4.00");
        jPanel22.add(itemg5price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 200, -1));

        itemg5title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg5title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg5title.setText("Edamame");
        jPanel22.add(itemg5title, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 390, 190, -1));

        jLabel518.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small beans.jpg"))); // NOI18N
        jLabel518.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel518, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 200, 130));

        jButton226.setBackground(new java.awt.Color(153, 153, 255));
        jButton226.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton226.setForeground(new java.awt.Color(255, 255, 255));
        jButton226.setText("+1");
        jButton226.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton226ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton226, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 435, 52, -1));

        jButton235.setBackground(new java.awt.Color(153, 153, 255));
        jButton235.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton235.setForeground(new java.awt.Color(255, 255, 255));
        jButton235.setText("-1");
        jButton235.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton235ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton235, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 435, 52, -1));

        jLabel526.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel526, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 200, 220));

        itemg8price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg8price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg8price.setText("RM 8.50");
        jPanel22.add(itemg8price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 200, -1));

        itemg8title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg8title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg8title.setText("Curry Rice");
        jPanel22.add(itemg8title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 200, -1));

        itemg7price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg7price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg7price.setText("RM 8.00");
        jPanel22.add(itemg7price, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 200, -1));

        itemg7title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg7title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg7title.setText("Fried Rice");
        jPanel22.add(itemg7title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 200, -1));

        jLabel537.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small rice curry.jpg"))); // NOI18N
        jLabel537.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel537, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 200, 130));

        jLabel538.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small steam fish.jpg"))); // NOI18N
        jLabel538.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel538, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 200, 130));

        itemg9title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg9title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg9title.setText("Steamed Fish");
        jPanel22.add(itemg9title, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 630, 190, -1));

        jLabel540.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small fried rice.jpg"))); // NOI18N
        jLabel540.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel540, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 130));

        itemg9price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg9price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg9price.setText("RM 28.00");
        jPanel22.add(itemg9price, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 650, 200, -1));

        jButton237.setBackground(new java.awt.Color(153, 153, 255));
        jButton237.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton237.setForeground(new java.awt.Color(255, 255, 255));
        jButton237.setText("+1");
        jButton237.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton237ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton237, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 675, 52, -1));

        jButton238.setBackground(new java.awt.Color(153, 153, 255));
        jButton238.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton238.setForeground(new java.awt.Color(255, 255, 255));
        jButton238.setText("+1");
        jButton238.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton238ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton238, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 675, 52, -1));

        jButton241.setBackground(new java.awt.Color(153, 153, 255));
        jButton241.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton241.setForeground(new java.awt.Color(255, 255, 255));
        jButton241.setText("+1");
        jButton241.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton241ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton241, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 675, 52, -1));

        jButton242.setBackground(new java.awt.Color(153, 153, 255));
        jButton242.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton242.setForeground(new java.awt.Color(255, 255, 255));
        jButton242.setText("-1");
        jButton242.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton242ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton242, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 675, 52, -1));

        jButton243.setBackground(new java.awt.Color(153, 153, 255));
        jButton243.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton243.setForeground(new java.awt.Color(255, 255, 255));
        jButton243.setText("-1");
        jButton243.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton243ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton243, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 675, 52, -1));

        jButton244.setBackground(new java.awt.Color(153, 153, 255));
        jButton244.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton244.setForeground(new java.awt.Color(255, 255, 255));
        jButton244.setText("-1");
        jButton244.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton244ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton244, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 675, 52, -1));

        jLabel544.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel544, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 200, 220));

        jLabel542.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel542, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 200, 220));

        jLabel541.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel541, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 220));

        jLabel549.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small sushi.jpg"))); // NOI18N
        jLabel549.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel549, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 200, 130));

        itemg6title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg6title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg6title.setText("Sushi");
        jPanel22.add(itemg6title, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 390, 200, -1));

        itemg6price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemg6price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemg6price.setText("RM 10.00");
        jPanel22.add(itemg6price, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 200, -1));

        jButton247.setBackground(new java.awt.Color(153, 153, 255));
        jButton247.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton247.setForeground(new java.awt.Color(255, 255, 255));
        jButton247.setText("+1");
        jButton247.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton247ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton247, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 435, 52, -1));

        jButton248.setBackground(new java.awt.Color(153, 153, 255));
        jButton248.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton248.setForeground(new java.awt.Color(255, 255, 255));
        jButton248.setText("-1");
        jButton248.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton248ActionPerformed(evt);
            }
        });
        jPanel22.add(jButton248, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 435, 52, -1));

        jLabel554.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel22.add(jLabel554, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 200, 220));

        jScrollPane4.setViewportView(jPanel22);

        jTabbedPane1.addTab("Asian", jScrollPane4);

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemh2title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh2title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh2title.setText("Steak with Fries");
        jPanel23.add(itemh2title, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 150, 200, -1));

        itemh1price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh1price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh1price.setText("RM 20.00");
        jPanel23.add(itemh1price, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 170, 200, -1));

        itemh1title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh1title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh1title.setText("Tender Grilled Chicken");
        jPanel23.add(itemh1title, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 150, 200, -1));

        itemh3price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh3price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh3price.setText("RM 22.00");
        jPanel23.add(itemh3price, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 170, 200, -1));

        itemh3title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh3title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh3title.setText("Fried Salmon");
        jPanel23.add(itemh3title, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 150, 200, -1));

        jLabel862.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Chicken 2.jpg"))); // NOI18N
        jLabel862.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel862, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        jLabel863.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Fish Image.jpg"))); // NOI18N
        jLabel863.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel863, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 130));

        jLabel864.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Beef Image.jpg"))); // NOI18N
        jLabel864.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel864, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        itemh2price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh2price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh2price.setText("RM 25.00");
        jPanel23.add(itemh2price, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 200, -1));

        itemh4price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh4price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh4price.setText("RM 12.50");
        jPanel23.add(itemh4price, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 410, 190, -1));

        itemh4title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh4title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh4title.setText("Beef Burger");
        jPanel23.add(itemh4title, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 390, 190, -1));

        jLabel880.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/beef burger.jpg"))); // NOI18N
        jLabel880.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel880, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 130));

        itemh6price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh6price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh6price.setText("RM 15.00");
        jPanel23.add(itemh6price, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 410, 200, -1));

        itemh6title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh6title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh6title.setText("Lasagna");
        jPanel23.add(itemh6title, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 390, 190, -1));

        jLabel889.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/lasagna.jpg"))); // NOI18N
        jLabel889.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel889, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 200, 130));

        itemh5price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh5price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh5price.setText("RM 11.50");
        jPanel23.add(itemh5price, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 410, 200, -1));

        itemh5title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh5title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh5title.setText("Spaghetti");
        jPanel23.add(itemh5title, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 390, 190, -1));

        jLabel901.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small spaghetti.jpg"))); // NOI18N
        jLabel901.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel901, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 200, 130));

        jButton425.setBackground(new java.awt.Color(153, 153, 255));
        jButton425.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton425.setForeground(new java.awt.Color(255, 255, 255));
        jButton425.setText("-1");
        jButton425.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton425ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton425, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        jButton426.setBackground(new java.awt.Color(153, 153, 255));
        jButton426.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton426.setForeground(new java.awt.Color(255, 255, 255));
        jButton426.setText("+1");
        jButton426.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton426ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton426, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        jButton427.setBackground(new java.awt.Color(153, 153, 255));
        jButton427.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton427.setForeground(new java.awt.Color(255, 255, 255));
        jButton427.setText("+1");
        jButton427.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton427ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton427, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, 52, -1));

        jButton428.setBackground(new java.awt.Color(153, 153, 255));
        jButton428.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton428.setForeground(new java.awt.Color(255, 255, 255));
        jButton428.setText("-1");
        jButton428.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton428ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton428, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        jButton429.setBackground(new java.awt.Color(153, 153, 255));
        jButton429.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton429.setForeground(new java.awt.Color(255, 255, 255));
        jButton429.setText("-1");
        jButton429.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton429ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton429, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 52, -1));

        jButton430.setBackground(new java.awt.Color(153, 153, 255));
        jButton430.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton430.setForeground(new java.awt.Color(255, 255, 255));
        jButton430.setText("+1");
        jButton430.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton430ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton430, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 195, 52, -1));

        jButton441.setBackground(new java.awt.Color(153, 153, 255));
        jButton441.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton441.setForeground(new java.awt.Color(255, 255, 255));
        jButton441.setText("+1");
        jButton441.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton441ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton441, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 435, 52, -1));

        jButton443.setBackground(new java.awt.Color(153, 153, 255));
        jButton443.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton443.setForeground(new java.awt.Color(255, 255, 255));
        jButton443.setText("+1");
        jButton443.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton443ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton443, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 435, 52, -1));

        jButton446.setBackground(new java.awt.Color(153, 153, 255));
        jButton446.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton446.setForeground(new java.awt.Color(255, 255, 255));
        jButton446.setText("+1");
        jButton446.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton446ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton446, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 435, 52, -1));

        jButton451.setBackground(new java.awt.Color(153, 153, 255));
        jButton451.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton451.setForeground(new java.awt.Color(255, 255, 255));
        jButton451.setText("-1");
        jButton451.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton451ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton451, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 435, 52, -1));

        jButton455.setBackground(new java.awt.Color(153, 153, 255));
        jButton455.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton455.setForeground(new java.awt.Color(255, 255, 255));
        jButton455.setText("-1");
        jButton455.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton455ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton455, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 435, 52, -1));

        jButton458.setBackground(new java.awt.Color(153, 153, 255));
        jButton458.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton458.setForeground(new java.awt.Color(255, 255, 255));
        jButton458.setText("-1");
        jButton458.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton458ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton458, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 435, 52, -1));

        jLabel894.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel894, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 200, 220));

        jLabel906.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel906, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 200, 220));

        jLabel881.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel881, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 220));

        jLabel870.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel870, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 220));

        jLabel872.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel872, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        jLabel868.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel868, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        jLabel525.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small chicken chop.jpg"))); // NOI18N
        jLabel525.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel525, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 130));

        itemh7title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh7title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh7title.setText("Chicken Chop");
        jPanel23.add(itemh7title, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 630, 190, -1));

        itemh7price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemh7price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemh7price.setText("RM 17.00");
        jPanel23.add(itemh7price, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 650, 200, -1));

        jButton201.setBackground(new java.awt.Color(153, 153, 255));
        jButton201.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton201.setForeground(new java.awt.Color(255, 255, 255));
        jButton201.setText("+1");
        jButton201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton201ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton201, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 675, 52, -1));

        jButton236.setBackground(new java.awt.Color(153, 153, 255));
        jButton236.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton236.setForeground(new java.awt.Color(255, 255, 255));
        jButton236.setText("-1");
        jButton236.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton236ActionPerformed(evt);
            }
        });
        jPanel23.add(jButton236, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 675, 52, -1));

        jLabel548.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel23.add(jLabel548, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 220));

        jScrollPane6.setViewportView(jPanel23);

        jTabbedPane1.addTab("Western", jScrollPane6);

        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel918.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Drinks Image.jpg"))); // NOI18N
        jLabel918.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel24.add(jLabel918, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        itemi1title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemi1title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemi1title.setText("Strawberry Smoothie");
        jPanel24.add(itemi1title, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 150, 190, -1));

        itemi1price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemi1price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemi1price.setText("RM 9.00");
        jPanel24.add(itemi1price, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 170, 190, -1));

        jLabel950.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small coffee.jpg"))); // NOI18N
        jLabel950.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel24.add(jLabel950, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        itemi2title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemi2title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemi2title.setText("Coffee");
        jPanel24.add(itemi2title, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 150, 190, -1));

        itemi2price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemi2price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemi2price.setText("RM 7.00");
        jPanel24.add(itemi2price, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 170, 190, -1));

        itemi3price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemi3price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemi3price.setText("RM 7.00");
        jPanel24.add(itemi3price, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 170, 190, -1));

        itemi3title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemi3title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemi3title.setText("Fruit Juice");
        jPanel24.add(itemi3title, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 150, 190, -1));

        jLabel962.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/water.jpg"))); // NOI18N
        jLabel962.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel24.add(jLabel962, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 130));

        itemi4title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemi4title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemi4title.setText("Water");
        jPanel24.add(itemi4title, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 390, 200, -1));

        jLabel964.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small juice.jpg"))); // NOI18N
        jLabel964.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel24.add(jLabel964, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 130));

        itemi4price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemi4price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemi4price.setText("RM 1.00");
        jPanel24.add(itemi4price, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 410, 190, -1));

        jButton473.setBackground(new java.awt.Color(153, 153, 255));
        jButton473.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton473.setForeground(new java.awt.Color(255, 255, 255));
        jButton473.setText("+1");
        jButton473.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton473ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton473, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        jButton477.setBackground(new java.awt.Color(153, 153, 255));
        jButton477.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton477.setForeground(new java.awt.Color(255, 255, 255));
        jButton477.setText("+1");
        jButton477.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton477ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton477, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, 52, -1));

        jButton480.setBackground(new java.awt.Color(153, 153, 255));
        jButton480.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton480.setForeground(new java.awt.Color(255, 255, 255));
        jButton480.setText("+1");
        jButton480.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton480ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton480, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 435, 52, -1));

        jButton482.setBackground(new java.awt.Color(153, 153, 255));
        jButton482.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton482.setForeground(new java.awt.Color(255, 255, 255));
        jButton482.setText("+1");
        jButton482.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton482ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton482, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 195, 52, -1));

        jButton485.setBackground(new java.awt.Color(153, 153, 255));
        jButton485.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton485.setForeground(new java.awt.Color(255, 255, 255));
        jButton485.setText("-1");
        jButton485.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton485ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton485, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        jButton491.setBackground(new java.awt.Color(153, 153, 255));
        jButton491.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton491.setForeground(new java.awt.Color(255, 255, 255));
        jButton491.setText("-1");
        jButton491.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton491ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton491, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        jButton492.setBackground(new java.awt.Color(153, 153, 255));
        jButton492.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton492.setForeground(new java.awt.Color(255, 255, 255));
        jButton492.setText("-1");
        jButton492.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton492ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton492, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 435, 52, -1));

        jButton494.setBackground(new java.awt.Color(153, 153, 255));
        jButton494.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton494.setForeground(new java.awt.Color(255, 255, 255));
        jButton494.setText("-1");
        jButton494.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton494ActionPerformed(evt);
            }
        });
        jPanel24.add(jButton494, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 52, -1));

        jLabel965.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel24.add(jLabel965, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 220));

        jLabel968.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel24.add(jLabel968, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 220));

        jLabel956.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel24.add(jLabel956, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        jLabel931.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel24.add(jLabel931, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        jScrollPane8.setViewportView(jPanel24);

        jTabbedPane1.addTab("Drinks", jScrollPane8);

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemj1price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemj1price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemj1price.setText("RM 12.00");
        jPanel21.add(itemj1price, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 170, 190, -1));

        itemj1title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemj1title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemj1title.setText("Salad");
        jPanel21.add(itemj1title, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 150, 200, -1));

        jLabel736.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/Small Vegetable Image.jpg"))); // NOI18N
        jLabel736.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel21.add(jLabel736, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 130));

        jButton367.setBackground(new java.awt.Color(153, 153, 255));
        jButton367.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton367.setForeground(new java.awt.Color(255, 255, 255));
        jButton367.setText("+1");
        jButton367.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton367ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton367, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 195, 52, -1));

        jButton379.setBackground(new java.awt.Color(153, 153, 255));
        jButton379.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton379.setForeground(new java.awt.Color(255, 255, 255));
        jButton379.setText("-1");
        jButton379.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton379ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton379, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, 52, -1));

        jLabel747.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel21.add(jLabel747, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        itemj3price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemj3price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemj3price.setText("RM 4.00");
        jPanel21.add(itemj3price, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 170, 190, -1));

        itemj3title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemj3title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemj3title.setText("Edamame");
        jPanel21.add(itemj3title, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 150, 190, -1));

        itemj2price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemj2price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemj2price.setText("RM 7.50");
        jPanel21.add(itemj2price, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 170, 190, -1));

        itemj2title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemj2title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemj2title.setText("Avacado Slice");
        jPanel21.add(itemj2title, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 150, 200, -1));

        jLabel440.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small beans.jpg"))); // NOI18N
        jLabel440.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel21.add(jLabel440, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 130));

        jLabel505.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small avacado slice.jpg"))); // NOI18N
        jLabel505.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel21.add(jLabel505, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 130));

        jButton223.setBackground(new java.awt.Color(153, 153, 255));
        jButton223.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton223.setForeground(new java.awt.Color(255, 255, 255));
        jButton223.setText("+1");
        jButton223.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton223ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton223, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 195, 52, -1));

        jButton225.setBackground(new java.awt.Color(153, 153, 255));
        jButton225.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton225.setForeground(new java.awt.Color(255, 255, 255));
        jButton225.setText("+1");
        jButton225.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton225ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton225, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 195, 52, -1));

        jButton227.setBackground(new java.awt.Color(153, 153, 255));
        jButton227.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton227.setForeground(new java.awt.Color(255, 255, 255));
        jButton227.setText("-1");
        jButton227.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton227ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton227, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 52, -1));

        jButton228.setBackground(new java.awt.Color(153, 153, 255));
        jButton228.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton228.setForeground(new java.awt.Color(255, 255, 255));
        jButton228.setText("-1");
        jButton228.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton228ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton228, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 52, -1));

        jLabel509.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel21.add(jLabel509, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 200, 220));

        jLabel508.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel21.add(jLabel508, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 200, 220));

        itemj4price.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemj4price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemj4price.setText("RM 7.50");
        jPanel21.add(itemj4price, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 410, 190, -1));

        itemj4title.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        itemj4title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemj4title.setText("Bowl of Strawberries");
        jPanel21.add(itemj4title, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 390, 190, 20));

        jLabel535.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/small strawberry.jpg"))); // NOI18N
        jLabel535.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel21.add(jLabel535, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 130));

        jButton239.setBackground(new java.awt.Color(153, 153, 255));
        jButton239.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton239.setForeground(new java.awt.Color(255, 255, 255));
        jButton239.setText("+1");
        jButton239.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton239ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton239, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 435, 52, -1));

        jButton240.setBackground(new java.awt.Color(153, 153, 255));
        jButton240.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton240.setForeground(new java.awt.Color(255, 255, 255));
        jButton240.setText("-1");
        jButton240.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton240ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton240, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 435, 52, -1));

        jLabel536.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel21.add(jLabel536, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 220));

        jScrollPane1.setViewportView(jPanel21);

        jTabbedPane1.addTab("Vegetable", jScrollPane1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 670, 590));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0 , 150));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 17, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Name:");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 200, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 80, -1));

        jTextField2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setEnabled(false);
        jPanel7.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 200, -1));

        jButton10.setBackground(new java.awt.Color(153, 153, 255));
        jButton10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Logout");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, -1, 45));

        jButton11.setBackground(new java.awt.Color(153, 153, 255));
        jButton11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Edit Personal Details");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, 45));

        jButton12.setBackground(new java.awt.Color(153, 153, 255));
        jButton12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Order History");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, -1, 45));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1250, 90));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0, 150));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Cart");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 540, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Grand Total:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0, 150));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("RM 0.00");
        jLabel5.setInheritsPopupMenu(false);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 170, -1));

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Start Over");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 140, 45));

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Done and Pay");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 160, 45));

        jButton9.setBackground(new java.awt.Color(153, 153, 255));
        jButton9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Delete Selected");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 520, 180, 45));

        jTable2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setAutoscrolls(false);
        jTable2.setRowHeight(18);
        jTable2.setShowGrid(false);
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 530, 470));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 570, 580));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assignment/Pictures/pexels-malidate-van-842142.jpg"))); // NOI18N
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void item14BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item14BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item14Title.getText();
        
        double unitPrice = Double.parseDouble(item14Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item14BtnNegActionPerformed

    private void item12BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item12BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item12Title.getText();
        
        double unitPrice = Double.parseDouble(item12Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item12BtnNegActionPerformed

    private void item10BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item10BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item10Title.getText();
        
        double unitPrice = Double.parseDouble(item10Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                   
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item10BtnNegActionPerformed

    private void item8BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item8BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item8Title.getText();
        
        double unitPrice = Double.parseDouble(item8Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item8BtnNegActionPerformed

    private void item6BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item6BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item6Title.getText();
        
        double unitPrice = Double.parseDouble(item6Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item6BtnNegActionPerformed

    private void item4BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item4Title.getText();
        
        double unitPrice = Double.parseDouble(item4Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item4BtnNegActionPerformed

    private void jButton172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton172ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itema5title.getText();
        
        double unitPrice = Double.parseDouble(itema5price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton172ActionPerformed

    private void jButton277ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton277ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = item1Title.getText();
        
        double unitPrice = Double.parseDouble(item1Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton277ActionPerformed

    private void jButton312ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton312ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = iteme1title.getText();
        
        double unitPrice = Double.parseDouble(iteme1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton312ActionPerformed

    private void jButton318ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton318ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = iteme3title.getText();
        
        double unitPrice = Double.parseDouble(iteme3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton318ActionPerformed

    private void jButton343ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton343ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemf1title.getText();
        
        double unitPrice = Double.parseDouble(itemf1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton343ActionPerformed

    private void jButton413ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton413ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemg1title.getText();
        
        double unitPrice = Double.parseDouble(itemg1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton413ActionPerformed

    private void jButton417ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton417ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemg2title.getText();
        
        double unitPrice = Double.parseDouble(itemg2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton417ActionPerformed

    private void jButton419ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton419ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemg4title.getText();
        
        double unitPrice = Double.parseDouble(itemg4price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton419ActionPerformed

    private void jButton458ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton458ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemh5title.getText();
        
        double unitPrice = Double.parseDouble(itemh5price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton458ActionPerformed

    private void jButton485ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton485ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemi1title.getText();
        
        double unitPrice = Double.parseDouble(itemi1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton485ActionPerformed

    private void jButton491ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton491ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemi2title.getText();
        
        double unitPrice = Double.parseDouble(itemi2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton491ActionPerformed

    private void item17BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item17BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item17Title.getText();
        
        double unitPrice = Double.parseDouble(item17Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_item17BtnNegActionPerformed

    private void item20BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item20BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item20Title.getText();
        
        double unitPrice = Double.parseDouble(item20Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item20BtnNegActionPerformed

    private void jButton233ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton233ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemf3title.getText();
        
        double unitPrice = Double.parseDouble(itemf3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton233ActionPerformed

    private void jButton227ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton227ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemj3title.getText();
        
        double unitPrice = Double.parseDouble(itemj3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton227ActionPerformed

    private void jButton235ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton235ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemg5title.getText();
        
        double unitPrice = Double.parseDouble(itemg5price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton235ActionPerformed

    private void jButton243ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton243ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemg8title.getText();
        
        double unitPrice = Double.parseDouble(itemg8price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton243ActionPerformed

    private void item1BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item1Title.getText();
        
        double unitPrice = Double.parseDouble(item1Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));

                return;
            }
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
        
    }//GEN-LAST:event_item1BtnPosActionPerformed

    private void item1BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item1Title.getText();
        
        double unitPrice = Double.parseDouble(item1Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        
        
    }//GEN-LAST:event_item1BtnNegActionPerformed

    private void item2BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item2Title.getText();
        
        double unitPrice = Double.parseDouble(item2Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item2BtnPosActionPerformed

    private void item3BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item3Title.getText();
        
        double unitPrice = Double.parseDouble(item3Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item3BtnPosActionPerformed

    private void item4BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item4Title.getText();
        
        double unitPrice = Double.parseDouble(item4Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item4BtnPosActionPerformed

    private void item5BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item5Title.getText();
        
        double unitPrice = Double.parseDouble(item5Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item5BtnPosActionPerformed

    private void item6BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item6BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item6Title.getText();
        
        double unitPrice = Double.parseDouble(item6Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item6BtnPosActionPerformed

    private void item7BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item7BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item7Title.getText();
        
        double unitPrice = Double.parseDouble(item7Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item7BtnPosActionPerformed

    private void item8BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item8BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item8Title.getText();
        
        double unitPrice = Double.parseDouble(item8Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item8BtnPosActionPerformed

    private void item9BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item9BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item9Title.getText();
        
        double unitPrice = Double.parseDouble(item9Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item9BtnPosActionPerformed

    private void item10BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item10BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item10Title.getText();
        
        double unitPrice = Double.parseDouble(item10Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item10BtnPosActionPerformed

    private void item11BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item11BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item11Title.getText();
        
        double unitPrice = Double.parseDouble(item11Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item11BtnPosActionPerformed

    private void item12BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item12BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item12Title.getText();
        
        double unitPrice = Double.parseDouble(item12Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item12BtnPosActionPerformed

    private void item13BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item13BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item13Title.getText();
        
        double unitPrice = Double.parseDouble(item13Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item13BtnPosActionPerformed

    private void item14BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item14BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item14Title.getText();
        
        double unitPrice = Double.parseDouble(item14Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item14BtnPosActionPerformed

    private void item15BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item15BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item15Title.getText();
        
        double unitPrice = Double.parseDouble(item15Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item15BtnPosActionPerformed

    private void item16BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item16BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item16Title.getText();
        
        double unitPrice = Double.parseDouble(item16Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item16BtnPosActionPerformed

    private void item17BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item17BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item17Title.getText();
        
        double unitPrice = Double.parseDouble(item17Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item17BtnPosActionPerformed

    private void item18BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item18BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item18Title.getText();
        
        double unitPrice = Double.parseDouble(item18Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item18BtnPosActionPerformed

    private void item19BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item19BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item19Title.getText();
        
        double unitPrice = Double.parseDouble(item19Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item19BtnPosActionPerformed

    private void item20BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item20BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item20Title.getText();
        
        double unitPrice = Double.parseDouble(item20Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item20BtnPosActionPerformed

    private void item21BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item21BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item21Title.getText();
        
        double unitPrice = Double.parseDouble(item21Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item21BtnPosActionPerformed

    private void item22BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item22BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item22Title.getText();
        
        double unitPrice = Double.parseDouble(item22Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item22BtnPosActionPerformed

    private void item23BtnPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item23BtnPosActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item23Title.getText();
        
        double unitPrice = Double.parseDouble(item23Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_item23BtnPosActionPerformed

    private void item2BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item2Title.getText();
        
        double unitPrice = Double.parseDouble(item2Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item2BtnNegActionPerformed

    private void item3BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item3Title.getText();
        
        double unitPrice = Double.parseDouble(item4Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item3BtnNegActionPerformed

    private void item5BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item5Title.getText();
        
        double unitPrice = Double.parseDouble(item5Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item5BtnNegActionPerformed

    private void item7BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item7BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item7Title.getText();
        
        double unitPrice = Double.parseDouble(item7Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item7BtnNegActionPerformed

    private void item9BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item9BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item9Title.getText();
        
        double unitPrice = Double.parseDouble(item9Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item9BtnNegActionPerformed

    private void item11BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item11BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item11Title.getText();
        
        double unitPrice = Double.parseDouble(item11Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item11BtnNegActionPerformed

    private void item13BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item13BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item13Title.getText();
        
        double unitPrice = Double.parseDouble(item13Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    return;
                }
                
            }
            
        }
    }//GEN-LAST:event_item13BtnNegActionPerformed

    private void item15BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item15BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item15Title.getText();
        
        double unitPrice = Double.parseDouble(item15Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
   
                }
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item15BtnNegActionPerformed

    private void item16BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item16BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item16Title.getText();
        
        double unitPrice = Double.parseDouble(item16Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_item16BtnNegActionPerformed

    private void item18BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item18BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item18Title.getText();
        
        double unitPrice = Double.parseDouble(item18Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item18BtnNegActionPerformed

    private void item19BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item19BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item19Title.getText();
        
        double unitPrice = Double.parseDouble(item19Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item19BtnNegActionPerformed

    private void item21BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item21BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item21Title.getText();
        
        double unitPrice = Double.parseDouble(item21Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
                
            }
            
        }
    }//GEN-LAST:event_item21BtnNegActionPerformed

    private void item22BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item22BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item22Title.getText();
        
        double unitPrice = Double.parseDouble(item22Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_item22BtnNegActionPerformed

    private void item23BtnNegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item23BtnNegActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        String title = item23Title.getText();
        
        double unitPrice = Double.parseDouble(item23Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_item23BtnNegActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        table = (DefaultTableModel) jTable2.getModel();
        table.setRowCount(0);
        jLabel5.setText("RM 0.00");
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try
        {
            table = (DefaultTableModel) jTable2.getModel();
            table.removeRow(jTable2.getSelectedRow());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Select an item!", "Selection Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
         double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
        
        //String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.setVisible(false);
        Login lf = new Login();
        lf.setLocation(this.getLocation());
        lf.setResizable(false);
        lf.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.setVisible(false);
        EditPersonalDetails epdf = new EditPersonalDetails(this.user.split("\t")[0]);
        epdf.setLocation(this.getLocation());
        epdf.setResizable(false);
        epdf.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.table = (DefaultTableModel) jTable2.getModel();
        if (this.table.getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(this, "Cart is empty", "Order Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            this.setVisible(false);
            
            Payment pf = new Payment(this.user, this.table);
            pf.setLocation(this.getLocation());
            pf.setResizable(false);
            pf.setVisible(true);
        }
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton146ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itema1title.getText();
        
        double unitPrice = Double.parseDouble(itema1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton146ActionPerformed

    private void jButton147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton147ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itema2title.getText();
        
        double unitPrice = Double.parseDouble(itema2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton147ActionPerformed

    private void jButton150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton150ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itema3title.getText();
        
        double unitPrice = Double.parseDouble(itema3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton150ActionPerformed

    private void jButton161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton161ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itema4title.getText();
        
        double unitPrice = Double.parseDouble(itema4price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton161ActionPerformed

    private void jButton160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton160ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itema5title.getText();
        
        double unitPrice = Double.parseDouble(itema5price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton160ActionPerformed

    private void jButton195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton195ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itema6title.getText();
        
        double unitPrice = Double.parseDouble(itema6price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton195ActionPerformed

    private void jButton212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton212ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itema7title.getText();
        
        double unitPrice = Double.parseDouble(itema7price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton212ActionPerformed

    private void jButton213ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton213ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itema8title.getText();
        
        double unitPrice = Double.parseDouble(itema8price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton213ActionPerformed

    private void jButton185ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton185ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemb1title.getText();
        
        double unitPrice = Double.parseDouble(itemb1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton185ActionPerformed

    private void jButton219ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton219ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemb2title.getText();
        
        double unitPrice = Double.parseDouble(itemb2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton219ActionPerformed

    private void jButton220ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton220ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemb3title.getText();
        
        double unitPrice = Double.parseDouble(itemb3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton220ActionPerformed

    private void jButton216ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton216ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemd1title.getText();
        
        double unitPrice = Double.parseDouble(itemd1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton216ActionPerformed

    private void jButton198ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton198ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemd2title.getText();
        
        double unitPrice = Double.parseDouble(itemd2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton198ActionPerformed

    private void jButton252ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton252ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = item3Title.getText();
        
        double unitPrice = Double.parseDouble(item3Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton252ActionPerformed

    private void jButton266ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton266ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = item3Title.getText();
        
        double unitPrice = Double.parseDouble(item3Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton266ActionPerformed

    private void jButton265ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton265ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = item3Title.getText();
        
        double unitPrice = Double.parseDouble(item3Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton265ActionPerformed

    private void jButton300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton300ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = iteme1title.getText();
        
        double unitPrice = Double.parseDouble(iteme1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton300ActionPerformed

    private void jButton299ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton299ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = iteme2title.getText();
        
        double unitPrice = Double.parseDouble(iteme2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton299ActionPerformed

    private void jButton306ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton306ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = iteme3title.getText();
        
        double unitPrice = Double.parseDouble(iteme3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton306ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemf1title.getText();
        
        double unitPrice = Double.parseDouble(itemf1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton231ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton231ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemf2title.getText();
        
        double unitPrice = Double.parseDouble(itemf2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton231ActionPerformed

    private void jButton230ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton230ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemf3title.getText();
        
        double unitPrice = Double.parseDouble(itemf3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton230ActionPerformed

    private void jButton367ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton367ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemj1title.getText();
        
        double unitPrice = Double.parseDouble(itemj1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton367ActionPerformed

    private void jButton225ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton225ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemj2title.getText();
        
        double unitPrice = Double.parseDouble(itemj2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton225ActionPerformed

    private void jButton223ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton223ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemj3title.getText();
        
        double unitPrice = Double.parseDouble(itemj3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton223ActionPerformed

    private void jButton239ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton239ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemj4title.getText();
        
        double unitPrice = Double.parseDouble(itemj4price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton239ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemg1title.getText();
        
        double unitPrice = Double.parseDouble(itemg1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton405ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton405ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemg2title.getText();
        
        double unitPrice = Double.parseDouble(itemg2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton405ActionPerformed

    private void jButton404ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton404ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemg3title.getText();
        
        double unitPrice = Double.parseDouble(itemg3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton404ActionPerformed

    private void jButton409ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton409ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemg4title.getText();
        
        double unitPrice = Double.parseDouble(itemg4price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton409ActionPerformed

    private void jButton226ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton226ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemg5title.getText();
        
        double unitPrice = Double.parseDouble(itemg5price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton226ActionPerformed

    private void jButton247ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton247ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemg6title.getText();
        
        double unitPrice = Double.parseDouble(itemg6price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton247ActionPerformed

    private void jButton241ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton241ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemg7title.getText();
        
        double unitPrice = Double.parseDouble(itemg7price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton241ActionPerformed

    private void jButton238ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton238ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemg8title.getText();
        
        double unitPrice = Double.parseDouble(itemg8price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton238ActionPerformed

    private void jButton237ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton237ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemg9title.getText();
        
        double unitPrice = Double.parseDouble(itemg9price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton237ActionPerformed

    private void jButton426ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton426ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemh1title.getText();
        
        double unitPrice = Double.parseDouble(itemh1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton426ActionPerformed

    private void jButton427ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton427ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemh2title.getText();
        
        double unitPrice = Double.parseDouble(itemh2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton427ActionPerformed

    private void jButton430ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton430ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemh3title.getText();
        
        double unitPrice = Double.parseDouble(itemh3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton430ActionPerformed

    private void jButton441ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton441ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemh4title.getText();
        
        double unitPrice = Double.parseDouble(itemh4price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton441ActionPerformed

    private void jButton446ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton446ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemh5title.getText();
        
        double unitPrice = Double.parseDouble(itemh5price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton446ActionPerformed

    private void jButton443ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton443ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemh6title.getText();
        
        double unitPrice = Double.parseDouble(itemh6price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton443ActionPerformed

    private void jButton201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton201ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemh7title.getText();
        
        double unitPrice = Double.parseDouble(itemh7price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton201ActionPerformed

    private void jButton473ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton473ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemi1title.getText();
        
        double unitPrice = Double.parseDouble(itemi1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton473ActionPerformed

    private void jButton477ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton477ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemi2title.getText();
        
        double unitPrice = Double.parseDouble(itemi2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton477ActionPerformed

    private void jButton482ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton482ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemi3title.getText();
        
        double unitPrice = Double.parseDouble(itemi3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton482ActionPerformed

    private void jButton480ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton480ActionPerformed
           table = (DefaultTableModel) jTable2.getModel();
        String title = itemi4title.getText();
        
        double unitPrice = Double.parseDouble(itemi4price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                table.setValueAt(Integer.parseInt(table.getValueAt(i, 1).toString())+1, i, 1);
                table.setValueAt(String.format("%.2f", Double.parseDouble(table.getValueAt(i, 3).toString()) + unitPrice), i, 3);
                
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
        
        table.insertRow(table.getRowCount(), new Object[] {title, "1", String.format("%.2f", unitPrice), String.format("%.2f", unitPrice)});
        
        double total = 0;
        for (int j = 0; j < table.getRowCount(); j++)
        {
            total += Double.parseDouble(table.getValueAt(j, 3).toString());
        }
        jLabel5.setText("RM " + String.format("%.2f", total));
    }//GEN-LAST:event_jButton480ActionPerformed

    private void jButton145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton145ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itema1title.getText();
        
        double unitPrice = Double.parseDouble(itema1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton145ActionPerformed

    private void jButton148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton148ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itema2title.getText();
        
        double unitPrice = Double.parseDouble(itema2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton148ActionPerformed

    private void jButton149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton149ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itema3title.getText();
        
        double unitPrice = Double.parseDouble(itema3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton149ActionPerformed

    private void jButton171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton171ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itema4title.getText();
        
        double unitPrice = Double.parseDouble(itema4price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton171ActionPerformed

    private void jButton204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton204ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itema6title.getText();
        
        double unitPrice = Double.parseDouble(itema6price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton204ActionPerformed

    private void jButton218ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton218ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itema7title.getText();
        
        double unitPrice = Double.parseDouble(itema7price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton218ActionPerformed

    private void jButton217ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton217ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itema8title.getText();
        
        double unitPrice = Double.parseDouble(itema8price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton217ActionPerformed

    private void jButton221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton221ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemb3title.getText();
        
        double unitPrice = Double.parseDouble(itemb3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton221ActionPerformed

    private void jButton222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton222ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemb2title.getText();
        
        double unitPrice = Double.parseDouble(itemb2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton222ActionPerformed

    private void jButton184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton184ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemb2title.getText();
        
        double unitPrice = Double.parseDouble(itemb2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton184ActionPerformed

    private void jButton215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton215ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemd1title.getText();
        
        double unitPrice = Double.parseDouble(itemd1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton215ActionPerformed

    private void jButton224ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton224ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemd2title.getText();
        
        double unitPrice = Double.parseDouble(itemd2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton224ActionPerformed

    private void jButton253ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton253ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = item1Title.getText();
        
        double unitPrice = Double.parseDouble(item1Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton253ActionPerformed

    private void jButton276ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton276ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = item1Title.getText();
        
        double unitPrice = Double.parseDouble(item1Price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton276ActionPerformed

    private void jButton313ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton313ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = iteme2title.getText();
        
        double unitPrice = Double.parseDouble(iteme2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton313ActionPerformed

    private void jButton234ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton234ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemf2title.getText();
        
        double unitPrice = Double.parseDouble(itemf2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton234ActionPerformed

    private void jButton379ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton379ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemj1title.getText();
        
        double unitPrice = Double.parseDouble(itemj1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton379ActionPerformed

    private void jButton228ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton228ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemj2title.getText();
        
        double unitPrice = Double.parseDouble(itemj2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton228ActionPerformed

    private void jButton240ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton240ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemj4title.getText();
        
        double unitPrice = Double.parseDouble(itemj4price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton240ActionPerformed

    private void jButton418ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton418ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemg3title.getText();
        
        double unitPrice = Double.parseDouble(itemg3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton418ActionPerformed

    private void jButton248ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton248ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemg6title.getText();
        
        double unitPrice = Double.parseDouble(itemg6price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton248ActionPerformed

    private void jButton244ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton244ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemg7title.getText();
        
        double unitPrice = Double.parseDouble(itemg7price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton244ActionPerformed

    private void jButton242ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton242ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemg9title.getText();
        
        double unitPrice = Double.parseDouble(itemg9price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton242ActionPerformed

    private void jButton425ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton425ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemh1title.getText();
        
        double unitPrice = Double.parseDouble(itemh1price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton425ActionPerformed

    private void jButton428ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton428ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemh2title.getText();
        
        double unitPrice = Double.parseDouble(itemh2price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton428ActionPerformed

    private void jButton429ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton429ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemh3title.getText();
        
        double unitPrice = Double.parseDouble(itemh3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton429ActionPerformed

    private void jButton451ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton451ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemh4title.getText();
        
        double unitPrice = Double.parseDouble(itemh4price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton451ActionPerformed

    private void jButton455ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton455ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemh6title.getText();
        
        double unitPrice = Double.parseDouble(itemh6price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton455ActionPerformed

    private void jButton236ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton236ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemh7title.getText();
        
        double unitPrice = Double.parseDouble(itemh7price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton236ActionPerformed

    private void jButton494ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton494ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemi3title.getText();
        
        double unitPrice = Double.parseDouble(itemi3price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton494ActionPerformed

    private void jButton492ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton492ActionPerformed
          table = (DefaultTableModel) jTable2.getModel();
        String title = itemi4title.getText();
        
        double unitPrice = Double.parseDouble(itemi4price.getText().substring(2));
        
        for (int i = 0; i < table.getRowCount(); i++)
        {
            if (title.compareTo(table.getValueAt(i, 0).toString()) == 0)
            {
                int qty = Integer.parseInt(table.getValueAt(i, 1).toString());
                double totalPrice = Double.parseDouble(table.getValueAt(i, 3).toString());
                
                table.setValueAt(qty-1, i, 1);
                table.setValueAt(String.format("%.2f",totalPrice-unitPrice), i, 3);
                if (qty-1 == 0)
                {
                    table.removeRow(i);
                    
                }
                double total = 0;
                for (int j = 0; j < table.getRowCount(); j++)
                {
                    total += Double.parseDouble(table.getValueAt(j, 3).toString());
                }
                jLabel5.setText("RM " + String.format("%.2f", total));
                return;
            }
            
        }
    }//GEN-LAST:event_jButton492ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.setVisible(false);
        OrderHistory ohf = new OrderHistory(this.user);
        ohf.setLocation(this.getLocation());
        ohf.setResizable(false);
        ohf.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton item10BtnNeg;
    private javax.swing.JButton item10BtnPos;
    private javax.swing.JLabel item10Price;
    private javax.swing.JLabel item10Title;
    private javax.swing.JButton item11BtnNeg;
    private javax.swing.JButton item11BtnPos;
    private javax.swing.JLabel item11Price;
    private javax.swing.JLabel item11Title;
    private javax.swing.JButton item12BtnNeg;
    private javax.swing.JButton item12BtnPos;
    private javax.swing.JLabel item12Price;
    private javax.swing.JLabel item12Title;
    private javax.swing.JButton item13BtnNeg;
    private javax.swing.JButton item13BtnPos;
    private javax.swing.JLabel item13Price;
    private javax.swing.JLabel item13Title;
    private javax.swing.JButton item14BtnNeg;
    private javax.swing.JButton item14BtnPos;
    private javax.swing.JLabel item14Price;
    private javax.swing.JLabel item14Title;
    private javax.swing.JButton item15BtnNeg;
    private javax.swing.JButton item15BtnPos;
    private javax.swing.JLabel item15Price;
    private javax.swing.JLabel item15Title;
    private javax.swing.JButton item16BtnNeg;
    private javax.swing.JButton item16BtnPos;
    private javax.swing.JLabel item16Price;
    private javax.swing.JLabel item16Title;
    private javax.swing.JButton item17BtnNeg;
    private javax.swing.JButton item17BtnPos;
    private javax.swing.JLabel item17Price;
    private javax.swing.JLabel item17Title;
    private javax.swing.JButton item18BtnNeg;
    private javax.swing.JButton item18BtnPos;
    private javax.swing.JLabel item18Price;
    private javax.swing.JLabel item18Title;
    private javax.swing.JButton item19BtnNeg;
    private javax.swing.JButton item19BtnPos;
    private javax.swing.JLabel item19Price;
    private javax.swing.JLabel item19Title;
    private javax.swing.JButton item1BtnNeg;
    private javax.swing.JButton item1BtnPos;
    private javax.swing.JLabel item1Price;
    private javax.swing.JLabel item1Title;
    private javax.swing.JButton item20BtnNeg;
    private javax.swing.JButton item20BtnPos;
    private javax.swing.JLabel item20Price;
    private javax.swing.JLabel item20Title;
    private javax.swing.JButton item21BtnNeg;
    private javax.swing.JButton item21BtnPos;
    private javax.swing.JLabel item21Price;
    private javax.swing.JLabel item21Title;
    private javax.swing.JButton item22BtnNeg;
    private javax.swing.JButton item22BtnPos;
    private javax.swing.JLabel item22Price;
    private javax.swing.JLabel item22Title;
    private javax.swing.JButton item23BtnNeg;
    private javax.swing.JButton item23BtnPos;
    private javax.swing.JLabel item23Price;
    private javax.swing.JLabel item23Title;
    private javax.swing.JButton item2BtnNeg;
    private javax.swing.JButton item2BtnPos;
    private javax.swing.JLabel item2Price;
    private javax.swing.JLabel item2Title;
    private javax.swing.JButton item3BtnNeg;
    private javax.swing.JButton item3BtnPos;
    private javax.swing.JLabel item3Price;
    private javax.swing.JLabel item3Title;
    private javax.swing.JButton item4BtnNeg;
    private javax.swing.JButton item4BtnPos;
    private javax.swing.JLabel item4Price;
    private javax.swing.JLabel item4Title;
    private javax.swing.JButton item5BtnNeg;
    private javax.swing.JButton item5BtnPos;
    private javax.swing.JLabel item5Price;
    private javax.swing.JLabel item5Title;
    private javax.swing.JButton item6BtnNeg;
    private javax.swing.JButton item6BtnPos;
    private javax.swing.JLabel item6Price;
    private javax.swing.JLabel item6Title;
    private javax.swing.JButton item7BtnNeg;
    private javax.swing.JButton item7BtnPos;
    private javax.swing.JLabel item7Price;
    private javax.swing.JLabel item7Title;
    private javax.swing.JButton item8BtnNeg;
    private javax.swing.JButton item8BtnPos;
    private javax.swing.JLabel item8Price;
    private javax.swing.JLabel item8Title;
    private javax.swing.JButton item9BtnNeg;
    private javax.swing.JButton item9BtnPos;
    private javax.swing.JLabel item9Price;
    private javax.swing.JLabel item9Title;
    private javax.swing.JLabel itema1price;
    private javax.swing.JLabel itema1title;
    private javax.swing.JLabel itema2price;
    private javax.swing.JLabel itema2title;
    private javax.swing.JLabel itema3price;
    private javax.swing.JLabel itema3title;
    private javax.swing.JLabel itema4price;
    private javax.swing.JLabel itema4title;
    private javax.swing.JLabel itema5price;
    private javax.swing.JLabel itema5title;
    private javax.swing.JLabel itema6price;
    private javax.swing.JLabel itema6title;
    private javax.swing.JLabel itema7price;
    private javax.swing.JLabel itema7title;
    private javax.swing.JLabel itema8price;
    private javax.swing.JLabel itema8title;
    private javax.swing.JLabel itemb1price;
    private javax.swing.JLabel itemb1title;
    private javax.swing.JLabel itemb2price;
    private javax.swing.JLabel itemb2title;
    private javax.swing.JLabel itemb3price;
    private javax.swing.JLabel itemb3title;
    private javax.swing.JLabel itemd1price;
    private javax.swing.JLabel itemd1title;
    private javax.swing.JLabel itemd2price;
    private javax.swing.JLabel itemd2title;
    private javax.swing.JLabel iteme1price;
    private javax.swing.JLabel iteme1title;
    private javax.swing.JLabel iteme2price;
    private javax.swing.JLabel iteme2title;
    private javax.swing.JLabel iteme3price;
    private javax.swing.JLabel iteme3title;
    private javax.swing.JLabel itemf1price;
    private javax.swing.JLabel itemf1title;
    private javax.swing.JLabel itemf2price;
    private javax.swing.JLabel itemf2title;
    private javax.swing.JLabel itemf3price;
    private javax.swing.JLabel itemf3title;
    private javax.swing.JLabel itemg1price;
    private javax.swing.JLabel itemg1title;
    private javax.swing.JLabel itemg2price;
    private javax.swing.JLabel itemg2title;
    private javax.swing.JLabel itemg3price;
    private javax.swing.JLabel itemg3title;
    private javax.swing.JLabel itemg4price;
    private javax.swing.JLabel itemg4title;
    private javax.swing.JLabel itemg5price;
    private javax.swing.JLabel itemg5title;
    private javax.swing.JLabel itemg6price;
    private javax.swing.JLabel itemg6title;
    private javax.swing.JLabel itemg7price;
    private javax.swing.JLabel itemg7title;
    private javax.swing.JLabel itemg8price;
    private javax.swing.JLabel itemg8title;
    private javax.swing.JLabel itemg9price;
    private javax.swing.JLabel itemg9title;
    private javax.swing.JLabel itemh1price;
    private javax.swing.JLabel itemh1title;
    private javax.swing.JLabel itemh2price;
    private javax.swing.JLabel itemh2title;
    private javax.swing.JLabel itemh3price;
    private javax.swing.JLabel itemh3title;
    private javax.swing.JLabel itemh4price;
    private javax.swing.JLabel itemh4title;
    private javax.swing.JLabel itemh5price;
    private javax.swing.JLabel itemh5title;
    private javax.swing.JLabel itemh6price;
    private javax.swing.JLabel itemh6title;
    private javax.swing.JLabel itemh7price;
    private javax.swing.JLabel itemh7title;
    private javax.swing.JLabel itemi1price;
    private javax.swing.JLabel itemi1title;
    private javax.swing.JLabel itemi2price;
    private javax.swing.JLabel itemi2title;
    private javax.swing.JLabel itemi3price;
    private javax.swing.JLabel itemi3title;
    private javax.swing.JLabel itemi4price;
    private javax.swing.JLabel itemi4title;
    private javax.swing.JLabel itemj1price;
    private javax.swing.JLabel itemj1title;
    private javax.swing.JLabel itemj2price;
    private javax.swing.JLabel itemj2title;
    private javax.swing.JLabel itemj3price;
    private javax.swing.JLabel itemj3title;
    private javax.swing.JLabel itemj4price;
    private javax.swing.JLabel itemj4title;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton145;
    private javax.swing.JButton jButton146;
    private javax.swing.JButton jButton147;
    private javax.swing.JButton jButton148;
    private javax.swing.JButton jButton149;
    private javax.swing.JButton jButton150;
    private javax.swing.JButton jButton160;
    private javax.swing.JButton jButton161;
    private javax.swing.JButton jButton171;
    private javax.swing.JButton jButton172;
    private javax.swing.JButton jButton184;
    private javax.swing.JButton jButton185;
    private javax.swing.JButton jButton195;
    private javax.swing.JButton jButton198;
    private javax.swing.JButton jButton201;
    private javax.swing.JButton jButton204;
    private javax.swing.JButton jButton212;
    private javax.swing.JButton jButton213;
    private javax.swing.JButton jButton215;
    private javax.swing.JButton jButton216;
    private javax.swing.JButton jButton217;
    private javax.swing.JButton jButton218;
    private javax.swing.JButton jButton219;
    private javax.swing.JButton jButton220;
    private javax.swing.JButton jButton221;
    private javax.swing.JButton jButton222;
    private javax.swing.JButton jButton223;
    private javax.swing.JButton jButton224;
    private javax.swing.JButton jButton225;
    private javax.swing.JButton jButton226;
    private javax.swing.JButton jButton227;
    private javax.swing.JButton jButton228;
    private javax.swing.JButton jButton230;
    private javax.swing.JButton jButton231;
    private javax.swing.JButton jButton233;
    private javax.swing.JButton jButton234;
    private javax.swing.JButton jButton235;
    private javax.swing.JButton jButton236;
    private javax.swing.JButton jButton237;
    private javax.swing.JButton jButton238;
    private javax.swing.JButton jButton239;
    private javax.swing.JButton jButton240;
    private javax.swing.JButton jButton241;
    private javax.swing.JButton jButton242;
    private javax.swing.JButton jButton243;
    private javax.swing.JButton jButton244;
    private javax.swing.JButton jButton247;
    private javax.swing.JButton jButton248;
    private javax.swing.JButton jButton252;
    private javax.swing.JButton jButton253;
    private javax.swing.JButton jButton265;
    private javax.swing.JButton jButton266;
    private javax.swing.JButton jButton276;
    private javax.swing.JButton jButton277;
    private javax.swing.JButton jButton299;
    private javax.swing.JButton jButton300;
    private javax.swing.JButton jButton306;
    private javax.swing.JButton jButton312;
    private javax.swing.JButton jButton313;
    private javax.swing.JButton jButton318;
    private javax.swing.JButton jButton343;
    private javax.swing.JButton jButton367;
    private javax.swing.JButton jButton379;
    private javax.swing.JButton jButton404;
    private javax.swing.JButton jButton405;
    private javax.swing.JButton jButton409;
    private javax.swing.JButton jButton413;
    private javax.swing.JButton jButton417;
    private javax.swing.JButton jButton418;
    private javax.swing.JButton jButton419;
    private javax.swing.JButton jButton425;
    private javax.swing.JButton jButton426;
    private javax.swing.JButton jButton427;
    private javax.swing.JButton jButton428;
    private javax.swing.JButton jButton429;
    private javax.swing.JButton jButton430;
    private javax.swing.JButton jButton441;
    private javax.swing.JButton jButton443;
    private javax.swing.JButton jButton446;
    private javax.swing.JButton jButton451;
    private javax.swing.JButton jButton455;
    private javax.swing.JButton jButton458;
    private javax.swing.JButton jButton473;
    private javax.swing.JButton jButton477;
    private javax.swing.JButton jButton480;
    private javax.swing.JButton jButton482;
    private javax.swing.JButton jButton485;
    private javax.swing.JButton jButton491;
    private javax.swing.JButton jButton492;
    private javax.swing.JButton jButton494;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel367;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel396;
    private javax.swing.JLabel jLabel397;
    private javax.swing.JLabel jLabel398;
    private javax.swing.JLabel jLabel399;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel400;
    private javax.swing.JLabel jLabel401;
    private javax.swing.JLabel jLabel402;
    private javax.swing.JLabel jLabel403;
    private javax.swing.JLabel jLabel404;
    private javax.swing.JLabel jLabel405;
    private javax.swing.JLabel jLabel406;
    private javax.swing.JLabel jLabel407;
    private javax.swing.JLabel jLabel408;
    private javax.swing.JLabel jLabel409;
    private javax.swing.JLabel jLabel410;
    private javax.swing.JLabel jLabel411;
    private javax.swing.JLabel jLabel412;
    private javax.swing.JLabel jLabel413;
    private javax.swing.JLabel jLabel414;
    private javax.swing.JLabel jLabel415;
    private javax.swing.JLabel jLabel416;
    private javax.swing.JLabel jLabel417;
    private javax.swing.JLabel jLabel418;
    private javax.swing.JLabel jLabel419;
    private javax.swing.JLabel jLabel420;
    private javax.swing.JLabel jLabel421;
    private javax.swing.JLabel jLabel422;
    private javax.swing.JLabel jLabel423;
    private javax.swing.JLabel jLabel424;
    private javax.swing.JLabel jLabel425;
    private javax.swing.JLabel jLabel426;
    private javax.swing.JLabel jLabel427;
    private javax.swing.JLabel jLabel428;
    private javax.swing.JLabel jLabel431;
    private javax.swing.JLabel jLabel435;
    private javax.swing.JLabel jLabel436;
    private javax.swing.JLabel jLabel438;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel440;
    private javax.swing.JLabel jLabel441;
    private javax.swing.JLabel jLabel442;
    private javax.swing.JLabel jLabel443;
    private javax.swing.JLabel jLabel444;
    private javax.swing.JLabel jLabel447;
    private javax.swing.JLabel jLabel448;
    private javax.swing.JLabel jLabel450;
    private javax.swing.JLabel jLabel452;
    private javax.swing.JLabel jLabel457;
    private javax.swing.JLabel jLabel458;
    private javax.swing.JLabel jLabel460;
    private javax.swing.JLabel jLabel461;
    private javax.swing.JLabel jLabel462;
    private javax.swing.JLabel jLabel465;
    private javax.swing.JLabel jLabel466;
    private javax.swing.JLabel jLabel468;
    private javax.swing.JLabel jLabel469;
    private javax.swing.JLabel jLabel470;
    private javax.swing.JLabel jLabel472;
    private javax.swing.JLabel jLabel473;
    private javax.swing.JLabel jLabel478;
    private javax.swing.JLabel jLabel480;
    private javax.swing.JLabel jLabel481;
    private javax.swing.JLabel jLabel482;
    private javax.swing.JLabel jLabel483;
    private javax.swing.JLabel jLabel486;
    private javax.swing.JLabel jLabel488;
    private javax.swing.JLabel jLabel489;
    private javax.swing.JLabel jLabel492;
    private javax.swing.JLabel jLabel494;
    private javax.swing.JLabel jLabel496;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel502;
    private javax.swing.JLabel jLabel503;
    private javax.swing.JLabel jLabel505;
    private javax.swing.JLabel jLabel507;
    private javax.swing.JLabel jLabel508;
    private javax.swing.JLabel jLabel509;
    private javax.swing.JLabel jLabel510;
    private javax.swing.JLabel jLabel517;
    private javax.swing.JLabel jLabel518;
    private javax.swing.JLabel jLabel520;
    private javax.swing.JLabel jLabel521;
    private javax.swing.JLabel jLabel522;
    private javax.swing.JLabel jLabel525;
    private javax.swing.JLabel jLabel526;
    private javax.swing.JLabel jLabel535;
    private javax.swing.JLabel jLabel536;
    private javax.swing.JLabel jLabel537;
    private javax.swing.JLabel jLabel538;
    private javax.swing.JLabel jLabel540;
    private javax.swing.JLabel jLabel541;
    private javax.swing.JLabel jLabel542;
    private javax.swing.JLabel jLabel544;
    private javax.swing.JLabel jLabel548;
    private javax.swing.JLabel jLabel549;
    private javax.swing.JLabel jLabel554;
    private javax.swing.JLabel jLabel562;
    private javax.swing.JLabel jLabel568;
    private javax.swing.JLabel jLabel609;
    private javax.swing.JLabel jLabel624;
    private javax.swing.JLabel jLabel625;
    private javax.swing.JLabel jLabel632;
    private javax.swing.JLabel jLabel633;
    private javax.swing.JLabel jLabel634;
    private javax.swing.JLabel jLabel635;
    private javax.swing.JLabel jLabel636;
    private javax.swing.JLabel jLabel637;
    private javax.swing.JLabel jLabel640;
    private javax.swing.JLabel jLabel641;
    private javax.swing.JLabel jLabel642;
    private javax.swing.JLabel jLabel697;
    private javax.swing.JLabel jLabel698;
    private javax.swing.JLabel jLabel702;
    private javax.swing.JLabel jLabel704;
    private javax.swing.JLabel jLabel721;
    private javax.swing.JLabel jLabel726;
    private javax.swing.JLabel jLabel736;
    private javax.swing.JLabel jLabel747;
    private javax.swing.JLabel jLabel801;
    private javax.swing.JLabel jLabel806;
    private javax.swing.JLabel jLabel817;
    private javax.swing.JLabel jLabel818;
    private javax.swing.JLabel jLabel822;
    private javax.swing.JLabel jLabel824;
    private javax.swing.JLabel jLabel832;
    private javax.swing.JLabel jLabel833;
    private javax.swing.JLabel jLabel862;
    private javax.swing.JLabel jLabel863;
    private javax.swing.JLabel jLabel864;
    private javax.swing.JLabel jLabel868;
    private javax.swing.JLabel jLabel870;
    private javax.swing.JLabel jLabel872;
    private javax.swing.JLabel jLabel880;
    private javax.swing.JLabel jLabel881;
    private javax.swing.JLabel jLabel889;
    private javax.swing.JLabel jLabel894;
    private javax.swing.JLabel jLabel901;
    private javax.swing.JLabel jLabel906;
    private javax.swing.JLabel jLabel918;
    private javax.swing.JLabel jLabel931;
    private javax.swing.JLabel jLabel950;
    private javax.swing.JLabel jLabel956;
    private javax.swing.JLabel jLabel962;
    private javax.swing.JLabel jLabel964;
    private javax.swing.JLabel jLabel965;
    private javax.swing.JLabel jLabel968;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
