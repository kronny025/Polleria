
package capapresentación;
import capanegocio.Cliente;
import capanegocio.Motorizado;
public class frmMotorizado extends javax.swing.JFrame {

    /**
     * Creates new form frmMotorizado
     */
    public frmMotorizado() {
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

        txtCodMotorizado = new javax.swing.JTextField();
        txtNombreMotorizado = new javax.swing.JTextField();
        txtCelularMotorizado = new javax.swing.JTextField();
        btnLeer = new javax.swing.JButton();
        btnEscribir = new javax.swing.JButton();
        btnMetodo1 = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombreMotorizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMotorizadoActionPerformed(evt);
            }
        });

        btnLeer.setText("Leer");

        btnEscribir.setText("Escribir");
        btnEscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscribirActionPerformed(evt);
            }
        });

        btnMetodo1.setText("Metodo 1");

        lblMensaje.setText("Mensaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCelularMotorizado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodMotorizado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnLeer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEscribir)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombreMotorizado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMetodo1)
                        .addGap(89, 89, 89))))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(lblMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodMotorizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeer)
                    .addComponent(btnEscribir))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreMotorizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMetodo1))
                .addGap(18, 18, 18)
                .addComponent(txtCelularMotorizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensaje)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMotorizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMotorizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMotorizadoActionPerformed

    private void btnEscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscribirActionPerformed
        // TODO add your handling code here:
        String codMotorizado = txtCodMotorizado.getText();
        String nombreMotorizado = txtNombreMotorizado.getText();
        String celularMotorizado = txtCelularMotorizado.getText();
        // Declarar objeto Cliente
        Motorizado motorizado = new Motorizado();
        motorizado.setCodMotorizado(codMotorizado);
        motorizado.setNombreMotorizado(nombreMotorizado);
        motorizado.setCelularMotorizado(celularMotorizado);
        // Enviar mensaje de confirmacion
        lblMensaje.setText("Se escribio los atributos del objeto motorizado");
    }//GEN-LAST:event_btnEscribirActionPerformed

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
            java.util.logging.Logger.getLogger(frmMotorizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMotorizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMotorizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMotorizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMotorizado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscribir;
    private javax.swing.JButton btnLeer;
    private javax.swing.JButton btnMetodo1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtCelularMotorizado;
    private javax.swing.JTextField txtCodMotorizado;
    private javax.swing.JTextField txtNombreMotorizado;
    // End of variables declaration//GEN-END:variables
}
