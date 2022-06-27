/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class banking_system 
{
    public static void main(String args[])
    {
        JFrame f=new JFrame("PNB BANK");
        JLabel l=new JLabel("WELCOME TO PUNJAB NATIONAL BANK PORTAL ");
        l.setForeground(Color.red);
        JLabel l1=new JLabel("enter the account number ");
        JTextField jt=new JTextField();
        JButton b1=new JButton("CREDIT");
        JButton b2=new JButton("DEBIT");
        JButton b3=new JButton("CHECK BALANCE");
        
        
        l.setBounds(100,100,400,50);
        l1.setBounds(20,200,400,50);
        jt.setBounds(220,200,200,50);
        b1.setBounds(100,340,160,50);
        b2.setBounds(100,430,160,50);
        b3.setBounds(100,520,160,50);
        
        
        f.add(l);f.add(jt);f.add(l1);f.add(b1);f.add(b2);f.add(b3);
        
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame f=new JFrame("CREDIT");
                JLabel l=new JLabel("enter the amount");
                JTextField jt=new JTextField();
                JButton b=new JButton("SUBMIT");
                
                l.setBounds(100,200,400,50);
                jt.setBounds(100,250,200,50);
                b.setBounds(100,400,160,50);
                
                b.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        int amount=500000;
                        JFrame f=new JFrame();
                        JLabel jl=new JLabel();
                        
                        f.add(jl);
                        jl.setBounds(100,200,300,50);
                        
                        int a = Integer.parseInt(jt.getText());
               
                        int credit=amount+a;
                        String s3=String.valueOf(credit);
                        jl.setText("Balance is  : "+ s3); 
                        
                        f.setSize(600,700);
                        f.setLayout(null);
                        f.setVisible(true);
                        
                    }
                    
                });
                
                
                
                f.add(l);f.add(jt);f.add(b);
                
                f.setSize(600,700);
                f.setLayout(null);
                f.setVisible(true);
                
            }
            
        });
        
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame f=new JFrame("DEBIT");
                JLabel l=new JLabel("enter the amount");
                JTextField jt=new JTextField();
                JButton b=new JButton("SUBMIT");
                
                l.setBounds(100,200,400,50);
                jt.setBounds(100,250,200,50);
                b.setBounds(100,400,160,50);
                
                b.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        int amount=500000;
                        JFrame f=new JFrame();
                        JLabel jl=new JLabel();
                        
                        f.add(jl);
                        jl.setBounds(100,200,300,50);
                        
                        int a = Integer.parseInt(jt.getText());
               
                        int debit=amount-a;
                        String s3=String.valueOf(debit);
                        jl.setText("Balance is  : "+ s3); 
                        
                        f.setSize(600,700);
                        f.setLayout(null);
                        f.setVisible(true);
                        
                    }
                    
                });
                
                
                
                f.add(l);f.add(jt);f.add(b);
                
                f.setSize(600,700);
                f.setLayout(null);
                f.setVisible(true);
                
                
            }
            
        });
        
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame f=new JFrame("BALANCE");
                JLabel l1=new JLabel();
                
                l1.setBounds(100,200,170,50);
                
                f.add(l1);
                
                f.setSize(600,700);
                f.setLayout(null);
                f.setVisible(true);
            }
            
        });
        
        f.setSize(600,700);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
