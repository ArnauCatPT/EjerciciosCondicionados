/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscondicionados;

/**
 *
 * @author UsuarioM
 */
public class Ejercicio3 {
    /*Escribir un programa que pida una letra y nos diga por pantalla si es vocal
    o consonante.*/
   public static void mostrarLetra(String palabra){
       char letra = palabra.charAt(0);
               
      if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
          {
            System.out.println("Es vocal");
          }else if(   
                (letra >='a' && letra <='z') || (letra >='A' && letra <='Z'))
        {
                         System.out.println("Es consonante");
         }else{
                         System.out.println("No es ni una vocal ni una consonante");
         }
          
      } 
   public static void mostrarLetraSwitch(String palabra){
       char letra = palabra.charAt(0);
        
       switch(letra){
           case 'a','e','i','o','u': System.out.println("Es vocal");
            break;
           default:
               System.out.println("Es consonante");
 
       }
    }     
   
}
