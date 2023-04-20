/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2;

import java.util.Scanner;

/**
 *
 * @author malen
 */
public class ejerciciovideo2 {

   
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    //se crea la variable scanner para leer, no importa donde sea declarada 
    
    String nombre;
    //String es el tipo de variable que usamos, en este caso es una cadena de caracteres. 
    
    System.out.println("Ingrese su nombre");
    //se imprime en pantalla 
    nombre = leer.next();
 /*leer.next(); 
 * leer como variable invoca a otra (next) 
 *y el resultado de eso se asigna a nuestra variable string. (nombre) 
 */
    
        System.out.println("¡Hola mundo! Soy " + nombre + " y estoy programando en Java");
        
    //sout lo ponemos en minuscula 
    //el + tenemos que ponerlo con espacios y tambien dejar los espacios en comillas. 
     
  
    }
    
}
