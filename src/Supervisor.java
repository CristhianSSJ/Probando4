
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Supervisor {

    private String Nombre, Apellido, Cedula;
    int idSupersvisor;
    AccesoBD BD;

    public Supervisor() throws Exception {
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto"); //TA= Tiempo de asignacion por se esta asignando 
        BD.ConectaBD(); //3_TA 
        //TA + 3_TA = 4TA
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) { 
        this.Cedula = Cedula; //TA
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) { 
        this.Nombre = Nombre;//TA
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) { 
        this.Apellido = Apellido;//TA
    }

    public int getIdSupersvisor() {
        return idSupersvisor;
    }

    public void setIdSupersvisor(int idSupersvisor) { 
        this.idSupersvisor = idSupersvisor; //TA
    }

    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD; //TA
    }



    public int Incremento_Supersvisor() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(idSupervisor) as num FROM Supervisor;"); //TA + 2TA 
        if (rs.next()) { // TIEMPO DE COMPARACIÓN    T.C
            inc = rs.getInt(1) + 1; //TA + T.O
        } else {                                                       
            inc = 1; //TA
        }
        return inc;
    } //3TA + TA + T.O = 4TA + T.O    tiempo peor esperado
      // 3TA + TA = 4TA               tiempo mejor esperado 
      // T.O                   -----> TIEMPO ESPERADO 
     
 
    public void Insertar_Supersvisor() throws SQLException {
        String cadena = "insert into supervisor values('" + Incremento_Supersvisor() + "','" + getCedula() //TA + T.O
                + "','" + getNombre() + "','" + getApellido() + "')";
        BD.ActualizarBD(cadena); //2TA
        //TA + TO + 2TA = 3TA + TO 
    }

    public void Actualizar_Supersvisor() throws SQLException {
String cadena = "update supervisor set Nombre='" + getNombre()+ "', Cedula='"+getCedula()+"', Apellido='"
                + getApellido()+"' where IdSupervisor='" + getIdSupersvisor()+ "'"; //TA 

        BD.ActualizarBD(cadena); //2TA 
        //TA 
        //2TA
        //-----
        //3TA 
    }
 

    public void Eliminar_Supersvisor() throws SQLException {
    String cadena = "delete from supervisor where IdSupervisor='" + getIdSupersvisor()+ "'"; //TA 
        BD.ActualizarBD(cadena); //2TA 
    } //TA + 2TA = 3TA 
    

    public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql); //2TA
    }

    public void Consultar_OSupersvisor() throws SQLException {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Supersvisor"); //2TA + TA = 3TA
        while (rs.next()) { //N x TC
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
        } //3TA + N x TC.
    }

    public ArrayList<Supervisor> SupervisorVista() throws SQLException, Exception {
        ArrayList<Supervisor> Lista= new ArrayList<>(); //TA
        ResultSet rs;
        rs = BD.ConsultaBD("Select * from Supervisor"); //2TA + TA + TA = 4TA
        while (rs.next()) {  //N x TC
            Supervisor SAUX = new Supervisor();  //N x TA
            SAUX.setIdSupersvisor(rs.getInt("idSupervisor")); //N x TA
            SAUX.setNombre(rs.getString("Nombre")); //N x TA
            SAUX.setApellido(rs.getString("Apellido"));//N x TA
            SAUX.setCedula(rs.getString("Cedula"));   //N x TA
            Lista.add(SAUX); //N x TA
        }
        return Lista;
    }     //     4TA 
          // N x  TC
          // N x  6TA ----> =  N x 10TA + TC |PEOR TIEMPO ESPERADO| 
    /*
     4TA + TC  | TIEMPO MEJOR ESPERADO|
     N x 10TA + TC - (4TA + TC) =  N x 6TA + TC.

    */
        public int obtenerIDPorCedula(String titulo) throws SQLException {
        String consulta = "SELECT IdSupervisor FROM Supervisor WHERE Cedula = '" + getCedula() + "'"; //TA
        ResultSet rs = BD.ConsultaBD(consulta);  //2TA + TA = 3TA
        if (rs.next()) {//T.C
            return rs.getInt("IdSupervisor");
        } else {
            return -1; // Valor de retorno para indicar que no se encontró el libro
        } //4TA + TC.
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
