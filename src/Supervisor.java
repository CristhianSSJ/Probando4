
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Supervisor {

    private String Nombre, Apellido, Cedula;
    int idSupersvisor;
    AccesoBD BD;

    public Supervisor() throws Exception {
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");
        BD.ConectaBD();
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getIdSupersvisor() {
        return idSupersvisor;
    }

    public void setIdSupersvisor(int idSupersvisor) {
        this.idSupersvisor = idSupersvisor;
    }

    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD;
    }



    public int Incremento_Supersvisor() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(idSupervisor) as num FROM Supervisor;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_Supersvisor() throws SQLException {
        String cadena = "insert into supervisor values('" + Incremento_Supersvisor() + "','" + getCedula()
                + "','" + getNombre() + "','" + getApellido() + "')";
        BD.ActualizarBD(cadena);

    }

    public void Actualizar_Supersvisor() throws SQLException {
String cadena = "update supervisor set Nombre='" + getNombre()+ "', Cedula='"+getCedula()+"', Apellido='"
                + getApellido()+"' where IdSupervisor='" + getIdSupersvisor()+ "'";
        BD.ActualizarBD(cadena);
    }
 

    public void Eliminar_Supersvisor() throws SQLException {
    String cadena = "delete from supervisor where IdSupervisor='" + getIdSupersvisor()+ "'";
        BD.ActualizarBD(cadena);
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql);
    }

    public void Consultar_OSupersvisor() throws SQLException {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Supersvisor");
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

    public ArrayList<Supervisor> SupervisorVista() throws SQLException, Exception {
        ArrayList<Supervisor> Lista= new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD("Select * from Supervisor");
        while (rs.next()) {
            Supervisor SAUX = new Supervisor();
            SAUX.setIdSupersvisor(rs.getInt("idSupervisor"));
            SAUX.setNombre(rs.getString("Nombre"));
            SAUX.setApellido(rs.getString("Apellido"));
            SAUX.setCedula(rs.getString("Cedula"));   
            Lista.add(SAUX);
        }
        return Lista;
    }
    
        public int obtenerIDPorCedula(String titulo) throws SQLException {
        String consulta = "SELECT IdSupervisor FROM Supervisor WHERE Cedula = '" + getCedula() + "'";
        ResultSet rs = BD.ConsultaBD(consulta);
        if (rs.next()) {
            return rs.getInt("IdSupervisor");
        } else {
            return -1; // Valor de retorno para indicar que no se encontró el libro
        }
    }
//   public ArrayList<Supervisor> VistaEspecial() throws SQLException, Exception {
//        ArrayList<Supervisor> Lista= new ArrayList<>();
//        ResultSet rs;
//        rs = BD.ConsultaBD("SELECT * FROM supervisor INNER JOIN biblioteca ON supervisor.idSupervisor = biblioteca.idSupervisor WHERE biblioteca.idBiblioteca = ");
//        while (rs.next()) {
//            Supervisor SAUX = new Supervisor();
//            SAUX.setIdSupersvisor(rs.getInt("idSupervisor"));
//            SAUX.setNombre(rs.getString("Nombre"));
//            SAUX.setApellido(rs.getString("Apellido"));
//            SAUX.setCedula(rs.getString("Cedula"));   
//            Lista.add(SAUX);
//        }
//        return Lista;
//    }
    @Override
    public String toString() {
        return Nombre +" "+Apellido ;
    }

    void setPrecio(double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
