/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miventana1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author OmegaKnight
 */
public class EjercicioVentana6 extends javax.swing.JFrame{
    
    JButton jButton = new JButton();
    JTextField text = new JTextField();
    JLabel label =new JLabel();
    
    Font font = new Font("Tohoma", Font.ITALIC, 18);
    Border borderLines = BorderFactory.createLineBorder(Color.yellow);
    public EjercicioVentana6(){
         setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Mi Ventana");
        
        jButton.setText("Finalizar");
        jButton.setBounds(20, 900, 100, 30);
        
       text.setText("Hola mundo");
       text.setBounds(10, 50, 500, 30);
       text.setFont(font);
        
       label.setText("MI PRIMERA ETIQUETA");
       label.setFont(font);
       label.setBounds(10, 5, 450, 30);
       label.setBorder(borderLines);
       label.setForeground(Color.blue);
       
        add(jButton);
        add(text);
        add(label);
        
       
    }
    
    public static void main(String[] args) {
        new EjercicioVentana6();
    }
    
}
