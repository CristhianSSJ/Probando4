
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormCliente extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public FormCliente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        TextoApellido = new javax.swing.JTextField();
        TextoDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextoCiudad = new javax.swing.JTextField();
        TextoTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UPDATEJBUTTON = new javax.swing.JButton();
        ADDJBUTTON = new javax.swing.JButton();
        DELETEJBUTTON = new javax.swing.JButton();
        TextoCedula = new javax.swing.JTextField();
        CedulaJButton = new javax.swing.JLabel();
        CONSULTJBUTTON = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        ClearJBUTTON1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Labelidcliente = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        TextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreActionPerformed(evt);
            }
        });

        Apellido.setText("Apellido:");

        TextoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoApellidoActionPerformed(evt);
            }
        });

        TextoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDireccionActionPerformed(evt);
            }
        });

        jLabel3.setText("Direccion:");

        jLabel4.setText("Ciudad:");

        TextoCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCiudadActionPerformed(evt);
            }
        });

        TextoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoTelefonoActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono:");

        UPDATEJBUTTON.setText("UPDATE");
        UPDATEJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEJBUTTONActionPerformed(evt);
            }
        });

        ADDJBUTTON.setText("ADD");
        ADDJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDJBUTTONActionPerformed(evt);
            }
        });

        DELETEJBUTTON.setText("DELETE");
        DELETEJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEJBUTTONActionPerformed(evt);
            }
        });

        TextoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCedulaActionPerformed(evt);
            }
        });

        CedulaJButton.setText("Cedula:");

        CONSULTJBUTTON.setText("CONSULT");
        CONSULTJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONSULTJBUTTONActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ClienteId", "Cedula", "Nombre", "Apellido", "Direccion", "Ciudad", "Telefono"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        ClearJBUTTON1.setText("Clear");
        ClearJBUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearJBUTTON1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Id cliente:");

        Atras.setText("Menu");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CedulaJButton)
                                    .addComponent(jLabel1)
                                    .addComponent(Apellido)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Labelidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ADDJBUTTON)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DELETEJBUTTON)
                                .addGap(4, 4, 4)
                                .addComponent(CONSULTJBUTTON)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UPDATEJBUTTON)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ClearJBUTTON1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                                .addComponent(Atras)))))
                .addGap(31, 31, 31))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TextoApellido, TextoCedula, TextoCiudad, TextoDireccion, TextoNombre, TextoTelefono});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(Labelidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CedulaJButton)
                            .addComponent(TextoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Apellido)
                            .addComponent(TextoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TextoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADDJBUTTON)
                    .addComponent(DELETEJBUTTON)
                    .addComponent(CONSULTJBUTTON)
                    .addComponent(UPDATEJBUTTON)
                    .addComponent(ClearJBUTTON1))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Atras)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TextoApellido, TextoCedula, TextoCiudad, TextoDireccion, TextoNombre, TextoTelefono});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreActionPerformed

    private void TextoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoApellidoActionPerformed

    private void TextoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDireccionActionPerformed

    private void TextoCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCiudadActionPerformed

    private void TextoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoTelefonoActionPerformed

    private void UPDATEJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEJBUTTONActionPerformed
        try {
            // TODO add your handling code here:
            Clientes C = new Clientes();
            C.setCedula(TextoCedula.getText());
            C.setNombre(TextoNombre.getText());
            C.setApellido(TextoApellido.getText());
            C.setDireccion(TextoDireccion.getText());
            C.setCiudad(TextoCiudad.getText());
            C.setTelefono(TextoTelefono.getText());
           C.setClienteID(Integer.parseInt(Labelidcliente.getText()));
            C.Actualizar_Insertar_Cliente();
              this.mostrar(Tabla, "select * from clientes");
        } catch (Exception ex) {
            Logger.getLogger(FormCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_UPDATEJBUTTONActionPerformed

    
    private void TextoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCedulaActionPerformed

    private void CONSULTJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONSULTJBUTTONActionPerformed
        // TODO add your handling code here:
          this.mostrar(Tabla, "select * from clientes");
    }//GEN-LAST:event_CONSULTJBUTTONActionPerformed

    private void ADDJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDJBUTTONActionPerformed
        try {
            // TODO add your handling code here:
            Clientes C = new Clientes();
            C.setCedula(TextoCedula.getText());
            C.setNombre(TextoNombre.getText());
            C.setApellido(TextoApellido.getText());
            C.setDireccion(TextoDireccion.getText());
            C.setCiudad(TextoCiudad.getText());
            C.setTelefono(TextoTelefono.getText());
            C.Insertar_Cliente();
              this.mostrar(Tabla, "select * from clientes");
            

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "El ingreso no pudo realizarse ");
        }


    }//GEN-LAST:event_ADDJBUTTONActionPerformed

    private void DELETEJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEJBUTTONActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Clientes C = new Clientes();
            C.setCedula(TextoCedula.getText());
            C.setNombre(TextoNombre.getText());
            C.setApellido(TextoApellido.getText());
            C.setDireccion(TextoDireccion.getText());
            C.setCiudad(TextoCiudad.getText());
            C.setTelefono(TextoTelefono.getText());
            C.setClienteID(Integer.parseInt(Labelidcliente.getText()));
            C.Eliminar_Clientes();
            this.mostrar(Tabla, "select * from clientes");
        } catch (Exception ex) {
            Logger.getLogger(FormCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DELETEJBUTTONActionPerformed

    private void ClearJBUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearJBUTTON1ActionPerformed
        // TODO add your handling code here:
        TextoApellido.setText("");//ta
        TextoCedula.setText("");//ta
        TextoCiudad.setText("");//ta
        TextoDireccion.setText("");//ta
        TextoTelefono.setText("");//ta
        TextoNombre.setText("");//ta
        Labelidcliente.setText("");//ta
        this.mostrar(Tabla, "select * from clientes");//3ta
    }//GEN-LAST:event_ClearJBUTTON1ActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        this.MouseClick();
    }//GEN-LAST:event_TablaMouseClicked

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        FormPrueba P = new FormPrueba();
        P.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasActionPerformed

     private void mostrar   (javax.swing.JTable JT, String sql) {
        try {
            Clientes cb = new Clientes();
            ResultSet rs;
                DefaultTableModel modelo = new DefaultTableModel();
            JT.setModel(modelo);
            rs = cb.consultaTabla(sql);
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();
            int cantcolumnas = rsMd.getColumnCount();
            for (int i = 1; i <= cantcolumnas; i++) {//n*(to + ta)
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()) {//n*tc
                Object[] columna = new Object[cantcolumnas];
                for (int i = 0; i < cantcolumnas; i++) {
                    columna[i] = rs.getObject(i + 1);
                }
                modelo.addRow(columna);
            }
            //Tm = 2ta + n * (2tc + to + ta) + tc
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }
         private void MouseClick() {
        int fila=Tabla.getSelectedRow();
        Labelidcliente.setText(Tabla.getModel().getValueAt(fila , 0).toString());
        TextoCedula.setText(Tabla.getModel().getValueAt(fila, 1).toString());
        TextoNombre.setText(Tabla.getModel().getValueAt(fila, 2).toString());
        TextoApellido.setText(Tabla.getModel().getValueAt(fila, 3).toString());
        TextoDireccion.setText(Tabla.getModel().getValueAt(fila, 4).toString());
        TextoCiudad.setText(Tabla.getModel().getValueAt(fila, 5).toString());
        TextoTelefono.setText(Tabla.getModel().getValueAt(fila, 6).toString());
    }
//    void consultar() throws Exception{
//        Clientes C = new Clientes();
//        ArrayList<Clientes> Lista= new ArrayList<>();
//        Lista=C.Consulta();
//        Object
//        modelo=(DefaultTableModel)Tabla.getModel();
//        for (int i = 0; i < C.Consulta().size(); i++) {
//            modelo.addRow(Lista.get(i));
//        }
//    }

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
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDJBUTTON;
    private javax.swing.JLabel Apellido;
    private javax.swing.JButton Atras;
    private javax.swing.JButton CONSULTJBUTTON;
    private javax.swing.JLabel CedulaJButton;
    private javax.swing.JButton ClearJBUTTON1;
    private javax.swing.JButton DELETEJBUTTON;
    private javax.swing.JLabel Labelidcliente;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TextoApellido;
    private javax.swing.JTextField TextoCedula;
    private javax.swing.JTextField TextoCiudad;
    private javax.swing.JTextField TextoDireccion;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JTextField TextoTelefono;
    private javax.swing.JButton UPDATEJBUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
