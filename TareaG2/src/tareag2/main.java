/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareag2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Satellite Pro
 */
public class main {
    public static void main(String[] args) {
        
        //Declaracion de variables
        // :)
        
        String nombre, apellido, correo, direccion = "";
        int telefono = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido");
        nombre = sc.nextLine();
        
        validacion calc = new validacion(); //Si no se cual es el error, debe escribir Exception //Siempre debe haber un Exception e 


        try {
            System.out.println("Bienvenido a la prueba Try Catch");
            System.out.println("Ingrese dos numeros enteros para hacer una division: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            float divide = calc.dividir(n1, n2);
            System.out.println("Resultado: " + divide);
        } catch (ArithmeticException e) {
            System.out.println("Mensaje: " + "No se puede hacer una division entre cero");
        } catch (InputMismatchException e) {
            System.out.println("Mensaje: " + "Solo numeros enteros");
        } catch (Exception e) {
            String mensajeGeneral = "Error inesperado. Intente de nuevo.";
            System.out.println("Mensaje: " + mensajeGeneral);
            // System.out.println("Mensaje: " + e.getClass().getName()); 
        } finally {
            System.out.println("\nFin de la ejecucion de la prueba");
        }
        
    }
}
