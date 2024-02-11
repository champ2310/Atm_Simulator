/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.management.system;

/*
 * @author onkar
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    
    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    String pinnumber;
    Withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);//l3=image
        l3.setBounds(0, 0, 900, 900);
        add(l3);
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO Withdrawl");//text
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
        t1 = new JTextField();//t1=amount
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        b1 = new JButton("Withdrawl");//   b1=button1
        b2 = new JButton("BACK"); //b2=button 2
        
        setLayout(null);
        
        l1.setBounds(170,300,400,20);//text
        l3.add(l1);//l3=image
        
        t1.setBounds(170,350,320,25); // t1=amount
        l3.add(t1);
        
        b1.setBounds(355,485,150,30); //button 1
        l3.add(b1);
        b2.setBounds(355,520,150,35); //button 2
        l3.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setSize(900,900);
        setUndecorated(true);
        setLocation(300,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
            if(ae.getSource()==b1){
               String number=t1.getText();
               Date date=new Date();
               if(number.equals(""))
               {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdrawl");
                }else
               {
                   try{
                    Conn c1 = new Conn();
                    String query="insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+number+"')";
                    c1.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. "+number+" Withdrawl Successfully");
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                      }
                   catch(Exception e){
                       System.out.println(e);
                   }
               }
            }else if(ae.getSource()==b2){
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }
        }
    
    
    public static void main(String[] args){
        new Withdrawl("").setVisible(true);
    }

}