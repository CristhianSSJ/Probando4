
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

    private int idAutor;
    private String NombreA, ApellidoA;
    AccesoBD BD;

    public Autor() throws Exception {
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");
        BD.ConectaBD();
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }


    public String getNombreA() {
        return NombreA;
    }

    public void setNombreA(String NombreA) {
        this.NombreA = NombreA;
    }

    public String getApellidoA() {
        return ApellidoA;
    }

    public void setApellidoA(String ApellidoA) {
        this.ApellidoA = ApellidoA;
    }

    public AccesoBD getBD() {
        return BD;
    }

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
         public void Insertar_Autor() throws SQLException {
        try{
            
       String cadena = "INSERT INTO Autor VALUES('" + Incremento_Autor() + "','" + getNombreA()
                + "','" + getApellidoA() + "')";

        BD.ActualizarBD(cadena);
   
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ingreso no realizado");
        }
    }
        public void Actualiza_Autor() throws SQLException {
      String cadena = "UPDATE Autor SET NombreAutor='" + getNombreA() + "', ApellidoAutor='" + getApellidoA() + "' WHERE idAutor='" + getIdAutor() + "'";

        BD.ActualizarBD(cadena);
    }
        public void Eliminar_Autor() throws SQLException {
       String cadena = "DELETE FROM Autor WHERE idAutor='" + getIdAutor() + "'";

        BD.ActualizarBD(cadena);
    }
      public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql);
    }
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

    @Override
    public String toString() {
        return NombreA + " " + ApellidoA;
    }
         
}
