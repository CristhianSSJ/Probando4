
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
        BD = new AccesoBD("localhost", "root", "Ayuda", "proyecto");
        BD.ConectaBD();
    }

    public int getLibrosID() {
        return LibrosID;
    }

    public void setLibrosID(int LibrosID) {
        this.LibrosID = LibrosID;
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
        this.idBiblioteca = idBiblioteca;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public AccesoBD getBD() {
        return BD;
    }

    public void setBD(AccesoBD BD) {
        this.BD = BD;
    }



    public int Incremento_Libro() throws SQLException {
        int inc;
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT max(LibroID) as num FROM Libro;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_Libro() throws SQLException {
        String cadena = "insert into libro values('" + Incremento_Libro() +  "','" + getTitulo() + "','" + getPrecio()+ "','" + getIdBiblioteca()+ "','" + getIdCategoria()+ "','" + getIdAutor()+ "')";
        BD.ActualizarBD(cadena);

    }

    public void Actualizar_Libro() throws SQLException {
           String cadena = "UPDATE libro SET Titulo='" + getTitulo() + "', Precio=" + getPrecio() 
                + ", idBiblioteca=" + getIdBiblioteca() + ", idCategoria=" + getIdCategoria() 
                + ", idAutor=" + getIdAutor() + " WHERE LibroID='" + getLibrosID() + "'";

        BD.ActualizarBD(cadena);
    }

    public void Eliminar_Libro() throws SQLException {
        String cadena = "delete from libro where LibroID='" + getLibrosID() + "'";
        BD.ActualizarBD(cadena);
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return BD.ConsultaBD(sql);
    }

    public void Consultar_Libro() throws SQLException {
        ResultSet rs;
        rs = BD.ConsultaBD("select * from Libro");
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
     public ArrayList<Libros> LibrosVista() throws SQLException, Exception {
        ArrayList<Libros> Lista= new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD("Select * from libro");
        while (rs.next()) {
            Libros SAUX = new Libros();
            SAUX.setLibrosID(rs.getInt("LibroID"));
            SAUX.setTitulo(rs.getString("Titulo"));
            SAUX.setPrecio(rs.getDouble("Precio"));
            SAUX.setIdBiblioteca(rs.getInt("idBiblioteca"));
            SAUX.setIdCategoria(rs.getInt("idCategoria"));
            SAUX.setIdAutor(rs.getInt("idAutor"));
            Lista.add(SAUX);
        }
        return Lista;
    }
      public ArrayList<Libros> VistaEspecial(String sql) throws SQLException, Exception {
        ArrayList<Libros> Lista= new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD(sql);
        while (rs.next()) {
            Libros SAUX = new Libros();
            SAUX.setLibrosID(rs.getInt("LibroID"));
            SAUX.setTitulo(rs.getString("Titulo"));
            SAUX.setPrecio(rs.getDouble("Precio"));
            SAUX.setIdBiblioteca(rs.getInt("idBiblioteca"));
            SAUX.setIdCategoria(rs.getInt("idCategoria"));
            SAUX.setIdAutor(rs.getInt("idAutor"));
            Lista.add(SAUX);
        }
        return Lista;
    }
 public ArrayList<Categoria> VistaEspecial(int idb) throws SQLException, Exception {
        ArrayList<Categoria> Lista = new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT * FROM Categoria INNER JOIN libro ON Categoria.idCategoria= libro.idCategoria WHERE libro.LibroID="+ idb);
        while (rs.next()) {
            Categoria SAUX = new Categoria();
            SAUX.setIdCategoria(rs.getInt("idCategoria"));
            SAUX.setCategoria(rs.getString("Categoriacol"));
            Lista.add(SAUX);
        }
        return Lista;
    }
 
 public ArrayList<Autor> VSTE(int idb) throws SQLException, Exception {
        ArrayList<Autor> Lista = new ArrayList<>();
        ResultSet rs;
        rs = BD.ConsultaBD("SELECT * FROM autor INNER JOIN libro ON autor.idAutor= libro.idAutor WHERE libro.LibroID="+ idb);
        while (rs.next()) {
            Autor SAUX = new Autor();
            SAUX.setIdAutor(rs.getInt("idAutor"));
            SAUX.setNombreA(rs.getString("NombreAutor"));
            SAUX.setApellidoA(rs.getString("ApellidoAutor"));
            Lista.add(SAUX);
        }
        return Lista;
    }
    @Override
    public String toString() {
        return getTitulo();
    }
      
}
