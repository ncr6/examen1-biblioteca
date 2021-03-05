package entidades;

import java.util.ArrayList;
/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */
public class Estudiante implements Comparable<Estudiante> {
    
    public Estudiante(String codigo, String nombre, String apellido, String carrera, String anioIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.anioIngreso = anioIngreso;
        prestamos = new ArrayList();
    }    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public int agregarPrestamo(Prestamo prest){
        if (prestamos.size() < 3){
            prestamos.add(prest);
            return 1;
        } else {
            return 2;
        }
    }

    public String getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    @Override
    public String toString(){
        return "[Datos del estudiante]" +
               "\nCódigo: " + getCodigo() +
               "\nNombre: " + getNombre() +
               "\nApellido: " + getApellido() +
               "\nCarrera: " + getCarrera() +
               "\nAño de ingreso: " + getAnioIngreso();
    }
    
    @Override
    public int compareTo(Estudiante est){
        return this.apellido.compareTo(est.getApellido());
    }      
    
    private String codigo;
    private String nombre;
    private String apellido;
    private String carrera;
    private String anioIngreso;
    private ArrayList<Prestamo> prestamos;
    
}
