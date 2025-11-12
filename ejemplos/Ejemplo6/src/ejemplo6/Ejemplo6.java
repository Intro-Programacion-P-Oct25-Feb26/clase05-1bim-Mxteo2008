/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejemplo6 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double membresia = 25;
        String nombre;
        String apellido;
        String usuario;
        int edad;
        String parroquia;
        int dia;
        double desc = 0.05;
        double valorDesc;
        double valorFinal;
        
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese su usuario");
        usuario = entrada.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        entrada.nextLine();
        System.out.println("Ingrese su parroquia");
        parroquia = entrada.nextLine();
                
        System.out.println("Ingrese día de pago");
        dia = entrada.nextInt();    
        
        if {();
         
             
         
         {
            System.out.printf("Estudiante %s aprobado con un promedio: %.2f\n "
                    + "Ciudad: %s\t\tEdad:%s\n", 
                    miNombre, promedio, ciudad, edad);
        }else{
            System.out.printf("Estudiante reprobado con un "
                    + "promedio: %.2f\nSu edad es:%s\nSu nombre es: %s\n"
                    , promedio, edad, miNombre);
        }
           
    }
    
}
