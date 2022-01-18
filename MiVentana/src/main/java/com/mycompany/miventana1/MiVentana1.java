/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miventana1;

import java.awt.Color;

/**
 *
 * @author MichalHomenda
 */
public class MiVentana1 extends javax.swing.JFrame {
    //este se podria considerar que es el ejercicio 1
    
    public MiVentana1(){
        //mostrar ventana
        setVisible(true);
    //Cerrar ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    //Crear las dimensiones de la ventana
        setBounds(300, 100, 600, 500);
    //No redimensionable
        setResizable(false);
    //Titulo
        setTitle("Mi Ventana");
    //Cambiar Color a base de coger el contenido panel 'Pane' 
        getContentPane().setBackground(Color.yellow);
    //Centrar la ventana
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args){
     new MiVentana1 ();
  }
}


