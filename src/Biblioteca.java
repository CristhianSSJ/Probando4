
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Biblioteca {

    int idBiblioteca, idSupervisor;
    String direccion, Nombre;
    AccesoBD BD;

    public Biblioteca() throws Exception {
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");
        BD.ConectaBD();
    }

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public int getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD;
    }

    public int Incremento_Bibliotca() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(idBiblioteca) as num FROM biblioteca;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_Biblioteca() throws SQLException {
        String cadena = "INSERT INTO Biblioteca VALUES(" + Incremento_Bibliotca() + ",'" + getDireccion() + "','" + getIdSupervisor() + "','" + getNombre() + "')";

//        String cadena = "insert into Biblioteca values(" + Incremento_Bibliotca() + ",'" + 
//        "','" + getDireccion() + "','" + getIdSupervisor()+"','"+getNombre()+"')";
        BD.ActualizarBD(cadena);

    }

    /////////////////////////////////////////////////////////////////
    public int obtenerIDPorNombreydireccion() throws SQLException {
        String consulta = "SELECT idBiblioteca FROM Biblioteca WHERE Direccion = '" + getDireccion() + "' AND Nombre = '" + getNombre() + "'";
        ResultSet rs = BD.ConsultaBD(consulta);
        if (rs.next()) {
            return rs.getInt("idBiblioteca");
        } else {
            return -1; // Valor de retorno para indicar que no se encontró el libro
        }
    }

    /////////////////////////////////////////////////////////////////
    public void Actualizar_Biblioteca() throws SQLException {
        String cadena = "UPDATE biblioteca SET Direccion='" + getDireccion() + "', idSupervisor='"
                + getIdSupervisor() + "', nombre='" + getNombre() + "' WHERE idBiblioteca='" + getIdBiblioteca() + "'";

        BD.ActualizarBD(cadena);
    }

    public void Eliminar_Biblioteca() throws SQLException {
        String cadena = "delete from biblioteca where idBiblioteca='" + getIdBiblioteca() + "'";
        BD.ActualizarBD(cadena);
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql);
    }

    public void Consultar_Biblioteca() throws SQLException {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Biblioteca");
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

    public ArrayList<Biblioteca> bibliotecaVista() throws SQLException, Exception {
        ArrayList<Biblioteca> Lista = new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD("Select * from Biblioteca");
        while (rs.next()) {
            Biblioteca SAUX = new Biblioteca();
            SAUX.setIdBiblioteca(rs.getInt("idBiblioteca"));
            SAUX.setDireccion(rs.getString("Direccion"));
            SAUX.setIdSupervisor(rs.getInt("idSupervisor"));
            SAUX.setNombre(rs.getString("nombre"));
            Lista.add(SAUX);
        }
        return Lista;
    }
 public ArrayList<Biblioteca> VistaEspecial(int idb) throws SQLException, Exception {
        ArrayList<Biblioteca> Lista = new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT * FROM supervisor INNER JOIN biblioteca ON supervisor.idSupervisor = biblioteca.idSupervisor WHERE biblioteca.idBiblioteca = "+ idb);
        while (rs.next()) {
            Biblioteca SAUX = new Biblioteca();
            SAUX.setIdBiblioteca(rs.getInt("idBiblioteca"));
            SAUX.setDireccion(rs.getString("Direccion"));
            SAUX.setIdSupervisor(rs.getInt("idSupervisor"));
            SAUX.setNombre(rs.getString("nombre"));
            Lista.add(SAUX);
        }
        return Lista;
    }
    @Override
    public String toString() {
        return Nombre ;
    }
    
}
