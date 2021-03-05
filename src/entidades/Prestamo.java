package entidades;

import java.time.LocalDate;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */
public class Prestamo {

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Prestamo(Libro libro, LocalDate fecha) {
        this.libro = libro;
        this.fecha = fecha;
    }
    
    private Libro libro;
    private LocalDate fecha;
    
}
