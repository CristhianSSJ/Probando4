
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nahin
 */
public class Autor {

 // Atributos privados de la clase   
    private int idAutor;
    private String NombreA, ApellidoA;
    AccesoBD BD;// Objeto para acceder a la base de datos

    // Constructor de la clase Autor
    public Autor() throws Exception {
        // Inicialización de la conexión a la base de datos en el constructor
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");
        BD.ConectaBD();// Establecer la conexión a la base de datos
    }

     // Métodos para obtener y establecer el ID del autor
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

 // Métodos para obtener y establecer el nombre del autor
    public String getNombreA() {
        return NombreA;
    }

    public void setNombreA(String NombreA) {
        this.NombreA = NombreA;
    }

    // Métodos para obtener y establecer el apellido del autor
    public String getApellidoA() {
        return ApellidoA;
    }

    public void setApellidoA(String ApellidoA) {
        this.ApellidoA = ApellidoA;
    }

    // Métodos para obtener y establecer el objeto de acceso a la base de datos
    
    public AccesoBD getBD() {
        return BD;
    }

     // Método para obtener el siguiente ID de autor incremental
    public void setBD(AccesoBD BD) {
        this.BD = BD;
    }
     public int Incremento_Autor() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(idAutor) as num FROM Autor;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }
     // Método para insertar un nuevo autor en la base de datos
         public void Insertar_Autor() throws SQLException {
        try{
            // Crear la cadena SQL para la inserción
       String cadena = "INSERT INTO Autor VALUES('" + Incremento_Autor() + "','" + getNombreA()
                + "','" + getApellidoA() + "')";

        BD.ActualizarBD(cadena);// Ejecutar la actualización en la base de datos
   
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ingreso no realizado");
        }
    }
         // Método para actualizar los datos de un autor en la base de datos
        public void Actualiza_Autor() throws SQLException {
      String cadena = "UPDATE Autor SET NombreAutor='" + getNombreA() + "', ApellidoAutor='" + getApellidoA() + "' WHERE idAutor='" + getIdAutor() + "'";

        BD.ActualizarBD(cadena);// Ejecutar la actualización en la base de datos
    }
        // Método para eliminar un autor de la base de datos
        public void Eliminar_Autor() throws SQLException {
       String cadena = "DELETE FROM Autor WHERE idAutor='" + getIdAutor() + "'";

        BD.ActualizarBD(cadena);// Ejecutar la actualización en la base de datos
    }
        // Método para realizar una consulta personalizada en la base de datos
      public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql);
    }
      // Método para obtener una lista de autores desde la base de datos
         public ArrayList<Autor> AutorVista() throws SQLException, Exception{
     ResultSet rs;
        rs = BD.ConsultaBD("select * from autor");
        ArrayList<Autor> Lista= new ArrayList<>();
        while (rs.next()) {
                    Autor a = new Autor();

           a.setIdAutor(rs.getInt("idAutor"));
           a.setNombreA(rs.getString("NombreAutor"));
           a.setApellidoA(rs.getString("ApellidoAutor"));
           Lista.add(a);
    }
        return Lista;
}
// Representación en forma de cadena del autor
    @Override
    public String toString() {
        return NombreA + " " + ApellidoA;
    }
         
}
