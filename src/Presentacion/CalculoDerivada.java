package Presentacion;
import derivada.Datos;
import derivada.Derivada;
import Presentacion.Polinomio;

/**
 *
 * @author VG
 */
public class CalculoDerivada extends javax.swing.JFrame {

    /**
     * Creates new form CalculoDerivada
     */
    public CalculoDerivada() {
        initComponents();
        this.setLocationRelativeTo(null);
        btntranparente();
        txtkesima.requestFocus();
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
        jLabel2 = new javax.swing.JLabel();
        lblpolinomio = new javax.swing.JLabel();
        lblderivada = new javax.swing.JLabel();
        btnderivar = new javax.swing.JButton();
        txtkesima = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        lblfondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 70, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Derivada ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 90, 60));

        lblpolinomio.setBackground(new java.awt.Color(94, 142, 94));
        lblpolinomio.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lblpolinomio.setForeground(new java.awt.Color(255, 255, 255));
        lblpolinomio.setOpaque(true);
        getContentPane().add(lblpolinomio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 290, 30));

        lblderivada.setBackground(new java.awt.Color(94, 142, 94));
        lblderivada.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lblderivada.setForeground(new java.awt.Color(255, 255, 255));
        lblderivada.setOpaque(true);
        getContentPane().add(lblderivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 290, 30));

        btnderivar.setBackground(new java.awt.Color(0, 81, 19));
        btnderivar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnderivar.setForeground(new java.awt.Color(255, 255, 255));
        btnderivar.setText("Derivar");
        btnderivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnderivarActionPerformed(evt);
            }
        });
        getContentPane().add(btnderivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        txtkesima.setBackground(new java.awt.Color(94, 142, 94));
        txtkesima.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtkesima.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtkesima, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("INGRESAR LA DERIVADA ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("f(x) = ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 90, 60));

        btnnuevo.setBackground(new java.awt.Color(0, 81, 19));
        btnnuevo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnnuevo.setText("Nuevo Polinomio");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        lblfondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(lblfondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnderivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnderivarActionPerformed
        int num = Integer.parseInt(txtkesima.getText());
        if(num < 0 || num > Datos.Grado+1 )
        {
            lblderivada.setText("");
            txtkesima.requestFocus();
        }
        if(num > Datos.d.grado)
        {
            lblderivada.setText("0");
        }
        else
        {
            Datos.d.Derivar(num);
            lblderivada.setText(Datos.d.imprimir());
            Datos.d = new Derivada(Datos.Grado,Datos.Coeficiente);
        } 
    }//GEN-LAST:event_btnderivarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        Polinomio nuevo = new Polinomio();
        nuevo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnnuevoActionPerformed

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
            java.util.logging.Logger.getLogger(CalculoDerivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoDerivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoDerivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoDerivada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculoDerivada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnderivar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel lblderivada;
    private javax.swing.JLabel lblfondo2;
    public static javax.swing.JLabel lblpolinomio;
    private javax.swing.JTextField txtkesima;
    // End of variables declaration//GEN-END:variables
}
