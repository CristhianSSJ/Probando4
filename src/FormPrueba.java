
import java.util.logging.Level;
import java.util.logging.Logger;

// Oralys Yepez
public class FormPrueba extends javax.swing.JFrame {
    /**
     * Creates new form FormPrueba
     */
    public FormPrueba() {
        initComponents();  setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cliente = new javax.swing.JButton();
        Biblioteca = new javax.swing.JButton();
        Libro = new javax.swing.JButton();
        Ordenar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mainn");

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });

        Biblioteca.setText("Biblioteca");
        Biblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BibliotecaActionPerformed(evt);
            }
        });

        Libro.setText("Libro");
        Libro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroActionPerformed(evt);
            }
        });

        Ordenar.setText("Orden");
        Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Biblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Libro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Libro, Ordenar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Biblioteca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Libro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ordenar)
                .addGap(44, 44, 44)
                .addComponent(Salir)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);  //TA
        FormCliente v = new FormCliente(); //TA
        v.setVisible(true);                //TA
    }//GEN-LAST:event_ClienteActionPerformed
      //2TA 
    private void BibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BibliotecaActionPerformed
        // TODO add your handling code here:
       
        FromBiblioteca B = new FromBiblioteca();   //TA
        B.setVisible(true);                        //TA
         this.dispose();                           //TA
         
    }//GEN-LAST:event_BibliotecaActionPerformed
// ----->  3TA
    private void LibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);                    //TA
        FromLibro fromLibro = new FromLibro();      //TA
        fromLibro.setVisible(true);                  //TA
    }//GEN-LAST:event_LibroActionPerformed
           //3TA
    private void OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarActionPerformed
            // TODO add your handling code here:
            this.setVisible(false);                  //TA
        try {
            FormOrdenes FO = new FormOrdenes();       //TA
            FO.setVisible(true);                       //TA
        } catch (Exception ex) {
            Logger.getLogger(FormPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_OrdenarActionPerformed
  // ----->  3TA
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrueba().setVisible(true);  //TA
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Biblioteca;
    private javax.swing.JButton Cliente;
    private javax.swing.JButton Libro;
    private javax.swing.JButton Ordenar;
    private javax.swing.JButton Salir;
    // End of variables declaration//GEN-END:variables
}
