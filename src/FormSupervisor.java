
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// Autora FUTURA.ING -----ORALYS YEPEZ-------
public class FormSupervisor extends javax.swing.JFrame {

    public FormSupervisor() {
        initComponents();  setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextoCedula = new javax.swing.JTextField();
        CedulaSupervjLabel1 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        NombreSupervjLabel2 = new javax.swing.JLabel();
        TextoApellido = new javax.swing.JTextField();
        ApellidoSupervjLabel3 = new javax.swing.JLabel();
        EliminarSupervJBUTTON = new javax.swing.JButton();
        ConsulSuperJBUTTON = new javax.swing.JButton();
        UpdtSupervJBUTTON = new javax.swing.JButton();
        AddSupervJBUTTON = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        LabelIdS = new javax.swing.JLabel();
        ClearJBUTTON1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supervisor");

        TextoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCedulaActionPerformed(evt);
            }
        });

        CedulaSupervjLabel1.setText("Cedula:");

        TextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreActionPerformed(evt);
            }
        });

        NombreSupervjLabel2.setText("Nombre del Supervisor:");

        TextoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoApellidoActionPerformed(evt);
            }
        });

        ApellidoSupervjLabel3.setText("Apellido del Supervisor:");

        EliminarSupervJBUTTON.setText("DELETE");
        EliminarSupervJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarSupervJBUTTONActionPerformed(evt);
            }
        });

        ConsulSuperJBUTTON.setText("CONSULT");
        ConsulSuperJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulSuperJBUTTONActionPerformed(evt);
            }
        });

        UpdtSupervJBUTTON.setText("UPDATE");
        UpdtSupervJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdtSupervJBUTTONActionPerformed(evt);
            }
        });

        AddSupervJBUTTON.setText("ADD");
        AddSupervJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSupervJBUTTONActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdSupervisor", "Cedula", "Nombre", "Apellido"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jLabel1.setText("IdSupervisor");

        ClearJBUTTON1.setText("Clear");
        ClearJBUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearJBUTTON1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ConsulSuperJBUTTON)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EliminarSupervJBUTTON)
                                .addGap(2, 2, 2)
                                .addComponent(UpdtSupervJBUTTON)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddSupervJBUTTON)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClearJBUTTON1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(5, 5, 5)
                                .addComponent(LabelIdS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CedulaSupervjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NombreSupervjLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ApellidoSupervjLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CedulaSupervjLabel1)
                        .addComponent(TextoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NombreSupervjLabel2)
                        .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ApellidoSupervjLabel3)
                        .addComponent(TextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(LabelIdS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsulSuperJBUTTON)
                    .addComponent(EliminarSupervJBUTTON)
                    .addComponent(UpdtSupervJBUTTON)
                    .addComponent(AddSupervJBUTTON)
                    .addComponent(ClearJBUTTON1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCedulaActionPerformed

    private void TextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreActionPerformed

    private void TextoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoApellidoActionPerformed

    private void UpdtSupervJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdtSupervJBUTTONActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            Supervisor S = new Supervisor(); //4TA 
            S.setCedula(TextoCedula.getText()); //TA
            S.setNombre(TextoNombre.getText()); //TA
            S.setApellido(TextoApellido.getText()); //TA
            S.setIdSupersvisor(Integer.parseInt(LabelIdS.getText())); //TA
            S.Actualizar_Supersvisor(); //3TA
            this.mostrar(Tabla, "select * from supervisor");  //N*5TA + N*3TC + N*TO -TC -TO 
        } catch (Exception ex) {
            Logger.getLogger(FormSupervisor.class.getName()).log(Level.SEVERE, null, ex);
            //11 TA + N*5TA + N*3TC + N*TO -TC -TO 
        }
    }//GEN-LAST:event_UpdtSupervJBUTTONActionPerformed

    private void AddSupervJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSupervJBUTTONActionPerformed
        try {
            // TODO add your handling code here:
            Supervisor S = new Supervisor();        //4TA 
            S.setCedula(TextoCedula.getText());      //TA
            S.setNombre(TextoNombre.getText());      //TA
            S.setApellido(TextoApellido.getText());  //TA
            S.Insertar_Supersvisor();                //3TA + TO 
this.mostrar(Tabla, "select * from supervisor");     //N*5TA + N*3TC + N*TO -TC -TO 
        } catch (Exception ex) {
            Logger.getLogger(FormSupervisor.class.getName()).log(Level.SEVERE, null, ex);
       } //      N*5TA + N*3TC + N*TO -TC -TO 
         // 10TA +                        +TO
         //____________________________________
         // 10TA +N*5TA + N*3TC + N*TO -TC -TO
    }//GEN-LAST:event_AddSupervJBUTTONActionPerformed

    private void EliminarSupervJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarSupervJBUTTONActionPerformed
        try {
            // TODO add your handling code here:
            Supervisor S = new Supervisor();           //4TA 
            S.setCedula(TextoCedula.getText());        //TA
            S.setNombre(TextoNombre.getText());        //TA
            S.setApellido(TextoApellido.getText());    //TA
            S.setIdSupersvisor(Integer.parseInt(LabelIdS.getText())); //TA
            S.Eliminar_Supersvisor();                  //3TA 
            this.mostrar(Tabla, "select * from supervisor");  //N*5TA + N*3TC + N*TO -TC -TO 
        } catch (Exception ex) {
            Logger.getLogger(FormSupervisor.class.getName()).log(Level.SEVERE, null, ex);
        }
        // ---------11 TA + N*5TA + N*3TC + N*TO -TC -TO ---------
    }//GEN-LAST:event_EliminarSupervJBUTTONActionPerformed

    private void ConsulSuperJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulSuperJBUTTONActionPerformed
        // TODO add your handling code here:
        this.mostrar(Tabla, "select * from supervisor");
    }//GEN-LAST:event_ConsulSuperJBUTTONActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        MouseClick();
    }//GEN-LAST:event_TablaMouseClicked

    private void ClearJBUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearJBUTTON1ActionPerformed
        // TODO add your handling code here:
        LabelIdS.setText("");
        TextoNombre.setText("");TextoApellido.setText("");TextoCedula.setText("");
        
        this.mostrar(Tabla, "select * from Categoria");
    }//GEN-LAST:event_ClearJBUTTON1ActionPerformed
     private void mostrar   (javax.swing.JTable JT, String sql) {
        try {
            Clientes cb = new Clientes(); //TA
            ResultSet rs;
                DefaultTableModel modelo = new DefaultTableModel(); //TA
            JT.setModel(modelo); //TA
            rs = cb.consultaTabla(sql); //TA 
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();    //TA
            int cantcolumnas = rsMd.getColumnCount();  //TA
            for (int i = 1; i <= cantcolumnas; i++) {  //TA + TC*N + TO*N + TA*N
                modelo.addColumn(rsMd.getColumnLabel(i)); //TA
            }
             // N*7TA + 2TA + TC + TO + TA = | N*9TA + N*TC + N*TO |
             // 
            while (rs.next()) { //N*TC
                Object[] columna = new Object[cantcolumnas]; //N*TA
                for (int i = 0; i < cantcolumnas; i++) {  //N*2TA + N*TC + N*TO 
                    columna[i] = rs.getObject(i + 1); //TA + TO
                }
                modelo.addRow(columna); //TA 
            }
            //N*3TA + N*2TC + N*TO
            //  2TA   +         TO
            //----------------------
            // N*5TA +N*2TC + N*2TO  +   N*9TA + N*TC + N*TO  =  N(14 TA) + N (3 TC) + N (3 TO)
            // N(14 TA) + N (3TC) + N (3 TO)               TIEMPO PEOR ESPERADO.
            // N*9TA    +      TC +      TO                TIEMPO MEJOR ESPERADO.
           // -______________________________
            // N*5TA + N*3TC + N*TO -TC -TO               TIEMPO ESPERADO
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }
      private void MouseClick() {
        int fila=Tabla.getSelectedRow();                                       //TA
        LabelIdS.setText(Tabla.getModel().getValueAt(fila, 0).toString());     //TA
        TextoCedula.setText(Tabla.getModel().getValueAt(fila, 1).toString());  //TA
        TextoNombre.setText(Tabla.getModel().getValueAt(fila, 2).toString());  //TA
        TextoApellido.setText(Tabla.getModel().getValueAt(fila, 3).toString());//TA
        //5TA 
    }
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
            java.util.logging.Logger.getLogger(FormSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSupervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSupervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSupervJBUTTON;
    private javax.swing.JLabel ApellidoSupervjLabel3;
    private javax.swing.JLabel CedulaSupervjLabel1;
    private javax.swing.JButton ClearJBUTTON1;
    private javax.swing.JButton ConsulSuperJBUTTON;
    private javax.swing.JButton EliminarSupervJBUTTON;
    private javax.swing.JLabel LabelIdS;
    private javax.swing.JLabel NombreSupervjLabel2;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TextoApellido;
    private javax.swing.JTextField TextoCedula;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JButton UpdtSupervJBUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
