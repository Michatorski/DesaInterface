
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author MichalHomenda
 */
public class Pagando extends javax.swing.JDialog {

    /**
     * Creates new form Pagando
     */
    public Pagando(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
      
    }

    Gala_benefica gala_benefica;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rGPago = new javax.swing.ButtonGroup();
        jbCancelar = new javax.swing.JButton();
        jPanelBotonesPago = new javax.swing.JPanel();
        rbTarjeta = new javax.swing.JRadioButton();
        rbEfectivo = new javax.swing.JRadioButton();
        rbBizum = new javax.swing.JRadioButton();
        jPanelTextoPago = new javax.swing.JPanel();
        jLabelPregunta = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        jbFinalizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pgando");
        setPreferredSize(new java.awt.Dimension(543, 300));

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jPanelBotonesPago.setLayout(new java.awt.GridLayout(3, 1));

        rGPago.add(rbTarjeta);
        rbTarjeta.setText("Pagar con tarjeta");
        rbTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbTarjetaMouseClicked(evt);
            }
        });
        jPanelBotonesPago.add(rbTarjeta);

        rGPago.add(rbEfectivo);
        rbEfectivo.setText("Pago en efectivo");
        rbEfectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbEfectivoMouseClicked(evt);
            }
        });
        jPanelBotonesPago.add(rbEfectivo);

        rGPago.add(rbBizum);
        rbBizum.setText("Bizum");
        rbBizum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbBizumMouseClicked(evt);
            }
        });
        jPanelBotonesPago.add(rbBizum);

        javax.swing.GroupLayout jPanelTextoPagoLayout = new javax.swing.GroupLayout(jPanelTextoPago);
        jPanelTextoPago.setLayout(jPanelTextoPagoLayout);
        jPanelTextoPagoLayout.setHorizontalGroup(
            jPanelTextoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTextoPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTextoPagoLayout.setVerticalGroup(
            jPanelTextoPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTextoPagoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelBotones.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 30));

        jbFinalizar.setText("Finalizar compra");
        jbFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jbFinalizar);

        jbLimpiar.setText("Limpiar seleccion");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jbLimpiar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelTextoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBotonesPago, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCancelar)
                    .addComponent(jPanelTextoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelBotonesPago, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // Cierra el DialogoModal y volvemos a la pantalla principal
        setVisible(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void rbTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbTarjetaMouseClicked
        // Muestra mensaje
        jLabelPregunta.setText("Has seleccionado Tarjeta. ??Quiere continuar?");
    }//GEN-LAST:event_rbTarjetaMouseClicked

    private void rbEfectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbEfectivoMouseClicked
        // Muestra mensaje
         jLabelPregunta.setText("Has seleccionado Efectivo. ??Quiere continuar?");
    }//GEN-LAST:event_rbEfectivoMouseClicked

    private void rbBizumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbBizumMouseClicked
        // Muestra mensaje
         jLabelPregunta.setText("Has seleccionado Bizum. ??Quiere continuar?");
    }//GEN-LAST:event_rbBizumMouseClicked

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // Limpia la etiqueta
         jLabelPregunta.setText(" ");
        //Limpia el radio group
           rGPago.clearSelection();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarActionPerformed
        // Hace que salte el mensaje en un pop up
        JOptionPane.showMessageDialog(this, "Compra finalizada");
        
        //cierra todo el sistema al cerrarse la ventana
        System.exit(0);
        
    }//GEN-LAST:event_jbFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(Pagando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagando.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pagando dialog = new Pagando(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelPregunta;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelBotonesPago;
    private javax.swing.JPanel jPanelTextoPago;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFinalizar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.ButtonGroup rGPago;
    private javax.swing.JRadioButton rbBizum;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.JRadioButton rbTarjeta;
    // End of variables declaration//GEN-END:variables
}
