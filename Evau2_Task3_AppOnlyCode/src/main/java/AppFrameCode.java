
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import  javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OmegaKnight
 */
import javax.swing.JLabel;
import javax.swing.LayoutStyle;
public class AppFrameCode extends javax.swing.JFrame{

    private javax.swing.JButton jbtnFinal;
    private javax.swing.JButton jbtnNext;
    private javax.swing.JLabel jText;
    
    public AppFrameCode(){
        initComponents();
    }

    private void initComponents() {
        jbtnFinal = new javax.swing.JButton();
        jbtnNext = new javax.swing.JButton();
        jText = new javax.swing.JLabel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        jbtnFinal.setText("Finalizar");
        jbtnFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFinalActionPerformed(evt);
            }
        });
        
        jbtnNext.setText("Siguiente");
        jbtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNextActionPerformed(evt);
            }

            
        });
        
        jText.setText("Bienvenido");
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jbtnFinal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnNext)
                                .addGap(71, 71, 71))
                .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jText)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jbtnFinal)
                                        .addComponent(jbtnNext))
                                .addGap(30, 30, 30))
        );
        pack();
                }
  
    
     private void jbtnFinalActionPerformed(ActionEvent evt) {
         JOptionPane.showMessageDialog(rootPane, "Programa sera finalizado");
         dispose();
                   }
     
     private void jbtnNextActionPerformed(ActionEvent evt) {
               JOptionPane.showMessageDialog(rootPane, "La edad del usuario: " + JOptionPane.showInputDialog("introduce años"));
            }
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFrameCode().setVisible(true);
            }
          });
     
    }
    
}
