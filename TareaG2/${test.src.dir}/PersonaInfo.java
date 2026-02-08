package tareag2;

/**
 *
 * @author qianp
 */
public class PersonaInfo {
    private String nombre, apellido, correo, direccion;
    private int telefono;

    PersonaInfo(String nombre, String apellido, String correo, int telefono, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
}