
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Biblioteca {

    int idBiblioteca, idSupervisor;
    String direccion, Nombre;
    AccesoBD BD;

    public Biblioteca() throws Exception {
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");//4Ta
        BD.ConectaBD();
    }//3Ta

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;//Ta
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;//Ta
    }

    public int getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;//Ta
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;//Ta
    }

    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD;//Ta
    }

    public int Incremento_Bibliotca() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(idBiblioteca) as num FROM biblioteca;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1; //n*(to+ta)

        } else {
            inc = 1;//Ta
        }
        return inc;
    }

    public void Insertar_Biblioteca() throws SQLException {
        String cadena = "INSERT INTO Biblioteca VALUES(" + Incremento_Bibliotca() + ",'" + getDireccion() + "','" + getIdSupervisor() + "','" + getNombre() + "')";
             //Ta
//        String cadena = "insert into Biblioteca values(" + Incremento_Bibliotca() + ",'" + 
//        "','" + getDireccion() + "','" + getIdSupervisor()+"','"+getNombre()+"')";
        BD.ActualizarBD(cadena);
       //2Ta
    }

    /////////////////////////////////////////////////////////////////
    public int obtenerIDPorNombreydireccion() throws SQLException {
        String consulta = "SELECT idBiblioteca FROM Biblioteca WHERE Direccion = '" + getDireccion() + "' AND Nombre = '" + getNombre() + "'";//Ta
        ResultSet rs = BD.ConsultaBD(consulta);//tc
        if (rs.next()) { //n*tc
            return rs.getInt("idBiblioteca");
        } else {//Ta
            return -1; // Valor de retorno para indicar que no se encontró el libro
        }
    }

    /////////////////////////////////////////////////////////////////
    public void Actualizar_Biblioteca() throws SQLException {
        String cadena = "UPDATE biblioteca SET Direccion='" + getDireccion() + "', idSupervisor='"
                + getIdSupervisor() + "', nombre='" + getNombre() + "' WHERE idBiblioteca='" + getIdBiblioteca() + "'";
       //ta+ta+to
        BD.ActualizarBD(cadena);// 2ta
    }

    public void Eliminar_Biblioteca() throws SQLException {
        String cadena = "delete from biblioteca where idBiblioteca='" + getIdBiblioteca() + "'";//ta+to
        BD.ActualizarBD(cadena);//2ta
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql);
    }

    public void Consultar_Biblioteca() throws SQLException {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Biblioteca");//ta
        while (rs.next()) {//n*Tc
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
        /*Tiempo Peor Esperado
        Ta+n*tc
        Tiempo Mejor Esperado
        Ta+Tc
        Tiempo Esperado
        n
        */
        }
    }

    public ArrayList<Biblioteca> bibliotecaVista() throws SQLException, Exception {
        ArrayList<Biblioteca> Lista = new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD("Select * from Biblioteca");// ta
        while (rs.next()) {//n*Tc
            Biblioteca SAUX = new Biblioteca();
            SAUX.setIdBiblioteca(rs.getInt("idBiblioteca")); //ta
            SAUX.setDireccion(rs.getString("Direccion"));//ta
            SAUX.setIdSupervisor(rs.getInt("idSupervisor"));//ta
            SAUX.setNombre(rs.getString("nombre"));//ta
            Lista.add(SAUX);
        }
        return Lista;
        /*Tiempo Peor Esperado
        Ta+Ta+2Ta+n(Tc+8Ta)=4Ta+n(Tc+8Ta)
        Tiempo Mejor esperado
        Ta+Ta+2Ta+Tc=4Ta+Tc
        Tiempo mejor esperado
        4Ta+n(Tc+8Ta)-(4Ta+Tc)=n(Tc+8Ta)-tc
        */
    }
 public ArrayList<Biblioteca> VistaEspecial(int idb) throws SQLException, Exception {
        ArrayList<Biblioteca> Lista = new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT * FROM supervisor INNER JOIN biblioteca ON supervisor.idSupervisor = biblioteca.idSupervisor WHERE biblioteca.idBiblioteca = "+ idb);
        while (rs.next()) {//n*ta
            Biblioteca SAUX = new Biblioteca();
            SAUX.setIdBiblioteca(rs.getInt("idBiblioteca"));//ta
            SAUX.setDireccion(rs.getString("Direccion"));//ta
            SAUX.setIdSupervisor(rs.getInt("idSupervisor"));//ta
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
