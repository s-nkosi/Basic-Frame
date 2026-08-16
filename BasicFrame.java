/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author SIYABONGA NKOSI
 */
public class BasicFrame extends JFrame {
       
    public BasicFrame(){
        
        setSize(500, 500);
        setTitle("My first GUI");
        setLocationRelativeTo(null);
        setBackground(Color.yellow);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
   
        setVisible(true);
    }
}
