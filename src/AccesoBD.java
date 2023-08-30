//Integrantes: Andrade Acosta , Delgado Bravo , Yepez Rodriguez

import java.sql.*;
import javax.swing.JOptionPane;

public class AccesoBD {

    private final String Host, User, Password, BD;
    private Connection conexion;

    public AccesoBD(String Host, String User, String Password, String BD) {
        this.Host = Host;
        this.User = User;
        this.Password = Password;
        this.BD = BD;

    }

    public String getHost() {
        return Host;
    }

    public String getUser() {
        return User;
    }

    public String getPassword() {
        return Password;
    }

    public String getBD() {
        return BD;
    }

    public void ConectaBD() throws Exception {
        try {
            Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String cadena = "jdbc:mysql://" + getHost() + "/" + getBD();
            conexion = DriverManager.getConnection(cadena, getUser(), getPassword());
        } catch (SQLException e) {
            System.out.println("Error a la conexion a la Base de Datos" + e.toString());
        }
    }

    public void ActualizarBD(String sql)throws SQLException{
        try {
            Statement stm=conexion.createStatement();
            stm.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null, "Transaccion exitosa");
            } catch(SQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(null, "Transaccion fallida"+e.toString());
        
        } catch (SQLException e) {
            System.out.println("Error en la Transaccion "+ e.toString());
       
        
    }
    }

    public ResultSet ConsultaBD(String sql) throws SQLException {
        ResultSet Cursor;
        Statement stm = conexion.createStatement();
        Cursor = stm.executeQuery(sql);
        return Cursor;
    }

    public void CerrarBD() throws SQLException {
        conexion.close();
    }
}
