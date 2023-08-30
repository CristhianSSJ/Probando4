
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
public class Categoria {

    private int idCategoria;
    private String Categoria;
    AccesoBD BD;

    public Categoria() throws Exception {
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");
        BD.ConectaBD();
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD;
    } public int Incremento_Categoria() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(idCategoria) as num FROM Categoria;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }
         public void Insertar_Categoria() throws SQLException {
        try{
        String cadena = "insert into Categoria values('" + Incremento_Categoria()+ "','" + getCategoria()+ "')";
        BD.ActualizarBD(cadena);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ingreso no realizado");
        }
    }
        public void Actualiza_Categoria() throws SQLException {
      String cadena = "UPDATE Categoria SET Categoriacol='" + getCategoria()+ "' WHERE idCategoria='" + getIdCategoria()+ "'";
        BD.ActualizarBD(cadena);
    }
        public void Eliminar_Categoria() throws SQLException {
        String cadena = "delete from Categoria where idCategoria='" + getIdCategoria()+ "'";
        BD.ActualizarBD(cadena);
    }

    public ArrayList<Categoria> CategoriaVista() throws SQLException, Exception {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Categoria");
        ArrayList<Categoria> Lista = new ArrayList<>();
        Categoria C = new Categoria();
        while (rs.next()) {
            C.setIdCategoria(rs.getInt("idCategoria"));
            C.setCategoria(rs.getString("Categoriacol"));
            Lista.add(C);
        }
        return Lista;
    }

    @Override
    public String toString() {
        return  Categoria ;
    }
    
}
