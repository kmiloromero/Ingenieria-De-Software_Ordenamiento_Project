/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author ClaudiaQuevedo
 */
public class Segundo_Panel extends javax.swing.JFrame {

    /**
     * Creates new form Segundo_Panel
     */
    public Segundo_Panel() {
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

        panel1 = new java.awt.Panel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonDes = new javax.swing.JButton();
        jButtonAsc = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Examinar..");
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 90, 30));

        jTextField1.setEditable(false);
        panel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 410, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Software de Ordenamiento");
        jLabel1.setToolTipText("");
        jLabel1.setIconTextGap(5);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 20));

        jButtonDes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonDes.setText("Ordenamiento Descendente");
        jButtonDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesActionPerformed(evt);
            }
        });
        panel1.add(jButtonDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 190, 30));

        jButtonAsc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAsc.setText("Ordenamiento Ascendente");
        jButtonAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAscActionPerformed(evt);
            }
        });
        panel1.add(jButtonAsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 30));

        jButton4.setText("Salir");
        panel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese la ruta del archivo TXT que desea ordenar");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAscActionPerformed

    private void jButtonDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDesActionPerformed

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
            java.util.logging.Logger.getLogger(Segundo_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Segundo_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Segundo_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Segundo_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Segundo_Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonAsc;
    private javax.swing.JButton jButtonDes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
