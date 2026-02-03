/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareag2;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Satellite Pro
 */
public class main {

    public static void main(String[] args) {

        String nombre, apellido, correo, direccion;
        int telefono = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<PersonaInfo> personas = new ArrayList<>();
        
        
        
        System.out.println("Ingrese su Nombre");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese su Apellido");
        apellido = sc.nextLine();

        System.out.println("Ingrese su Correo Electronico");
        correo = sc.nextLine();
        
        System.out.println("Ingrese su Numero de Telephono");
        telefono = sc.nextInt();

        System.out.println("Ingrese su Direccion");
        direccion = sc.nextLine();
        
        personas.add(new PersonaInfo(nombre, apellido, correo, telefono, direccion));
        


        
        
    }
}
