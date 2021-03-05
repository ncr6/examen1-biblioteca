package entidades;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */
public class Libro implements Comparable<Libro> {

    public Libro(String codigoLib, String titulo, String autor, String edicion, String anioPub) {
        this.codigoLib = codigoLib;
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.anioPub = anioPub;
    }
    private String codigoLib;
    private String titulo;
    private String autor;
    private String edicion;
    private String anioPub;

    public String getCodigoLib() {
        return codigoLib;
    }

    public void setCodigoLib(String codigoLib) {
        this.codigoLib = codigoLib;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAnioPub() {
        return anioPub;
    }

    public void setAnioPub(String anioPub) {
        this.anioPub = anioPub;
    }
    
    @Override
    public String toString(){
        return "[DATOS DEL LIBRO]" +
                "\nCódigo: " + getCodigoLib() +
                "\nTítulo: " + getTitulo() +
                "\nAutor: " + getAutor() +
                "\nEdición: "+ getEdicion() +
                "\nAño de publicación: " + getAnioPub();
    }
    
    @Override
    public int compareTo(Libro lb){
        return this.anioPub.compareTo(lb.getAnioPub());
    }
    
}
