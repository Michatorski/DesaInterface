package a.ejercicio4.trimestre2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author OmegaKnight
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.MouseInputAdapter;

public class MouseTextEvent extends JFrame {

    private JButton boton;
     private JTextArea areatext;
    private JPanel panel;
    /**
     * Creates new form MouseEvent
     */
    public MouseTextEvent() {
         boton = new JButton("limpiar");
         areatext = new JTextArea(15, 60);
         panel = new JPanel();
        panel.add(boton);
        panel.add(areatext);
        add(panel);
        // SE CREA UN OYENTE RATON QUE SE ASOCIA AL AREA DE TEXTO
        ActionListener oyenteBoton = new OyenteAccion();
        boton.addActionListener(oyenteBoton);
        
        MouseListener oyenteRaton = new OyenteRaton();
        areatext.addMouseListener(oyenteRaton);
    }

    private int getModifiers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     class OyenteAccion implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            areatext.setText("");
        }
    }

    class OyenteRaton extends MouseInputAdapter{
        
        public void mouseClicked(MouseTextEvent e){
            areatext.append("Has hecho clic en \n");
            areatext.append("Posicion X: " + e.getX());
            areatext.append("Posicion Y: " + e.getY());
        }
        

        public void mousePressed(MouseTextEvent e){
            if(((e.getModifiers() & InputEvent.BUTTON3_DOWN_MASK) !=0)){
                areatext.append("Pulsado el bot??n derecho");
            }
            areatext.append("Se ha pulsado el bot??n del raton");
        }
        
        public void mouseReleased(MouseTextEvent e){
            areatext.append("Se ha soltado el bot??n derecho");
        }
        
        public void mouseEntered(MouseTextEvent e){
            areatext.append("El raton ha entrado en el componente");
        }
        public void mouseExited(MouseTextEvent e){
            areatext.append("El raton ha salido en el componente");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        MouseTextEvent ventana = new MouseTextEvent();
        ventana.setTitle("Todos los eventos del raton");
            ventana.pack();
            ventana.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
