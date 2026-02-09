/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    // sin este codigo Al final se imprime "tareag2.PersonaInfo@4d405ef7" en main
    @Override 
    public String toString(){
    return "Nombre: " + nombre + " " +  "Apellido: " + apellido + " "  + "Correo: " + correo  + " "  + "Telefono: " + telefono + " "  + "Direccion: " +direccion;
    }//fin override 
    
}
