/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miventana1;

import javax.swing.JButton;

/**
 *
 * @author MichalHomenda
 */
public class EjercicioVentana5 extends javax.swing.JFrame{
    
    JButton jButton = new JButton();
    
    public EjercicioVentana5(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(1000, 100, 400, 400);
        setResizable(false);
        setLayout(null);
        
        //boton
         add(jButton);
        jButton.setText("Empezar");
        jButton.setBounds(250, 10, 100, 30);
       
    }
    
    public static void main(String[] args) {
        new EjercicioVentana5();   
    }
}
