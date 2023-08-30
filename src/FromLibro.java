
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FromLibro extends javax.swing.JFrame {
    public FromLibro() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            LllenarCBXAutor(CBXAutor);
            LlenarCBXBiblioteca(CBXBiblioteca);
            LlenarCBXCategoria(CBXCategoria);
        } catch (Exception ex) {
            Logger.getLogger(FromLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void LlenarCBXBiblioteca(JComboBox JB) throws Exception{
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JB.setModel(modelo);
        Biblioteca B = new Biblioteca();
        ArrayList<Biblioteca> ListaB = B.bibliotecaVista();
        CBXBiblioteca.removeAllItems();
        for (int i = 0; i < ListaB.size(); i++) {
            modelo.addElement(ListaB.get(i));
        }
        JB.setModel(modelo);
    }
    public void LllenarCBXAutor(JComboBox JA) throws Exception{
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JA.setModel(modelo);
        Autor A= new Autor();
        ArrayList<Autor>ListaA=A.AutorVista();
        CBXAutor.removeAllItems();
        for (int i = 0; i < ListaA.size(); i++) {
            modelo.addElement(ListaA.get(i));
            System.out.println(ListaA.get(i).toString());
        }
       JA.setModel(modelo);
    }
    public void LlenarCBXCategoria(JComboBox JC) throws Exception {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        JC.setModel(modelo);
        Categoria C =new Categoria();
        ArrayList<Categoria>ListaC=C.CategoriaVista();
        CBXCategoria.setModel(modelo);
        for (int i = 0; i < ListaC.size(); i++) {
            modelo.addElement(ListaC.get(i));
        }
        JC.setModel(modelo);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EliminarLibroJBUTTON = new javax.swing.JButton();
        ConsulLibroJBUTTON = new javax.swing.JButton();
        UpdtLibroJBUTTON = new javax.swing.JButton();
        AddLibroJBUTTON = new javax.swing.JButton();
        TextoTitulo = new javax.swing.JTextField();
        TitulojLabel2 = new javax.swing.JLabel();
        TextoPrecio = new javax.swing.JTextField();
        PreciojLabel3 = new javax.swing.JLabel();
        IDBibliotecajLabel4 = new javax.swing.JLabel();
        CBXBiblioteca = new javax.swing.JComboBox<>();
        IdCategoriajLabel5 = new javax.swing.JLabel();
        CBXCategoria = new javax.swing.JComboBox<>();
        IDBibliotecajLabel5 = new javax.swing.JLabel();
        CBXAutor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        LabelID = new javax.swing.JLabel();
        ClearJBUTTON1 = new javax.swing.JButton();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        EliminarLibroJBUTTON.setText("DELETE");
        EliminarLibroJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarLibroJBUTTONActionPerformed(evt);
            }
        });

        ConsulLibroJBUTTON.setText("CONSULT");
        ConsulLibroJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulLibroJBUTTONActionPerformed(evt);
            }
        });

        UpdtLibroJBUTTON.setText("UPDATE");
        UpdtLibroJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdtLibroJBUTTONActionPerformed(evt);
            }
        });

        AddLibroJBUTTON.setText("ADD");
        AddLibroJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLibroJBUTTONActionPerformed(evt);
            }
        });

        TextoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoTituloActionPerformed(evt);
            }
        });

        TitulojLabel2.setText("Titulo:");

        TextoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPrecioActionPerformed(evt);
            }
        });

        PreciojLabel3.setText("Precio:");

        IDBibliotecajLabel4.setText("Biblioteca:");

        CBXBiblioteca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBXBiblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBXBibliotecaMouseClicked(evt);
            }
        });
        CBXBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXBibliotecaActionPerformed(evt);
            }
        });

        IdCategoriajLabel5.setText("Categoria:");

        CBXCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBXCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBXCategoriaMouseClicked(evt);
            }
        });
        CBXCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXCategoriaActionPerformed(evt);
            }
        });

        IDBibliotecajLabel5.setText("Autor:");

        CBXAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBXAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBXAutorMouseClicked(evt);
            }
        });
        CBXAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXAutorActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "LibroID", "Titulo", "Precio", "Autor", "Categoria", "Biblioteca"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jLabel1.setText("LibroID:");

        ClearJBUTTON1.setText("Clear");
        ClearJBUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearJBUTTON1ActionPerformed(evt);
            }
        });

        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ConsulLibroJBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EliminarLibroJBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UpdtLibroJBUTTON))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TitulojLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IDBibliotecajLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IDBibliotecajLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PreciojLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(IdCategoriajLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBXBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBXCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBXAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(AddLibroJBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ClearJBUTTON1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Menu))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TextoPrecio, TextoTitulo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TitulojLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TextoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PreciojLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CBXBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDBibliotecajLabel4))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CBXAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDBibliotecajLabel5)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBXCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdCategoriajLabel5))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsulLibroJBUTTON)
                    .addComponent(EliminarLibroJBUTTON)
                    .addComponent(UpdtLibroJBUTTON)
                    .addComponent(AddLibroJBUTTON)
                    .addComponent(ClearJBUTTON1)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {IDBibliotecajLabel4, IDBibliotecajLabel5, IdCategoriajLabel5, PreciojLabel3, TitulojLabel2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TextoPrecio, TextoTitulo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdtLibroJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdtLibroJBUTTONActionPerformed
        // TODO add your handling code here:
          try {
            Biblioteca B= (Biblioteca) CBXBiblioteca.getSelectedItem();
            Autor A=(Autor)CBXAutor.getSelectedItem();
            Categoria C=(Categoria) CBXCategoria.getSelectedItem();
            Libros L = new Libros();
            
            L.setTitulo(TextoTitulo.getText());
            L.setPrecio(Double.parseDouble(TextoPrecio.getText()));
            L.setIdBiblioteca(B.getIdBiblioteca());
            L.setIdAutor(A.getIdAutor());
            L.setIdCategoria(C.getIdCategoria());
            L.setLibrosID(Integer.parseInt(LabelID.getText()));
            L.Actualizar_Libro();
            this.mostrar(Tabla,"Select * From libro ");
        } catch (Exception ex) {
            Logger.getLogger(FromLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_UpdtLibroJBUTTONActionPerformed

    private void TextoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoTituloActionPerformed

    private void TextoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPrecioActionPerformed

    private void CBXBibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBXBibliotecaMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            FromBiblioteca B = new FromBiblioteca();
            B.setVisible(true);
            
        }
    }//GEN-LAST:event_CBXBibliotecaMouseClicked

    private void CBXBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXBibliotecaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CBXBibliotecaActionPerformed

    private void CBXAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBXAutorMouseClicked
        // TODO add your handling code here:
            if(evt.getClickCount()==2){
            FormAutor A = new FormAutor();
            A.setVisible(true);
            }
    }//GEN-LAST:event_CBXAutorMouseClicked

    private void CBXAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXAutorActionPerformed

    private void AddLibroJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLibroJBUTTONActionPerformed
        try {
            Biblioteca B= (Biblioteca) CBXBiblioteca.getSelectedItem();
            Autor A=(Autor)CBXAutor.getSelectedItem();
            Categoria C=(Categoria) CBXCategoria.getSelectedItem();
            Libros L = new Libros();
            L.setTitulo(TextoTitulo.getText());
            L.setPrecio(Double.parseDouble(TextoPrecio.getText()));
            L.setIdBiblioteca(B.getIdBiblioteca());
            L.setIdAutor(A.getIdAutor());
            L.setIdCategoria(C.getIdCategoria());
            L.Insertar_Libro();
            this.mostrar(Tabla,"Select * From libro ");
        } catch (Exception ex) {
            Logger.getLogger(FromLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_AddLibroJBUTTONActionPerformed

    private void CBXCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBXCategoriaMouseClicked
           if(evt.getClickCount()==2){
            FormCategoria B = new FormCategoria();
            B.setVisible(true);
            }        // TODO add your handling code here:
    }//GEN-LAST:event_CBXCategoriaMouseClicked

    private void CBXCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXCategoriaActionPerformed

    private void EliminarLibroJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarLibroJBUTTONActionPerformed
        try {
            // TODO add your handling code here:
            Libros L = new Libros();
            L.setLibrosID(Integer.parseInt(LabelID.getText()));
            L.Eliminar_Libro();
            this.mostrar(Tabla,"Select * From libro ");
        } catch (Exception ex) {
            Logger.getLogger(FromLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_EliminarLibroJBUTTONActionPerformed

    private void ConsulLibroJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulLibroJBUTTONActionPerformed
        // TODO add your handling code here:
        this.mostrar(Tabla,"SELECT Libro.LibroID,Libro.Titulo,Libro.Precio ,CONCAT(Autor.NombreAutor, ' ', Autor.ApellidoAutor) AS Autor,"
                + " Categoria.Categoriacol as Categoria, biblioteca.nombre as Biblioteca FROM Libro"
                + " INNER JOIN Autor ON Libro.idAutor = Autor.idAutor INNER JOIN Categoria ON Libro.idCategoria = Categoria.idCategoria"
                + " INNER JOIN Biblioteca ON Libro.idBiblioteca = Biblioteca.idBiblioteca");
    }//GEN-LAST:event_ConsulLibroJBUTTONActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        mouseclick();
    }//GEN-LAST:event_TablaMouseClicked

    private void ClearJBUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearJBUTTON1ActionPerformed
        // TODO add your handling code here:
        TextoPrecio.setText("");
        TextoTitulo.setText("");
        LabelID.setText("");
    }//GEN-LAST:event_ClearJBUTTON1ActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
  FormPrueba P = new FormPrueba();
        P.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_MenuActionPerformed
 private void mouseclick(){
     int fila= Tabla.getSelectedRow();
     LabelID.setText(Tabla.getModel().getValueAt(fila, 0).toString());
     TextoTitulo.setText(Tabla.getModel().getValueAt(fila, 1).toString());
     TextoPrecio.setText(Tabla.getModel().getValueAt(fila, 2).toString());
 }
    private void mostrar(javax.swing.JTable JT, String sql) {
        try {
            Clientes cb = new Clientes();
            ResultSet rs;
            DefaultTableModel modelo = new DefaultTableModel();
            JT.setModel(modelo);
            rs = cb.consultaTabla(sql);
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();
            int cantcolumnas = rsMd.getColumnCount();
            for (int i = 1; i <= cantcolumnas; i++) {
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            while (rs.next()) {
                Object[] columna = new Object[cantcolumnas];
                for (int i = 0; i < cantcolumnas; i++) {
                    columna[i] = rs.getObject(i + 1);
                }
                modelo.addRow(columna);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
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
            java.util.logging.Logger.getLogger(FromLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLibroJBUTTON;
    private javax.swing.JComboBox<String> CBXAutor;
    private javax.swing.JComboBox<String> CBXBiblioteca;
    private javax.swing.JComboBox<String> CBXCategoria;
    private javax.swing.JButton ClearJBUTTON1;
    private javax.swing.JButton ConsulLibroJBUTTON;
    private javax.swing.JButton EliminarLibroJBUTTON;
    private javax.swing.JLabel IDBibliotecajLabel4;
    private javax.swing.JLabel IDBibliotecajLabel5;
    private javax.swing.JLabel IdCategoriajLabel5;
    private javax.swing.JLabel LabelID;
    private javax.swing.JButton Menu;
    private javax.swing.JLabel PreciojLabel3;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TextoPrecio;
    private javax.swing.JTextField TextoTitulo;
    private javax.swing.JLabel TitulojLabel2;
    private javax.swing.JButton UpdtLibroJBUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
