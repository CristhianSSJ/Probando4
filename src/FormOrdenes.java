 
import java.awt.event.ItemEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//ORALYS
public class FormOrdenes extends javax.swing.JFrame {

 
    public FormOrdenes() throws Exception {
        initComponents();
        LLBC(CBXCliente);
        setLocationRelativeTo(null);
        Fecha.setText(LocalDate.now().toString());
        LLLL(CBXBi);
         LlenarLibros(CBXLibro);
    }

    public void LlenarLibros(JComboBox Lb) throws Exception {
        DefaultComboBoxModel AAA = new DefaultComboBoxModel(); //TA
        Lb.setModel(AAA); 
        Libros L = new Libros();                              //TA
        ArrayList<Libros> ListaL = L.LibrosVista();           //TA
        CBXLibro.removeAllItems();                            //TA 
        System.out.println(ListaL.size());                    
        for (int i = 0; i < ListaL.size(); i++) {             // N * TA + N*TC + N*TO
            AAA.addElement(ListaL.get(i));                    
            System.out.println(ListaL.get(i));
            System.out.println(ListaL.get(i).getIdAutor());
            System.out.println(ListaL.get(i).getTitulo());

        }
        CBXLibro.setModel(AAA);                               //TA 
        
    }   // 5TA + N * TA + N*TC + N*TO      TIEMPO PEOR ESPERADO 
        // 6TA          +   TC +   TO      TIEMPO MEJOR ESPERADO 
        //____________________________
        // -TA + N * TA + N*TC + N*TO - TC -TO         TIEMPO ESPERADO
    
    public void LLBC(JComboBox JJ) throws Exception {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();   //TA
        JJ.setModel(modelo);          //TA
        Clientes C = new Clientes();  //TA 
        ArrayList<Clientes> ListaC = C.Consulta();  //TA
        CBXCliente.removeAllItems();                //TA
        for (int i = 0; i < ListaC.size(); i++) {   //N*TA + N*TC + N*TO
            modelo.addElement(ListaC.get(i));       //TA
        }
        JJ.setModel(modelo);//ta
        /*
        6TA + N*TA + N*TC +  N*TO    -------- Tiempo Peor Esperado
       - 2TA +          TC +    TO            Tiempo Mejor Esperado
      ________________________________
         4TA -TC - TO + N*TA + N*TC +  N*TO     Tiempo Esperado
        
        */
    }

    public void LLLL(JComboBox LL) throws Exception {

        DefaultComboBoxModel modelo = new DefaultComboBoxModel(); //TA
        LL.setModel(modelo);                                      //TA
        Biblioteca S = new Biblioteca();                          //TA
        ArrayList<Biblioteca> ListaS = S.bibliotecaVista();       //TA
        CBXBi.removeAllItems();                                   //TA
        for (int i = 0; i < ListaS.size(); i++) {            //N*TA + N*TC + N*TO
            modelo.addElement(ListaS.get(i));                //TA
        }
        LL.setModel(modelo);                                 //TA
    }  // 7TA + N*TA + N*TC + N*TO     ----TIEMPO PEOR ESPERADO
       // 8TA +   TC +          TO     ----TIEMPOR MEJOR ESPERADO
       //__________________________
       // -TA +   TC +          TO     ----> TIEMPO ESPERADO.


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CBXCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CBXLibro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TextoPrecio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextoCategoria = new javax.swing.JLabel();
        TextoAutor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CBXBi = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CBXSupervisor = new javax.swing.JComboBox<>();
        Atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextoIDo = new javax.swing.JLabel();
        ConsulLibroJBUTTON = new javax.swing.JButton();
        EliminarLibroJBUTTON = new javax.swing.JButton();
        UpdtLibroJBUTTON = new javax.swing.JButton();
        AddLibroJBUTTON = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cliente:");

        CBXCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hola123", "Item 2", "Item 3", "Item 4" }));
        CBXCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBXClienteMouseClicked(evt);
            }
        });
        CBXCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Libro a comprar:");

        CBXLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBXLibro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBXLibroItemStateChanged(evt);
            }
        });
        CBXLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBXLibroMouseClicked(evt);
            }
        });
        CBXLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXLibroActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio:");

        jLabel4.setText("Categoria:");

        jLabel5.setText("Autor:");

        TextoAutor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel6.setText("Lugar de la compra:");

        CBXBi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBXBi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBXBiItemStateChanged(evt);
            }
        });
        CBXBi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBXBiMouseClicked(evt);
            }
        });
        CBXBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBXBiActionPerformed(evt);
            }
        });

        jLabel7.setText("Supervisor:");

        CBXSupervisor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBXSupervisor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBXSupervisorMouseClicked(evt);
            }
        });

        Atras.setText("Menu");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrdenesId", "ClienteID", "Cliente", "Libro", "Fecha "
            }
        ));
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jLabel8.setText("Fecha:");

        jLabel9.setText("idOrden:");

        ConsulLibroJBUTTON.setText("CONSULT");
        ConsulLibroJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsulLibroJBUTTONActionPerformed(evt);
            }
        });

        EliminarLibroJBUTTON.setText("DELETE");
        EliminarLibroJBUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarLibroJBUTTONActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ConsulLibroJBUTTON)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarLibroJBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UpdtLibroJBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddLibroJBUTTON)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Atras))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBXCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBXLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBXBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBXSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoIDo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoIDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(CBXCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(CBXLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(TextoPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CBXBi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(CBXSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsulLibroJBUTTON)
                    .addComponent(EliminarLibroJBUTTON)
                    .addComponent(UpdtLibroJBUTTON)
                    .addComponent(AddLibroJBUTTON)
                    .addComponent(Atras))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBXClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXClienteActionPerformed
//        try {
//            // TODO add your handling code here:
//            Clientes c = (Clientes) CBXCliente.getSelectedItem();
//            TextoAutor.setText(c.getNombre());
//        } catch (Exception ex) {
//            Logger.getLogger(FormOrdenes.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_CBXClienteActionPerformed

    private void CBXLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXLibroActionPerformed
        // TODO add your handling code here

    }//GEN-LAST:event_CBXLibroActionPerformed

    private void CBXBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBXBiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBXBiActionPerformed

    private void CBXBiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBXBiItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {          // TC
            try {
    //SELECT * FROM supervisor INNER JOIN biblioteca ON supervisor.idSupervisor = biblioteca.idSupervisor WHERE biblioteca.idBiblioteca = + 1;
                Biblioteca b = (Biblioteca) CBXBi.getSelectedItem();   //TA
                int idb = b.getIdBiblioteca();                          //TA
                LLenarSuper(CBXSupervisor, idb);                       // -TA + N*TA +N*TC + N*TO - TC - TO 
            } catch (Exception ex) {
                Logger.getLogger(FormOrdenes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CBXBiItemStateChanged
    //2TA + TC -TA + N*TA +N*TC + N*TO - TC - TO   =   TIEMPO PEOR ESPERADO 
    //    - TC                                     =   TIEMPO MEJOR ESPERADO
    //____________________________________________
    //-TA - TC + N*TA +N*TC + N*TO - TO            =   TIEMPO ESPERADO.
    private void CBXLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBXLibroMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {  //TC
            FromLibro l = new FromLibro();  //TA
            l.setVisible(true);            //TA
        }
    }//GEN-LAST:event_CBXLibroMouseClicked
           //TC + TA + TA  =    2TA +TC ---- TIEMPO PEOR ESPERADO
           //-TC                         ---- TIEMPO MEJOR ESPERADO
           //____________ 
           //     2TA
    private void CBXClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBXClienteMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) { //TC

            FormCliente B = new FormCliente(); //TA
            B.setVisible(true);                //TA

        }
    }//GEN-LAST:event_CBXClienteMouseClicked
                              
           //TC + TA + TA  =    2TA +TC ---- TIEMPO PEOR ESPERADO
           //-TC                         ---- TIEMPO MEJOR ESPERADO
           //____________ 
           //     2TA
    
    private void CBXBiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBXBiMouseClicked
        if (evt.getClickCount() == 2) {      //TC
            FromBiblioteca B = new FromBiblioteca(); //TA
            B.setVisible(true);                      //TA 
       }        // TODO add your handling code here:
    }//GEN-LAST:event_CBXBiMouseClicked
                                         
           //TC + TA + TA  =    2TA +TC ---- TIEMPO PEOR ESPERADO
           //-TC                         ---- TIEMPO MEJOR ESPERADO
           //____________ 
           //     2TA
    private void CBXSupervisorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBXSupervisorMouseClicked
        if (evt.getClickCount() == 2) { //TC

            FormSupervisor B = new FormSupervisor();  //TA
            B.setVisible(true);                       //TA
                                         
           //TC + TA + TA  =    2TA +TC ---- TIEMPO PEOR ESPERADO
           //-TC                         ---- TIEMPO MEJOR ESPERADO
           //____________ 
           //     2TA
        }        // TODO add your handling code here:
    }//GEN-LAST:event_CBXSupervisorMouseClicked

    private void CBXLibroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBXLibroItemStateChanged
        try {
            // TODO add your handlin
            Libros l = (Libros) CBXLibro.getSelectedItem();   //TA
            double A= l.getPrecio();                          //TA
                    TextoPrecio.setText(String.valueOf(A));   //TA
                    ArrayList<Categoria> AAA=l.VistaEspecial(l.getIdAutor());   //TA
                    ArrayList<Autor>LLL=l.VSTE(l.getLibrosID());                //TA
                    String AA=AAA.get(0).getCategoria();                        //TA
                    TextoAutor.setText(LLL.get(0).toString());                  //TA
                    TextoCategoria.setText(AA);                                 //TA
        } catch (Exception ex) {
            Logger.getLogger(FormOrdenes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CBXLibroItemStateChanged
        //8TA
    private void ConsulLibroJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsulLibroJBUTTONActionPerformed
        this.mostrar(Tabla, "SELECT ordenes.OrdenesID, clientes.ClienteID,clientes.Nombre AS Cliente, libro.LibroID  , libro.Titulo AS Libro, ordenes.Fecha_de_Orden AS Fecha FROM ordenes "
                + "INNER JOIN clientes ON ordenes.ClientesID = clientes.ClienteID"
                + " INNER JOIN libro ON ordenes.LibroID = libro.LibroID;");
    }//GEN-LAST:event_ConsulLibroJBUTTONActionPerformed
     // 9TA - TO - TC + N*4TA + N*2TC + N*TO 
    
    private void EliminarLibroJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarLibroJBUTTONActionPerformed
        try {
            Ordenes o = new Ordenes();                          //TA
            
            o.setOrdenID(Integer.parseInt(TextoIDo.getText()));  //TA
            o.Eliminar_Ordenes();                                //3TA
//            this.mostrar(Tabla,"Select * From libro ");
        } catch (Exception ex) {
            Logger.getLogger(FromLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
        // 2TA + 3TA = 5TA
    }//GEN-LAST:event_EliminarLibroJBUTTONActionPerformed

    private void UpdtLibroJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdtLibroJBUTTONActionPerformed
        // TODO add your handling code here:
        try {
            Ordenes o = new Ordenes();                             //TA
            Libros l = (Libros)CBXLibro.getSelectedItem();          //TA
            Clientes c = (Clientes)CBXCliente.getSelectedItem();    //TA
            o.setOrdenID(Integer.parseInt(TextoIDo.getText()));      //TA
            o.setClienteID(c.getClienteID());                        //TA
            o.setLibroID(l.getLibrosID());                            //TA
            o.setFechaDeOrden(LocalDate.now());                       //TA
            o.Actualizar_Ordenes();                                  //3TA
            
        } catch (Exception ex) {
            Logger.getLogger(FromLibro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_UpdtLibroJBUTTONActionPerformed
          //7TA + 3TA --------> 10 TA
    private void AddLibroJBUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLibroJBUTTONActionPerformed
        try {
            Clientes S = (Clientes) CBXCliente.getSelectedItem();        //TA
            Libros L= (Libros) CBXLibro.getSelectedItem();               //TA
            
            Ordenes O = new Ordenes();                                   //TA
            O.setClienteID(S.getClienteID());                            //TA
            O.setLibroID(L.getLibrosID());                               //TA
            O.Insertar_Ordenes( );                             //4TA + TC +  TO
//            this.mostrar(Tabla,"Select * From libro ");        
                                                               //5TA 
                                                               //4TA + TC +  TO = 9TA + TC +  TO
        } catch (Exception ex) {
            Logger.getLogger(FromLibro.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_AddLibroJBUTTONActionPerformed
   //9TA + TC +  TO
    private void mostrar   (javax.swing.JTable JT, String sql) {
        try {
            Clientes cb = new Clientes();                          //TA
            ResultSet rs;
                DefaultTableModel modelo = new DefaultTableModel();  //TA
            JT.setModel(modelo);                                    //TA
            rs = cb.consultaTabla(sql);                              //2TA
            ResultSetMetaData rsMd;
            rsMd = rs.getMetaData();                                 //TA
            int cantcolumnas = rsMd.getColumnCount();                //TA
            for (int i = 1; i <= cantcolumnas; i++) {       //TA + N*TA + N*TC + N*TO
                modelo.addColumn(rsMd.getColumnLabel(i));           //N*TA
            }
            while (rs.next()) {                                   //N*TC + TC
                Object[] columna = new Object[cantcolumnas];     //N*TA
                for (int i = 0; i < cantcolumnas; i++) {       //N*2TA + N*TC + N*TO
                    columna[i] = rs.getObject(i + 1);          //TA +TO
                }
                modelo.addRow(columna);                          //TA
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }
    }
   // 10TA + TO + TC + N*5TA + N*3TC + N*2TO    -----TIEMPO PEOR ESPERADO 
   //   TA  +          N *TA + N* TC  + N* TO   ----- TIEMPO MEJOR ESPERADO
   //_________________________________________
   //  9TA - TO - TC + N*4TA + N*2TC + N*TO    ---->TIEMPO ESPERADO
   
    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
                    MouseClick();
            
    }//GEN-LAST:event_TablaMouseClicked

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed

  FormPrueba P = new FormPrueba();
        P.setVisible(true);     //TA
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_AtrasActionPerformed
     //----> TA
    private void MouseClick() {
        int fila=Tabla.getSelectedRow();                                    //TA
        TextoIDo.setText(Tabla.getModel().getValueAt(fila , 0).toString()); //TA 
    }
     //2TA
    
    public void LLenarSuper(JComboBox JC, int IDB) throws Exception {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel(); //TA   
        JC.setModel(modelo);  //TA
        Biblioteca L = new Biblioteca(); //TA
        ArrayList<Biblioteca> ListaL = L.VistaEspecial(IDB); //TA
        CBXSupervisor.removeAllItems(); //TA
        for (int i = 0; i < ListaL.size(); i++) { //N*TA + N*TC + N*TO
            modelo.addElement(ListaL.get(i));     //TA
        }
        JC.setModel(modelo);                     //TA 
    } 
      // 7TA + N*TA + N*TC + N*TO               TIEMPO PEOR ESPERADO
      // -8TA +       TC +     TO               TIEMPO MEJOR ESPERADO
      //___________________________________
      //  -TA + N*TA +N*TC + N*TO - TC - TO             TIEMPO ESPERADO.
                 
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
            java.util.logging.Logger.getLogger(FormOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormOrdenes().setVisible(true);     //TA
                } catch (Exception ex) {
                    Logger.getLogger(FormOrdenes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLibroJBUTTON;
    private javax.swing.JButton Atras;
    private javax.swing.JComboBox<String> CBXBi;
    private javax.swing.JComboBox<String> CBXCliente;
    private javax.swing.JComboBox<String> CBXLibro;
    private javax.swing.JComboBox<String> CBXSupervisor;
    private javax.swing.JButton ConsulLibroJBUTTON;
    private javax.swing.JButton EliminarLibroJBUTTON;
    private javax.swing.JLabel Fecha;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel TextoAutor;
    private javax.swing.JLabel TextoCategoria;
    private javax.swing.JLabel TextoIDo;
    private javax.swing.JLabel TextoPrecio;
    private javax.swing.JButton UpdtLibroJBUTTON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
