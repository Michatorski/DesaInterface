/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miventana1;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author OmegaKnight
 */
public class EjercicioVentana6 extends javax.swing.JFrame{
    
    JButton jButton = new JButton();
    JTextField text = new JTextField();
    JLabel label =new JLabel();
    JLabel lbRadio =new JLabel();
    ButtonGroup buttonGroupFondo = new ButtonGroup();
    JRadioButton rbVerde = new JRadioButton();
    JRadioButton rbRojo = new JRadioButton();
    
    Font font = new Font("Tohoma", Font.ITALIC | Font.BOLD, 18);
    
    Border borderLines = BorderFactory.createLineBorder(Color.yellow);
    public EjercicioVentana6(){
         setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 600, 600);
        setLocationRelativeTo(null);
       setResizable(false);
        setLayout(null);
        setTitle("Mi Ventana");
        
        add(jButton);
        add(text);
        add(label);
        add(lbRadio);
        add(rbRojo);
        add(rbVerde);
        
        buttonGroupFondo.add(rbRojo);
        buttonGroupFondo.add(rbVerde);
        
        jButton.setText("Finalizar");
        jButton.setBounds(480, 10, 100, 30);
        
        
       text.setText("Hola mundo");
       text.setBounds(10, 50, 500, 30);
       text.setFont(font);
        
       label.setText("MI PRIMERA ETIQUETA");
       label.setFont(font);
       label.setBounds(10, 5, 450, 30);
       label.setBorder(borderLines);
       label.setForeground(Color.blue);
       
        
        lbRadio.setBounds(20, 200, 150, 30);
        lbRadio.setText("FONDO");
        lbRadio.setFont(font);
        lbRadio.setForeground(Color.GRAY);
        lbRadio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRadio.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        
        rbVerde.setText("VERDE");
        rbVerde.setBounds(25, 250, 100, 30);
        rbVerde.setFont(new java.awt.Font("Tahoma", 1, 18));
        rbRojo.setText("ROJO");
        rbRojo.setBounds(125, 250, 100, 30);
        rbRojo.setFont(new java.awt.Font("Tahoma", 1, 18));
        
    }
    
    public void coloringBckgrd(){
        if(rbRojo.isSelected()){
            getContentPane().setBackground(Color.red);
        } else if(rbVerde.isSelected()){
            getContentPane().setBackground(Color.green);
        }
    }
    public static void main(String[] args) {
        new EjercicioVentana6();
        
    }
    
}
