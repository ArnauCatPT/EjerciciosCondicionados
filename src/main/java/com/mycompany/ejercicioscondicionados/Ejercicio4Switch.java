/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscondicionados;

/**
 *
 * @author UsuarioM
 */
public class Ejercicio4Switch {
       /*Escribir un programa que dada la entrada en número de un mes nos
        indique su nombre con Switch*/
    public static void mostrarMes(int numMes){
        
       switch (numMes){
           case 1: System.out.println("Es Enero");
                   break;
           case 2: System.out.println("Es Febrero");
                   break;
           case 3: System.out.println("Es Marzo");
                   break;
           case 4: System.out.println("Es Abril");
                   break;
           case 5: System.out.println("Es Mayo");
                   break;           
           case 6: System.out.println("Es Juniu");
                   break;           
           case 7: System.out.println("Es Julio");
                   break;
           case 8: System.out.println("Es Agosto");
                   break;
           case 9: System.out.println("Es Septiembre");
                   break;
           case 10: System.out.println("Es Octubre");
                    break;
           case 11: System.out.println("Es Noviembre");
                    break;
           case 12: System.out.println("Es Diciembre");
                    break;
           default: System.out.println("El numero de mes no existe");
       }

    } 
}
