
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Libros {

    private int LibrosID;
    private String Titulo;
int idBiblioteca,idCategoria,idAutor;
    private double Precio;
    AccesoBD BD;

    public Libros() throws Exception {
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");//4Ta
        BD.ConectaBD();
        //3Ta
    }

    public int getLibrosID() {
        return LibrosID;
    }

    public void setLibrosID(int LibrosID) {
        this.LibrosID = LibrosID;//ta
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;//ta
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;//ta
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;//ta
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;//ta
    }

    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD;//ta+
    }



    public int Incremento_Libro() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(LibroID) as num FROM Libro;");//Ta+2Ta
        if (rs.next()) {//tc
            inc = rs.getInt(1) + 1;//To+Ta
        } else {
            inc = 1;//Ta
        }
        return inc;
        /*Tiempo Peor Esperado
        Ta+2Ta+Tc+To+Ta=4Ta+Tc+To
        Tiempo mejor esperado
        Ta+2Ta+Tc+Ta=4Ta+Tc
        Tiempo esperado
        To
        */
    }

    public void Insertar_Libro() throws SQLException {
        String cadena = "insert into libro values('" + Incremento_Libro() +  "','" + getTitulo() + "','" + getPrecio()+ "','" + getIdBiblioteca()+ "','" + getIdCategoria()+ "','" + getIdAutor()+ "')";
        //ta+ta+to
        BD.ActualizarBD(cadena);//2Ta
        /*Tiempo
        Ta+Ta+To+2Ta=4Ta+To
        */
    }

    public void Actualizar_Libro() throws SQLException {
           String cadena = "UPDATE libro SET Titulo='" + getTitulo() + "', Precio=" + getPrecio() 
                + ", idBiblioteca=" + getIdBiblioteca() + ", idCategoria=" + getIdCategoria() 
                + ", idAutor=" + getIdAutor() + " WHERE LibroID='" + getLibrosID() + "'";
                //Ta
        BD.ActualizarBD(cadena);//3Ta
        //4Ta
    }

    public void Eliminar_Libro() throws SQLException {
        String cadena = "delete from libro where LibroID='" + getLibrosID() + "'";//Ta
        BD.ActualizarBD(cadena);//3Ta
        //4Ta
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql);
        //2ta
    }

    public void Consultar_Libro() throws SQLException {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Libro");//ta
        while (rs.next()) {//n*Tc
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getString(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.print(rs.getString(6) + " ");
            System.out.println("");
        }
        /*Tiempo Peor Esperado
        Ta+n*tc
        Tiempo Mejor Esperado
        Ta+Tc
        Tiempo Esperado
        n
        
        */
    }
     public ArrayList<Libros> LibrosVista() throws SQLException, Exception {
        ArrayList<Libros> Lista= new ArrayList<>();//Ta
        ResultSet rs;
        rs = BD.ConsultaBD("Select * from libro");//3Ta
        while (rs.next()) {//n*Tc
            Libros SAUX = new Libros();//n*Ta
            SAUX.setLibrosID(rs.getInt("LibroID"));//n*Ta
            SAUX.setTitulo(rs.getString("Titulo"));//n*Ta
            SAUX.setPrecio(rs.getDouble("Precio"));//n*Ta
            SAUX.setIdBiblioteca(rs.getInt("idBiblioteca"));//n*Ta
            SAUX.setIdCategoria(rs.getInt("idCategoria"));//n*Ta
            SAUX.setIdAutor(rs.getInt("idAutor"));//n*Ta
            Lista.add(SAUX);//n*Ta
        }
        return Lista;
        /*
        Tiempo Peor Esperado
        Ta+3Ta+n*tc+n*8Ta
        4Ta+n(tc+8Ta)
        Tiempo Mejor Esperado
        4Ta+Tc
        Tiempo Esperado
        4Ta+n(tc+8Ta)-(4Ta+Tc)
        n(tc+8Ta)-Tc
        */
    }
      public ArrayList<Libros> VistaEspecial(String sql) throws SQLException, Exception {
        ArrayList<Libros> Lista= new ArrayList<>();//Ta
        ResultSet rs;
        rs = BD.ConsultaBD(sql);//Ta+2Ta
        while (rs.next()) {//n*Tc
            Libros SAUX = new Libros();//n*Ta
            SAUX.setLibrosID(rs.getInt("LibroID"));//n*Ta
            SAUX.setTitulo(rs.getString("Titulo"));//n*Ta
            SAUX.setPrecio(rs.getDouble("Precio"));//n*Ta
            SAUX.setIdBiblioteca(rs.getInt("idBiblioteca"));//n*Ta
            SAUX.setIdCategoria(rs.getInt("idCategoria"));//n*Ta
            SAUX.setIdAutor(rs.getInt("idAutor"));//n*Ta
            Lista.add(SAUX);//n*Ta
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
 public ArrayList<Categoria> VistaEspecial(int idb) throws SQLException, Exception {
        ArrayList<Categoria> Lista = new ArrayList<>();//Ta
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT * FROM Categoria INNER JOIN libro ON Categoria.idCategoria= libro.idCategoria WHERE libro.LibroID="+ idb);//3Ta
        while (rs.next()) {//n*Tc
            Categoria SAUX = new Categoria();//n*Ta
            SAUX.setIdCategoria(rs.getInt("idCategoria"));//n*Ta
            SAUX.setCategoria(rs.getString("Categoriacol"));//n*Ta
            Lista.add(SAUX);//n*Ta
        }
        /*
        Tiempo peor esperado
        Ta+3Ta+n(tc+4ta)=4Ta+n(tc+4Ta)
        Tiempo mejor esperado 
        4Ta+tc
        Tiempo Esperado
        4Ta+n(tc+4Ta)-(4Ta+Tc)=n(tc+4Ta)-tc
        */
        return Lista;
    }
 
 public ArrayList<Autor> VSTE(int idb) throws SQLException, Exception {
        ArrayList<Autor> Lista = new ArrayList<>();//Ta
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT * FROM autor INNER JOIN libro ON autor.idAutor= libro.idAutor WHERE libro.LibroID="+ idb);//3Ta
        while (rs.next()) {//n*tc
            Autor SAUX = new Autor();//n*Ta
            SAUX.setIdAutor(rs.getInt("idAutor"));//n*Ta
            SAUX.setNombreA(rs.getString("NombreAutor"));//n*Ta
            SAUX.setApellidoA(rs.getString("ApellidoAutor"));//n*Ta
            Lista.add(SAUX);//n*Ta
        }
        return Lista;
        /*
        Tiempo peor esperado
        4Ta+n(tc+5Ta)
        Tiempo Mejor esperado
        4Ta+Tc
        Tiempo Esperado
        4Ta+n(tc+5Ta)-(4Ta+Tc)= n(tc+5Ta)-Tc
        */
    }
    @Override
    public String toString() {
        return getTitulo();
    }
      
}
