
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author nahin
 */
public class FormCategoria extends javax.swing.JFrame {

    /**
     * Creates new form FormCategoria
     */
    public FormCategoria() {
        initComponents();
         setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        ClearJBUTTON1 = new javax.swing.JButton();
        UPDATEJBUTTON = new javax.swing.JButton();
        CONSULTJBUTTON = new javax.swing.JButton();
        DELETEJBUTTON = new javax.swing.JButton();
        ADDBUTTON = new javax.swing.JButton();
        IdCategoria = new javax.swing.JLabel();
        LabelCategoria = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TextoCategoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "IdCategoria", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        ClearJBUTTON1.setText("Clear");
        ClearJBUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearJBUTTON1ActionPerformed(evt);
            }
        });

        UPDATEJBUTTON.setText("UPDATE");
        UPDATEJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEJBUTTONActionPerformed(evt);
            }
        });

        CONSULTJBUTTON.setText("CONSULT");
        CONSULTJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTJBUTTONActionPerformed(evt);
            }
        });

        DELETEJBUTTON.setText("DELETE");
        DELETEJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEJBUTTONActionPerformed(evt);
            }
        });

        ADDBUTTON.setText("ADD");
        ADDBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBUTTONActionPerformed(evt);
            }
        });

        IdCategoria.setText("IdCategoria");

        jLabel1.setText("Categoria");

        TextoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ADDBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DELETEJBUTTON)
                        .addGap(4, 4, 4)
                        .addComponent(CONSULTJBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UPDATEJBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClearJBUTTON1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(IdCategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdCategoria)
                            .addComponent(LabelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDBUTTON)
                    .addComponent(DELETEJBUTTON)
                    .addComponent(CONSULTJBUTTON)
                    .addComponent(UPDATEJBUTTON)
                    .addComponent(ClearJBUTTON1))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearJBUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearJBUTTON1ActionPerformed
        // TODO add your handling code here:
     TextoCategoria.setText("");//ta
     LabelCategoria.setText("");//ta
        this.mostrar(Tabla, "select * from Categoria");//4Ta+ n(2Tc + 2To + 2Ta)+tc
        //2Ta+4Ta+ n(2Tc + 2To + 2Ta)+tc
        //6Ta+ n(2Tc + 2To + 2Ta)+tc
    }//GEN-LAST:event_ClearJBUTTON1ActionPerformed
    private void mostrar(javax.swing.JTable JT, String sql) {
           try {
               Clientes cb = new Clientes();//Ta
               ResultSet rs;
               DefaultTableModel modelo = new DefaultTableModel();//Ta
               JT.setModel(modelo);//Ta
               rs = cb.consultaTabla(sql);//Ta+2Ta
               ResultSetMetaData rsMd;
               rsMd = rs.getMetaData();//Ta
               int cantcolumnas = rsMd.getColumnCount();//Ta
               //Ta+Ta+Ta+Ta+2Ta+Ta+Ta
               for (int i = 1; i <= cantcolumnas; i++) {//Ta+n*Tc+n*To+n*Ta
                   modelo.addColumn(rsMd.getColumnLabel(i));//Ta
               }
               while (rs.next()) {//Tc*n+tc    
                   Object[] columna = new Object[cantcolumnas];//Ta
                   for (int i = 0; i < cantcolumnas; i++) {//Ta+n*Tc+n*to+n*ta
                       columna[i] = rs.getObject(i + 1);//Ta
                   }
                   modelo.addRow(columna);//Ta
               }
               
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error" + e.toString());
           }
           //TiempoPeorEsperado
           //Ta+Ta+Ta+Ta+2Ta+Ta+Ta+Ta+n*Tc+n*To+n*Ta+Ta+Tc*n+tc+Ta+Ta+n*Tc+n*To+n*Ta+Ta+Ta
           //9Ta+n(Tc+To+Ta)+2Ta+Tc*n+tc+Ta+n(Tc+To+Ta)+2Ta
           //14Ta + n(Tc+2Tc + 2To + 2Ta)+ + Tc
           //TiempoMejor Esperado
           ////Ta+Ta+Ta+Ta+2Ta+Ta+Taporque no entra al while ni for
           //10Ta
          //Tiempo esperado 
    //Te=[14Ta + n(2Tc + 2To + 2Ta) + Tc]-(10Ta)
    //Te=4Ta+ n(2Tc + 2To + 2Ta)+tc 
       }
    private void UPDATEJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEJBUTTONActionPerformed
        try {
            // TODO add your handling code here:
            Categoria C= new Categoria();//Ta
            C.setCategoria(TextoCategoria.getText());//Ta  
            C.Actualiza_Categoria();//3Ta
            this.mostrar(Tabla, "select * from Categoria");//4Ta+ n(2Tc + 2To + 2Ta)+tc
        } catch (Exception ex) {
            Logger.getLogger(FormCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Ta+Ta+3Ta+4Ta+ n(2Tc + 2To + 2Ta)+tc
        //9Ta+n(2Tc + 2To + 2Ta) + Tc
    }//GEN-LAST:event_UPDATEJBUTTONActionPerformed

    private void CONSULTJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTJBUTTONActionPerformed
        // TODO add your handling code here:
        this.mostrar(Tabla, "select * from Categoria");//14Ta + n(2Tc + 2To + 2Ta) + Tc
    }//GEN-LAST:event_CONSULTJBUTTONActionPerformed

    private void DELETEJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEJBUTTONActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Categoria C = new Categoria();//Ta
            C.setIdCategoria(Integer.parseInt(LabelCategoria.getText()));//Ta
            C.Eliminar_Categoria();//3Ta
            this.mostrar(Tabla, "select * from Categoria");//4Ta+ n(2Tc + 2To + 2Ta)+tc
        } catch (Exception ex) {
            Logger.getLogger(FormCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
         //Ta+Ta+3Ta+4Ta+ n(2Tc + 2To + 2Ta)+tc
                 //9Ta+n(2Tc + 2To + 2Ta) + Tc

    }//GEN-LAST:event_DELETEJBUTTONActionPerformed

    private void ADDBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBUTTONActionPerformed
        try {
            // TODO add your handling code here:
            Categoria C = new Categoria();//Ta
            C.setCategoria(TextoCategoria.getText());//Ta
            C.Insertar_Categoria();//3Ta
            this.mostrar(Tabla, "select * from Categoria");//4Ta+ n(2Tc + 2To + 2Ta)+tc

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "El ingreso no pudo realizarse ");
        }
        //Ta+Ta+3Ta+4Ta+ n(2Tc + 2To + 2Ta)+tc
        //9Ta  + n(2Tc + 2To + 2Ta)+tc
    }//GEN-LAST:event_ADDBUTTONActionPerformed

    private void TextoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(FormCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBUTTON;
    private javax.swing.JButton CONSULTJBUTTON;
    private javax.swing.JButton ClearJBUTTON1;
    private javax.swing.JButton DELETEJBUTTON;
    private javax.swing.JLabel IdCategoria;
    private javax.swing.JLabel LabelCategoria;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TextoCategoria;
    private javax.swing.JButton UPDATEJBUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
