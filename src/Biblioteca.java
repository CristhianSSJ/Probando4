
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
        rs = BD.ConsultaBD("SELECT max(idBiblioteca) as num FROM biblioteca;");//tc + to + ta
        if (rs.next()) {//tc
            inc = rs.getInt(1) + 1; 

        } else {
            inc = 1;
        }
        return inc;//to + ta
    }

    public void Insertar_Biblioteca() throws SQLException {
        String cadena = "INSERT INTO Biblioteca VALUES(" + Incremento_Bibliotca() + ",'" + getDireccion() + "','" + getIdSupervisor() + "','" + getNombre() + "')";
             //ta
//        String cadena = "insert into Biblioteca values(" + Incremento_Bibliotca() + ",'" + 
//        "','" + getDireccion() + "','" + getIdSupervisor()+"','"+getNombre()+"')";
        BD.ActualizarBD(cadena);
       //2Ta
    }

    /////////////////////////////////////////////////////////////////
    public int obtenerIDPorNombreydireccion() throws SQLException {
        String consulta = "SELECT idBiblioteca FROM Biblioteca WHERE Direccion = '" + getDireccion() + "' AND Nombre = '" + getNombre() + "'";//Ta
        ResultSet rs = BD.ConsultaBD(consulta);//tc
        if (rs.next()) { //tc
            return rs.getInt("idBiblioteca");
        } else {
            return -1; // Valor de retorno para indicar que no se encontró el libro
        }
    }

    /////////////////////////////////////////////////////////////////
    public void Actualizar_Biblioteca() throws SQLException {
        String cadena = "UPDATE biblioteca SET Direccion='" + getDireccion() + "', idSupervisor='"
                + getIdSupervisor() + "', nombre='" + getNombre() + "' WHERE idBiblioteca='" + getIdBiblioteca() + "'";
       //2Ta
        BD.ActualizarBD(cadena);// 2ta
    }

    public void Eliminar_Biblioteca() throws SQLException {
        String cadena = "delete from biblioteca where idBiblioteca='" + getIdBiblioteca() + "'";//ta + to
        BD.ActualizarBD(cadena);//2ta
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql);//2ta
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
        //n * (8Ta)
        }
    }

    public ArrayList<Biblioteca> bibliotecaVista() throws SQLException, Exception {
        ArrayList<Biblioteca> Lista = new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD("Select * from Biblioteca");// ta
        while (rs.next()) {
            Biblioteca SAUX = new Biblioteca();
            SAUX.setIdBiblioteca(rs.getInt("idBiblioteca")); 
            SAUX.setDireccion(rs.getString("Direccion"));
            SAUX.setIdSupervisor(rs.getInt("idSupervisor"));
            SAUX.setNombre(rs.getString("nombre"));
            Lista.add(SAUX); // n * (8Ta)
        }
        return Lista;//ta
        
    }
 public ArrayList<Biblioteca> VistaEspecial(int idb) throws SQLException, Exception {
        ArrayList<Biblioteca> Lista = new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT * FROM supervisor INNER JOIN biblioteca ON supervisor.idSupervisor = biblioteca.idSupervisor WHERE biblioteca.idBiblioteca = "+ idb);
        while (rs.next()) {//ta
            Biblioteca SAUX = new Biblioteca();
            SAUX.setIdBiblioteca(rs.getInt("idBiblioteca"));
            SAUX.setDireccion(rs.getString("Direccion"));
            SAUX.setIdSupervisor(rs.getInt("idSupervisor"));
            SAUX.setNombre(rs.getString("nombre"));
            Lista.add(SAUX);
        }// n * (5Ta)
        return Lista;//ta
    }
    @Override
    public String toString() {
        return Nombre ;//to
    }
//    Tiempo total esperado (peor caso):
//4Ta + 3Ta + 3Ta + 3Ta + tc + to + ta + ta + ta + to + 2Ta + ta + tc + tc + to + ta + 2Ta + ta + ta + tc + to + ta + ta + 2Ta + 2Ta + ta + ta + 2Ta + ta + n * (8Ta) + ta + to + n * (8Ta) + ta + ta + ta + n * (5Ta) + ta
//
//Esto es igual a:
//15Ta + 3Tc + 4To + 4Ta + n * (21Ta + 5To) + 5Ta + 2To
//
//Entonces el tiempo total esperado es:
//15Ta + 3Tc + 4To + 4Ta + n * (21Ta + 5To) + 5Ta + 2To
}
