//Integrantes: Andrade Acosta , Delgado Bravo , Yepez Rodriguez

import java.sql.*;
import javax.swing.JOptionPane;

public class AccesoBD {

    private final String Host, User, Password, BD;
    private Connection conexion;

    public AccesoBD(String Host, String User, String Password, String BD) {
        this.Host = Host;//Ta
        this.User = User;//Ta
        this.Password = Password;//Ta
        this.BD = BD;//Ta
        //4Ta
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
            Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();//Ta
            String cadena = "jdbc:mysql://" + getHost() + "/" + getBD();//Ta
            conexion = DriverManager.getConnection(cadena, getUser(), getPassword());//Ta
        } catch (SQLException e) {
            System.out.println("Error a la conexion a la Base de Datos" + e.toString());
        }

        //3ta
        //3Ta
    }

    public void ActualizarBD(String sql) throws SQLException {
        try {
            Statement stm = conexion.createStatement();//Ta
            stm.executeUpdate(sql);//Ta
            JOptionPane.showMessageDialog(null, "Transaccion exitosa");
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Transaccion fallida" + e.toString());

        } catch (SQLException e) {
            System.out.println("Error en la Transaccion " + e.toString());
            //2Ta

            //2ta
        }
    }

    public ResultSet ConsultaBD(String sql) throws SQLException {
        ResultSet Cursor;
        Statement stm = conexion.createStatement();//Ta
        Cursor = stm.executeQuery(sql);//Ta
        return Cursor;
        //2ta
        //2Ta
    }

    public void CerrarBD() throws SQLException {
        conexion.close();
    }
}
