
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Clientes {
// Atributos privados de la clase
    private int ClienteID;
    private String Cedula, Nombre, Apellido, Direccion, Ciudad, Telefono;
    AccesoBD BD;// Objeto para acceder a la base de datos

    // Constructor de la clase Clientes
    public Clientes() throws Exception {
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");
        BD.ConectaBD();// Establecer la conexión a la base de datos
    }
// Métodos para obtener y establecer la cédula del cliente
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }
// Métodos para obtener y establecer la ciudad del cliente
    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
// Métodos para obtener y establecer el ID del cliente
    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
    }
// Métodos para obtener y establecer el nombre del cliente
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
// Métodos para obtener y establecer el apellido del cliente
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
// Métodos para obtener y establecer la dirección del cliente
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCuidad() {
        return Ciudad;
    }

    public void setCuidad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
 // Métodos para obtener y establecer el teléfono del cliente
    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
// Métodos para obtener y establecer el objeto de acceso a la base de datos
    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD;
    }
 
    public int getClienteID() {
        return ClienteID;
    }
// Método para obtener el siguiente ID de cliente incremental
    public int Incremento_CLiente() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(ClienteID) as num FROM clientes;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }
// Método para insertar un nuevo cliente en la base de datos
    public void Insertar_Cliente() throws SQLException {
        try{
            // Crear la cadena SQL para la inserción
        String cadena = "insert into clientes values('" + Incremento_CLiente() + "','" + getCedula()
                + "','" + getNombre() + "','" + getApellido() + "','" + getDireccion() + "','" + getCuidad() + "','" + getTelefono() + "')";
        BD.ActualizarBD(cadena);// Ejecutar la actualización en la base de datos
   
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ingreso no realizado");
        }
    }
// Método para actualizar o insertar los datos de un cliente en la base de datos
    public void Actualizar_Insertar_Cliente() throws SQLException {
      String cadena = "UPDATE clientes SET Cedula='" + getCedula() + "', Nombre='" + getNombre() + "', Apellido='" +
                getApellido() + "', Direccion='" + getDireccion() + "', Ciudad='" + getCiudad() + "', Telefono='" + getTelefono() +
                "' WHERE ClienteID='" + getClienteID()+ "'";

        BD.ActualizarBD(cadena);// Ejecutar la actualización en la base de datos
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Método para obtener el ID de un cliente a partir de su cédula
    public int obtenerIDPorCedula() throws SQLException {
        String consulta = "SELECT ClienteID FROM clientes WHERE Cedula = '" + getCedula() + "'";
        ResultSet rs = BD.ConsultaBD(consulta);
        if (rs.next()) {
            return rs.getInt("ClienteID");
        } else {
            return -1; // Valor de retorno para indicar que no se encontró el libro
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Método para eliminar un cliente de la base de datos
    public void Eliminar_Clientes() throws SQLException {
        String cadena = "delete from clientes where ClienteID='" + getClienteID()+ "'";
        BD.ActualizarBD(cadena);
    }
// Método para realizar una consulta personalizada en la base de datos
    public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql);
    }
// Método para imprimir en la consola la información de los clientes
    public void Consultar_Cliente() throws SQLException {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Cliente");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
        }
    }
    // Método para obtener una lista de clientes desde la base de datos
    public ArrayList<Clientes> Consulta() throws SQLException, Exception{
     ResultSet rs;
        rs = BD.ConsultaBD("select * from Clientes");
        ArrayList<Clientes> Lista= new ArrayList<>();
        
        while (rs.next()) {
            Clientes C = new Clientes();
           C.setClienteID(rs.getInt("ClienteID"));
           C.setCedula(rs.getString("Cedula"));
           C.setNombre(rs.getString("Nombre"));
           C.setApellido(rs.getString("Apellido"));
           C.setDireccion(rs.getString("Direccion"));
           C.setCiudad(rs.getString("Ciudad"));
           C.setTelefono(rs.getString("Telefono"));
           Lista.add(C);
    }
        return Lista;
}
// Representación en forma de cadena del cliente
    @Override
    public String toString() {
        return getNombre()+" "+getApellido();
    }
    
}