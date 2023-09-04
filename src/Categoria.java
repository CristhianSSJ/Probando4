
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
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");//Ta+4Ta
        BD.ConectaBD();//3Ta
        //8Ta
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;//Ta
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;//Ta
    }

    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD;//Ta
    } 
    public int Incremento_Categoria() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(idCategoria) as num FROM Categoria;");//Ta+2Ta
        if (rs.next()) {//Tc
            inc = rs.getInt(1) + 1;//Ta+To
        } else {
            inc = 1;//Ta
        }
        return inc;
        /*tiempo peor esperado
        Ta+2Ta+Tc+Ta+To
        4Ta+Tc+To
        Tiempo Mejor Esperado
         Ta+2Ta+Tc+Ta=4Ta+Tc
        Tiempo Esperado
        To
        */
    }
        public void Insertar_Categoria() throws SQLException {
        try{
        String cadena = "insert into Categoria values('" + Incremento_Categoria()+ "','" + getCategoria()+ "')";//ta+to
        BD.ActualizarBD(cadena);//2Ta
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ingreso no realizado");
        }
        //3Ta+to
    }
        public void Actualiza_Categoria() throws SQLException {
      String cadena = "UPDATE Categoria SET Categoriacol='" + getCategoria()+ "' WHERE idCategoria='" + getIdCategoria()+ "'";//Ta
        BD.ActualizarBD(cadena);//2Ta
        //3Ta
    }
        public void Eliminar_Categoria() throws SQLException {
        String cadena = "delete from Categoria where idCategoria='" + getIdCategoria()+ "'";//Ta
        BD.ActualizarBD(cadena);//2Ta
        //3Ta
    }

    public ArrayList<Categoria> CategoriaVista() throws SQLException, Exception {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Categoria");//Ta+2Ta
        ArrayList<Categoria> Lista = new ArrayList<>();//Ta
        Categoria C = new Categoria();//Ta
        while (rs.next()) {//n*tc
            C.setIdCategoria(rs.getInt("idCategoria"));//n*Ta
            C.setCategoria(rs.getString("Categoriacol"));//n*Ta
            Lista.add(C);//Ta
        }
        return Lista;
        //Tiempo Peor Esperado 
        //Ta+2Ta+Ta+Ta+n*tc+n*2Ta
        //5Ta+n*tc+n*2ta
        //5Ta+n(Tc+2Ta)
        //Tiempo Mejor Esperado
        //Ta+2Ta+Ta+Ta=5Ta
        //Tiempo Esperado
        //n(Tc+2Ta)
    }

    @Override
    public String toString() {
        return  Categoria ;
    }
    
}
