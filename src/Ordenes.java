import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

 //AUTORA: YEPEZ ORALYS 𓆰𓆪𓆰𓆪𓆰
public class Ordenes {
    private int OrdenesID;
    private int ClienteID;
    private int LibroID;
    private LocalDate FechaDeOrden = LocalDate.now(); 
    AccesoBD BD; //TA 
     
     public Ordenes() throws Exception {
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto"); //TA 
        BD.ConectaBD(); //3TA 
        //4TA ----
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
        this.ClienteID = ClienteID; //TA
    }

    public int getLibroID() {
        return LibroID;
    }

    public void setLibroID(int LibroID) {
        this.LibroID = LibroID; //TA
    }

    public LocalDate getFechaDeOrden() {
        return FechaDeOrden;
    }

    public void setFechaDeOrden(LocalDate FechaDeOrden) {
        this.FechaDeOrden = FechaDeOrden;  //TA
    }

    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD;                   //TA 
    }
    
      public int Incremento_Ordene() throws SQLException {
        int inc; 
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(OrdenesID) as num FROM ordenes;"); //TA
        if (rs.next()) { // TC
            inc = rs.getInt(1) + 1; //TA + TO
        } else {
            inc = 1; //TA
        }
        return inc;
    } // 2TA + TC + TO   ----- PEOR TIEMPO ESPERADO
      // - TA            ----- MEJOR TIEMPO ESPERADO.
      //______________
      // TA + TC +TO     ------ TIEMPO ESPERADO 

    public void Insertar_Ordenes() throws SQLException {
        String cadena = "insert into ordenes values('" + Incremento_Ordene()+ "','" + getClienteID()+ //TA +TA + TC +TO 
        "','" + getLibroID()+ "','" + getFechaDeOrden()+"')"; 
        BD.ActualizarBD(cadena); //2TA 
        //  TA + TA + TC +TO 
        // 2TA 
        //_________________
        //  4TA + TC +  TO -------> SUMA del Time
    }

    public void Actualizar_Ordenes() throws SQLException {
        String cadena = "UPDATE ordenes SET ClienteID='" + getClienteID() + "', LibroID=" + getLibroID() 
                + ", fecha='" + getFechaDeOrden() + "' WHERE OrdenesID='" + getOrdenesID() + "'"; //TA

        BD.ActualizarBD(cadena); //2TA 
    }  //  TA
       // 2TA
      // __________ 
      // 3TA

    public void Eliminar_Ordenes() throws SQLException {
        String cadena = "delete from ordenes where OrdenesID='" + getOrdenesID()+ "'"; //TA
        BD.ActualizarBD(cadena); //2TA
        //3TA  <-----> Suma del tiempo esperado
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql); //2TA
    }

    public void Consultar_Ordenes() throws SQLException {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Ordenes");  //TA + 2TA
        while (rs.next()) {                           // N*TC
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
        } // N*TC + 3TA  ------ TIEMPO PEOR ESPERADO
         //    TC + 3TA  ------ TIEMPO MEJOR ESPERADO
         //____________
         // N*TC - TC    ------ TIEMPO ESPERADO   
    }
}
