/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen.examen_interfaces;
import javax.swing.JOptionPane;

/**
 *
 * @author MichalHomenda
 */
public class MyPanel extends javax.swing.JFrame {

    /**
     * Creates new form MyPanel
     */
    public MyPanel() {
        
      
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jName = new javax.swing.JLabel();
        jSurname = new javax.swing.JLabel();
        jZipCode = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfSurname = new javax.swing.JTextField();
        tfZipCode = new javax.swing.JTextField();
        jlTitle = new javax.swing.JLabel();
        jbtnAccept = new javax.swing.JButton();
        jbtnErase = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fomulario de Registro");
        setResizable(false);

        jName.setText("Nombre:");

        jSurname.setText("Apellidos");

        jZipCode.setText("CodigoPostal:");

        jlTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlTitle.setText("Formulario");

        jbtnAccept.setText("Aceptar");
        jbtnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcceptActionPerformed(evt);
            }
        });

        jbtnErase.setText("Borrar");
        jbtnErase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEraseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jZipCode)
                    .addComponent(jSurname)
                    .addComponent(jName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(tfName))
                        .addComponent(tfZipCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnAccept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnErase)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSurname)
                    .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jZipCode)
                    .addComponent(tfZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAccept)
                    .addComponent(jbtnErase))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcceptActionPerformed
        // TODO add your handling code here:
        String name = tfName.getText();
        String surname = tfSurname.getText();
        String zipCode = tfZipCode.getText();
        
        
         if (name.isEmpty() || surname.isEmpty() || zipCode.isEmpty()) {
             JOptionPane.showMessageDialog(null, "Las casillas debes estar rellenadas");

        } else{
              JOptionPane.showMessageDialog(null, "Nombre: " + name + "\n" + "Apellido: "
               + surname + "\n" + "CodigoPostal: " + zipCode, "Formulario", JOptionPane.INFORMATION_MESSAGE);
       
       System.exit(0);
        }
        
     
    }//GEN-LAST:event_jbtnAcceptActionPerformed

    private void jbtnEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEraseActionPerformed
        // TODO add your handling code here:
        if(tfName.getText().isEmpty() && tfSurname.getText().isEmpty()
                && tfZipCode.getText().isEmpty()){
             JOptionPane.showMessageDialog(null,"Ya estan vacias las casillas",
                     "Atencion",JOptionPane.INFORMATION_MESSAGE);
        } else{
             tfName.setText("");
        tfSurname.setText("");
        tfZipCode.setText("");
        }
       
    }//GEN-LAST:event_jbtnEraseActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new MyPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jName;
    private javax.swing.JLabel jSurname;
    private javax.swing.JLabel jZipCode;
    private javax.swing.JButton jbtnAccept;
    private javax.swing.JButton jbtnErase;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfSurname;
    private javax.swing.JTextField tfZipCode;
    // End of variables declaration//GEN-END:variables
}