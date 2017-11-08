package Presentacion;
import derivada.Datos;
import derivada.Derivada;
import Presentacion.CalculoDerivada;
import java.awt.Color;

/**
 *
 * @author VG
 */
public class Polinomio extends javax.swing.JFrame {
    public static String enviar;

    /**
     * Creates new form Polinomio
     */
    public Polinomio() {
        initComponents();
        this.setLocationRelativeTo(null);
        btntranparente();
    }
    
    //METODO PARA HACER TRANSPARENTE EL BOTON SALIR
    public void btntranparente(){
        btnsalir.setOpaque(false);
        btnsalir.setContentAreaFilled(false);
        btnsalir.setBorderPainted(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsalir = new javax.swing.JButton();
        btngrado = new javax.swing.JButton();
        txtgrado = new javax.swing.JTextField();
        btncoeficiente = new javax.swing.JButton();
        txtcoeficiente = new javax.swing.JTextField();
        lblx = new javax.swing.JLabel();
        lblgrado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtimprimir = new javax.swing.JTextField();
        btnimprimir = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        lbllogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnderivar = new javax.swing.JButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 70, 40));

        btngrado.setBackground(new java.awt.Color(0, 81, 19));
        btngrado.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btngrado.setForeground(new java.awt.Color(255, 255, 255));
        btngrado.setText("Grado");
        btngrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngradoActionPerformed(evt);
            }
        });
        getContentPane().add(btngrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 110, -1));

        txtgrado.setBackground(new java.awt.Color(94, 142, 94));
        txtgrado.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtgrado.setForeground(new java.awt.Color(255, 255, 255));
        txtgrado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtgrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgradoActionPerformed(evt);
            }
        });
        getContentPane().add(txtgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 60, 30));

        btncoeficiente.setBackground(new java.awt.Color(0, 81, 19));
        btncoeficiente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btncoeficiente.setForeground(new java.awt.Color(255, 255, 255));
        btncoeficiente.setText("Coeficiente");
        btncoeficiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncoeficienteActionPerformed(evt);
            }
        });
        getContentPane().add(btncoeficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 120, -1));

        txtcoeficiente.setBackground(new java.awt.Color(94, 142, 94));
        txtcoeficiente.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtcoeficiente.setForeground(new java.awt.Color(255, 255, 255));
        txtcoeficiente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtcoeficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 60, 30));

        lblx.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblx.setForeground(new java.awt.Color(255, 255, 255));
        lblx.setText("X");
        getContentPane().add(lblx, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 40, 70));

        lblgrado.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblgrado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblgrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 30, 20));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("f(x) = ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 90, 60));

        txtimprimir.setBackground(new java.awt.Color(94, 142, 94));
        txtimprimir.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtimprimir.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 290, 30));

        btnimprimir.setBackground(new java.awt.Color(0, 81, 19));
        btnimprimir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnimprimir.setForeground(new java.awt.Color(255, 255, 255));
        btnimprimir.setText("Imprimir");
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        btnnuevo.setBackground(new java.awt.Color(0, 81, 19));
        btnnuevo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 250, 150));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESAR POLINOMIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        btnderivar.setBackground(new java.awt.Color(0, 81, 19));
        btnderivar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnderivar.setForeground(new java.awt.Color(255, 255, 255));
        btnderivar.setText("Derivar");
        btnderivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnderivarActionPerformed(evt);
            }
        });
        getContentPane().add(btnderivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        lblfondo.setBackground(new java.awt.Color(255, 255, 255));
        lblfondo.setForeground(new java.awt.Color(255, 255, 255));
        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 436));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btngradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngradoActionPerformed
        Datos.Grado=Integer.parseInt(txtgrado.getText());
        Datos.exponente=Datos.Grado;
        Datos.subindice=Datos.Grado;
        Datos.Coeficiente=new double[Datos.subindice+1];
        lblgrado.setText(Integer.toString(Datos.subindice));
        txtcoeficiente.requestFocus();   
    }//GEN-LAST:event_btngradoActionPerformed

    private void btncoeficienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncoeficienteActionPerformed
        Datos.Coeficiente[Datos.subindice]=Float.parseFloat(txtcoeficiente.getText());
        Datos.subindice--;
        Datos.exponente--;
        txtcoeficiente.setText(" ");
        txtcoeficiente.requestFocus();
        lblgrado.setText(Integer.toString(Datos.exponente));
        if((Datos.exponente < 0)&&(Datos.subindice < 0)){
          lblgrado.setText(" ");
          btncoeficiente.setVisible(false);
          txtcoeficiente.setVisible(false);
          lblgrado.setVisible(false);
          lblx.setVisible(false);
        }
    }//GEN-LAST:event_btncoeficienteActionPerformed

    private void txtgradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgradoActionPerformed
        Datos.Grado=Integer.parseInt(txtgrado.getText());
        Datos.exponente=Datos.Grado;
        Datos.subindice=Datos.Grado;
        Datos.Coeficiente=new double[Datos.subindice+1];
        txtgrado.requestFocus();
    }//GEN-LAST:event_txtgradoActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        Datos.d = new Derivada(Datos.Grado,Datos.Coeficiente);
        txtimprimir.setText(Datos.d.imprimir()); 
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        Polinomio nuevo=new Polinomio();
        nuevo.setVisible(true);
        dispose();//cierra la ventana anterior
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnderivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnderivarActionPerformed
        CalculoDerivada calculo=new CalculoDerivada();
        calculo.setVisible(true);
        dispose();//cierra la ventana anterior
        enviar = txtimprimir.getText();
        CalculoDerivada.lblpolinomio.setText(enviar);
    }//GEN-LAST:event_btnderivarActionPerformed

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
            java.util.logging.Logger.getLogger(Polinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Polinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Polinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Polinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Polinomio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncoeficiente;
    private javax.swing.JButton btnderivar;
    private javax.swing.JButton btngrado;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblgrado;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblx;
    private javax.swing.JTextField txtcoeficiente;
    private javax.swing.JTextField txtgrado;
    private javax.swing.JTextField txtimprimir;
    // End of variables declaration//GEN-END:variables
}
