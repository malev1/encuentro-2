/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2;

/**
 *
 * @author malen
 */
public class ejteorico4 {

    //Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
    
    public static void main(String[] args) {
        
        int num1 = 15;
        int num2 = 20;
        
        //operadores aritmeticos: 
        
        int suma = num1 + num2;
        int resta = num2 - num1;       
    
        //de igual y relacion
        boolean logico = num1<num2;
        boolean logico1 = num1 == num2;
        
        //aritmeticos 
        System.out.println("La suma de 15 y 20 es: " +suma);
        System.out.println("La resta de 20 y 15 es es: " +resta);
        
        //unarios 
        System.out.println("El numero siguiente a 15 es: " +(++num1));
        System.out.println("El numero anterior a 20 es: " +(--num2));
       
        
        //de igualdad y relacion
        System.out.println("El numero 15 es menor al numero 20: " +logico);
        System.out.println("Los dos numeros son iguales, true o false?: " +logico1);
        
               
    }
    
}
