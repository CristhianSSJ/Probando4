import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
public class Ordenes {
    private int OrdenesID;
    private int ClienteID;
    private int LibroID;
    private LocalDate FechaDeOrden = LocalDate.now(); 
    AccesoBD BD;
     
     public Ordenes() throws Exception {
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");
        BD.ConectaBD();
    }

    public int getOrdenesID() {
        return OrdenesID;
    }

    public void setOrdenID(int OrdenID) {
        this.OrdenesID = OrdenID;
    }

    public int getClienteID() {
        return ClienteID;
    }

    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
    }

    public int getLibroID() {
        return LibroID;
    }

    public void setLibroID(int LibroID) {
        this.LibroID = LibroID;
    }

    public LocalDate getFechaDeOrden() {
        return FechaDeOrden;
    }

    public void setFechaDeOrden(LocalDate FechaDeOrden) {
        this.FechaDeOrden = FechaDeOrden;
    }

    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD;
    }
      public int Incremento_Ordene() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(OrdenesID) as num FROM ordenes;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_Ordenes() throws SQLException {
        String cadena = "insert into ordenes values('" + Incremento_Ordene()+ "','" + getClienteID()+
        "','" + getLibroID()+ "','" + getFechaDeOrden()+"')";
        BD.ActualizarBD(cadena);

    }

    public void Actualizar_Ordenes() throws SQLException {
        String cadena = "UPDATE ordenes SET ClienteID='" + getClienteID() + "', LibroID=" + getLibroID() 
                + ", fecha='" + getFechaDeOrden() + "' WHERE OrdenesID='" + getOrdenesID() + "'";

        BD.ActualizarBD(cadena);
    }

    public void Eliminar_Ordenes() throws SQLException {
        String cadena = "delete from ordenes where OrdenesID='" + getOrdenesID()+ "'";
        BD.ActualizarBD(cadena);
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql);
    }

    public void Consultar_Ordenes() throws SQLException {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Ordenes");
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
}
