package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
 MyWindow()
 {
     setVisible(true);
     setLocation(650,650);
     setSize(500,500);
     setTitle("Окно в Европу");
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     JPanel panel=new JPanel(new GridLayout(1,2));

     JButton btn1=new JButton("ВЫХОД");
     //add(btn1, BorderLayout.PAGE_END);
     panel.add(btn1);

     ActionListener actionListener=new CloseActionListener();
     btn1.addActionListener(actionListener);


     JButton btn2=new JButton("ВХОД");
     //add(btn2, BorderLayout.PAGE_START);
     panel.add(btn2);
     add(panel,BorderLayout.PAGE_END);

 }
}
