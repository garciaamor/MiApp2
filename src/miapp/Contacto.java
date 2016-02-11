package miapp;
/**
 * Simplest class, contains the basic information of each contact
 * @author jgarciaamor
 * version 1.0
 */
public class Contacto {

    private String nombre;

    private String apellidos;

    private String telefono;

    private String correoElec;

    private int id;

    /**
     *
     */
    public Contacto() {
    }
/**
 * 
 * @param nombre String that contains the first name of the contact
 * @param apellidos String with the last name of the contact
 * @param telefono String with the phone number of the contact
 * @param correoElec String with the e-mail of the contact
 * @param id integer number, an ID created by our application
 */
    public Contacto(String nombre, String apellidos, String telefono, String correoElec, int id) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", correoElec=" + correoElec + ", id=" + id + '}';
    }

    
}
